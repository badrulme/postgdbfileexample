package com.example.dbfileexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "file_manager", schema = "public", catalog = "demo_db")
public class FileManagerEntity {
    @Id
    private Long id;
    @Column(name = "text_file")
    private String textFile;
    @Column(name = "xml_file")
    private String xmlFile;
    @Column(name = "json_file")
    private Object jsonFile;

}
