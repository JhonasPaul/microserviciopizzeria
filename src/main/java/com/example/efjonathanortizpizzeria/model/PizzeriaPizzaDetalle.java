package com.example.efjonathanortizpizzeria.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pizzeria_pizza_detalle")
public class PizzeriaPizzaDetalle {
    @Id
    private PizzeriaPizzaFK fk = new PizzeriaPizzaFK();

    public PizzeriaPizzaFK getFk() {
        return fk;
    }

    public void setFk(PizzeriaPizzaFK fk) {
        this.fk = fk;
    }
}
