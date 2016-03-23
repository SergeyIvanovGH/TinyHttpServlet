package ua.com.univerpulse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by svivanov on 23.03.16.
 */
@WebServlet(name = "SimpleServlet", urlPatterns = {"/simpleservlet"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Request Information Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information Example</h3>");
        out.println("Method: " + req.getMethod());
        out.println("Request URI: " + req.getRequestURI());
        out.println("Protocol: " + req.getProtocol());
        out.println("PathInfo: " + req.getPathInfo());
        out.println("Remote Address: " + req.getRemoteAddr());
        out.println("</body>");
        out.println("</html>");    }
}
