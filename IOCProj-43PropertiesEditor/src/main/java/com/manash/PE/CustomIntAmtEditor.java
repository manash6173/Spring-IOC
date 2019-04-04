package com.manash.PE;

import java.beans.PropertyEditorSupport;

public class CustomIntAmtEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt=Integer.parseInt(text.substring(0,text.indexOf(",")));
		float 
		
	}

}
