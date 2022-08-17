package com.example.efjonathanortizpizzeria.controller;

import com.example.efjonathanortizpizzeria.model.Pizzeria;
import com.example.efjonathanortizpizzeria.service.iPizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzeria")
public class PizzeriaController {
    @Autowired
    private iPizzeriaService service;

    @GetMapping("/listarpizzeria")
    public ResponseEntity<?> listarCategoria() {
        List<Pizzeria> lista = this.service.listarPizzeria();
        return new ResponseEntity<List<Pizzeria>>(lista, HttpStatus.OK);
    }

    @GetMapping("/listarpizzeriasporid/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable("id") Integer id) {
        Pizzeria pizzeria = this.service.listarPizzeriaPorId(id);
        return new ResponseEntity<Pizzeria>(pizzeria, HttpStatus.OK);
    }

    @PostMapping("/agregarpizzerias")
    public ResponseEntity<?>agregar(@RequestBody Pizzeria pizzeria){
        Pizzeria categoriaNuevo = this.service.agregarPizzeria(pizzeria);
        return new ResponseEntity<Pizzeria>(categoriaNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizarpizzerias")
    public ResponseEntity<?> actualizar(@RequestBody Pizzeria pizzeria) {
        Pizzeria pizzeriaActualizado = this.service.actualizarPizzeria(pizzeria);
        return new ResponseEntity<Pizzeria>(pizzeriaActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminarpizzerias/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) {
        this.service.eliminarPizzeria(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
