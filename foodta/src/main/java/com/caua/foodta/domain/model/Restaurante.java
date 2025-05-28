package com.caua.foodta.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cozinha_id")
    private Cozinha cozinha;
    @Column(name = "taxa_frete")
    private BigDecimal taxa_frete;


    @Embedded
    private Endereco endereco;

}
