package com.recosoft.geradorloteria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class LoteriaNameNullException extends RuntimeException {
    public LoteriaNameNullException() {
        super("Nome é um campo obrigatório");
    }

}
