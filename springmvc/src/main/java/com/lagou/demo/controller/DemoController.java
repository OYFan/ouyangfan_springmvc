package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.LagouSecurity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouController
@LagouSecurity({"admin"})
@LagouRequestMapping("/demo")
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * @param request
     * @param response
     * @param username
     * @return
     */
    @LagouRequestMapping("/hand01")
    @LagouSecurity({"lisi","liwu"})
    public String hand01(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        response.getWriter().write(username+" success access hand01!");
        return demoService.get(username);
    }


    /**
     * @param request
     * @param response
     * @param username
     * @return
     */
    @LagouRequestMapping("/hand02")
    @LagouSecurity({"wanger"})
    public String hand02(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        response.getWriter().write(username+" success access hand02!");
        return demoService.get(username);
    }
}
