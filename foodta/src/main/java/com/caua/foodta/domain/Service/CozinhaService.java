package com.caua.foodta.domain.Service;


import com.caua.foodta.domain.model.Cozinha;
import com.caua.foodta.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CozinhaService {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Cozinha salvar(Cozinha cozinha){
        return cozinhaRepository.salvar(cozinha);
    }
}
