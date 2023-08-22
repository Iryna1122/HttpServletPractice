package com.example.httpservletpractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "guessServlet", value = "/guess-servlet")
public class GuessNumServlet extends HttpServlet {

    private int userNumber;
    private int count;
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;

    public void init()
    {
        userNumber=0;
        count=0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        getServletContext().getRequestDispatcher("/GuessNumber/guessnum.jsp").forward(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        userNumber = Integer.parseInt(request.getParameter("num"));
        out.println("<html><body>");
        out.println("<p>Your number: " + userNumber + ": </p>");

        if (userNumber >= MIN_NUMBER && userNumber <= MAX_NUMBER) {
            int computerGuess;

            do {
                computerGuess = guessNumber(MIN_NUMBER, MAX_NUMBER);
                out.println("<p>Комп'ютер вгадав число: " + computerGuess + "</p>");
                count++;
            } while (userNumber != computerGuess);

            out.println("<p>Комп'ютер вгадав число! з " + count+ " разу</p>");
        } else {
            out.println("Wrong number!");
        }

        out.println("</body></html>");
    }

    private int guessNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
