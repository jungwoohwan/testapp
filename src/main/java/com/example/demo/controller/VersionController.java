package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jslim
 */
@RestController
@RequestMapping(value = "/test")
public class VersionController {

    @GetMapping("")
    String test(){
        return "1.0";
    }
}
