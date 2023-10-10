package by.javaguru.git.mergeexperience;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/module2")
public class Module2Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Модуль 2";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<div id=\"buttons\" style=\"float:left; height:100%; width:100%\">");
        out.println("<div id=\"previous\" style=\"float:left; width:25%; \">");
        out.println("<button type=\"button\">\"<- Предыдущий модуль\"</button>");
        out.println("</div>");

        out.println("<div id=\"next\" style=\"float:left; width:25%; \">");
        out.println("<button type=\"button\">\"Следующий модуль ->\"</button>");
        out.println("</div>");
        out.println("</div>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}