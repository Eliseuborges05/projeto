package escolaiftm.escola.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import escolaiftm.escola.entities.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente,Long>{
    public ArrayList<Cliente> findByChildren(Integer children);
    
} 