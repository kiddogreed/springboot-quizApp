package com.rus.quizapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rus.quizapp.model.Question;
import com.rus.quizapp.service.QuestionService;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import org.codehaus.jackson.map.util.JSONWrappedObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    @GetMapping("/")
    public String homeScreen() {
        return "est";
    }

    @GetMapping("/api/object")
    @ResponseBody
    public String getObject() throws IOException {
        Map<String, Object> object = new HashMap<>();
        object.put("key1", "value1");
        object.put("key2", "value2");

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }









}
