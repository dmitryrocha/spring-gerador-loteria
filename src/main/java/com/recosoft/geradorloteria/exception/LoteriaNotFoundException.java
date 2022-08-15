package com.recosoft.geradorloteria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class LoteriaNotFoundException extends RuntimeException {

    public LoteriaNotFoundException(Long id) {
        super("Loteria não encontrada no id: " + id);
    }
}
