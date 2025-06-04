package escolaiftm.escola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import escolaiftm.escola.entities.Address;
import escolaiftm.escola.repositories.AddressRepository;
//import jakarta.transaction.Transactional;

import java.util.Optional;
@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Transactional(readOnly = true)
    public List<Address> findall(){
        return addressRepository.findAll();
    }  

    @Transactional(readOnly = true)
    public Optional<Address> findById(Long id) {
       return addressRepository.findById(id);
    }

    public List<Address> findByStateLike(String state){
        return addressRepository.findByStateLike(state);
    }

}
