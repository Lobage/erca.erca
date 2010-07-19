package com.googlecode.erca.framework.io.in;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.BinaryAttribute;
import com.googlecode.erca.CompositeAttribute;
import com.googlecode.erca.ErcaFactory;
import com.googlecode.erca.ValuedAttribute;

public class RcaParsingUtils {

	public static Attribute attributeFromText(String s) {
		if ( s.startsWith("(") ) {
			if ( s.startsWith("(("))
				return compositeAttributeFromText(s);
			else
				return valuedAttributeFromText(s);
		}
		else
			return binaryAttributeFromText(s);
	}

	public static BinaryAttribute binaryAttributeFromText(String s) {
		BinaryAttribute b = ErcaFactory.eINSTANCE.createBinaryAttribute();
		b.setName(s.trim());
		return b;
	}

	public static ValuedAttribute valuedAttributeFromText(String s) {
		ValuedAttribute v = ErcaFactory.eINSTANCE.createValuedAttribute();
		String[] tokens = s.substring(1,s.length()-1).split("\\,");
		v.setName(tokens[0].trim());
		v.setValue(tokens[1].trim());
		return v;
	}

	public static CompositeAttribute compositeAttributeFromText(String s) {
		CompositeAttribute c = ErcaFactory.eINSTANCE.createCompositeAttribute();
		s = s.substring(1,s.length() - 1);
		String[] tokens = s.split("\\)");
		for(String token: tokens) {
			if ("".equals(token))
				continue;
			else if ( token.startsWith(",") )
				token = token.substring(1,token.length());
			token += ")";
			c.getAttributes().add(valuedAttributeFromText(token));
		}
		return c;
	}

}
