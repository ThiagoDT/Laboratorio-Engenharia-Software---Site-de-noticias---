<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Login</title>
        <link rel="stylesheet" href="reset.css">
        <link rel="stylesheet" href="estilo.css">
    </head>
    <body>
        <header>
            <h1>CalcWeb</h1>
            <nav>
                <ul>
                    <li><a href="home">Home</a></li>
                    <li><a href="criarConta">Criar Conta</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <form method="get" action="verificarLogin.action">
                Email:<input type="email" name='email'><br>
                Senha:<input type="password" name="senha"><br>
                <input type="submit" value="Entrar">
            </form>
            <p>
            <%
                try{
                    String r=(String) request.getAttribute("messagem");
                    if(r!=null){
                        out.println(r);
                        this.log(r);
                    }
                }catch(Exception ex){
                    
                }
            %>
            </p>
        </main>
        <footer></footer>
    </body>
</html>