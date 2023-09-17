package com.devlopersabbir.security.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
    @GetMapping("/")
    public String admin (){
        return "<h1>Admin</h1>";
    }
}