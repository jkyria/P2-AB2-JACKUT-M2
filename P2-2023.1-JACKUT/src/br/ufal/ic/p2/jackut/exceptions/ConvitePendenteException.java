package br.ufal.ic.p2.jackut.exceptions;

public class ConvitePendenteException extends JackutException {
    public ConvitePendenteException() {
        super("Usu�rio j� est� adicionado como amigo, esperando aceita��o do convite.");
    }
}
