package com.viverprogramando.backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVaga;

    private String nome;
    private String tipo;
    private String status;

    @OneToMany(mappedBy = "vaga", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RegistroEntradaSaida> registros;

    public Long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Long idVaga) {
        this.idVaga = idVaga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RegistroEntradaSaida> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroEntradaSaida> registros) {
        this.registros = registros;
    }
}
