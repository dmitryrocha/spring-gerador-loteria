package com.recosoft.geradorloteria.service;

import com.recosoft.geradorloteria.repository.ApostaRepository;
import org.springframework.stereotype.Service;

@Service
public class ApostaService {

    private final ApostaRepository repository;


    public ApostaService(ApostaRepository repository) {
        this.repository = repository;
    }
}
