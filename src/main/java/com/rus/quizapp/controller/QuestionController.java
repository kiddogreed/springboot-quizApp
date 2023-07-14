package com.rus.quizapp.controller;

import com.rus.quizapp.model.Question;
import com.rus.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
        @GetMapping("allQuestions")
        public List<Question> getAllQuestions() {
            return questionService.getAllQuestions();
        }
}
