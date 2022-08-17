package com.example.efjonathanortizpizzeria.service;

import com.example.efjonathanortizpizzeria.model.Pizzeria;
import com.example.efjonathanortizpizzeria.repository.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzeriaServiceImpl implements iPizzeriaService{

    @Autowired
    private PizzeriaRepository repository;

    @Override
    public List<Pizzeria> listarPizzeria() {
        return this.repository.findAll();
    }

    @Override
    public Pizzeria listarPizzeriaPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Pizzeria agregarPizzeria(Pizzeria pizzeria) {
        return this.repository.save(pizzeria);
    }

    @Override
    public Pizzeria actualizarPizzeria(Pizzeria pizzeria) {
        return this.repository.saveAndFlush(pizzeria);
    }

    @Override
    public void eliminarPizzeria(Integer id) {
        this.repository.deleteById(id);
    }
}
