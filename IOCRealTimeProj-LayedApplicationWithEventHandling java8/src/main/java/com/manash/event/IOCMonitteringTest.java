package com.manash.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCMonitteringTest implements ApplicationListener {
	long pStart,cStart;
	long pEnd,cEnd;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event);
		if(event.toString().contains("Refreshed") && event.toString().contains("parent")) {
			cStart= System.currentTimeMillis();
		}
		else if(event.toString().contains("Refreshed") && !event.toString().contains("parent")) {
			pStart=System.currentTimeMillis();
		}
	    if(event.toString().contains("Closed") && event.toString().contains("parent")){
			cEnd=System.currentTimeMillis();
		}
		else if(event.toString().contains("Closed") && !event.toString().contains("parent")){
			pEnd=System.currentTimeMillis();
			System.out.println("Child Container Taking Time::"+(cEnd-cStart));
			System.out.println("Parent Container Taking Time"+(pEnd-pStart));
		}
		
		
		
	}

}
