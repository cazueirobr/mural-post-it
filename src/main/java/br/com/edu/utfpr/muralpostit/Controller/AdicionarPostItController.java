package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.util.Constants;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;




@WebServlet(name = "AdicionarPostItController", value = "/adicionar-post-it")
public class AdicionarPostItController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        request.getRequestDispatcher("/WEB-INF/view/screen/form-result.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }





}


