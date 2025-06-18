package escolaiftm.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Web.Client;
import org.springframework.stereotype.Service;
import escolaiftm.escola.entities.Cliente;
import escolaiftm.escola.repositories.ClientRepository;
import java.util.Optional;
//import com.escolaiftm.escola.entities.model.Cliente;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    // injeção de dependência
    @Autowired
    private ClientRepository repositorio;

    @Transactional
    public Cliente insert(Cliente cliente) {
        validateName(cliente.getName());
        return repositorio.save(cliente);
    }

    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return repositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Long id) {
        return repositorio.findById(id);
    }

    public List<Cliente> findByChildrenGreaterThan(int qtdFilhos) {
        return repositorio.findByChildremGreaterThan(qtdFilhos);
    }

    public List<Cliente> findByName(String name) {
        return repositorio.findByName(name);
    }

    private void validateName(String nome) {
        if (nome.length() < 2 || nome.length() > 200) {
            throw new IllegalArgumentException("Nome inválido!!! O nome precisa ter entre 2 e 200 caracteres.");
        }

        char primeiraLetra = nome.charAt(0);
        if (primeiraLetra >= '0' && primeiraLetra <= '9') {
            throw new IllegalArgumentException("Nome inválido!!! O nome não pode começar com números.");
        }

    }
}
