package com.rus.quizapp.controller;

import com.rus.quizapp.model.Question;
import com.rus.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
        @GetMapping("allQuestions")
        public ResponseEntity<List<Question>> getAllQuestions() {

            return questionService.getAllQuestions() ;
        }

        @GetMapping("category/{category}")
        public  ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
            return questionService.getQuestionsByCategory(category);
        }
        @PostMapping("add")
        public ResponseEntity<String> addQuestion(@RequestBody Question question) {
            return questionService.addQuestion(question);

        }


        @GetMapping("random/{category}/{numQ}")
        public ResponseEntity<List<Question>> getRandomQuestionsByCategory(@PathVariable String category, @PathVariable int numQ) {
            return questionService.getRandomQuestionsByCategory(category, numQ);

}
