/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.UsuarioDAO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Historico;
import model.Usuario;
import calculadora.Calculadora;
import java.io.PrintWriter;

/**
 *
 * @author Thiago
 */
public class CalculadoraController extends HttpServlet{
    
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        Calculadora cal;
        float n1, n2;
        String op,resultado="ERRO";
        try{
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/plain");
            cal=new Calculadora();
            
            n1 = Float.parseFloat(req.getParameter("n1"));
            op = req.getParameter("operador");
            n2= Float.parseFloat(req.getParameter("n2"));
            
            resultado=cal.gerarResultado(n1,n2,op);
            
            Usuario usuario = UsuarioDAO.criar()
                    .obterUsuario(SessaoUsuario.criar()
                    .obterDados(req)[1]).get();
            
            //cadastrar o historico
            Historico his= new Historico(n1, n2, op, resultado);
            usuario.getHistoricos().add(his);
            his.setUsuario(usuario);
            //O historico é cadastrado pelo UsuarioUrud poque o Usuario é o dono do mapiamento;
            UsuarioDAO.criar().atualizarUsuario(usuario);
            
            PrintWriter pw = resp.getWriter();
            pw.write(his.historicoJson());
            pw.close();
        }catch(Exception ex){
            System.err.println("ERR0: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
        }
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        try{
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            Usuario usuario = UsuarioDAO.criar()
                    .obterUsuario(SessaoUsuario.criar().obterDados(req)[1]).get();

            req.setAttribute("historico", usuario.getHistoricos());
            req.setAttribute("usuario", usuario);

            sc.getRequestDispatcher("/Templates/historico.jsp").forward(req, resp);
        }catch(Exception ex){
            
        }
    }
    
    
}
