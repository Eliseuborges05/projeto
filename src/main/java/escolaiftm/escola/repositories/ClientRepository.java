package escolaiftm.escola.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import escolaiftm.escola.entities.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente,Long>{
   public ArrayList<Cliente> findByNameAndChildren(String nome, int qtdFilhos);
 
     public ArrayList<Cliente> findByNameOrChildren(String nome, int qtdFilhos);
     public ArrayList<Cliente> findByNameOrChildrenOrderByName(String nome, int qtdFilhos);
     public ArrayList<Cliente> findByChildrenGreaterThan(int qtdFilhos);
     public ArrayList<Cliente> findByChildrenGreaterThanEqual(int qtdFilhos);
     public ArrayList<Cliente> findByName(String nome);
     public ArrayList<Cliente> findByChildrenBetween(int qtdMinima, int qtdMaxia);
     public ArrayList<Cliente> findByChildrenBetweenOrderByName(int qtdMinima, int qtdMaxia);
     public ArrayList<Cliente> findByNameLike(String nome);
} 