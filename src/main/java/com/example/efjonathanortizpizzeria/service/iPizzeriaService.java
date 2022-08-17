package com.example.efjonathanortizpizzeria.service;

import com.example.efjonathanortizpizzeria.model.Pizzeria;

import java.util.List;

public interface iPizzeriaService {
    public List<Pizzeria> listarPizzeria();
    public Pizzeria listarPizzeriaPorId(Integer id);
    public Pizzeria agregarPizzeria(Pizzeria pizzeria);
    public Pizzeria actualizarPizzeria(Pizzeria pizzeria);
    public void eliminarPizzeria(Integer id);
}
