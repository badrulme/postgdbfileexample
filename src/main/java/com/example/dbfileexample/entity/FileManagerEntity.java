package com.example.dbfileexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Setter
@Getter
@Entity
@Table(name = "file_manager", schema = "public", catalog = "demo_db")
public class FileManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "text_file")
    private String textFile;
    @JdbcTypeCode(SqlTypes.SQLXML)
    @Column(name = "xml_file")
    private String xmlFile;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "json_file")
    private Object jsonFile;

}
