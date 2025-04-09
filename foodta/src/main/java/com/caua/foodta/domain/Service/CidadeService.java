package com.caua.foodta.domain.Service;


import com.caua.foodta.domain.model.Cidade;
import com.caua.foodta.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade salvar(Cidade cidade){
        return cidadeRepository.salvar(cidade);
    }

}
