package com.caua.foodta.domain.Service;


import com.caua.foodta.domain.model.FormaPagamento;
import com.caua.foodta.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class FormaPagamentoService {
    private FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamento salvar (FormaPagamento formaPagamento){
        return formaPagamentoRepository.salvar(formaPagamento);
    }
}
