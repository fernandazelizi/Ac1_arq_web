package me.ac1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GeralController {
    @GetMapping
    public String test()
    {
        return "Ok";
    }

}
