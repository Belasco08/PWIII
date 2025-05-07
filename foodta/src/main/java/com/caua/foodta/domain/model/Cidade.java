package com.caua.foodta.domain.model;

import jakarta.persistence.*;

public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn (name = "estado_id")
    private Estado estado;
}
