package escolaiftm.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import escolaiftm.escola.entities.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente,Long>{
    
} 