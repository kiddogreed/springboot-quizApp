package com.rus.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

  @GetMapping("allTest")
  public String getAllTest() {
    
    return "all tests";
  }
  
}
