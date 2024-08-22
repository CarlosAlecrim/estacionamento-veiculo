package com.viverprogramando.backend.repository;

import com.viverprogramando.backend.model.Estacionamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Long> {
}
