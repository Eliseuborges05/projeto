package escolaiftm.escola.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import escolaiftm.escola.entities.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {
  public ArrayList<Cliente> findByNameAndChildrem(String nome, int qtdFilhos);

  public ArrayList<Cliente> findByNameOrChildrem(String nome, int qtdFilhos);

  public ArrayList<Cliente> findByNameOrChildremOrderByName(String nome, int qtdFilhos);

  public ArrayList<Cliente> findByChildremGreaterThan(int qtdFilhos);

  public ArrayList<Cliente> findByChildremGreaterThanEqual(int qtdFilhos);

  public ArrayList<Cliente> findByName(String nome);

  public ArrayList<Cliente> findByChildremBetween(int qtdMinima, int qtdMaxia);

  public ArrayList<Cliente> findByChildremBetweenOrderByName(int qtdMinima, int qtdMaxia);

  public ArrayList<Cliente> findByNameLike(String nome);
}