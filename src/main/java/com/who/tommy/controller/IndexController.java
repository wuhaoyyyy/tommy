package com.who.tommy.controller;

import com.who.tommy.utils.ApplicationContextUtil;
import com.who.tommy.utils.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = "/index.htm")
    @ResponseBody
    public String index(ServletRequest reqqq){
        System.out.println(reqqq.getParameter("p"));
        System.out.println("aajj");
        System.out.println(DateUtils.getCurrentDateStr());
        ApplicationContextUtil.getApplicationContext();
        return "insfdsaddexff";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return null;
    }
}
