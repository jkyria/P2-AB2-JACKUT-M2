package br.ufal.ic.p2.jackut.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Perfil implements Serializable {
    private static final long serialVersionUID = 1L;

    private final Map<String, String> atributos = new HashMap<>();

    public void adicionarAtributo(String chave, String valor) {
        if (chave == null || chave.isEmpty()) {
            throw new RuntimeException("Atributo não preenchido.");
        }
        atributos.put(chave, valor);
    }

    public String getAtributo(String chave) {
        return atributos.get(chave);
    }

    public Map<String, String> getAtributos() {
        return atributos;
    }
}