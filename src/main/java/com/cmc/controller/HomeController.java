package com.cmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.faces.bean.ManagedProperty;

@Controller
public class HomeController  extends SpringBeanAutowiringSupport {
    @GetMapping("/")
    public String index() {
//        @ManagedProperty(value = "#{helloService}")
//        HelloService helloService;
        return "index";
    }
}
