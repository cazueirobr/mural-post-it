package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.model.domain.Employer;
import br.com.edu.utfpr.muralpostit.service.EmployerService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FormEmployerServlet", value = "/adicionar-colaborador")
public class FormEmployerServlet extends HttpServlet {
    EmployerService employerService = new EmployerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/screen/employer-form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nome");
        String secondName = request.getParameter("sobrenome");

        String fullName = name + " " + secondName;

        Employer employer = new Employer(fullName);
        employerService.save(employer);

        response.sendRedirect("/mural-home");

    }
}
