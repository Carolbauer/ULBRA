package br.com.ulbra.ap2.exceptions;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException() {
        super("Cliente não encontrado");
    }
}
