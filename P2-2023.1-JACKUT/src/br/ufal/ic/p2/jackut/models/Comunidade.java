package br.ufal.ic.p2.jackut.models;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Comunidade {
    private final String nome;
    private final String descricao;
    private final String dono;
    private final Set<String> membros = new LinkedHashSet<>(); // Usando LinkedHashSet para manter ordem

    public Comunidade(String nome, String descricao, String dono) {
        this.nome = nome;
        this.descricao = descricao;
        this.dono = dono;
        this.membros.add(dono); // O dono é automaticamente membro
    }

    public boolean adicionarMembro(String login) {
        if (membros.contains(login)) {
            return false;
        }
        return membros.add(login);
    }

    public List<String> getMembrosOrdenados() {
        List<String> ordenados = new ArrayList<>(membros);
        Collections.sort(ordenados); // Ordena alfabeticamente
        return ordenados;
    }

    //Mantém a ordem de inserção
    public List<String> getMembrosEmOrdemInsercao() {
        return new ArrayList<>(membros);
    }

    public Set<String> getMembros() {
        return new HashSet<>(this.membros);  // Retorna cópia mutável
    }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public String getDono() { return dono; }

    public void setMembros(Set<String> novosMembros) {
    }

    public boolean removerMembro(String login) {
        return membros.remove(login);
    }

    public void removerMembroDirectamente(String login) {

    }
}