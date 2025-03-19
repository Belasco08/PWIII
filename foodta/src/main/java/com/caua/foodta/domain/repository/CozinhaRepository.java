package com.caua.foodta.domain.repository;


import com.caua.foodta.domain.model.Cozinha;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CozinhaRepository {
    List<Cozinha> listar();
     Cozinha buscar (Long id);
     Cozinha salvar (Cozinha cozinha);
     void remover (Long id);
}
