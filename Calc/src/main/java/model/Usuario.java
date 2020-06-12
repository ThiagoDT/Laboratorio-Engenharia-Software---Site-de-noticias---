package model;

public class Usuario{
    private int id;
    private String nome;
    private String senha;
    private String email;

    public Usuario(int id, String nome, String senha, String email){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }
}