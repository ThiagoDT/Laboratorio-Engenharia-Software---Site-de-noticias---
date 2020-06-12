<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Calculadora</title>
        <link rel="stylesheet" href="../css/reset.css">
		<link rel="stylesheet" href="../css/estilo.css">
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
            <img src="resource/1081217.jpg" class="imagemFundo">
            <section class="calculadora">
                <div>
                    <p id='Resultado'>Resultado:
                        <%
                            String r=(String) request.getAttribute("resultado");
                            if(r!=null)
                                out.print(r);
                        %>
                    </p>
                </div>
                <div>
                    <form method="post" action="resultado.action" >
                        <label>Numero 1:
                            <input name="n1"type="number">
                        </label><br>
                        <label>Operador-: 
                            <select name="operador">
                                <option>Adicao</option>
                                <option>Subtracao</option>
                                <option>Multiplicacao</option>
                                <option>Divisao</option>
                            </select>
                        </label><br>
                        <label>Numero 2:
                            <input name="n2" type="number">
                        </label><br>
                        <input class="botaoResu" type="submit" value="Resultado">
                        
                    </form>
                </div>
            </section>
        </main>
    </body>
</html>