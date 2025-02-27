import edu.vianna.calccombustivel.models.Combustivel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/primeiro")
public class CombustivelServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Combustivel g = new Combustivel(Double.parseDouble(request.getParameter("gasolina")), Double.parseDouble(request.getParameter("gasolina")));

        request.setAttribute("combustivel", g);
        RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
        rd.forward(request, response);
    }
}
