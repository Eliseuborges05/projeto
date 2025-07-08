package escolaiftm.escola.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import escolaiftm.escola.entities.Address;
//import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    public ArrayList<Address> findByCity(String city);

    public ArrayList<Address> findByStateLike(String state);

    // public ArrayList<Address>f
}
