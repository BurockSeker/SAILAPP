package com.example.demo.repository;

import com.example.demo.entity.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
    Advisor findByEmail(String email);
}
