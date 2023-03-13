package com.h2sm.testtasksportsoft.controllers;

import com.h2sm.testtasksportsoft.dto.UserCreate;
import com.h2sm.testtasksportsoft.dto.UserLogin;
import com.h2sm.testtasksportsoft.service.impl.BookService;
import com.h2sm.testtasksportsoft.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class LoginController {
    private UserService userService;
    private BookService bookService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model){
        return "login";
    }

    @GetMapping("/registration")
    public String getRegister(Model model){
        return "registration";
    }

    @PostMapping("/doLogin")
    public String loginUser(Model model) {
        var user = new UserLogin(model.getAttribute("login").toString(), model.getAttribute("password").toString());
        try {
            model.addAttribute("contacts", userService.doLogin(user));
        } catch (Exception e) {
            return "error";
        }
       // model.addAttribute("book")
        return "redirect:/main";
    }

    @PostMapping("/register")
    public String registerUser(Model model) {
        var login = model.getAttribute("login").toString();
        var password = model.getAttribute("password").toString();
        var fullName = model.getAttribute("fullname").toString();
        userService.createUser(new UserCreate(fullName, login, password));
        return "registration";
    }
}
