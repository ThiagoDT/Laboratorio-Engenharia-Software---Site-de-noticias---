/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Calculadora;

/**
 *
 * @author Thiago
 */
public class CalculadoraController implements IController{
    Calculadora cal;
    @Override
    public void doVerfirc(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
        
    }

    @Override
    public void doAdd(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
        try{
            req.setCharacterEncoding("UTF-8");
            cal=new Calculadora();
            
            float n1, n2;
            String op,resultado="ERRO";
            
            n1 = Float.parseFloat(req.getParameter("n1"));
            op = req.getParameter("operador");
            n2= Float.parseFloat(req.getParameter("n2"));
            
            resultado=cal.gerarResultado(n1,n2,op);
               
            req.setAttribute("resultado", resultado);
            sc.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);
            
            
            
        }catch(NullPointerException nu){}
        catch(Exception ex){
            System.err.println("ERR0: "+ex.getMessage()+":\n"+ex.getLocalizedMessage());
        }
    }

    @Override
    public void doUpdate(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse res, ServletContext sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
