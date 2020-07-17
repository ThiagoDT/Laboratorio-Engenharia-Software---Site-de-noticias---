package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Usuario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "u_seq")
    @SequenceGenerator(name="usuario_sequence", sequenceName="u_seq")
    private long id;
    
    @Basic
    @Column(nullable = false, length = 30)
    private String nome;
    
    @Basic
    @Column(nullable = false, length = 20)
    private String senha;
    
    @Basic
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    
    @Basic
    @OneToMany(mappedBy = "usuario", targetEntity = Historico.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    private List<Historico> historicos = new ArrayList<>();
    

    public Usuario(long id, String nome, String senha, String email){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }
    
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

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the historicos
     */
    public List<Historico> getHistoricos() {
        return historicos;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
    
    
    
    
    
}