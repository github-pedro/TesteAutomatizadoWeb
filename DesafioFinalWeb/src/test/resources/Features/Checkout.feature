#language: pt
#enconding: UTF-8
@Checkout @End2End
Funcionalidade: Checkout

  Contexto: 
    Dado que o usuario esteja na pagina principal do sistema
    E que o usuario esteja logado

  @CheckoutVazio
  Esquema do Cenario: Fazer checkout do carrinho vazio
    Quando acionar o botao do carrinho
    E clicar no botao Checkout
    E informar o campo Fist Name como "<firstName>"
    E informar o campo Last Name como "<lastName>"
    E informar o campo Postal Code como "<postalCode>"
    E clicar no botao Continue
    E clicar no botao Finish
    Entao o sistema ira validar o checkout sem nenhum item, exibindo a pagina de agradecimento.

    Exemplos: 
      | firstName | lastName | postalCode |
      | Pedro     | Paulo    |     123456 |
