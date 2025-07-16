package escolaiftm.escola.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import escolaiftm.escola.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

    public ArrayList<Curso> findByCurso(String curso);
} 