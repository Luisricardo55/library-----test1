package model;

public enum Categoria {
    //valores+caracteristicas entres parenteses
    FICCAO("Ficção", "Livros imaginarios!"),
    ROMANCE("Romance", "Historias de amor!"),
    TECNICO("Tecnico", "Estudos aprofundados!"),
    ACAO("Ação", "Historias de ritmo intenso!"),
    DRAMA("Drama", "Historias sobre conlfitos e experiências humanas."),
    TERROR("Terror", "Historias de dar medo!"),
    AVENTURA("Aventura", "Historias sobre explorações!"),
    INFANTIL("Infantil", "Historias para crianças!");
    //atributos
    private final String nome;
    private final String descricao;
    //construtor---> sempre usar private no enum
    Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    //getters para acessar as caracteristicas
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return nome;
    }
}
