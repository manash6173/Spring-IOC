package com.manash.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		List<String> empList = null;
		List<Date> dateList = null;
		Set<Long> phoneNo = null;
		Set<Date> dateSet = null;
		Map<String, String> capitals = null;
		Map<String, Date> dateMap = null;
		Properties colors = null;
		try {
			factory = new DefaultListableBeanFactory();
			reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			// get List class objects
			empList = factory.getBean("empList", ArrayList.class);
			dateList = factory.getBean("dateList", ArrayList.class);
			System.out.println(empList.getClass());
			System.out.println("--------------------------------");
			System.out.println(empList);
			System.out.println();
			System.out.println(dateList.getClass());
			System.out.println("--------------------------------");
			System.out.println(dateList);
			System.out.println("==================================");
			// get Set class objects
			phoneNo = factory.getBean("phoneNo", HashSet.class);
			dateSet = factory.getBean("dateSet", HashSet.class);
			System.out.println(phoneNo.getClass());
			System.out.println(dateSet.getClass());
			System.out.println("------------------------------------");
			System.out.println(phoneNo);
			System.out.println(dateSet);
			System.out.println("=================================================");
			// get Map class objects
			capitals = factory.getBean("capitals", HashMap.class);
			dateMap = factory.getBean("dateMap", Hashtable.class);
			System.out.println("------------------------------------");
			System.out.println(capitals.getClass());
			System.out.println(capitals);
			System.out.println(dateMap.getClass());
			System.out.println(dateMap);
			System.out.println("====================================================================");
			// get Properties class objects
			colors = factory.getBean("colors", Properties.class);
			System.out.println(colors.getClass());
			System.out.println(colors);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
