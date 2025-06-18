package escolaiftm.escola.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import escolaiftm.escola.entities.Cliente;
import escolaiftm.escola.service.ClientService;
//import java.util.ArrayList;
import java.util.List;
//import java.time.Instant;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    ClientService service;
    /*
     * public List<Cliente> findall() {
     * List<Cliente> clientes = new ArrayList<>();
     * Cliente cliente1 = new Cliente(2,"Jose","15389504932",12000.00
     * ,Instant.parse("1978-10-09T04:30:00.00Z"),2 );
     * Cliente cliente2 = new Cliente(3,"Jose","15389504935",12000.00
     * ,Instant.parse("1977-10-09T04:30:00.00Z"),2 );
     * clientes.add(cliente1);
     * clientes.add(cliente2);
     * return clientes;
     * }
     */
    // @GetMapping
    // public ResponseEntity<List<Cliente>> findall() {
    // List<Cliente> cliente = service.findAll();
    // return ResponseEntity.ok(cliente);
    // }

    @GetMapping("/id/{id}")
    public ResponseEntity<Cliente> findByI(@PathVariable Long id) {
        Optional<Cliente> cliente = service.findById(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> clients = service.findAll();
        if (clients.isEmpty() == false) {
            return ResponseEntity.ok(clients);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Cliente>> findByName(@PathVariable String name) {
        List<Cliente> clients = service.findByName(name);
        if (clients.isEmpty() == false) {
            return ResponseEntity.ok(clients);
        } else {
            System.out.println(name);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Childrem/{childrem}")
    public ResponseEntity<List<Cliente>> findByChildrenGreaterThan(@PathVariable Integer childrem) {
        List<Cliente> clients = service.findByChildrenGreaterThan(childrem);
        if (clients.isEmpty() == true) {
            return ResponseEntity.ok(clients);
        } else {
            System.out.println(childrem);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente client) {
        try {
            Cliente clientSave = service.insert(client);
            return ResponseEntity.ok(clientSave);
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

/*
 * @GetMapping("/id/{id}")
 * public ResponseEntity<Client> findById(@PathVariable Long id) {
 * Optional<Client> client = service.findById(id);
 * if (client.isPresent())
 * return ResponseEntity.ok(client.get());
 * else{
 * return ResponseEntity.notFound().build();
 * }
 * }
 * 
 * 
 * 
 * @PutMapping
 * public ResponseEntity<Client> update(@RequestBody Client client) {
 * try{
 * Client clientUpdate = service.update(client.getId(), client);
 * return ResponseEntity.ok(clientUpdate);
 * }catch(DataIntegrityViolationException e){
 * return ResponseEntity.badRequest().build();
 * }
 * }
 * 
 * @DeleteMapping("/{id}")
 * public String delete(@PathVariable Long id){
 * try {
 * service.delete(id);
 * return "Client delete sucessfull!!";
 * } catch (Exception e) {
 * return e.getMessage();
 * }
 * }
 */

/*
 * @GetMapping("/{matricula}")
 * public ResponseEntity <List<Matricula>> findAllMatricula(){
 * List<Matricula> matriculas = matriculaService.findAll();
 * return ResponseEntity.ok(matriculas);
 * }
 */
