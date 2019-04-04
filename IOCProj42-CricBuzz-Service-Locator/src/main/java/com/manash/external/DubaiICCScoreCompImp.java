package com.manash.external;

public class DubaiICCScoreCompImp implements DubaiICCScoreComp {

	@Override
	public String getScore(int mid) {
		if (mid==1001) {
			return "IND Vs AUS-->Ind-200/2"; 
		}
		else if(mid==2001) {
			return "ENG Vs PAK-->Eng-300/6";
		}
		return "No musch found" ;
	}

}