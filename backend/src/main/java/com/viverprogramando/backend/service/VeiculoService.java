package com.viverprogramando.backend.service;

import com.viverprogramando.backend.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }
}
