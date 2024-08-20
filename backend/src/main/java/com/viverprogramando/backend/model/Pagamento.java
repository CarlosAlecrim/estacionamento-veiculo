package com.viverprogramando.backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    private String tipoPagamento;
    private Double valor;
    private LocalDateTime dataPagamento;

    @OneToOne
    @JoinColumn(name="idRegistro", nullable = false)
    private  RegistroEntradaSaida registro;

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public RegistroEntradaSaida getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroEntradaSaida registro) {
        this.registro = registro;
    }
}
