package escolaiftm.escola.entities;

import java.io.Serializable;
//import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_address")
public class Address implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua", nullable = true, length = 100)
    private String street;
    @Column(name = "cidade", nullable = true, length = 30)
    private String city;
    @Column(name = "estado", nullable = true, length = 30)
    private String state;
    @Column(name = "cep", nullable = false, length = 8, unique = true)
    private String zipCode;

    // Relacionamento OneToOne com a entidade Client
    @OneToOne(mappedBy = "address")
    private Cliente client;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Cliente getClient() {
        return this.client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
   
}
