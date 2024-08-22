package com.viverprogramando.backend.repository;

import com.viverprogramando.backend.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
}
