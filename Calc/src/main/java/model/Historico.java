package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.persistence.Basic;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "h_seq")
    @SequenceGenerator(name="historico_sequencia", sequenceName="h_seq")
    private long id;
    
    @Basic
    @Column(nullable = false)
    private float valor1;
    
    @Basic
    @Column(nullable = false)
    private float valor2;
    
    @Basic
    @Column(nullable = false, length = 15)
    private String operador;
    
    @Basic
    @Column(nullable = false, length = 40)
    private String resultado;
    
    @Basic
    @ManyToOne()
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    public Historico() {
    }

    public Historico(float valor1,float valor2,String op, String resultado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operador=op;
        this.resultado = resultado;
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
    public float getValor1() {
        return valor1;
    }

    /**
     * @return the valor2
     */
    public float getValor2() {
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

    /**
     * @return the operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String historicoJson(){
        JsonObjectBuilder c = Json.createObjectBuilder();
        c.add("n1", this.valor1);
        c.add("n2:", this.valor2);
        c.add("operador", this.operador);
        c.add("resultado", this.resultado);
        JsonObject objetoJson = c.build();
        return objetoJson.toString();
    }

}