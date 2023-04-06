package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.model.domain.PostIt;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FormularioController", value = "/adicionar-post")
public class FormularioController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/screen/adicionar.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tema = request.getParameter("cor");
        String idColaborador = request.getParameter("colaborador");
        String texto = request.getParameter("mensagem");

        Integer idColaboradorInt = Integer.parseInt(idColaborador);


        PostIt postit = new PostIt(tema, idColaborador, texto);
        request.setAttribute("flash.postit", postit);
        request.setAttribute("flash.colaborador", idColaborador);

        response.sendRedirect("adicionar-post-it");

    }
}
