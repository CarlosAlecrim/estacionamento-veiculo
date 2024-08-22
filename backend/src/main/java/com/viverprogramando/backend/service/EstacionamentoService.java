package com.viverprogramando.backend.service;

import com.viverprogramando.backend.repository.EstacionamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstacionamentoService {

    private final EstacionamentoRepository estacionamentoRepository;

    public EstacionamentoService(EstacionamentoRepository estacionamentoRepository) {
        this.estacionamentoRepository = estacionamentoRepository;
    }
}
