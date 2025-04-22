package escolaiftm.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import escolaiftm.escola.entities.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Long>{
    
}
