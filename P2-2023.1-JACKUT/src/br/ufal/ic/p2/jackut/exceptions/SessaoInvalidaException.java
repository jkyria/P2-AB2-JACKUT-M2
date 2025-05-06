package br.ufal.ic.p2.jackut.exceptions;

public class SessaoInvalidaException extends JackutException {
    public SessaoInvalidaException() {
        super("Login ou senha inválidos.");
    }
}
