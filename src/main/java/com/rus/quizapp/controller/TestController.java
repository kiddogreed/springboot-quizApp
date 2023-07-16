package com.rus.quizapp.controller;

import com.rus.quizapp.model.Test;
import com.rus.quizapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
  @Autowired
  TestService testService;
  @GetMapping("allTest")
  public ResponseEntity<List<Test>> getAllQuestions() {

    return testService.getTestList();
  }
  @GetMapping("bio/{bio}")
  public  ResponseEntity<List<Test>> getTestByBio(@PathVariable String bio) {
    return testService.getTestByBio(bio);
  }
  
}
