package com.caua.NovoTa.domain.Repository;

import com.caua.NovoTa.domain.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
