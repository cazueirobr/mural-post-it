package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.util.Constants;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "InfoServlet", value = "/info")
public class InfoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer visitantes = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
        Integer numberOfVisit = (Integer) request.getSession(true).getAttribute(Constants.COUNTER_SESSION);
        System.out.println(numberOfVisit);
        request.setAttribute("visitantes", visitantes);
        request.setAttribute("numeroVisita", numberOfVisit);
        request.getRequestDispatcher("/WEB-INF/view/screen/info.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
