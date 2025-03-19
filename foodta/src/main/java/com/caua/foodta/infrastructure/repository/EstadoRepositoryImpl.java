package com.caua.foodta.infrastructure.repository;

import com.caua.foodta.domain.model.Estado;
import com.caua.foodta.domain.repository.EstadoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Estado> listar() {
        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Override
    public Estado buscar(Long id) {
        return null;
    }

    @Override
    public Estado salvar(Long id) {
        return null;
    }

    @Override
    public void remover(Long id) {

    }
}
