package com.manash.bpp;



import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.manash.bo.BaseBO;

public class DOJPostProcess implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       System.out.println("DOJPostProcess.postProcessBeforeInitialization()");
       if (bean instanceof BaseBO) {
    	   ((BaseBO)bean).setDoj(new Date());
		
	}
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DOJPostProcess.postProcessAfterInitialization()");
		return bean;
	}

}