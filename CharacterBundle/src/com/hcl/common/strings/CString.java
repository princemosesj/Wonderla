package com.hcl.common.strings;


import java.util.ResourceBundle;
/**
 * This class represents the SQL related static variables used
 * across this product.
 * @author sibic
 *
 */
public enum CString{
	For,
	null_Text,
	;

	public String getName(){
		ResourceBundle bundle = ResourceBundle.getBundle(CString.class.getName());
		return bundle.getString(name());

	}
	
	@Override
	public String toString(){
		return getName();
	}

}
