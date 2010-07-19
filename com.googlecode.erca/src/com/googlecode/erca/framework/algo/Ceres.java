package com.googlecode.erca.framework.algo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;

import com.googlecode.erca.clf.ClfFactory;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.framework.algo.filtering.ConceptLatticeFilter;
import com.googlecode.erca.framework.algo.filtering.FilterManager;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.exputils.NameGenerator;

public class Ceres {

	private FormalContext formalContext;

	private ConceptLattice conceptLattice;

	private NameGenerator nameGenerator;

	private List<ConceptLatticeFilter> filters;

	private HashMap<String, Concept> checkConceptsByExtent;

	private HashMap<String, Concept> checkConceptsByIntent;

	private HashMap<Concept, EList<Entity>> simplifies;

	public Ceres(FormalContext formalContext) {
		this.formalContext = formalContext;
		this.nameGenerator = new NameGenerator("_");
		checkConceptsByExtent = new HashMap<String, Concept>();
		checkConceptsByIntent = new HashMap<String, Concept>();
		simplifies = new HashMap<Concept, EList<Entity>>();

	}

	public void addFilter(String name) {
		this.filters.add(FilterManager.getConceptLatticeFilter(name));
	}

	public void applyFilter() {
		for (ConceptLatticeFilter f : filters)
			f.filter(this.conceptLattice);
	}

	public void generateConceptLattice() {

		sortedIntentDecreasing(formalContext.getAttributes());
		exec();
		generateTopConcept();
		generateBottomConcept();

	}

	public ConceptLattice getConceptLattice() {
		return this.conceptLattice;
	}

	public void saveConceptLattice(String path) throws IOException {
		ErcaIO.saveErcaObject(this.conceptLattice, path);
	}

	private void exec() {

		conceptLattice = ClfFactory.eINSTANCE.createConceptLattice();
		Concept conceptTop = ClfFactory.eINSTANCE.createConcept();
		conceptTop.getExtent().addAll(formalContext.getEntities());
		conceptTop.setName("Concept_0");
		conceptLattice.getConcepts().add(conceptTop);
		conceptLattice.setTop(conceptTop);

		EList<Concept> PLN = new BasicEList<Concept>();
		EList<Entity> SOO = new BasicEList<Entity>();

		EList<Attribute> SOP = new BasicEList<Attribute>();
		int index = 0;
		for (int i = formalContext.getEntities().size(); i > -1; i--) {

			PLN = new BasicEList<Concept>();

			for (int j = index; j < formalContext.getAttributes().size(); j++) {

				Attribute attribute = formalContext.getAttributes().get(j);

				if (formalContext.getSourceEntities(attribute).size() != i)
					break;

				Boolean trouve = false;
				Iterator<Concept> it = PLN.iterator();
				while (it.hasNext() && !trouve) {

					Concept concept = it.next();

					if (concept.getExtent().containsAll(
							formalContext.getSourceEntities(attribute))
							&& formalContext.getSourceEntities(attribute)
									.containsAll(concept.getExtent())) {

						concept.getIntent().add(attribute);
						trouve = true;

					}

				}
				if (!trouve) {

					Concept concept = ClfFactory.eINSTANCE.createConcept();
					concept.getIntent().add(attribute);
					concept.getExtent().addAll(
							formalContext.getSourceEntities(attribute));
					PLN.add(concept);

				}
				index++;
			}

			for (Concept concept : PLN) {

				classify(concept, true);
				SOP.addAll(concept.getSimplifiedIntent());

				simplifies.put(concept, new BasicEList<Entity>());
				for (Entity ent : concept.getExtent()) {

					if (formalContext.getTargetAttributes(ent).size() == concept
							.getIntent().size()) {
						simplifies.get(concept).add(ent);
						SOO.add(ent);
					}

				}

				workOnLeftPart(concept, SOP, SOO);

			}

		}

	}

	private void classify(Concept concept, Boolean addIntent) {

		for (Concept c : conceptLattice.getConcepts()) {
			c.setCreationStep(-1);
		}

		LinkedList<Concept> q = new LinkedList<Concept>();
		EList<Concept> dsc = new BasicEList<Concept>();

		q.add(conceptLattice.getTop());
		Concept csc = null;
		while (!q.isEmpty()) {

			csc = q.remove(0);
			dsc.add(csc);
			dsc.removeAll(csc.getParents());

			if (addIntent) {
				concept.getIntent().addAll(csc.getSimplifiedIntent());
			}

			for (Concept child : csc.getChildren()) {

				if (child.getCreationStep() == -1) {
					child.setCreationStep(child.getParents().size());

				}
				child.setCreationStep(child.getCreationStep() - 1);

				if (child.getCreationStep() == 0) {
					if (child.getExtent().containsAll(concept.getExtent())) {
						q.add(child);

					}
				}

			}

		}

		conceptLattice.getConcepts().add(concept);
		concept.setName("Concept_" + (conceptLattice.getConcepts().size() - 1));

		for (Concept c : dsc) {
			c.getChildren().add(concept);
		}

	}

	private void workOnLeftPart(Concept concept, EList<Attribute> SOP,EList<Entity> SOO) {

		EList<Entity> CC = new BasicEList<Entity>();

		EList<Entity> extents = concept.getExtent();

		sortedExtentsIncreasing(extents);

		CC.addAll(extents);
		CC.removeAll(simplifies.get(concept));

		for (int i = 0; i < CC.size(); i++) {

			Entity e = CC.get(i);

			if ((SOP.containsAll(formalContext.getTargetAttributes(e)))) {

				Concept newconcept = ClfFactory.eINSTANCE.createConcept();
				newconcept.getIntent().addAll(
						formalContext.getTargetAttributes(e));
				newconcept.getExtent().add(e);
				SOO.add(e);

				for (int j = i + 1; j < CC.size(); j++) {

					Entity cc = CC.get(j);

					if (formalContext.getTargetAttributes(cc).size() == formalContext
							.getTargetAttributes(e).size()) {
						if (formalContext.getTargetAttributes(cc).equals(
								formalContext.getTargetAttributes(e))) {
							newconcept.getExtent().add(cc);
							CC.remove(cc);
							SOO.add(cc);
							j--;

						}
					} else {

						if (formalContext.getTargetAttributes(cc).containsAll(
								formalContext.getTargetAttributes(e))) {
							newconcept.getExtent().add(cc);
							SOO.add(cc);
						}

					}
				}

				classify(newconcept, false);

			}

		}

	}

	private void generateTopConcept() {

		Concept concept = conceptLattice.getTop();
		if (concept.getChildren().size() == 1) {

			if (concept.getChildren().get(0).getExtent().containsAll(
					concept.getExtent())) {
				conceptLattice.setTop(concept.getChildren().get(0));
				conceptLattice.getConcepts().remove(concept);
			}
		}

	}

	private void generateBottomConcept() {

		Concept bot = ClfFactory.eINSTANCE.createConcept();
		bot.getIntent().addAll(formalContext.getAttributes());
		classify(bot, false);

		if (bot.getParents().size() == 1) {

			for (Concept parent : bot.getParents()) {
				parent.getChildren().remove(bot);
			}
			conceptLattice.getConcepts().remove(bot);
		}
	}

	private void sortedIntentDecreasing(EList<Attribute> attributs) {

		ArrayList<ArrayList<Attribute>> t = new ArrayList<ArrayList<Attribute>>();

		for (int i = 0; i <= formalContext.getEntities().size(); i++) {
			t.add(new ArrayList<Attribute>());
		}

		for (Attribute a : attributs) {
			t.get(formalContext.getSourceEntities(a).size()).add(a);

		}

		for (int i = 0; i < t.size(); i++) {

			ArrayList<Attribute> atts = t.get(i);
			for (Attribute a : atts) {
				attributs.move(0, a);
			}

		}

	}

	private void sortedExtentsIncreasing(EList<Entity> extents) {

		ArrayList<ArrayList<Entity>> t = new ArrayList<ArrayList<Entity>>();

		for (int i = 0; i <= formalContext.getAttributes().size(); i++) {
			t.add(new ArrayList<Entity>());
		}

		for (Entity e : extents) {
			t.get(formalContext.getTargetAttributes(e).size()).add(e);

		}

		for (int i = 0; i < t.size(); i++) {

			ArrayList<Entity> a = t.get(i);

			for (Entity e : a) {
				extents.move(extents.size() - 1, e);

			}
		}

	}

}
