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
        processamento(request, response);
        request.getRequestDispatcher("/WEB-INF/view/screen/form-result.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }


    private void processamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] visitantes = request.getCookies();
        String cookieValue = null;
        if (visitantes != null) {
            for (Cookie cookie : visitantes) {
                if (cookie.getName().equals("visitante")) {
                    cookieValue = cookie.getValue();
                    break;
                }
            }
        }

        if (cookieValue == null) {
            Integer notasCriadas = null;
            notasCriadas = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
            if (notasCriadas == null) {
                notasCriadas = 0;
            }
            notasCriadas++;

            getServletContext().setAttribute(Constants.COUNTER_APPLICATION, notasCriadas);
            Cookie cookie = new Cookie("visitante", String.valueOf(1));

            cookie.setMaxAge(60);
            response.addCookie(cookie);
        }

    }


}


