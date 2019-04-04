package com.manash.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.controler.MainControler;
import com.manash.vo.EmployeeVO;

public class SpringLayedWithNastedBeanUsingApplicationContext {

	public static void main(String[] args) {
		ApplicationContext pCtx=null,cCtx=null;
		MainControler controler=null;
		List<EmployeeVO> listVO=null;
		String desg=null;
		Scanner scn=null;
		
		pCtx=new ClassPathXmlApplicationContext("com/manash/cfgs/business-beans.xml");
		cCtx=new ClassPathXmlApplicationContext(new String[]{"com/manash/cfgs/presentation-beans.xml"}, pCtx);
		
			//get target bean class object from IOC container
			try {
				scn=new Scanner(System.in);
				System.out.println("Enter Designation::");
				desg=scn.nextLine().toUpperCase();
				controler=cCtx.getBean("eControler",MainControler.class);
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
			((AbstractApplicationContext) cCtx).close();
			((AbstractApplicationContext) pCtx).close();
			
	}

}
