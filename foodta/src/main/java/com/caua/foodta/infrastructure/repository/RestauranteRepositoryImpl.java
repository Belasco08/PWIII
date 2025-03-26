package com.caua.foodta.infrastructure.repository;


import com.caua.foodta.domain.model.Estado;
import com.caua.foodta.domain.model.Restaurante;
import com.caua.foodta.domain.repository.RestauranteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    private EntityManager manager;


    @Override
    public List<Restaurante> listar() {
        return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
    }

    @Override
    public Restaurante salvar(Long id) {
        return null;
    }

    @Override
    public Restaurante buscar(Long id) {
        return null;
    }

    @Override
    public void remover(Long id) {

    }
}
