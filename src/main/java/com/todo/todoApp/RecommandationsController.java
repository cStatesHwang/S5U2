package com.todo.todoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommandationsController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
