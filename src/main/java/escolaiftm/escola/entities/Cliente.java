package escolaiftm.escola.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//anotação que indica ao JPA que essa classe é uma 

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1l;

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(name = "income", nullable = true, unique = false)
    private Double income;

    @Column(name = "birth_Date", nullable = true, unique = false)
    private Instant birthDate;

    @Column(name = "childrem", nullable = true, unique = false)
    private Integer childrem;

    // Construtores
    public Cliente() {
    }

    public Cliente(long id, String name, String cpf, Double income, Instant birthDate, Integer childrem) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.childrem = childrem;
    }

    // Relacionamento OneToOne com a entidade Address
    @OneToOne
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildrem() {
        return childrem;
    }

    public void setChildrem(Integer childrem) {
        this.childrem = childrem;
    }

    private void validateName(String nome) {
        if (nome.length() < 2 || nome.length() > 200) {
            throw new IllegalArgumentException("Nome inválido: Deve ter entre 2 e 200 caracteres.");
        }
        if (Character.isDigit(nome.charAt(0))) {
            throw new IllegalArgumentException("Nome inválido: Não pode começar com número.");
        }
    }

    private void validateCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido: Formato esperado é XXX.XXX.XXX-XX");
        }
    }

    private void validateIncome(Double income) {
        if (income < 0) {
            throw new IllegalArgumentException("Renda inválida: Deve ser maior ou igual a 0.");
        }
    }

    // get and setters

}
