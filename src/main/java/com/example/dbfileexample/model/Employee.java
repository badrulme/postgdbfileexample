package com.example.dbfileexample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
    private Long id;
    private String name;
    private String email;
}
