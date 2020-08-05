package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @PostMapping(value = "/test/json")
    public String testIndex(@RequestBody Map map) {
        System.out.println("map = " + map);
        return "testIndex"; }


}
