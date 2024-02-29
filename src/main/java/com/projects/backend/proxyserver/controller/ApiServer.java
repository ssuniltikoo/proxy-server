package com.projects.backend.proxyserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class ApiServer {


    @GetMapping("/test")
    public String testEndpoint(){
        return "Test successful";
    }
}
