package com.manash.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.service.CBuzzLocalScoreService;
import com.manash.service.CBuzzLocalScoreServiceImp;

public class MainControllerServlet extends HttpServlet {
	ApplicationContext ctx;
	CBuzzLocalScoreService service;
	@Override
	public void init() throws ServletException {
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("lService",CBuzzLocalScoreServiceImp.class);
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid=0;
		String matchScore=null;
		RequestDispatcher rd=null;
		mid=Integer.parseInt(req.getParameter("matchID"));
		matchScore=service.searchScore(mid);
		//keep the results in request scope
		req.setAttribute("matchScore",matchScore);
		//forward request to result.jsp
		rd=req.getRequestDispatcher("/view_score.jsp");
		rd.forward(req,res);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  doGet(req,res);
	}
	@Override
	public void destroy() {
		//Nullify the objects
		service=null;
		((AbstractApplicationContext) ctx).close();
	}


}
