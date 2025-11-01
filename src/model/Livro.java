package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Livro {
private String titulo;
private long id;
private String sinopse;
private BigDecimal preco;
private Autor autor;
private Editora editora;
private LocalDate dataLancamento;
private Categoria categoria;

//construtores
    //construtor de criação
    public Livro(String titulo, String sinopse, BigDecimal preco, Autor autor, Editora editora,
                 LocalDate dataLancamento, Categoria categoria) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.preco = preco;
        this.autor = autor;
        this.editora = editora;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }
// construtor vazio para frameworks
    public Livro() {};

    //construtor vindo do mysql
    public Livro( long id, String titulo, String sinopse, BigDecimal preco, Autor autor, Editora editora,
                  LocalDate dataLancamento, Categoria categoria) {
        this(titulo, sinopse, preco, autor, editora, dataLancamento, categoria);
        this.id = id;
    }
    //getters e setters
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getSinopse() {return sinopse;}
    public void setSinopse(String sinopse) {this.sinopse = sinopse;}
    public BigDecimal getPreco() {return preco;}
    public void setPreco(BigDecimal preco) {this.preco = preco;}
    public Autor getAutor() {return autor;}
    public void setAutor(Autor autor) {this.autor = autor;}
    public Editora getEditora() {return editora;}
    public void setEditora(Editora editora) {this.editora = editora;}
    public LocalDate getDataLancamento() {return dataLancamento;}
    public void setDataLancamento(LocalDate dataLancamento) {this.dataLancamento = dataLancamento;}
    public Categoria getCategoria() {return categoria;}
    public void setCategoria(Categoria categoria) {this.categoria = categoria;}
    @Override
    //representação resumida do livro
    public String toString() {
        return titulo + " (" + categoria + ")" + "(" + autor + ")" + "(" + editora + ")" ;
    }
    // se dois livros tiveem o mesmo id eles sao iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return id == livro.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
