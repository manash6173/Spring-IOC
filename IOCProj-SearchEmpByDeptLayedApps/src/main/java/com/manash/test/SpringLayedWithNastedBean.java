package com.manash.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.controler.MainControler;
import com.manash.vo.DeptVO;

public class SpringLayedWithNastedBean {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		MainControler controler=null;
		List<DeptVO> listVO=null;
		int deptno=0;
		Scanner scn=null;
		pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/manash/cfgs/business-beans.xml");
		
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/manash/cfgs/presentation-beans.xml");
			//get target bean class object from IOC container
			try {
				scn=new Scanner(System.in);
				System.out.println("Enter DeptNo::");
				deptno=scn.nextInt();
				controler=cFactory.getBean("eControler",MainControler.class);
				listVO=controler.getByDeptNo(deptno);
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
