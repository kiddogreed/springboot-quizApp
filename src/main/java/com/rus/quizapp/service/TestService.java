package com.rus.quizapp.service;

import com.rus.quizapp.dao.TestDao;
import com.rus.quizapp.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestDao testDao;

    public List<Test> getTestList() {
        return testDao.findAll();
    }

}
