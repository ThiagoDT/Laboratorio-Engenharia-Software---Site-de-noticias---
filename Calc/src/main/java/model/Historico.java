package model;

public class Historico {
    private int id;
    private String conteudo;
    private float resultado;

    public Historico (int id, String conteudo, float resultado){
        this.id=id;
        this.conteudo=conteudo;
        this.resultado=resultado;
    }
}