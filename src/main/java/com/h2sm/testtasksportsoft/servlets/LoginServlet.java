package com.h2sm.testtasksportsoft.servlets;

import com.h2sm.testtasksportsoft.dto.UserLogin;
import com.h2sm.testtasksportsoft.service.impl.UserService;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

import java.io.IOException;

@WebFilter("/login")
@AllArgsConstructor
public class LoginServlet extends HttpServlet {
    private UserService userService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        var userLogin = new UserLogin(req.getParameter("login"), req.getParameter("password"));
        try {
            var user = userService.doLogin(userLogin);
            resp.sendRedirect("/main");
        } catch (Exception e) {
            resp.sendError(403, e.getMessage());
        }
    }
}
