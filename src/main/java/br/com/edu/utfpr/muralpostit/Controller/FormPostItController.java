package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.model.domain.Employer;
import br.com.edu.utfpr.muralpostit.model.domain.PostIt;
import br.com.edu.utfpr.muralpostit.service.EmployerService;
import br.com.edu.utfpr.muralpostit.service.PostItService;



import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FormPostItController", value = "/adicionar-post")
public class FormPostItController extends HttpServlet {

    PostItService postItService = new PostItService();
    EmployerService employerService = new EmployerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("colaboradores", employerService.findAll());
        request.getRequestDispatcher("/WEB-INF/view/screen/adicionar.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String theme = request.getParameter("cor");
        String idColaborador = request.getParameter("colaboradores");
        String text = request.getParameter("mensagem");

        Integer valor = Integer.parseInt(idColaborador);
        
        employerService.getById(1);


        PostIt postit = new PostIt(theme, employerService.getById(valor), text);
        postItService.save(postit);


        request.setAttribute("flash.postit", postit);
        request.setAttribute("flash.colaborador", idColaborador);



        response.sendRedirect("adicionar-post-it");

    }
}
