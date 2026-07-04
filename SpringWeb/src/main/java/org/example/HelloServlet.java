package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//accept request and send response
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    //gets executed whenever a req comes and send res
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");


        res.setContentType("text/html");

        //1st way to send data
        //res.getWriter().println("Hello World");

        //2nd way
        PrintWriter out = res.getWriter();
//        out.println("Hello World");

        out.println("<h2><b>Hello World</b></h2>");
    }

}
