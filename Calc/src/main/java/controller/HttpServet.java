package controller;

import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Calculadora;

@WebServlet({"*.action","/"})
public class HttpServet extends HttpServlet{
    IController web;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        try{
            String path = req.getServletPath();
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");
            switch (path){
                case "/" :
                    sc.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
                case "/home" :
                    sc.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);

                case "/login":
                    sc.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
                case "/verificarLogin.action":
                    web= new UsuarioController();
                    web.doVerfirc(req, resp,sc);  
                case "/calculadora":
                    sc.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, resp);
                case "/historico":
                    sc.getRequestDispatcher("/jsp/historico.jsp").forward(req, resp);
                case "/criarConta":
                    sc.getRequestDispatcher("/jsp/criarConta.jsp").forward(req, resp);
                default:
                    sc.getRequestDispatcher("/jsp/nao_encontrado.jsp").forward(req, resp);                  
            }
        }catch (Exception ex){} 
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{
            String path = req.getServletPath();
            ServletContext sc = req.getServletContext();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html");

            switch (path){
                case "/resultado.action":
                    web= new CalculadoraController();
                    web.doAdd(req, resp,sc);
                case "/cadastrarUsuario.action":
                    web= new UsuarioController();
                    web.doAdd(req, resp,sc);
                case "/atualizarUsuario.action":
                    web= new UsuarioController();
                    web.doUpdate(req, resp,sc);
            }
        }catch (Exception ex){} 
    }

}