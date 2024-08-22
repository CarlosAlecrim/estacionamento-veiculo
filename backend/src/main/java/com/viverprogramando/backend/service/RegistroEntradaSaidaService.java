package com.viverprogramando.backend.service;

import com.viverprogramando.backend.repository.RegistroEntradaSaidaRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistroEntradaSaidaService {

    private final RegistroEntradaSaidaRepository registroEntradaSaidaRepository;

    public RegistroEntradaSaidaService(RegistroEntradaSaidaRepository registroEntradaSaidaRepository) {
        this.registroEntradaSaidaRepository = registroEntradaSaidaRepository;
    }
}
