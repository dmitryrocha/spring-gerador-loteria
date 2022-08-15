package com.recosoft.geradorloteria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class LoteriaNegativeNumberException extends RuntimeException {
    public LoteriaNegativeNumberException() {
        super("Não podem ser utilizados números negativos");
    }
}
