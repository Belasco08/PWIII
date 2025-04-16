package com.caua.foodta.domain.Service;

import com.caua.foodta.domain.model.Restaurante;
import com.caua.foodta.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestauranteService {
    @Autowired
    private RestauranteRepository restauranteRepository;

    public Restaurante salvar(Restaurante restaurante){
        return restauranteRepository.salvar(restaurante);
    }
}
