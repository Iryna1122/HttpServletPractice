package com.example.httpservletpractice;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String message1;

    public void init() {
        message = "Any fool can write code that a computer can understand. Good programmers write code that humans can understand";
   message1="Мартін Фаулер";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<blockquote >" + "<p>" +message+"</p>" + "<footer>"+message1 +"</footer>"+"</blockquote >");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}