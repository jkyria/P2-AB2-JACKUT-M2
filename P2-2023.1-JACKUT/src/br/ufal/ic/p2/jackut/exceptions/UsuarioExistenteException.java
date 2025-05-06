package br.ufal.ic.p2.jackut.exceptions;

public class UsuarioExistenteException extends JackutException {
    public UsuarioExistenteException(String login) {super("Conta com esse nome já existe.");
    }
}
