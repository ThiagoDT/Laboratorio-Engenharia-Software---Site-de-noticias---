/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sessao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author Thiago
 */
public class SessaoUsuario {
    private HttpSession session;
    private static SessaoUsuario sessaoUsuario;
    
    private SessaoUsuario(){}
    
    public static SessaoUsuario criar(){
        if(sessaoUsuario==null)
            sessaoUsuario = new SessaoUsuario();
        return sessaoUsuario;
    }
    
    public void criarSessao(Usuario usuario, HttpServletRequest req ){
         session = req.getSession(); 
         session.setAttribute("id",usuario.getId());
         session.setAttribute("email", usuario.getEmail());
    }
    public String[] obterDados(HttpServletRequest req){
        session = req.getSession(false);
        String[] lista = new String[2];
        lista[0] = String.valueOf(session.getAttribute("id"));
        lista[1] = String.valueOf(session.getAttribute("email"));
        return lista;
    }
    
}
