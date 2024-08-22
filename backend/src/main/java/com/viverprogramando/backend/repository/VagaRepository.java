package com.viverprogramando.backend.repository;

import com.viverprogramando.backend.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
}
