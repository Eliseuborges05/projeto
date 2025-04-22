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
    private Long id_matricula;

    @Column(name = "inicio_matricula",nullable = false, unique = false)
    private Instant data_inicio;

    @Column(name = "fim_matricula",nullable = true, unique = false)
    private Instant data_fim;
    
    public Matricula() {
    }

    public Matricula(Long id_matricula, Instant data_inicio, Instant data_fim) {
        this.id_matricula = id_matricula;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public Instant getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Instant data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Instant getData_fim() {
        return data_fim;
    }

    public void setData_fim(Instant data_fim) {
        this.data_fim = data_fim;
    }
    
}
