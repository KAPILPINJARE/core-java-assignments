package com.capgemini.dollarconversion.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dollarconverter")
public class DollarConversionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DollarConversionController() {
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int value = Integer.parseInt(request.getParameter("number"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("dollarTable.jsp");
		request.setAttribute("value", value);
		dispatcher.forward(request, response);
	}

}
