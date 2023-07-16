package com.rus.quizapp.dao;

import com.rus.quizapp.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao  extends JpaRepository<Test, Integer> {
    List<Test> findByBio(String bio);
}
