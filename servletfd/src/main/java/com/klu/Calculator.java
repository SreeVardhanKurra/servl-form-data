package com.klu;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
  private static final long serialVersionUID = 1L;
      
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int A=Integer.parseInt(request.getParameter("A"));
    int B=Integer.parseInt(request.getParameter("B"));
    int C=A+B;
    response.setContentType("text/html");
    PrintWriter pw=response.getWriter();
    pw.print("Sum ="+C);
    
    
  }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int A=Integer.parseInt(request.getParameter("A"));
    int B=Integer.parseInt(request.getParameter("B"));
    int C=A-B;
    response.setContentType("text/html");
    PrintWriter pw=response.getWriter();
    pw.print("Subtract ="+C);
  }

}
//calculator.java