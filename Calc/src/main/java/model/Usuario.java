package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Basic;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    @Column(nullable = false, length = 30)
    private String nome;
    
    @Basic
    @Column(nullable = false, length = 20)
    private String senha;
    
    @Basic
    @Column(nullable = false, length = 50)
    private String email;

    
    public Usuario(String nome, String senha, String email){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }
    
    public Usuario(){}

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    
    
    
    
}