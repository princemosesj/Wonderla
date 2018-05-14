package com.hcl.common.characters;


import java.util.ResourceBundle;
/**
 * This class represents the SQL related static variables used
 * across this product.
 * @author sibic
 *
 */
public enum CCharacter{
	ASTERIX,
	CLOSING_PARENTHESIS,
	COLON,
	COMMA,
	DOT,
	EQUALS,
	HYPHEN,
	NOT_EQUALS,
	OPENING_PARENTHESIS,
	SEMI_COLON,
	SINGLE_QUOTE,
	DOUBLE_QUOTE,
	GREATER_THAN,
	LESSER_THAN,
	ZERO,
	PERCENTAGE,
	BACKSLASH,
	FORWARDDOUBLESLASH,
	FORWARDSLASH,
	SPACE,
	NO_TEXT,
	;
	public final String SPACE_VALUE = " ";
	
	public String getName(){
		
		if(this.equals(SPACE)){
			return SPACE_VALUE;
		}
		else{
			ResourceBundle bundle = ResourceBundle.getBundle(CCharacter.class.getName());
			return bundle.getString(name());
		}

	}
	
	@Override
	public String toString(){
		return getName();
	}
}
