# Laboratorio-Engenharia-Software---Calculadora---
Neste Diretório sera realizado os trabalhos da disciplina de Laboratório de Engenharia de Software 3.
O projeto deste github tem como objetivo o desenvolvimento o servidor web criado em um ambiente java.
Durante o andamento do projeto, o tema foi modificado, que anteriormante seria construido um site de noticias, mas atualmente sera um site de simples calculadora.

## Tecnologias Utilizadas neste Projeto

__Tecnologias do front-end__
* HMTL5
* CSS3
* JavaScript

__Tecnologias do back-end__
* Java 8
* Gradle 5.6
* Servlet & JSP
* MySQL 8
* Hibernate & JPA

## Projeto
Para o desenvolvimentodo projeto, foi utilizado alguns padrãos de projetos como __MVC__ (Model View Controller) que separa a construção do projeto, __strategy__ que auxilia as funções com comportamento semelhantes, e o __singleton__ que introduz a criação de um objeto.
Cada padão ajudou o desenvolvimento e foi utilizado no projeto na seguinte maneira:
* __MVC__ - Para a construção e divisão da CalcWEB em partes.
* __Strategy__ - Foi utilizado nas funções da calculadora como adição, subtração, divisão e multiplicação.
* __Singleton__ - Foi para criar o objeto de criação e manipulação do banco de dados.

### Instalação
O CalcWeb tem como requisitos para funcionamento, instalação do JDK8 e configiração do gradle que é a, inserção da variavel de ambiente. Por ultimo o sistema gerenciador de banco de dados MySQL na versão 8.
Após os requisitos finalizado, para executar o projeto o usuario precisa digitar os comando abaixo:

### Configuração antes de iniciar
Execute o arquivo chamado `Arquivo de criação do banco de dados.sql` no Mysql Workbench para criar o banco de dados.
Depois da execução do arquivo, o usuario precisa mudar algumas configuração de um arquivo que esta localizado em `src/main/resources/META-INF`. As configuração que precisam ser mudadas são:

`<property name="javax.persistence.jdbc.user" value="coloque nome do usuario do banco"/>`
<br>
`<property name="javax.persistence.jdbc.password" value="coloque a senha do usuario"/>`

Apos a mudanca da configuração, o proximo passo é a execução do projeto, que sera mostrado como executa.
### Execução do projeto
Para executar o projeto, precisa estar dentro da pasta do projeto, para que os comandos fucione.

1. __Instala as dependencias e configura o projeto__<br>
`gradle build`
__Obs__: caso queira configura, usando a versão do gradle do desenvolvedor, utilize o comando:
`gradlew.bat build`  - usado no Windows.
ou
`gradlew build` - usado no Linux.


2. __Executa o projeto__<br>
`gradle apprun`

__Obs__: caso queira executar a versão do gradle do desenvolvedor, utilize o comando:
`gradlew.bat apprun`  - usado no Windows.
ou
`gradlew apprun` - usado no Linux.

Apos executar o projeto, aparecera um link com a seguinte descrição:
`http://localhost:8080/CalcWEB`

<img src="/imagens/tela.png" height="240" width="426">
### Fases do projeto
No projeto foi desenvolvido em fases, que cada fase implementa um função, uma tecnologia e uma maneira de desenvolvimento. O projeto constitui-se 4 fases que são:

#### Fase 1 - criação da funções da calculadora
- [x] Adição
- [x] Subtração
- [x] Multiplicação
- [x] Divisão

#### Fase 2 - Mapiamento das paginas
- [x] Criação do formulario index
- [x] Criação do formulario login
- [x] Criação do formulario calculadora
- [x] Criação do formulario historico
- [x] Criação do formulario cadastro
- [x] Criação do mapiamento com servlet
- [x] CSS basico
- [x] Implentação de funçoes basicas da calculadora a pagina jsp
- [x] Implentação de funçoes basicas da login a pagina jsp
- [x] Implentação de funçoes basicas da cadastrar sem persistencia a pagina jsp

#### Fase 3 - Estilização das paginas
- [x] Implementação do CSS3
- [x] Implentação do Bootstrap 4.5
- [x] Implementação da pagina recursiva
- [x] utilização de font externa(arquivo)
- [x] Implementação de uma pagina recursiva com o CSS criado pelo desenvolverdor
- [x] Criado um novo mapiamento das paginas e funções esta no arquivo web.xml
- [x] Criação base das classes do pacote model

#### Fase 4 - Implentação da persistencia
- [x] Alteração da persistencia das classes Usuario e Historico
- [x] Alteração do arquivo persistence.xml
- [x] Criação das classes dao sendo UsuarioCrud e HistoricoCrud
- [x] Implementação das funções do dao ao controller
- [x] Controller de sessão 

#### Fase 5 - Inserindo Javascript
- [x] Implementado javascript
- [x] Usado Jquery no login
- [x] Usado Jquery na calculadora

## Funções concluidas do Projeto
- [x] Navegação da paginas do site
- [x] Login de usuario
- [x] Criar conta
- [x] Calculadora
- [x] Editar dados do usuario
- [x] Historico de atividade sobre o uso da calculadora


