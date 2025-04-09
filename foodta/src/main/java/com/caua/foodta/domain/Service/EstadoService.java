package com.caua.foodta.domain.Service;


import com.caua.foodta.domain.model.Estado;
import com.caua.foodta.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

public Estado salvar(Estado estado){
    return estadoRepository.salvar(estado);
}
}
