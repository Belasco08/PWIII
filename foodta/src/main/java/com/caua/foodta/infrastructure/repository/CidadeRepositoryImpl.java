package com.caua.foodta.infrastructure.repository;

import com.caua.foodta.domain.model.Cidade;
import com.caua.foodta.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> listar() {
        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Override
    public Cidade buscar(Long id) {
        return null;
    }

    @Override
    public Cidade salvar(Cidade cidade) {
        return manager.merge(cidade);
    }

    @Override
    public void remover(Long id) {

    }
}
