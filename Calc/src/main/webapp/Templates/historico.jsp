<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Historico</title>
        <link rel="stylesheet" href="Static/css/reset.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="Static/css/estilo.css">
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
            <section class="conteudo-geral">
                <div class="historico row justify-content-center">
                    <div class="col-md-7">
                    <h2>Dados do usuario</h2>
                    <form method="Post" action="atualizarUsuario.action">
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Nome:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="nome" value="Thiago" required="true">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Email:</label>
                            <div class="col-sm-8">
                                <input type="email" class="form-control" name="email"value="thiago@gmail.com" required="true">
                            </div>
                        </div>
                        <div class="form-group row">    
                            <label class="col-sm-2 col-form-label">Senha:</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" name="senha" maxlength="20" value="senha" required="true">
                            </div>
                        </div>
                        <div class="form-group row justify-content-center">  
                            <div class="col-sm-5">
                            <button class="btn btn-primary btn-block " type="submit">Alterar dados conta</button>
                            </div>
                        </div>
                     </form>
                    </div>
                    <section>
                        <p>
                            <%
                                String resposta=(String) request.getAttribute("mensagem");
                                if(resposta!=null)
                                   out.print(resposta);
                            %>
                        </p>
                    </section>
                    <div class="table-responsive">
                        <h2>Historico das operações</h2>
                    <table class="table table-striped">
                        <%
                            //exsite uma hierarquia dos JSP
                            //Esta é a maior hierarquia desta pagina
                            String [] lista={"#","Numero 1","Numero 2","Operador","Resultado"};
                            String [][] listas={{"0","1", "2","adicao", "3"},
                                            {"1","2", "3","multiplicacao", "6"},
                                            {"2","1", "2","divisao", "0.5"},
                                            {"3","1", "2","divisao", "0.5"},
                                            {"4","1", "2","divisao", "0.5"},
                                            {"5","1", "2","divisao", "0.5"},
                                            {"6","1", "2","divisao", "0.5"},
                                            {"7","1", "2","divisao", "0.5"},
                                            {"8","1", "2","divisao", "0.5"}};
                         %>
                        <thead>
                        <%
                            //Esta é a menor hierarquia desta pagina
                            out.print("<tr class='bg-primary text-white'>");
                            for(int x=0;x<lista.length;x++){
                                out.print("<th scope='col'>");
                                out.print(lista[x]);
                                out.print("</th>");
                                
                            }
                            out.print("</tr>");
                        %>
                        </thead>
                        <tbody>

                        </tbody>
                        <%
                            //Esta é anenor hierarquia desta pagina
                            for(int i=0;i<9;i++)
                            {
                                out.print("<tr>");
                                for(int y=0;y<5;y++)
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
                    </div>
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