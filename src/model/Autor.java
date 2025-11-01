package model;

import java.util.Objects;

public class Autor {
    private Long id;
    private String nome;//nome completo do autor
    private String nacionalidade;//info basica
//construtores
    //atrubutos sem id
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
//construtor vazio
    public Autor() {}
//atributos com id
    public Autor(Long id, String nome, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    //getters e setter1
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
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    @Override
    public String toString() {
        return nome;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(id, autor.id);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}