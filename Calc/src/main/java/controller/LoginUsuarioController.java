/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class UsuarioController extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        try{
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            
            req.setCharacterEncoding("UTF-8");
            
            String email = req.getParameter("email");
            String senha = req.getParameter("senha");
            
            if(email.equals("teste@teste.com")&&senha.equals("senha")){
                sc.getRequestDispatcher("/Templates/calculadora.jsp").forward(req, resp);  
            }else{
                req.setAttribute("messagem", "Usuario Invalido");
                sc.getRequestDispatcher("/Templates/login.jsp").forward(req, resp);
            }
        }catch(Exception ex){}
    }
    
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
            
            senha=senha.trim().replace(" ", "");
            confSenha=confSenha.trim().replace(" ", "");
            nome=nome.trim().replace(" ", "");
            
            if(!nome.isEmpty() && !senha.isEmpty() && !confSenha.isEmpty()){
                sc.getRequestDispatcher("/Templates/calculadora.jsp").forward(req, resp);  
            }else{
                req.setAttribute("mensagem", "Campo vazio");
                sc.getRequestDispatcher("/Templates/criarConta.jsp").forward(req, resp);
            }
        }catch(Exception ex){}
    }
}
