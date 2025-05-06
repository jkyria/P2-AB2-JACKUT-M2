package br.ufal.ic.p2.jackut.exceptions;

public class AmizadeExistenteException extends JackutException {
    public AmizadeExistenteException() {
        super("Usuário já está adicionado como amigo.");
    }
}
