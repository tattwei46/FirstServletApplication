package com.davidcheah.webapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("GET request received " + request.getParameter("item"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("POST request received " + request.getParameter("item"));
	}
}
