package com.caua.foodta.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_restaurante")

public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;

    @Column(name = "taxa_frete")
    private BigDecimal taxaFrete;

    @ManyToOne
    @JoinColumn(name = "cozinha_id")
    private Cozinha cozinha;

}
