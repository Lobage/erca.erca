 /*********************************************************************************
 * Copyright (c) 2007, 2008 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jean-Rémy Falleri <jr.falleri@laposte.net> - initial API and implementation
 *********************************************************************************/

package com.googlecode.erca.framework.algo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SimpleLog;
import org.eclipse.emf.common.util.*;

import com.googlecode.erca.*;
import com.googlecode.erca.clf.*;
import com.googlecode.erca.framework.algo.filtering.ClfFilter;
import com.googlecode.erca.framework.algo.filtering.FilterManager;
import com.googlecode.erca.framework.algo.scaling.*;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.rcf.*;
import com.googlecode.exputils.NameGenerator;

/**
 * Generates a CLF from a RCF.
 * @author Jean-Rémy Falleri
 */
public class ClfGenerator {
	
	private final static Log logger = new SimpleLog("com.google.code.erca.framework.algo.ClfGenerator");
	
	private int stepNumber;

	private int maxStepNumber;
	
	private boolean saveDebugLattices;
	
	private File debugDir;
	
	private RelationalContextFamily rcf;
	
	private ConceptLatticeFamily clf;
	
	private NameGenerator nameGenerator;
	
	private List<ClfFilter> filters;

	public ClfGenerator(RelationalContextFamily rcf,int maxStepNumber,boolean saveDebugContexts,File debugDir ) {
		this.rcf = rcf;
		this.maxStepNumber = maxStepNumber;
		this.saveDebugLattices = saveDebugContexts;
		this.debugDir = debugDir;
		this.nameGenerator = new NameGenerator("_");
		this.filters = new LinkedList<ClfFilter>();
	}
	
	/**
	 * Adds a filter to the filter list.
	 * @param name the filter class name.
	 */
	public void addFilter(String name) {
		filters.add( FilterManager.getClfFilter(name) );
	}
	
	/**
	 * Applies all the filters on the CLF.
	 */
	public void applyFilters() {
		for(ClfFilter f : filters)
			f.filter(clf);
	}
	
	/**
	 * Creates a Concept Lattice Family generator using the given Relational Context
	 * Family and a given maximum number of step. If the maximum number of step is -1,
	 * the number of step is unbounded.
	 * @param rcf a Relational Context Family.
	 * @param maxStepNumber an int representing the maximum number of step of the RCA process.
	 */
	public ClfGenerator(RelationalContextFamily rcf,int maxStepNumber) {
		this(rcf,maxStepNumber,false,null);
	}
	
	public ClfGenerator(RelationalContextFamily rcf) {
		this(rcf,-1);
	}
	
	public ClfGenerator(String rcfPath,int maxStepNumber) {
		this(ErcaIO.loadRCF(rcfPath),maxStepNumber);
	}
	
	public ClfGenerator(String rcfPath,int maxStepNumber,boolean saveDebugLattices,String debugPath) {
		this(ErcaIO.loadRCF(rcfPath),maxStepNumber,saveDebugLattices,new File(debugPath));
	}
	
	public ClfGenerator(String path) {
		this(path,-1);
	}

	/**
	 * Build the CLF for the given RCF.
	 * @throws IOException IOException.
	 */
	public void generateClf() throws IOException {
		logger.info("Starting concept lattice family construction.");
		logger.info("Initializing lattices.");

		stepNumber = 0;

		this.clf = ClfFactory.eINSTANCE.createConceptLatticeFamily();

		for(FormalContext context: this.rcf.getFormalContexts() )
			initializeLattice(context);

		HashMap<ConceptLattice, EList<Concept>> nextStepConcepts = initNextStepConcepts();
		HashMap<ConceptLattice, EList<Concept>> currentStepConcepts = new HashMap<ConceptLattice, EList<Concept>>();
		EList<Concept> newConcepts;

		logger.info("Starting relational construction process.");

		boolean stopProcess = ( nextStepConcepts.isEmpty() || ( maxStepNumber > 0 && stepNumber >= maxStepNumber ) );
		
		while( !stopProcess ) {

			if ( saveDebugLattices ) {
				logger.debug("Saving debug informations.");
				String clfPath = debugDir.getAbsolutePath() + "/clf_" + stepNumber + ".clf";
				ErcaIO.saveErcaObject(clf, clfPath);
			}

			stepNumber++;

			logger.debug("Step number " + Integer.toString(stepNumber));

			int addedConcepts = 0;
			currentStepConcepts = nextStepConcepts;
			nextStepConcepts = new HashMap<ConceptLattice, EList<Concept>>();
			for(FormalContext context: this.rcf.getFormalContexts()) {
				ConceptLattice lattice = this.clf.getConceptLattice(context.getName());
				for(RelationalContext relation: this.rcf.getRelationalContexts(context)) {
					ConceptLattice targetLattice = this.clf.getConceptLattice(relation.getTargetContext().getName());
					newConcepts = null;
					newConcepts = scale(lattice,relation,currentStepConcepts.get(targetLattice));
					if ( newConcepts != null ) {
						addedConcepts += newConcepts.size();
						// Sets the creation step attribute
						for(Concept concept: newConcepts)
							concept.setCreationStep(stepNumber);
					}
					if ( newConcepts == null || newConcepts.isEmpty())
						continue;
					else if (nextStepConcepts.get(lattice) == null ) 
						nextStepConcepts.put(lattice,newConcepts);
					else
						nextStepConcepts.get(lattice).addAll(newConcepts);
				}
			}

			logger.debug("Added concepts: " + Integer.toString(addedConcepts));

			stopProcess = ( nextStepConcepts.isEmpty() || ( maxStepNumber > 0 && stepNumber >= maxStepNumber ) );
		}

		clf.setStepNumber(stepNumber);

		applyFilters();
	}
	
	/**
	 * Returns the RCF.
	 * @return the RCF.
	 */
	public RelationalContextFamily getRcf() {
		return this.rcf;
	}

	/**
	 * Returns the CLF that has been created.
	 * @return the CLF.
	 */
	public ConceptLatticeFamily getClf() {
		return this.clf;
	}

	/**
	 * Saves the CLF to the given path.
	 * @param path a path.
	 * @throws IOException IOException.
	 */
	public void saveClf(String path) throws IOException {
		ErcaIO.saveErcaObject(this.clf,path);
	}

	private EList<Concept> scale(ConceptLattice lattice,RelationalContext relationalContext,EList<Concept> filteredConcepts) {
		if( filteredConcepts == null ) 
			return null;
		EList<Concept> addedConcepts = new BasicEList<Concept>();

		ScalingOperator sclOp = ScalingOperatorManager.getScalingOperator(relationalContext.getScalingOperator());

		for(Concept concept: filteredConcepts) {
			EList<Entity> extent = new BasicEList<Entity>();
			// Performs scaling.
			for(Entity entity: relationalContext.getSourceContext().getEntities() ) {
				EList<Entity> linkedEntities = relationalContext.getTargetEntities(entity);
				if ( sclOp.accept(linkedEntities, concept) )
					extent.add(entity);
			}
			
			if ( !extent.isEmpty() ) {
				Attribute attribute = scaleConcept(lattice, concept, relationalContext);
				EList<Concept> initialConcepts = new BasicEList<Concept>();
				initialConcepts.addAll(lattice.getConcepts());
				Concept addedConcept = AddExtent.addExtent(extent,lattice.getTop(),lattice,nameGenerator);
				for(Concept child: addedConcept.getAllChildren() )
					child.getIntent().add(attribute);
				EList<Concept> finalConcepts = new BasicEList<Concept>();
				finalConcepts.addAll(lattice.getConcepts());
				finalConcepts.removeAll(initialConcepts);
				addedConcepts.addAll(finalConcepts);
			}
		}
		
		if ( addedConcepts.isEmpty() )
			return null;
		else
			return addedConcepts;
	}

	private void initializeLattice(FormalContext context) {
		ConceptLattice lattice = AddExtent.createLattice(context, nameGenerator);
		this.clf.getConceptLattices().add(lattice);
	}

	private HashMap<ConceptLattice, EList<Concept>> initNextStepConcepts() {
		HashMap<ConceptLattice, EList<Concept>> nextStepConcepts = new HashMap<ConceptLattice, EList<Concept>>();
		for(ConceptLattice lattice: this.clf.getConceptLattices()) {
			EList<Concept> latticeNextStepConcepts = new BasicEList<Concept>();
			latticeNextStepConcepts.addAll(lattice.getConcepts());
			nextStepConcepts.put(lattice, latticeNextStepConcepts );
		}
		return nextStepConcepts;
	}

	private Attribute scaleConcept(ConceptLattice lattice, Concept concept,RelationalContext relation) {
		RelationalAttribute sclAttr = ErcaFactory.eINSTANCE.createRelationalAttribute();
		sclAttr.setName(relation.getName());
		sclAttr.setValue(concept);
		sclAttr.setScalingOperator(relation.getScalingOperator());
		
		if ( lattice.getAttribute(sclAttr) != null )
			return lattice.getAttribute(sclAttr);
		else {
			lattice.getAttributes().add(sclAttr);
			return sclAttr;
		}
	}

}
