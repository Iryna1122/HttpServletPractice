package com.example.httpservletpractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="anketaServlet", value = "/anketa-servlet")
public class AnketaServlet extends HttpServlet {

    private String name;
    private String phone;
    private String email;
    private int age;
    private boolean spam;
    private String sex;


    public void init()
    {
        name="";
        phone="";
        email="";
        age=0;
        spam=false;
        sex="";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        getServletContext().getRequestDispatcher("/Anketa/anketa.jsp").forward(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        name=request.getParameter("name");
        email=request.getParameter("email");
        phone=request.getParameter("phone");
        age= Integer.parseInt(request.getParameter("age"));
        spam = Boolean.parseBoolean(request.getParameter("spam"));
        sex=request.getParameter("sex");

        out.println("<html><body>");
        out.println("<p>Your name: " + name + " </p>");
        out.println("<p>Your phone: " + phone + " </p>");
        out.println("<p>Your email: " + email + " </p>");
        out.println("<p>Your age: " + age + " </p>");
        out.println("<p>Your decision: " + spam + " </p>");
        out.println("<p>Your sex: " + sex + " </p>");

        out.println("</html></body>");
    }
}
