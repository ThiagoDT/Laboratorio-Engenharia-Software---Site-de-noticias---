<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <meta http-equiv="cache-control" content="no-cache" />
        <title>Calculadora</title>
        <link rel="stylesheet" href="Static/css/reset.css">
	    <link rel="stylesheet" href="Static/css/estilo.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <header>
            <h1>CalcWeb</h1>
            <nav>
                <form method="Get" action="historico">
                    <button type="submit">Historico da calculadora</button>
                </form>
            </nav>
        </header>
        <main>
            <section class="conteudo-geral">
                <div class="calculadora">
                    <div>
                        <p id='resultado'>Resultado:</p>
                    </div>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" for="number1">Numero 1:</span>
                            </div>
                            <input id="number1" class="form-control" name="n1"type="number"  required="true">
                            
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
                            <input type = "submit" id="calcular" class="btn btn-primary btn-block" value="Calcular">
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
    <script src="Static/js/jquery-3.3.1.min.js"></script>
    <script id="s" src="Static/js/calculadora.js"></script>
</html>