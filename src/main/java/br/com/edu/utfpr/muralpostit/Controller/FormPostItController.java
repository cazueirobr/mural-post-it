package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.model.domain.PostIt;
import br.com.edu.utfpr.muralpostit.service.EmployerService;
import br.com.edu.utfpr.muralpostit.service.PostItService;



import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PostItFormController", value = "/adicionar-post")
public class PostItFormController extends HttpServlet {

    PostItService postItService = new PostItService();
    EmployerService employerService = new EmployerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("colaboradores", employerService.findAll());
        request.getRequestDispatcher("/WEB-INF/view/screen/adicionar.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tema = request.getParameter("cor");
        String idColaborador = request.getParameter("colaborador");
        String texto = request.getParameter("mensagem");

        long valor = Long.parseLong(idColaborador);






        PostIt postit = new PostIt(tema,employerService.getById(valor), texto);
        postItService.save(postit);


        request.setAttribute("flash.postit", postit);
        request.setAttribute("flash.colaborador", idColaborador);



        response.sendRedirect("adicionar-post-it");

    }
}
