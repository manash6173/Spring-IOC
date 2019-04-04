package com.manash.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.manash.controler.MainControler;
import com.manash.vo.EmployeeVO;

public class SpringLayedWithNastedBean {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		MainControler controler=null;
		List<EmployeeVO> listVO=null;
		String desg=null;
		Scanner scn=null;
		//PropertyPlaceholderConfigurer configurer=null;
		 PropertySourcesPlaceholderConfigurer configurer=null;
		pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/manash/cfgs/business-beans.xml");
		
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/manash/cfgs/presentation-beans.xml");
		
		/*configurer=pFactory.getBean(PropertyPlaceholderConfigurer.class);
		configurer.postProcessBeanFactory(pFactory);*/
		
		configurer=pFactory.getBean(PropertySourcesPlaceholderConfigurer.class);
		configurer.postProcessBeanFactory(pFactory);
			//get target bean class object from IOC container
			try {
				scn=new Scanner(System.in);
				System.out.println("Enter Designation::");
				desg=scn.nextLine().toUpperCase();
				controler=cFactory.getBean("eControler",MainControler.class);
				listVO=controler.getEmployeeByDesg(desg);
				System.out.println();
				listVO.forEach(vo->{
					System.out.println(vo);
				});
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}
