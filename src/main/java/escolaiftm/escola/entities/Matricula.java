package escolaiftm.escola.entities;

import java.io.Serializable;
import java.time.Instant;
//import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_matricula")
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmatricula;

    @Column(name = "inicio_matricula",nullable = false, unique = false)
    private Instant datainicio;

    @Column(name = "fim_matricula",nullable = true, unique = false)
    private Instant datafim;

    @Column(name = "status", nullable = false, unique = false)
    private String status;

    
    public Matricula() {
    }

    public Matricula(Long idmatricula, Instant datainicio, Instant datafim, String status) {
        this.idmatricula = idmatricula;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.status = status;

    }

    public Long getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(Long idmatricula) {
        this.idmatricula = idmatricula;
    }

    public Instant getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Instant datainicio) {
        this.datainicio = datainicio;
    }

    public Instant getDatafim() {
        return datafim;
    }

    public void setDatafim(Instant datafim) {
        this.datafim = datafim;
    }
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
