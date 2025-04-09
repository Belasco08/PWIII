package com.caua.foodta.domain.repository;

import com.caua.foodta.domain.model.Restaurante;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestauranteRepository {
    List<Restaurante> listar();
    Restaurante salvar (Restaurante restaurante);
    Restaurante buscar (Long id);
    void remover (Long id);
}
