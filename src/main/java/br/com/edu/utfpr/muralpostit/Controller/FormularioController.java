package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.model.domain.Employer;
import br.com.edu.utfpr.muralpostit.model.domain.PostIt;
import br.com.edu.utfpr.muralpostit.model.dto.PostItDTO;
import br.com.edu.utfpr.muralpostit.model.mapper.PostItMapper;
import br.com.edu.utfpr.muralpostit.service.EmployerService;
import br.com.edu.utfpr.muralpostit.service.PostItService;



import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FormularioController", value = "/adicionar-post")
public class FormularioController extends HttpServlet {

    PostItService postItService = new PostItService();
    EmployerService employerService = new EmployerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(employerService.findAll().get(0).getNome());
        request.setAttribute("colaboradores", employerService.findAll());
        request.getRequestDispatcher("/WEB-INF/view/screen/adicionar.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tema = request.getParameter("cor");
        String idColaborador = request.getParameter("colaborador");
        String texto = request.getParameter("mensagem");

        Integer idColaboradorInt = Integer.parseInt(idColaborador);

        Employer colaborador = new Employer("Matheus");
        employerService.save(colaborador);
        PostIt postit = new PostIt(tema, colaborador, texto);
        postItService.save(postit);
        //PostItDTO postitDTO = PostItMapper.toDTO(postit);

        request.setAttribute("flash.postit", postit);
        request.setAttribute("flash.colaborador", idColaborador);



        response.sendRedirect("adicionar-post-it");

    }
}
