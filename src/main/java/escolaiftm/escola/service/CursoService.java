package escolaiftm.escola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import escolaiftm.escola.entities.Curso;
import escolaiftm.escola.repositories.CursoRepository;
import jakarta.transaction.Transactional;


@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    @Transactional
    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

    @Transactional
    public List<Curso> findByCurso(String curso){
        return cursoRepository.findByCurso(curso);
    }
}
