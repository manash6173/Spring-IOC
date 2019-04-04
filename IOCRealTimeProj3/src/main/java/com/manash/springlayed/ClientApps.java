package com.manash.springlayed;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.manash.controler.MainControler;
import com.manash.vo.StudentVO;

public class ClientApps {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		StudentVO vo=null;
		Scanner scn=null;
		MainControler controler=null;
		String result=null;
		//read inputs from enduser
		vo=new StudentVO();
		try {
		scn=new Scanner(System.in);
		System.out.println("Enter Student Name::");
		vo.setSname(scn.next());
		System.out.println("Enter Student Marks1::");
		vo.setM1(scn.next());
		System.out.println("Enter Student Marks2::");
		vo.setM2(scn.next());
		System.out.println("Enter Student Marks3::");
		vo.setM3(scn.next());
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
		//get controller class objects
		controler=factory.getBean("sControler",MainControler.class);
		result=controler.generateResult(vo);
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











