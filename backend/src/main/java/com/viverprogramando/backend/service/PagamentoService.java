package com.viverprogramando.backend.service;

import com.viverprogramando.backend.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }
}
