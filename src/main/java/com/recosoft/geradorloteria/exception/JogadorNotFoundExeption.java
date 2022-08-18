package com.recosoft.geradorloteria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class JogadorNotFoundExeption extends RuntimeException {

    public JogadorNotFoundExeption(Long id) {
        super("Jogador de id " + id + " não encontrado");
    }
}
