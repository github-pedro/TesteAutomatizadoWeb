package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.ExcluirTransacaoPage;

public class ExcluirTransacaoStep {
	
	ExcluirTransacaoPage ep = new ExcluirTransacaoPage(driver);
	
	@Dado("que o usuario acione a Primeira Transacao")
	public void queOUsuarioAcioneAPrimeiraTransacao() throws Exception {
	    ep.primeiraTransacao();
	}

	@Dado("acionar a primeira transacao da categoria")
	public void acionarAPrimeiraTransacaoDaCategoria() throws Exception {
	    ep.selecionarTransacao();
	}

	@Dado("acionar o botao Excluir")
	public void acionarOBotaoExcluir() throws Exception {
	    ep.excluirTransacao();
	}
	
	@Dado("confirmar a exclusao")
	public void confirmarAExclusao() throws Exception {
	    ep.confirmarExclusao();
	}

	@Entao("o app removera a transacao escolhida")
	public void oAppRemoveraATransacaoEscolhida() {
	    
	}
}
