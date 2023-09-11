package com.devlopersabbir.restapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping(path = "/users")
    public String user(){
        return "User url";
    }
}
