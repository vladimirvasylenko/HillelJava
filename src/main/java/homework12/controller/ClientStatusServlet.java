package homework12.controller;

import homework12.service.ClientService;
import homework12.service.ClientStatusService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/clients_statuses")
public class ClientStatusServlet extends HttpServlet {
    private final ClientStatusService clientService = new ClientStatusService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clientsStatuses", clientService.findAllClientsStatuses());
        req.getRequestDispatcher("views/clientsStatus.jsp").forward(req, resp);
    }
}
