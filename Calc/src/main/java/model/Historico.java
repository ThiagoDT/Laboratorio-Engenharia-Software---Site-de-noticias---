package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    @Column(nullable = false)
    private long valor1;
    
    @Basic
    @Column(nullable = false)
    private long valor2;
    
    @Basic
    @Column(nullable = false, length = 100)
    private String resultado;
    
    
    @Basic
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE , orphanRemoval = true)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    public Historico() {
    }

    public Historico(long valor1, long valor2, String resultado, Usuario usuario) {
        this.id = id;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
        this.usuario = usuario;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the valor1
     */
    public long getValor1() {
        return valor1;
    }

    /**
     * @return the valor2
     */
    public long getValor2() {
        return valor2;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }
    
    
    
    

}