package model;

public enum TipoUsuario {
    CRIANCAS("Crianças", 4, 7),
    ADOLECENTES("Adolecentes", 5, 8),
    ADULTOS("Adultos", 10, 20),
    IDOSOS("Idosos", 10, 20);
    //atributos
    private final String tipodeUsuario;
    private final int quantidadeLivros;
    private final int prazoDevolver;
//construtores --- sempre usar o 'private' no enum
    TipoUsuario(String tipodeUsuario, int quantidadeLivros, int prazoDevolver) {
        this.tipodeUsuario = tipoUsuario;
        this.quantidadeLivros = quantidadeLivros;
        this.prazoDevolver = prazoDevolver;
    }
    //getters para acessar os tipos
    public String getTipodeUsuario() {return tipdeUsuario;}
    public int getQuantidadeLivros() {return quantidadeLivros;}
    public int getPrazoDevolver() {return prazoDevolver;}
    @Override
    public String toString() {return tipodeUsuario;}


}
