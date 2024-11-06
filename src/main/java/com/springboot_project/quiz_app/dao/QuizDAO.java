package com.springboot_project.quiz_app.dao;

import com.springboot_project.quiz_app.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDAO extends JpaRepository<Quiz, Integer> {

}
