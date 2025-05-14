package escolaiftm.escola.repositories;


import java.time.Instant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import escolaiftm.escola.entities.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Long>{
     List<Matricula> findByDatainicioBetween(Instant inicio_matricula, Instant fim_matricula);
     List<Matricula> findByDatafimAfter(Instant date);
     List<Matricula> findByStatusLike(String status);
     List<Matricula> findByDatainicioGreaterThanAndDatafimLessThan(Instant inicio_matricula, Instant fim_matricula);
     List<Matricula> findByDatainicioGreaterThanAndDatafimLessThanAndStatusLike(Instant inicio_matricula, Instant fim_matricula,String status);
     List<Matricula> findByStatusAndDatainicioBetweenOrderByDatainicioAsc(String status, Instant inicio_matricula, Instant fim_matricula);


}
