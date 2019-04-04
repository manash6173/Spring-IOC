package com.manash.test;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.controler.MainControler;
import com.manash.vo.EmployeeVO;

public class SpringLayedWithNastedBean {

	public static void main(String[] args) {
	    ApplicationContext ctx=null;
		MainControler controler=null;
		List<EmployeeVO> listVO=null;
		String desg=null;
		Scanner scn=null;
		//create IOC Container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
			//get target bean class object from IOC container
			try {
				scn=new Scanner(System.in);
				System.out.println("Enter Designation::");
				desg=scn.nextLine().toUpperCase();
				controler=ctx.getBean("controler",MainControler.class);
				listVO=controler.getEmployeeByDesg(desg);
				System.out.println();
				listVO.forEach(vo->{
					System.out.println(vo);
				});
				System.out.println(System.getProperties());
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//close container
			  ctx.close();
	}

}
