package com.caua.NovoTa.domain.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany
    private Curso curso;
    @CreationTimestamp
    @Column(name = "data_cadastro", columnDefinition = "datetime")
    private LocalDateTime DataCadastro;
    @UpdateTimestamp
    @Column(name = "data_atualizacao", columnDefinition = "datetime")
    private LocalDateTime DataAtualizacao;
}
