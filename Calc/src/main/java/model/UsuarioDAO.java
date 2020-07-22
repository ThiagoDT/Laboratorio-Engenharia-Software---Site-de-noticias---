/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.util.Optional;
import javax.persistence.NoResultException;
import model.Usuario;
/**
 *
 * @author Thiago
 */
public class UsuarioCrud extends Factory{
    protected static UsuarioCrud usucrud;
    
    public static UsuarioCrud criar(){
        if(usucrud == null)
            usucrud= new UsuarioCrud();
        return usucrud;
    }
    
    
    private UsuarioCrud(){
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
