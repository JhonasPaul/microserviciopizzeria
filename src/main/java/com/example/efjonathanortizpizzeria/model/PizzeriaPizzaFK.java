package com.example.efjonathanortizpizzeria.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Getter
@Setter
@Embeddable
public class PizzeriaPizzaFK implements Serializable {
    private static final long serialVersionUID = 4417214286334278899L;

    @Column(name="id_pizzeria", nullable = false, unique = true)
    private Integer id_pizzeria;

    @Column(name="id_pizza", nullable = false, unique = true)
    private Integer id_pizza;


}
