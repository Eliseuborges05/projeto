package escolaiftm.escola.entities;

import java.io.Serializable;
import java.time.DateTimeException;
//import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity

public class Matricula implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_matricula;

    @Column(nullable = false, unique = false)
    private DateTimeException data_inicio;

    @Column(nullable = true, unique = false)
    private DateTimeException data_fim;
    
    public Matricula() {
    }

    public Matricula(long id_matricula, DateTimeException data_inicio, DateTimeException data_fim) {
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

    public DateTimeException getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(DateTimeException data_inicio) {
        this.data_inicio = data_inicio;
    }

    public DateTimeException getData_fim() {
        return data_fim;
    }

    public void setData_fim(DateTimeException data_fim) {
        this.data_fim = data_fim;
    }
    
}
