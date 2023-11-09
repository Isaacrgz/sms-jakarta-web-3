package mx.com.jakartaEE.sms.web;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;
import mx.com.jakartaEE.sms.domain.User;
import mx.com.jakartaEE.sms.service.UserService;

@WebServlet("/Users")
public class UserServlet extends HttpServlet{
    @Inject
    UserService userService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<User> users = userService.listUser();
        System.out.println("Users:" + users);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/listUsers.jsp").forward(request, response);
    }
}
