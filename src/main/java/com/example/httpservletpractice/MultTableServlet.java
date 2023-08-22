package com.example.httpservletpractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="multServlet", value ="/mult-servlet")
public class MultTableServlet extends HttpServlet {

    private int num1;


    public void init() {
        num1=0;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        getServletContext().getRequestDispatcher("/Mult/mult.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        num1 = Integer.parseInt(request.getParameter("number"));
        out.println("<html><body>");
        out.println("<p>Multiply table for number " + num1 + ": </p>");
        if(num1>0){
            out.println("<table border='1'>");
            for (int i = 1; i <= 10; i++) {
                out.println("<tr><td>" + num1 + " * " + i + "</td><td>" + (num1 * i) + "</td></tr>");
            }
            out.println("</table>");
        }
        out.println("</html></body>");




    }
}
