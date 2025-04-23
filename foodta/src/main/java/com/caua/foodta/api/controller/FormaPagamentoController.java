package com.caua.foodta.api.controller;


import com.caua.foodta.domain.Service.FormaPagamentoService;
import com.caua.foodta.domain.exception.EntidadeEmUsoException;
import com.caua.foodta.domain.exception.EntidadeNaoEncontradaException;
import com.caua.foodta.domain.model.Cozinha;
import com.caua.foodta.domain.model.FormaPagamento;
import com.caua.foodta.domain.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/formasPagamento")
public class FormaPagamentoController {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    @Autowired
    private FormaPagamentoService formaPagamentoService;

    @GetMapping()
    public List<com.caua.foodta.domain.model.FormaPagamento> listar(){
        return formaPagamentoRepository.listar();
    }

    @GetMapping("/{formaPagamentoId}")
    public ResponseEntity<FormaPagamento> buscar (@PathVariable Long formapagamentoId){
        FormaPagamento formaPagamento = formaPagamentoRepository.buscar(formapagamentoId);
        if (formaPagamento!= null){
        return ResponseEntity.ok(formaPagamento);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public FormaPagamento adicionar(@RequestBody FormaPagamento formaPagamento){
        return formaPagamentoService.salvar(formaPagamento);
    }

    @DeleteMapping("/{formaPagamentoId}")
    public  ResponseEntity<Cozinha> remover (Long formaPagamentoId){
        try {
            formaPagamentoService.excluir(formaPagamentoId);
            return ResponseEntity.notFound().build();
        }
        catch (EntidadeNaoEncontradaException e){
            return ResponseEntity.notFound().build();
        }
        catch (EntidadeEmUsoException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
