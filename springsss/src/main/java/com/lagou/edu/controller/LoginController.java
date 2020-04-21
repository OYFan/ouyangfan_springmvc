package com.lagou.edu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author 应癫
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController  {

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password) {
        if ("admin".equals(username) && "admin".equals(password)){
            session.setAttribute("token",username);
            return "redirect:/tbResume/findAll";
        }
        session.setAttribute("token",null);
        return "/failed.jsp";
    }

}
