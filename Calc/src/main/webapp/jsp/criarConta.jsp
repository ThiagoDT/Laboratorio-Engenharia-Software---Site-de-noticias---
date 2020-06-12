<%-- 
    Document   : criarConta
    Created on : 10/06/2020, 19:53:30
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <h1>CalcWeb</h1>
            <nav>
                <ul>
                    <li><a href="home">Home</a></li>
                    <li><a href="login">Login</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <div>
                <h2>Formulario de Cadastro</h2>
                <form method="Post" action="cadastrarUsuario.action">
                    <label>Nome:
                        <input type="text" name="nome" value="Thiago"><br>
                    </label>
                    <label>Email:
                        <input type="email" name="email"value="thiago@gmail.com" ><br>
                    </label>
                    <label>Senha:
                        <input type="password" name="senha" maxlength="20" value="senha"><br>
                    </label>
                    <label>Confirmar senha:
                        <input type="password" name="senhaConf" maxlength="20" value="senha"><br>
                    </label>
                    <input type="submit" value="Criar conta"><br>
                    <input type="reset" value="Limpar"><br>
                </form>
                <section>
                    <p>
                        <%
                            String r=(String) request.getAttribute("mensagem");
                            if(r!=null)
                                out.print(r);
                        %>
                    </p>
                </section>
            </div>
        </main>
    </body>
</html>
