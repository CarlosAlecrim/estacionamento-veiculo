package com.viverprogramando.backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class RegistroEntradaSaida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private Double valorPago;

    @ManyToOne
    @JoinColumn(name = "idVeiculo", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name="idVaga", nullable = false)
    private Vaga vaga;

    @ManyToOne
    @JoinColumn(name = "idEstacionamento", nullable = false)
    private Estacionamento estacionamento;

    @OneToOne(mappedBy = "registro",cascade = CascadeType.ALL)
    private Pagamento pagamento;

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
