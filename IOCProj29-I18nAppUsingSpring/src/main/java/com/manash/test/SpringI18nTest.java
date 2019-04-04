package com.manash.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null;
		String label1=null,label2=null,label3=null,label4=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create IOC container 
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		////create locale class object
		locale=new Locale(args[0], args[1]);
		//get locale messages from IOC container
		label1=ctx.getMessage("btn.caps1", null ,"cap1", locale);
		label2=ctx.getMessage("btn.caps2" ,null ,"cap2", locale);
		label3=ctx.getMessage("btn.caps3", null ,"cap3", locale);
		label4=ctx.getMessage("btn.caps4", null ,"cap1", locale);
		System.out.println(label1+"   "+label2+"  "+label3+"  "+label4);
		//create frame window
		frame=new JFrame("SPring I18n Apps");
		//create buttons for the frame
		btn1=new JButton(label1);
		frame.add(btn1);
		btn2=new JButton(label2);
		frame.add(btn2);
		btn3=new JButton(label3);
		frame.add(btn3);
		btn4=new JButton(label4);
		frame.add(btn4);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		((AbstractApplicationContext) ctx).close();
	}
}
