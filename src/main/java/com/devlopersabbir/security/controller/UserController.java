package com.devlopersabbir.security.controller;
import com.devlopersabbir.security.entity.User;
import com.devlopersabbir.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserRepository repository;
    @PostMapping("/user")
    public ResponseEntity<?> store(@RequestBody User user){
//        checked if any input filed is missing
        if(user.getFullName() == null || user.getEmail() == null || user.getPassword() == null){
            return ResponseEntity.status(400).body("Please fill the required input!");
        }

        try{
            if(repository.findByEmail(user.getEmail()) == null){
                repository.save(user);
                return ResponseEntity.status(201).body(user);
            }
            return ResponseEntity.status(401).body("Email already exists!");

        }catch (Exception error){
            return ResponseEntity.status(400).body(new Exception());
        }
    }

}
