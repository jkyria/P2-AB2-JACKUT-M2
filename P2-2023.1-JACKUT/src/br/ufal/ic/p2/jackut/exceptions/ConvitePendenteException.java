package br.ufal.ic.p2.jackut.exceptions;

public class ConvitePendenteException extends JackutException {
    public ConvitePendenteException() {
        super("Usuário já está adicionado como amigo, esperando aceitação do convite.");
    }
}
