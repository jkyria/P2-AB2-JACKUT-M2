package br.ufal.ic.p2.jackut.exceptions;

public class AutoRelacionamentoException extends JackutException {
    public AutoRelacionamentoException() {
        super("Usu�rio n�o pode adicionar a si mesmo como amigo.");
    }
}
