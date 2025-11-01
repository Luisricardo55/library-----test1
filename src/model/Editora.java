package model;

import java.util.Objects;

public class Editora {
    private long id;
    private String nome;
    private String pais;
    private String endereco;

    //construtores
    //criando atributos
    public Editora(String nome, String pais, String endereco) {
        this.nome = nome;
        this.pais = pais;
        this.endereco = endereco;
    }

    //construtor vazio
    public Editora() {
    }

    //atributos com id
    public Editora(long id, String nome, String pais, String endereco) {
        this(nome, pais, endereco);
        this.id = id;
    }

    //getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editora editora = (Editora) o;
        return Objects.equals(id, editora.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}