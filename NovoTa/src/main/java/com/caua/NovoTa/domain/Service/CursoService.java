package com.caua.NovoTa.domain.Service;

import com.caua.NovoTa.domain.Exception.EntidadeEmUsoException;
import com.caua.NovoTa.domain.Exception.EntidadeNaoEncontradaException;
import com.caua.NovoTa.domain.Repository.CursoRepository;
import com.caua.NovoTa.domain.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public Curso salvar(Curso curso){
        return cursoRepository.save(curso);
    }
    public void excluir(Long id){
        try {
            cursoRepository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw  new EntidadeEmUsoException(String.format("Cidade ou codigo %d não pode ser encontrado, pois está em uso", id));
        }
        catch (EmptyResultDataAccessException e){
            throw new EntidadeNaoEncontradaException(String.format("Não existe cadastro de cidade com codigo %d", id));
        }
    }
}
