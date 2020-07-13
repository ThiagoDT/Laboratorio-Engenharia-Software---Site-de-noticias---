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
import outros.Calculadora;

/**
 *
 * @author Thiago
 */
public class CalculadoraController extends HttpServlet{
    Calculadora cal;
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            cal=new Calculadora();
            
            float n1, n2;
            String op,resultado="ERRO";
            
            n1 = Float.parseFloat(req.getParameter("n1"));
            op = req.getParameter("operador");
            n2= Float.parseFloat(req.getParameter("n2"));
            
            resultado=cal.gerarResultado(n1,n2,op);
               
            req.setAttribute("resultado", resultado);
            sc.getRequestDispatcher("/Templates/calculadora.jsp").forward(req, resp);
            
            
            
        }catch(NullPointerException nu){}
        catch(Exception ex){
            System.err.println("ERR0: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
        }
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        try{
            
        }catch(Exception ex){}
    }
}
