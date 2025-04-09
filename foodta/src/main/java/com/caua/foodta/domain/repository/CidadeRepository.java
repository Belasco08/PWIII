package com.caua.foodta.domain.repository;


import com.caua.foodta.domain.model.Cidade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository {
    List<Cidade> listar();
    Cidade buscar (Long id);
    Cidade salvar (Cidade cidade);
    void remover (Long id);
}
