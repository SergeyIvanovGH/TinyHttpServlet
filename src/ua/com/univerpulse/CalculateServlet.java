package ua.com.univerpulse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation = req.getParameter("operation");
        double operand1Value = 0;
        double operand2Value = 0;
        try {
            operand1Value = Double.parseDouble(req.getParameter("operand1"));
            operand2Value = Double.parseDouble(req.getParameter("operand2"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return;
        }

        TinyHttpCalculate calculate = new TinyHttpCalculate(operand1Value, operand2Value, operation);

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>CalculateServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information:</h3>");
        out.println("<p>Operation: " + calculate.getOperation().getShortOperationName() +"<br/>");
        out.println("Value of Operand1: " + operand1Value + "<br/>");
        out.println("Value of Operand2: " + operand2Value + "</p>");
        out.println("<p><strong>Result: " + calculate.calculate() + "</strong></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
