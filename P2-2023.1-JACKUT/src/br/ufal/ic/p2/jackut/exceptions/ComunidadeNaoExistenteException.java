package br.ufal.ic.p2.jackut.exceptions;

public class ComunidadeNaoExistenteException extends RuntimeException {
    public ComunidadeNaoExistenteException() {
        super("Comunidade n�o existe.");
    }
}
