package escolaiftm.escola.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import escolaiftm.escola.entities.Address;
import escolaiftm.escola.entities.Cliente;
import escolaiftm.escola.service.AddressService;
//import java.util.ArrayList;
import java.util.List;
//import java.time.Instant;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService serviceaddress;

    @GetMapping
    public ResponseEntity<List<Address>> findall() {
        List<Address> addresses = serviceaddress.findall();
        return ResponseEntity.ok(addresses);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Address> findByI(@PathVariable Long id) {
        Optional<Address> addresses = serviceaddress.findById(id);
        if (addresses.isPresent()) {
            return ResponseEntity.ok(addresses.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/State/{state}")
    public ResponseEntity<List<Address>> findByStateLike(@PathVariable String state) {
        List<Address> addresses = serviceaddress.findByStateLike(state);
        if (!addresses.isEmpty()) {
            return ResponseEntity.ok(addresses);
        } else {
            System.out.println(addresses);
            return ResponseEntity.notFound().build();
        }
    }

}
