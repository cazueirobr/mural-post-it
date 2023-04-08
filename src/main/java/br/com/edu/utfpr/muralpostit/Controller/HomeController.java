package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.util.Constants;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counterOfVisitors(request, response);
        request.getRequestDispatcher("/WEB-INF/view/screen/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void counterOfVisitors(HttpServletRequest request, HttpServletResponse response){
        boolean meuAtributo = (boolean) request.getAttribute("visitor");
        if (meuAtributo == true) {

            Integer notasCriadas = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
            if (notasCriadas == null) {
                notasCriadas = 0;
            }
            notasCriadas++;

            getServletContext().setAttribute(Constants.COUNTER_APPLICATION, notasCriadas);
            Cookie visitCookie = new Cookie("visitante", String.valueOf(1));


            visitCookie.setMaxAge(60);
            response.addCookie(visitCookie);


            int sessionNumberVisit = notasCriadas;
            System.out.println(sessionNumberVisit);

            request.getSession(true).setAttribute(Constants.COUNTER_SESSION, sessionNumberVisit);


            Cookie numberVisit = new Cookie("numero_visitante", String.valueOf(notasCriadas));
            response.addCookie(numberVisit);
        }
        else {


        }


    }
}
