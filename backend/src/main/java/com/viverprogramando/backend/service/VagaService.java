package com.viverprogramando.backend.service;

import com.viverprogramando.backend.repository.VagaRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaService {
    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }
}
