# Laboratorio-Engenharia-Software---Calculadora---
Neste Diretório sera realizado os trabalhos da disciplina de Laboratório de Engenharia de Software 3.
O projeto deste github tem como objetivo o desenvolvimento o servidor web criado em um ambiente java.
Durante o andamento do projeto, o tema foi modificado, que anteriormante seria construido um site de noticias, mas atualmente sera um site de simples calculadora.

## Tecnologias Utilizadas neste Projeto

__Tecnologias do front-end__
* HMTL5
* CSS3
* Javascript

__Tecnologias do back-end__
* Java 8
* Gradle 5.6
* Servlet & JSP
* MySQL 8
* Hibernate & JPA

## Projeto
Para o desenvolvimentodo projeto, foi utilizado alguns padrãos de projetos como __MVC__ (Model View Controller) que separa a construção do projeto, ___strategy__ que auxilia as funções com comportamento semelhantes, e o __singleton__ que introduz a criação de um objeto.
Cada padão ajudou o desenvolvimento e foi utilizado no projeto na seguinte maneira:
* __MVC__ - Para a construção e divisão do CalcWEB em partes.
* __Strategy__ - Foi utilizado nas funções da calculadora como adição, subtração, divisão e multiplicação.
* __Singleton__ - para criar o objeto de criação e manipulação do banco de dados.


### Fases do projeto
No projeto foi desenvolvido em fases, que cada fase implementa um função, uma tecnologia e uma maneira de desenvolvimento. O projeto constitui-se 5 fases que são:

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
- [x] Criado um novo mapiamento das paginas e funções que esta no arquivo web.xml
- [x] Criação base das classes do pacote model

#### Fase 4 - Implentação da persistencia
- [x] Alteração da persistencia das classes Usuario e Historico
- [x] Alteração do arquivo persistence.xml
- [x] Criação das classes dao sendo UsuarioCrud e HistoricoCrud
- [x] Implementação das funções do dao ao controller
- [x] Controller de sessão 

#### Fase 5 - Adicionamento do Ajax
- [ ] Adicionamento do ajax na função da tabela
- [ ] Adicionamento do ajax na função de atualizar os dados do usuario

## Funções concluidas do projeto Projeto
- [x] Navegação da paginas do site
- [x] Login de usuario
- [x] Criar conta
- [x] Calculadora
- [ ] Editar dados do usuario
- [ ] Historico de atividade sobre o uso da calculadora

