package com.viverprogramando.backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estacionamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstacionamento;

    private String nome;
    private String endereco;
    private int capacidadeTotal;

    @OneToMany(mappedBy = "estacionamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RegistroEntradaSaida> registros;

    public Long getIdEstacionamento() {
        return idEstacionamento;
    }

    public void setIdEstacionamento(Long idEstacionamento) {
        this.idEstacionamento = idEstacionamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public List<RegistroEntradaSaida> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroEntradaSaida> registros) {
        this.registros = registros;
    }
}
