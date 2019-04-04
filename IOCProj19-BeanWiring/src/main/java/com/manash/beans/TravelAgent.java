package com.manash.beans;

import java.util.Calendar;
import java.util.Date;

public class TravelAgent {
	private TourPlan tp1,tp2;
	public TravelAgent() {
		System.out.println("TravelAgent:0-param constructor");
	}
	public TravelAgent(TourPlan tp1) {
		this.tp1 = tp1;
		System.out.println("TravelAgent:1-param constructor");
	}
	private Calendar cl;
	public void setCl(Calendar cl) {
		this.cl = cl;
	}
   public void setTp(TourPlan tp2) {
	   System.out.println("TravelAgent.setTp()");
		this.tp2 = tp2;
	}
   public void executePlan() {
	   System.out.println(tp1+"  places are visited on date "+cl);
	   System.out.println("=======================================");
	   System.out.println(tp2+"  places are visited on date "+cl);
   }
}
