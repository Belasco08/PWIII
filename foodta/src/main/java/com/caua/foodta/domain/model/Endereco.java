package com.caua.foodta.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Embeddable
public class Endereco {

    @NotBlank(message = "Cep Obrigatorio")
    @Column(name = "endereco_cep")
    private String cep;

    @NotBlank(message = "Logradouro Obrigatorio")
    @Column(name = "endereco_logradouro")
    private String logradouro;

    @NotBlank(message = "Numero Obrigatorio")
    @Column(name = "endereco_numero")
    private String numero;

    @Column(name = "endereco_complemento")
    private String complemento;

    @NotBlank(message = "Bairro Obrigatorio")
    @Column(name = "endereco_bairro")
    private String bairro;

    @ManyToOne
    @JoinColumn(name = "endereco_cidade_id")
    private Cidade cidade;
}
