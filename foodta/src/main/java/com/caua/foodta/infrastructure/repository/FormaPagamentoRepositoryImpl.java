package com.caua.foodta.infrastructure.repository;


import com.caua.foodta.domain.model.FormaPagamento;
import com.caua.foodta.domain.repository.FormaPagamentoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;
    @Override
    public List<FormaPagamento> listar() {
        return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
    }

    @Override
    public FormaPagamento buscar(Long id) {
        return manager.find(FormaPagamento.class, id);
    }

    @Override
    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return manager.merge(formaPagamento);
    }

    @Override
    public void remover(Long id) {
        FormaPagamento formaPagamento =buscar(id);
        manager.remove(formaPagamento);
    }
}
