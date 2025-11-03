package model;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private long id;
    private String nomeUsuario;
    private String email;
    private String TipoUsuario tipodeUsuario; //  enum aluno, professor, funcionario
    private List<Emprestimo> emprestimos; // historico dos emprestimos
    //construtores
    //atributos sem id
    public Usuario(String nomeUsuario, String email, String tipodeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.tipodeUsuario = tipodeUsuario;
        this.emprestimos = new ArrayList <Emprestimo>();
    }
    //construtor vazio
    public Usuario() {}
    //atributos com id
    public Usuario(long id, String nomeUsuario, String email, String tipodeUsuario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.tipodeUsuario = tipodeUsuario;
        this.emprestimos = new ArrayList();
    }
    //getters e setters

}

