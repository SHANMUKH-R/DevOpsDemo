package com.gl.DevOpsDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/display")
    public ResponseEntity<String> display(){
        String str = "Mayank spelled my name correctly, new commit-2";
        return ResponseEntity.ok(str);
    }
}
