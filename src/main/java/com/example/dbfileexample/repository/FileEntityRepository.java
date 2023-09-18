package com.example.dbfileexample.repository;

import com.example.dbfileexample.entity.FileManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileEntityRepository extends JpaRepository<FileManagerEntity, Long> {
}
