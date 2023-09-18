package com.example.swagger.swaggerdemo.controller;

import com.example.swagger.swaggerdemo.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "userControl", description = "User Api documentation")
public class UserController
{
    private final List<User> userList = new ArrayList<>();

    //classin const calistiktan sonra bu metod calissin.
    @PostConstruct
    public void init()
    {
        userList.add(new User(1,"erman", "erman",
                "ozardic", "eozardic@gmail.com", new Date()));
    }

    @PostMapping
    @Operation(
            summary = "New User adding method",
            description = "New User adding method")
    public ResponseEntity<User> save(@RequestBody User user) {
        userList.add(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    @Operation(
            summary = "User list method",
            description = "User list method")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userList);
    }
}
