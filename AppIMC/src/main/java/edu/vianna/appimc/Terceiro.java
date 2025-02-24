package edu.vianna.appimc;

import edu.vianna.appimc.models.Pessoa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/terceiro")
public class Terceiro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    private void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pessoa p = new Pessoa(request.getParameter("fname"), Double.parseDouble(request.getParameter("fpeso")), Double.parseDouble(request.getParameter("faltura")));

        String page = "resultado.jsp";

        RequestDispatcher rd = request.getRequestDispatcher(page);
        rd.forward(request, response);

    }
}
