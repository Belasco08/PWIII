package com.caua.NovoTa.domain.Exception;

public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException (String message){
        super(message);
    }
}
