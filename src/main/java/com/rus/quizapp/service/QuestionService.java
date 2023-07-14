package com.rus.quizapp.service;


import com.rus.quizapp.dao.QuestionDao;
import com.rus.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
       return questionDao.findAll();
    }
}
