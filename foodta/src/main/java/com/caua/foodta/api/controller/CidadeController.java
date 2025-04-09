package com.caua.foodta.api.controller;

import com.caua.foodta.domain.Service.CidadeService;
import com.caua.foodta.domain.model.Cidade;
import com.caua.foodta.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<Cidade> listar(){

        return cidadeRepository.listar();
    }

    @GetMapping("/{cidadeId}")
    public ResponseEntity<Cidade> buscar(@PathVariable Long cidadeId){
    Cidade cidade = cidadeRepository.buscar(cidadeId);
    if (cidade!= null){
        return ResponseEntity.ok(cidade);
    }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Cidade adicionar (@RequestBody Cidade cidade){
        return cidadeService.salvar(cidade);
    }
}
