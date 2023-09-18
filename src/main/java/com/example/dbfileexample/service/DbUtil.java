package com.example.dbfileexample.service;

import com.example.dbfileexample.entity.FileManagerEntity;
import com.example.dbfileexample.model.Employee;
import com.example.dbfileexample.repository.FileEntityRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbUtil {

    @Autowired
    private FileEntityRepository fileEntityRepository;

    public void save() {

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Badrul");
        employee.setEmail("badrul@gmail.com");

        Gson gson = new Gson();

        String jsonObej = gson.toJson(employee);

        FileManagerEntity fileManagerEntity = new FileManagerEntity();
        fileManagerEntity.setName("Badrul");
        fileManagerEntity.setTextFile("testTextFileData");
        fileManagerEntity.setXmlFile("testXmlFileData");

        fileManagerEntity.setJsonFile(jsonObej);

        fileEntityRepository.save(fileManagerEntity);
        System.out.println(1);
    }
}
