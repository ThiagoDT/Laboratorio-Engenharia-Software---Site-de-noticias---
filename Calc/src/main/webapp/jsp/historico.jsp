<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Historico</title>
        <link rel="stylesheet" href="reset.css">
		<link rel="stylesheet" href="estilo.css">
    </head>
    <body>
        <header>
            <h1>CalcWeb</h1>
            <nav>
                <ul>
                    <li><a href="calculadora">Calculadora</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <h2>Historico</h2>
            <br>
            <form method="Post" action="atualizarUsuario.action">
                    <label>Nome:
                        <input type="text" name="nome" value="Thiago"><br>
                    </label>
                    <label>Email:
                        <input type="email" name="email"value="thiago@gmail.com" ><br>
                    </label>
                    <label>Senha:
                        <input type="password" name="senha" maxlength="20" value="senha"><br>
                    </label>
                    <input type="submit" value="Alterar dados conta"><br>
             </form>
            <section>
                <p>
                    <%
                        String resposta=(String) request.getAttribute("mensagem");
                        if(resposta!=null)
                           out.print(resposta);
                    %>
                </p>
            </section>
            <table>
                <%
                    //exsite uma hierarquia dos JSP
                    //Esta é a maior hierarquia desta pagina
                    String [] lista={"Numero 1","Numero 2","Operador","Resultado"};
                    String [][] listas={{"1", "2","adicao", "3"},
                                    {"2", "3","multiplicacao", "6"},
                                    {"1", "2","divisao", "0.5"}};
                 %>
                <thead>
                <%
                    //Esta é a menor hierarquia desta pagina
                    out.print("<tr>");
                    for(int x=0;x<lista.length;x++){
                        out.print("<td>");
                        out.print(lista[x]);
                        out.print("</td>");
                    }
                    out.print("</tr>");
                %>
                </thead>
                <tbody>
                    
                </tbody>
                <%
                    //Esta é anenor hierarquia desta pagina
                    for(int i=0;i<3;i++)
                    {
                        out.print("<tr>");
                        for(int y=0;y<4;y++)
                        {
                            out.print("<td>");
                            String r=listas[i][y];
                            out.print(r);
                            out.print("</td>");
                        }
                        out.print("</tr>");
                    }
                %>
            </table>
        </main>
        <footer></footer>
    </body>
</html>