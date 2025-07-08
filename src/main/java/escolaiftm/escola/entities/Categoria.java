package escolaiftm.escola.entities;

import java.io.Serializable;
//import java.time.Instant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
//import java.util.Objects;

@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "escolaridade", nullable = true, length = 100)
    private String escolaridade;
    @Column(name = "curso", nullable = true, length = 30)
    private String curso;

    // @OneToMany(fetch = FetchType.LAZY)
    // private List<Cliente> clientes = new ArrayList<>();
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Cliente> clientes = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(String escolaridade, String curso) {
        this.escolaridade = escolaridade;
        this.curso = curso;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Categoria escolaridade(String escolaridade) {
        setEscolaridade(escolaridade);
        return this;
    }

    public Categoria curso(String curso) {
        setCurso(curso);
        return this;
    }

}
