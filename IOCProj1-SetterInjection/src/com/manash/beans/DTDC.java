package com.manash.beans;

import java.util.Date;

public class DTDC {
	public String delivery(int oid) {
		return oid+"order delivery to customer in the "+new Date()+"by DTDC courier";
	}

}
