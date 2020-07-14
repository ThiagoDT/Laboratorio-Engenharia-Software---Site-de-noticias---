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
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Criar conta</title>
        <link rel="stylesheet" href="Static/css/reset.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="Static/css/estilo.css">
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
            <section class="conteudo-geral">
                <div class="formulario">
                    <h2>Formulario de Cadastro</h2>
                    <form method="Post" action="cadastrarUsuario.action">
                        <div class="form-group row">
                            <label for="nome" class="col-sm-2 col-form-label">Nome:</label>
                            <div class="col-sm-8">
                                <input id="nome" type="text" class="form-control" name="nome" placeholder="thiago" required="true">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="email" class="col-sm-2 col-form-label">Email:</label>
                            <div class="col-sm-8">
                                <input id="email" type="email" class="form-control" name="email" placeholder="teste@gmail.com" required="true">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="senha" class="col-sm-2 col-form-label">Senha:</label>
                            <div class="col-sm-8">
                                <input id="senha" type="password" class="form-control" name="senha" maxlength="20" placeholder="*****" required="true">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="csenha" class="col-sm-2 col-form-label">Confirmar senha:</label>
                            <div class="col-sm-8">
                                <input id="csenha" type="password" class="form-control" name="senhaConf" maxlength="20" placeholder="*****" required="true">
                            </div>
                        </div>
                        <div class="form-group row justify-content-center">
                            <div class="col-sm-4 mb-2">
                                <input type="submit" value="Criar conta" class="btn btn-primary btn-block">
                            </div>
                            <div class="col-sm-4 mb-2">
                                <input type="reset" value="Limpar" class="btn btn-primary btn-block ">
                            </div>
                        </div>
                    </form>
                    <p>
                        <%
                            String r=(String) request.getAttribute("mensagem");
                            if(r!=null)
                                out.print(r);
                        %>
                    </p>
                </div>
            </section>
        </main>
        <footer>
            <div class="contesto-principal">
                <p>&#9413; Projeto de Engenharia de Software 3</p>
            </div>
        </footer>
    </body>
</html>
