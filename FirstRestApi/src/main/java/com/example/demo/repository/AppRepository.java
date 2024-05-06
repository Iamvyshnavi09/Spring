package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Apps;

public interface AppRepository extends JpaRepository<Apps, Integer> {

}
