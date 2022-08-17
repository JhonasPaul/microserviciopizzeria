package com.example.efjonathanortizpizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pizzerias")
public class Pizzeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pizzeria;
    private String direccion;
    private String sede;
}
