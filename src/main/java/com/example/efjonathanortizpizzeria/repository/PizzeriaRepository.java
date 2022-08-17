package com.example.efjonathanortizpizzeria.repository;

import com.example.efjonathanortizpizzeria.model.Pizzeria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {
}
