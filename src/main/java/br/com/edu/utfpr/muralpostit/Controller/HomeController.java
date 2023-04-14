package br.com.edu.utfpr.muralpostit.Controller;

import br.com.edu.utfpr.muralpostit.service.PostItService;
import br.com.edu.utfpr.muralpostit.util.Constants;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeController extends HttpServlet {
    PostItService postItService = new PostItService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counterOfVisitors(request, response);

        request.setAttribute("postits", postItService.findAll());
        request.getRequestDispatcher("/WEB-INF/view/screen/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void counterOfVisitors(HttpServletRequest request, HttpServletResponse response){
        boolean visitor = (boolean) request.getAttribute("visitor");
        if (visitor) {

            Integer visit = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
            if (visit == null) {
                visit = 0;
            }
            visit++;

            getServletContext().setAttribute(Constants.COUNTER_APPLICATION, visit);
            Cookie visitCookie = new Cookie("visitante", String.valueOf(1));


            visitCookie.setMaxAge(60);
            response.addCookie(visitCookie);


            int sessionNumberVisit = visit;

            request.getSession(true).setAttribute(Constants.COUNTER_SESSION, sessionNumberVisit);


            Cookie numberVisit = new Cookie("numero_visitante", String.valueOf(visit));
            response.addCookie(numberVisit);
        }



    }
}
