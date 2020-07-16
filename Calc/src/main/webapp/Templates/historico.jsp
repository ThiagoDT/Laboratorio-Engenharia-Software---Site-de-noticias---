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
            <%@page import="
                    java.util.*,
                    model.*" 
            %>
            <%
                Usuario us = (Usuario)request.getAttribute("usuario"); 
            %>
            <section class="conteudo-geral">
                <div class="historico row justify-content-center">
                    <div class="col-md-7">
                    <h2>Dados do usuario</h2>
                    <form method="Post" action="atualizarUsuario.action">
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Nome:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="nome" value="<%=us.getNome()%>" required="true">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Email:</label>
                            <div class="col-sm-8">
                                <input type="email" class="form-control" name="email" value="<%=us.getEmail()%>" required="true">
                            </div>
                        </div>
                        <div class="form-group row">    
                            <label class="col-sm-2 col-form-label">Senha:</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" name="senha" maxlength="20" value="<%=us.getSenha()%>"  required="true">
                            </div>
                        </div>
                        <div class="form-group row justify-content-center">  
                            <div class="col-sm-5">
                            <button class="btn btn-primary btn-block " type="submit">Alterar dados conta</button>
                            </div>
                        </div>
                     </form>
                     <p>
                     <%
                        String resposta=(String) request.getAttribute("mensagem");
                        if(resposta!=null)
                            out.print(resposta);
                     %>
                      </p>
                    </div>
                    <div class="table-responsive">
                        <h2>Historico das operações</h2>
                    <table class="table table-striped">
                        <%
                            //exsite uma hierarquia dos JSP
                            //Esta é a maior hierarquia desta pagina
                            String [] lista={"#","Numero 1","Operador","Numero 2","Resultado"};
                            List<Historico> historicos = (List<Historico>)request.getAttribute("historico"); 
                        %>
                          
                        <thead>
                            <tr class="bg-primary text-white">
                        <%
                            for(int x=0;x<lista.length;x++){
                        %>
                                <th scope="col"><%=lista[x]%></th>
                        <%      
                            }
                        %>
                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                        <%
                            for(Historico hi:historicos){
                        %>
                        <tr>
                            <td><%=hi.getId() %></td>
                            <td><%=hi.getValor1() %></td>
                            <td><%=hi.getOperador() %></td>
                            <td><%=hi.getValor2() %></td>
                            <td><%=hi.getResultado() %></td>
                        </tr>
                        <%
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