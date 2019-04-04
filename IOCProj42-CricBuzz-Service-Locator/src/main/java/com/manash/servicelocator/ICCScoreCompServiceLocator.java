package com.manash.servicelocator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.manash.external.DubaiICCScoreComp;
import com.manash.external.DubaiICCScoreCompImp;

public class ICCScoreCompServiceLocator implements FactoryBean<DubaiICCScoreComp> {
	private Map<String, DubaiICCScoreComp> cache = new HashMap<>();
	private String jndi;

	public ICCScoreCompServiceLocator(String jndi) {
		super();
		this.jndi = jndi;
	}

	@Override
	public DubaiICCScoreComp getObject() throws Exception {
		DubaiICCScoreComp extComp = null;
		if (!cache.containsKey(jndi)) {
			extComp = new DubaiICCScoreCompImp();
			cache.put(jndi, extComp);
		}

		return cache.get(jndi);
	}

	@Override
	public Class<?> getObjectType() {

		return DubaiICCScoreCompImp.class;
	}

	@Override
	public boolean isSingleton() {

		return true;
	}

}
