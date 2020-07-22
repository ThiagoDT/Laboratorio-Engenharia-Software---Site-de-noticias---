/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Optional;
import javax.persistence.NoResultException;
import model.Usuario;
/**
 *
 * @author Thiago
 */
public class UsuarioDAO extends Factory{
    protected static UsuarioDAO usucrud;
    
    public static UsuarioDAO criar(){
        if(usucrud == null)
            usucrud= new UsuarioDAO();
        return usucrud;
    }
    
    
    private UsuarioDAO(){
        super();
    }
    
    public void criarUsuario(Usuario usuario){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(usuario);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public void atualizarUsuario(Usuario usuario){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(usuario);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    @SuppressWarnings("unchecked")
    public Optional<Usuario> obterUsuario(String email){
       try{ 
           Usuario u;
           u= entityManager.createQuery("FROM "+Usuario.class.getName()+" as u where u.email='"+
                  email+"'", Usuario.class).getSingleResult();
           Optional<Usuario> uo = Optional.of(u);
           return uo;
       }catch(NoResultException ex){
            //ex.printStackTrace();
            return Optional.empty();
       }
        
    }
}
