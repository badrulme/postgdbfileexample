package com.example.dbfileexample.controller;

import com.example.dbfileexample.service.DbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    private DbUtil dbUtil;

    @GetMapping("test")
    public void saveFile() {
        dbUtil.save();
    }
}
