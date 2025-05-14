package escolaiftm.escola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Web.Client;
import org.springframework.stereotype.Service;
import escolaiftm.escola.entities.Cliente;
import escolaiftm.escola.repositories.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService {
    //injeção de dependência
    @Autowired
    private ClientRepository repositorio;

    @Transactional
    public Cliente insert(Cliente cliente){
        validateName(cliente.getName());
        return repositorio.save(cliente);
        /*
        if (client.getName().length() >=2 && client.getName().length()<=200){
            return repositorio.save(client);
        }else{
            throw new IllegalArgumentException("Nome inválido!!! O nome precisa ter entre 2 e 200 caracteres.");
        }
        */
    }

    private void validateName(String nome){
        if (nome.length() < 2 || nome.length()>200){
            throw new IllegalArgumentException("Nome inválido!!! O nome precisa ter entre 2 e 200 caracteres.");
        }
        
        char primeiraLetra = nome.charAt(0);
        if (primeiraLetra >= '0' && primeiraLetra<= '9'){
            throw new IllegalArgumentException("Nome inválido!!! O nome não pode começar com números.");
        }
        
    }
}
