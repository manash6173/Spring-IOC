package com.manash.beans;

public class BankAccount {
	private long accno;
	private String accholder;
	private float dalance;
	private int bankcode;
	public BankAccount(long accno, String accholder, float dalance, int bankcode) {
		System.out.println("BAnkAccount Constructor!!");
		this.accno = accno;
		this.accholder = accholder;
		this.dalance = dalance;
		this.bankcode = bankcode;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", accholder=" + accholder + ", dalance=" + dalance + ", bankcode="
				+ bankcode + "]";
	}
	

}
