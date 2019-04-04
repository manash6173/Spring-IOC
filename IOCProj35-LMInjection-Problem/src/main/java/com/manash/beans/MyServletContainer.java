package com.manash.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware{
	ApplicationContext ctx;
	public MyServletContainer() {
		System.out.println("MyServletContainer::o-param Constructor");
	}
	public void processRequest(String data) {
		RequestHandler handler=null;
		handler=ctx.getBean("rh",RequestHandler.class);
		handler.handler(data);
	}
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
         this.ctx=ctx;	
	}
}
