package com.janadri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class ServletSq extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		Cookie cookies[] = req.getCookies();
		
		int k = 0;
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
			k  = Integer.parseInt(c.getValue());
		}
		
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The square of the number is : " +k);
	}
}
