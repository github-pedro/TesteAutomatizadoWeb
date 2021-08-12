#language: pt
#enconding: UTF-8
@AddToCart @End2End
Funcionalidade: AddToCart

  Contexto: 
    Dado que o usuario esteja na pagina principal do sistema
    E que o usuario esteja logado

  @AdicionarProduto
  Esquema do Cenario: Adicionar produto ao carrinho
    Quando acionar o produto Sauce Labs Backpack
    E clicar no botao Add To Cart
    Entao o sistema deve adicionar o produto ao carrinho, exibindo o botao REMOVE.

    Exemplos: 
      | user          | password     |
      | standard_user | secret_sauce |
