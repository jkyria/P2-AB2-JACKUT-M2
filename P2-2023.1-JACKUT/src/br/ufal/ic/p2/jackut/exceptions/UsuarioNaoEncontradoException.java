package br.ufal.ic.p2.jackut.exceptions;

public class UsuarioNaoEncontradoException extends JackutException {
    public UsuarioNaoEncontradoException(String login) {
        super("Usuário não cadastrado.");
    }
}
