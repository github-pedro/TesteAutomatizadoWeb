#language: pt
#enconding: UTF-8
@Login @End2End
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina principal do sistema

  @RealizarLogin @SmokeTest
  Esquema do Cenario: Realizar Login com sucesso
    Quando preencher o campo Username como "<usuario>"
    E preencher o campo Password como "<senha>"
    E clicar no botao Login
    Entao o sistema deve autorizar o login, exibindo a pagina contendo os produtos.

    Exemplos: 
      | usuario       | senha        |
      | standard_user | secret_sauce |
