package escolaiftm.escola.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import escolaiftm.escola.entities.Matricula;
//import escolaiftm.escola.service.ClientService;
import escolaiftm.escola.service.MatriculaService;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import java.time.Instant;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/matriculas")
@CrossOrigin(origins = "*")
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;
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

    @GetMapping
    public ResponseEntity<List<Matricula>> findAllMatricula() {
        List<Matricula> matriculas = matriculaService.findAll();
        return ResponseEntity.ok(matriculas);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Matricula> findById(@PathVariable Long id) {
        Optional<Matricula> matricula = matriculaService.findById(id);
        if (matricula.isPresent()) {
            return ResponseEntity.ok(matricula.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Status/{status}")
    public ResponseEntity<List<Matricula>> findByStatusLike(@PathVariable String status) {
        List<Matricula> matricula = matriculaService.findByStatusLike(status);
        if (!matricula.isEmpty()) {
            return ResponseEntity.ok(matricula);
        } else {
            System.out.println(matricula);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Matricula> insert(@RequestBody Matricula matricula) {
        Matricula matriculacliente = matriculaService.insert(matricula);
        return ResponseEntity.ok(matriculacliente);
    }

    @PutMapping(("/Update/{id}"))
    public ResponseEntity<Matricula> update(@PathVariable Long id, @RequestBody Matricula novMatricula) {
        try {
            Matricula updatecliente = matriculaService.update(id, novMatricula);
            return ResponseEntity.ok(updatecliente);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(("/Delete/{id}"))
    public ResponseEntity<Matricula> delete(@PathVariable Long id) {
        matriculaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
