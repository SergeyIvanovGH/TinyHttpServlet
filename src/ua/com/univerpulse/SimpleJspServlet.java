package ua.com.univerpulse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by svivanov on 23.03.16.
 */
@WebServlet(name = "SimpleJspServlet", urlPatterns = {"/simplejspservlet"})
public class SimpleJspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/simplejsp.jsp");

        req.setAttribute("hello", new String("Hello from SimpleJspServlet! SetAttribute()"));

        List<User> users = new ArrayList<>();

        users.add(new User(20, "User number one"));
        users.add(new User(10, "User number two"));
        users.add(new User(18, "User number three"));

        req.setAttribute("users", users);

        dispatcher.forward(req,resp);
    }
}
