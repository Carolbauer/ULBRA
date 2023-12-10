package br.com.ulbra.ap2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ClientException {
    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<String> handlerExceptionClient(final ClientNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível encontrar o cliente");
    }

}

