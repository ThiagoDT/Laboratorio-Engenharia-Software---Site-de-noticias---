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
public class AtualizarUsuarioController extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        CalculadoraController c = new CalculadoraController();
        try{
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            req.setCharacterEncoding("UTF-8");
            
            String email = req.getParameter("email");
            String nome= req.getParameter("nome");
            String senha= req.getParameter("senha");
            
            String s=senha.trim().replace(" ", "");
            String n=nome.trim().replace(" ", "");
            
            if(!n.isEmpty() && !s.isEmpty()){
                Usuario novo = UsuarioCrud.criar().
                        obterUsuario(SessaoUsuario.criar().obterDados(req)[1]).get();
                novo.setEmail(email);
                novo.setNome(nome);
                novo.setSenha(senha);
                UsuarioCrud.criar().atualizarUsuario(novo);
                SessaoUsuario.criar().criarSessao(novo, req);
                
                req.setAttribute("mensagem", "Dados do usuario alterado");
            }else{
                req.setAttribute("mensagem", "Campo vazio");
            }
            c.doGet(req, resp);
            
                    
        }catch(Exception ex){
        
        }
    }
}
