package com.springboot_project.quiz_app.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor // this will create a default and a parameterized constructor
public class Response {
    private Integer id;
    private String response;
}
