/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago
 */
public class UsuarioController implements IController{

    @Override
    public void doVerfirc(HttpServletRequest req, HttpServletResponse res,ServletContext sc) {
        try{
            req.setCharacterEncoding("UTF-8");
            
            String email = req.getParameter("email");
            String senha = req.getParameter("senha");
            
            if(email.equals("teste@teste.com")&&senha.equals("senha")){
                sc.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);  
            }else{
                req.setAttribute("messagem", "Usuario Invalido");
                sc.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
            }
            
            
        }catch(NullPointerException ne){}
        catch(Exception ex){
            System.err.println("ERRO: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
        } 
    }

    @Override
    public void doAdd(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
        try{
            req.setCharacterEncoding("UTF-8");
            String email = req.getParameter("email");
            String nome= req.getParameter("nome");
            String senha= req.getParameter("senha");
            String confSenha= req.getParameter("senhaConf");
            
            senha=senha.trim().replace(" ", "");
            confSenha=confSenha.trim().replace(" ", "");
            nome=nome.trim().replace(" ", "");
            
            if(!nome.isEmpty() && !senha.isEmpty() && !confSenha.isEmpty()){
                sc.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);  
            }else{
                req.setAttribute("mensagem", "Campo vazio");
                sc.getRequestDispatcher("/jsp/criarConta.jsp").forward(req, res);
            }
            
        }catch(NullPointerException ne){}
        catch(Exception ex){
            System.err.println("ERRO: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
        }
    }

    @Override
    public void doUpdate(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
try{
            req.setCharacterEncoding("UTF-8");
            String email = req.getParameter("email");
            String nome= req.getParameter("nome");
            String senha= req.getParameter("senha");
            
            senha=senha.trim().replace(" ", "");
            nome=nome.trim().replace(" ", "");
            
            if(!nome.isEmpty() && !senha.isEmpty()){
                req.setAttribute("mensagem", "Atualizado");
            }else{
                req.setAttribute("mensagem", "Campo vazio");
            }
            sc.getRequestDispatcher("/jsp/historico.jsp").forward(req, res);
            
        }catch(NullPointerException ne){}
        catch(Exception ex){
            System.err.println("ERRO: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
        }    
    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
