package escolaiftm.escola.service;

import java.time.Instant;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import escolaiftm.escola.entities.Matricula;
import escolaiftm.escola.repositories.MatriculaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository repository;

    private void validarMatricula(Matricula matricula) {
        if (matricula.getDatainicio().isAfter(Instant.now())) {
            throw new IllegalArgumentException("Data de início não pode estar no futuro.");
        }

        if (matricula.getDatafim() != null && matricula.getDatafim().isBefore(matricula.getDatainicio())) {
            throw new IllegalArgumentException("Data de fim não pode ser anterior à data de início.");
        }
        if (!matricula.getStatus().equalsIgnoreCase("Ativo") &&
            !matricula.getStatus().equalsIgnoreCase("Inativo") &&
            !matricula.getStatus().equalsIgnoreCase("Cancelado")) {
            throw new IllegalArgumentException("Status inválido. Valores permitidos: Ativo, Inativo ou Cancelado.");
        }
}

public Matricula insert(Matricula matricula) {
    validarMatricula(matricula);
    return repository.save(matricula);
}

@Transactional
public List<Matricula> insertAll(List<Matricula> matriculas) {
    for (Matricula m : matriculas) {
        validarMatricula(m);
    }
    return repository.saveAll(matriculas);
}

 public Matricula update(Long id, Matricula newData) {
        Matricula matricula = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Matrícula não encontrada com ID: " + id));
        
        validarMatricula(newData);

        matricula.setDatainicio(newData.getDatainicio());
        matricula.setDatafim(newData.getDatafim());
        matricula.setStatus(newData.getStatus());

        return repository.save(matricula);
    }

public void delete(Long id) {
    repository.deleteById(id);
}

public void deleteAll() {
    repository.deleteAll();
}

public List<Matricula> findAll() {
    return repository.findAll();
}

public Matricula findById(Long id) {
    return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Matrícula não encontrada"));
}

public List<Matricula> buscarPorStatus(String status) {
    return repository.findByStatusLike(status);
}

public List<Matricula> buscarPorDataInicio(Instant inicio, Instant fim) {
    return repository.findByDatainicioBetween(inicio, fim);
}

public List<Matricula> buscarPorDataFimDepois(Instant data) {
    return repository.findByDatafimAfter(data);
}

public List<Matricula> buscarEntreDatasComStatus(Instant inicio, Instant fim, String status) {
    return repository.findByDatainicioGreaterThanAndDatafimLessThanAndStatusLike(inicio, fim, status);
}

public List<Matricula> buscarStatusEntreDatasOrdenado(Instant inicio, Instant fim, String status) {
    return repository.findByStatusAndDatainicioBetweenOrderByDatainicioAsc(status, inicio, fim);
}
}



