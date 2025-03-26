package com.caua.foodta.infrastructure.repository;

import com.caua.foodta.domain.model.Cozinha;
import com.caua.foodta.domain.repository.CozinhaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> listar() {
            return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha buscar(Long id) {
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha salvar(Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Long id) {
        Cozinha cozinha = buscar(id);
        manager.remove(cozinha);
    }
}
