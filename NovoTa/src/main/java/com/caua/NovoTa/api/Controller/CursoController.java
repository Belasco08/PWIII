package com.caua.NovoTa.api.Controller;


import com.caua.NovoTa.domain.Exception.EntidadeEmUsoException;
import com.caua.NovoTa.domain.Exception.EntidadeNaoEncontradaException;
import com.caua.NovoTa.domain.Repository.CursoRepository;
import com.caua.NovoTa.domain.Service.CursoService;
import com.caua.NovoTa.domain.model.Curso;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listar() {

        return cursoRepository.findAll();
    }

    @GetMapping("/{cursoId}")
    public ResponseEntity<Curso> buscar(@PathVariable Long cursoID) {
        Optional<Curso> curso = cursoRepository.findById(cursoID);
        if (curso.isPresent()) {
            return ResponseEntity.ok(curso.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity <Curso> adicionar(@RequestBody Curso curso) {
        curso = cursoService.salvar(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(curso);
    }

    @PutMapping("/{cursoId}")
    public ResponseEntity<Curso> atualizar(@PathVariable Long cursoID, @RequestBody Curso curso) {
        Optional<Curso> cursoAtual = cursoRepository.findById(cursoID);

        if (cursoAtual.isPresent()) {
            BeanUtils.copyProperties(curso, cursoAtual, "id");
            Curso cursoSalva = cursoService.salvar(cursoAtual.get());

            return ResponseEntity.ok(cursoSalva);
        }
        return  ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{cursoId}")
    public  ResponseEntity<Curso> remover (Long cursoId){
        try {
            cursoService.excluir(cursoId);
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
