package com.caua.NovoTa.domain.Repository;

import com.caua.NovoTa.domain.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
