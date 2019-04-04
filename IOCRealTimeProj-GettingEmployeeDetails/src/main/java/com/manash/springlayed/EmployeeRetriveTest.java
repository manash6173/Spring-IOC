package com.manash.springlayed;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.controler.EmployeeControler;
import com.manash.vo.EmployeeVO;
import com.sun.xml.internal.ws.policy.sourcemodel.attach.ExternalAttachmentsUnmarshaller;

public class EmployeeRetriveTest {

	public static void main(String[] args) {
		Scanner scn=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EmployeeControler controler=null;
		List<EmployeeVO> empvo=null;
		String desg=null;
		try {
			scn=new Scanner(System.in);
			System.out.println("Enter Designation:");
			desg=scn.nextLine().toUpperCase();
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get bean class object
			controler=factory.getBean("eControler",EmployeeControler.class);
			empvo=controler.foundEmployee(desg);
			Iterator<?> it=empvo.iterator();
			while(it.hasNext()) {
				EmployeeVO empvo1=(EmployeeVO) it.next();
				System.out.println(empvo1.getEname()+" "+empvo1.getDesg()+"  "+empvo1.getSalary());
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
