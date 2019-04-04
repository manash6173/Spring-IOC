package com.manash.test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;

public class I18nTest {

	public static void main(String[] args) {
		String label1=null,label2=null,label3=null,label4=null;
		Locale locale=null;
		ResourceBundle bundle=null;
		Button btn1=null,btn2=null,btn3=null,btn4=null;
		JFrame frame=null;
		//create Jframe page
        frame=new JFrame("I18nApp");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.pack();
        locale=new Locale(args[0], args[1]);
        bundle=ResourceBundle.getBundle("com/manash/commons/App",locale);
        //get properti values
        label1=bundle.getString("btn.caps1");
        label2=bundle.getString("btn.caps2");
        label3=bundle.getString("btn.caps3");
        label4=bundle.getString("btn.caps4");
        //create buttons
        btn1=new Button(label1);
        btn2=new Button(label2);
        btn3=new Button(label3);
        btn4=new Button(label4);
        //add buttons to frame page
        frame.add(btn1);frame.add(btn2);frame.add(btn3);frame.add(btn4);
        System.out.println(label1+"\n"+label2+"\n"+label3+"\n"+label4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
