package com.devlopersabbir.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping(path="/")
    public String home(){
        return "<h1>Hello world</h1>";
    }
}
