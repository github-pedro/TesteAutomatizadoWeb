#language: pt
#enconding: UTF-8
@Gestao
Funcionalidade: Gestor de Orcamento - Despesas
  
  Eu enquanto usario necessito organizar minhas financas para cortar gastos desnecessarios e poupar dinheiro
	
	@CriarTransacao
  Cenario: Nova transacao
    Dado que o usuario acione o botao Adicionar Transacao
    E acionar a calculadora
    E acionar o numero nove
    E acionar o numero zero
    E acionar o simbolo =
    E confirmar valor
    E acionar a categoria Transporte
    E acionar o botao Adicionar
    Entao o app adiciona uma nova transacao
    
  @AlterarTransacao
  Cenario: Alterar transacao
    Dado que o usuario acione a Primeira Transacao
    E acionar a primeira transacao da categoria
    E acionar o botao Lapis
    E acionar a categoria Familia
    E acionar o botao Salvar
    Entao o app ira alterar a transacao escolhida
    
   @ExcluirTransacao
  Cenario: Remover transacao
    Dado que o usuario acione a Primeira Transacao
    E acionar a primeira transacao da categoria
    E acionar o botao Excluir
    E confirmar a exclusao
    Entao o app removera a transacao escolhida
    

