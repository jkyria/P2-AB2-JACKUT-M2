package br.ufal.ic.p2.jackut.exceptions;

public class CredenciaisInvalidasException extends JackutException {
    public CredenciaisInvalidasException() {
        super("Login ou senha inválidos.");
    }
}
