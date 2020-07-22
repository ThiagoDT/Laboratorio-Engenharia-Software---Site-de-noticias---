/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.UsuarioDAO;
import java.util.Optional;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import java.io.PrintWriter;
import javax.json.Json;

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
            resp.setContentType("text/plain");
            req.setCharacterEncoding("UTF-8");
            
            String e = req.getParameter("email");
            String s = req.getParameter("senha");
            PrintWriter pw =resp.getWriter();

            Optional<Usuario> opnovo = UsuarioDAO.criar().obterUsuario(e);
            
            if(opnovo.isPresent() && s.equals(opnovo.get().getSenha())){
                SessaoUsuario.criar().criarSessao(opnovo.get(), req);
                
                pw.write("/calculadora");
                pw.close();
            }else{
                pw.write("Usuario Invalido");
                pw.close();
            }
        }catch(Exception ex){
        }
    }
    
}
