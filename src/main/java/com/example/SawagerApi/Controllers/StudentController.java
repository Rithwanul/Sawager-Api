package com.example.SawagerApi.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    @GetMapping
    public String studentName() {
        return "Dico";
    }
}
