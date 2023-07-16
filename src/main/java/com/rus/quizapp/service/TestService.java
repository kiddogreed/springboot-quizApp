package com.rus.quizapp.service;

import com.rus.quizapp.dao.TestDao;
import com.rus.quizapp.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    @Autowired
    TestDao testDao;

    public ResponseEntity<List<Test>> getTestList() {
        try{
            return new ResponseEntity<>(testDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Test>> getTestByBio(String bio) {
        try{
            return new ResponseEntity<>(testDao.findByBio(bio),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

}
