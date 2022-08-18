package com.recosoft.geradorloteria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class JogadorNameNullException extends RuntimeException {
    public JogadorNameNullException() {
        super("Este campo não pode ser nulo ou estar em branco");
    }
}
