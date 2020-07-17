/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Sessao.SessaoUsuario;
import crud.UsuarioCrud;
import java.util.Optional;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author Thiago
 */
public class LoginUsuarioController extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){     
         try{
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            req.setCharacterEncoding("UTF-8");
            
            String e = req.getParameter("email");
            String s = req.getParameter("senha");
            
            Optional<Usuario> opnovo = UsuarioCrud.criar().obterUsuario(e);
            
            if(opnovo.isPresent() && s.equals(opnovo.get().getSenha())){
                SessaoUsuario.criar().criarSessao(opnovo.get(), req);
                sc.getRequestDispatcher("/Templates/calculadora.jsp").forward(req, resp);  
            }else{
                req.setAttribute("messagem", "Usuario Invalido");
                sc.getRequestDispatcher("/Templates/login.jsp").forward(req, resp);
            }
        }catch(Exception ex){
        }
    }
    
}
