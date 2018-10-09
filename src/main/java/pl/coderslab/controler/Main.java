package pl.coderslab.controler;

import pl.coderslab.model.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;

import static pl.coderslab.dao.OrderDAO.loadAllorders;

@WebServlet(name = "Main", urlPatterns = "/main")
public class Main extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            ArrayList<Order> orders = loadAllorders();
            request.setAttribute("orders", orders);
            getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}