<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Calculadora</title>
        <link rel="stylesheet" href="Static/css/reset.css">
	<link rel="stylesheet" href="Static/css/estilo.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    </head>
    <body>
        <header>
            <h1>CalcWeb</h1>
            <nav>
                <ul>
                    <li><a href="historico">Historico da calculadora</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <section class="conteudo-geral">
                <div class="calculadora">
                    <div>
                        <p id='Resultado'>Resultado:
                            <%
                                String r=(String) request.getAttribute("resultado");
                                if(r!=null)
                                    out.print(r);
                            %>
                        </p>
                    </div>
                    <form method="post" action="resultado.action" >
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" for="number1">Numero 1:</span>
                            </div>
                            <input id="number1" class="form-control" name="n1"type="number" required="true">
                            
                        </div>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for="op">Operador:</label>
                            </div>
                            <select class="form-control" id="op" name="operador" required="true">
                                <option>Adicao</option>
                                <option>Subtracao</option>
                                <option>Multiplicacao</option>
                                <option>Divisao</option>
                            </select>
                        </div>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" for="number2">Numero 2:</span>
                            </div>
                            <input id="number2" class="form-control" name="n2"type="number" required="true">
                            
                        </div>
                        <div class="form-group">
                            <input class="btn btn-primary btn-block" type="submit" value="Resultado">
                        </div>

                    </form> 
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