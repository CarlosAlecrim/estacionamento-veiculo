package com.viverprogramando.backend.repository;

import com.viverprogramando.backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
