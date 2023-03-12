package com.h2sm.testtasksportsoft.servlets;

import com.h2sm.testtasksportsoft.dto.UserCreate;
import com.h2sm.testtasksportsoft.dto.UserLogin;
import com.h2sm.testtasksportsoft.service.impl.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

import java.io.IOException;

@WebFilter("/register")
@AllArgsConstructor
public class RegistrationServlet extends HttpServlet {
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var newUser = new UserCreate(req.getParameter("userFullName;"), req.getParameter("login"), req.getParameter("password"));
        userService.createUser(newUser);
        resp.sendRedirect("/login");
        super.doPost(req, resp);
    }
}
