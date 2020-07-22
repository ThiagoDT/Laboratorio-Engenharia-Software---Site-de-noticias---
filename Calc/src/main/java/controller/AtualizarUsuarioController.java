/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.UsuarioDAO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author Thiago
 */
public class AtualizarUsuarioController extends HttpServlet {
	/**
     *
     */
    private static final long serialVersionUID = -5123317669157459139L;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        CalculadoraController c = new CalculadoraController();
        try{
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            req.setCharacterEncoding("UTF-8");
            
            String email = req.getParameter("email");
            String nome= req.getParameter("nome");
            String senha= req.getParameter("senha");
            
            String s=senha.trim().replace(" ", "");
            String n=nome.trim().replace(" ", "");
            
            if(!n.isEmpty() && !s.isEmpty()){
                Usuario novo = UsuarioDAO.criar().
                        obterUsuario(SessaoUsuario.criar().obterDados(req)[1]).get();
                novo.setEmail(email);
                novo.setNome(nome);
                novo.setSenha(senha);
                UsuarioDAO.criar().atualizarUsuario(novo);
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
