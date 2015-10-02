package com.techalpino.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OperationController {

	@RequestMapping("/user")
    String home() {
        return "Hello World!";
    }
}
