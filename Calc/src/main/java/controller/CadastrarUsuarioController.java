/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Sessao.SessaoUsuario;
import crud.UsuarioCrud;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author Thiago
 */
public class CadastrarUsuarioController extends HttpServlet{
    
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
            String email = req.getParameter("email");
            String nome= req.getParameter("nome");
            String senha= req.getParameter("senha");
            String confSenha= req.getParameter("senhaConf");
            
            String s=senha.trim().replace(" ", "");
            String confS=confSenha.trim().replace(" ", "");
            String n=nome.trim().replace(" ", "");
            
            if(!n.isEmpty() && !s.isEmpty() && !confS.isEmpty()){
                
                UsuarioCrud.criar().criarUsuario(new Usuario(nome, senha, email));
                Usuario novo = UsuarioCrud.criar().obterUsuario(email).get();
                SessaoUsuario.criar().criarSessao(novo, req);
                sc.getRequestDispatcher("/Templates/calculadora.jsp").forward(req, resp);
            }
            req.setAttribute("mensagem", "Campo vazio");
            sc.getRequestDispatcher("/Templates/criarConta.jsp").forward(req, resp);
            
        }catch(Exception ex){}
    }
}
