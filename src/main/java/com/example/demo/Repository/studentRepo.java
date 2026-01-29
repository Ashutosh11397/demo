package com.example.demo.Repository;

import com.example.demo.Enity.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<studentEntity,Integer> {
}
