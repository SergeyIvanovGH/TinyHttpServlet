package ua.com.univerpulse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by svivanov on 23.03.16.
 */
//@WebServlet(name = "CalculateServlet", urlPatterns = {"/calculate"})
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation = req.getParameter("operation");
        Double operand1Value = Double.parseDouble(req.getParameter("operand1"));
        Double operand2Value = Double.parseDouble(req.getParameter("operand2"));

        TinyHttpCalculate calculate = new TinyHttpCalculate(operand1Value, operand2Value, operation);

        resp.setContentType("text/html");

        switch (operation) {
            case "add": {
                operation = "Addition";
                break;
            }
            case "sub": {
                operation = "Subtraction";
                break;
            }
            case "mul": {
                operation = "Multiplication";
                break;
            }
            case "div": {
                operation = "Division";
                break;
            }
        }
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>CalculateServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information:</h3>");
        out.println("<p>Operation: " + operation+"<br/>");
        out.println("Value of Operand1: " + operand1Value + "<br/>");
        out.println("Value of Operand2: " + operand2Value + "</p>");
        out.println("<p><strong>Result: " + calculate.calculate() + "</strong></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
