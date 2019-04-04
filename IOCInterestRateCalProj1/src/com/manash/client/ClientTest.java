package com.manash.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.manash.controler.MainControler;
import com.manash.vo.RateOfInterestVO;

public class ClientTest {
	
	public static void main(String[] args) {
		BeanFactory factory=null;
		MainControler controler;
		String result=null;
		Scanner scn=null;
		RateOfInterestVO vo=null;
		vo=new RateOfInterestVO();
			try {
				scn=new Scanner(System.in);
				//read inputs
				if(scn!=null)
				System.out.println("Enter Principal Amount::");
				vo.setPrincipal(scn.next());
				System.out.println("Enter Rate::");
				vo.setRate(scn.next());
				System.out.println("Enter Year::");
				vo.setTime(scn.next());
		//create bean factory
		factory=new XmlBeanFactory(new ClassPathResource("com/manash/cfgs/applicationContext.xml"));
		//get controller class object
		controler=factory.getBean("controler",MainControler.class);
		result=controler.interestAmount(vo);
		System.out.println(result);
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
