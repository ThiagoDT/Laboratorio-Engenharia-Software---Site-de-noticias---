<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <meta http-equiv="cache-control" content="no-cache" />
        <title>Login</title>
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
                    <li><a href="criarConta">Criar Conta</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <section class="conteudo-geral">
                <div class="formulario">
                    <h2>Login</h2>
                    <form>
                        <div class="form-group row">
                            <label for="email" class="col-sm-2 col-form-label">Email:</label>
                            <div class="col-sm-8">
                                <input id="email" class="form-control" type="email" name='email' placeholder="teste@gmail.com" required="true">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="senha" class="col-sm-2 col-form-label">Senha:</label>
                            <div class="col-sm-8">
                                <input id="senha" class="form-control" type="password" name="senha" placeholder="*****" required="true">
                            </div>
                        </div>
                        <div class="form-group justify-content-center">
                            <input type = "submit" id="logar" class="btn btn-primary botao-confirmar" value="Entrar">
                        </div>  
                    </form>
                    <p id="resposta"></p>
                </div>
            </section>
        </main>
        <footer>
            <div class="contesto-principal">
                <p>&#9413; Projeto de Engenharia de Software 3</p>
            </div>
        </footer>
    </body>
    <script src="Static/js/jquery-3.3.1.min.js"></script>
    <script src="Static/js/login.js"></script>
</html>