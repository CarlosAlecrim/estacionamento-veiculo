package com.viverprogramando.backend.repository;

import com.viverprogramando.backend.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
