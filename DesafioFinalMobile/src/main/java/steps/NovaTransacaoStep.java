package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.NovaTransacaoPage;

public class NovaTransacaoStep {
	
	NovaTransacaoPage gp = new NovaTransacaoPage(driver);
	
	@Dado("que o usuario acione o botao Adicionar Transacao")
	public void queOUsuarioAcioneOBotaoAdicionarTransacao() throws Exception {
	    gp.novaTransacao();
	}

	@Dado("acionar a calculadora")
	public void acionarACalculadora() throws Exception {
	   gp.calculadora();
	}

	@Dado("acionar o numero nove")
	public void acionarONumeroNove() throws Exception {
	   gp.primeiroNumero();
	}

	@Dado("acionar o numero zero")
	public void acionarONumeroZero() throws Exception {
	   gp.segundoNumero();
	}

	@Dado("acionar o simbolo =")
	public void acionarOSimbolo() throws Exception {
	    gp.acionarIgual();
	}
	
	@Dado("confirmar valor")
	public void confirmarValor() throws Exception {
	    gp.confirmarValor();
	}

	@Dado("acionar a categoria Transporte")
	public void acionarACategoriaTransporte() throws Exception {
	    gp.adicionarCategoria();
	}

	@Dado("acionar o botao Adicionar")
	public void acionarOBotaoAdicionar() throws Exception {
	    gp.adicionarTransacao();
	}

	@Entao("o app adiciona uma nova transacao")
	public void oAppAdicionaUmaNovaTransacao() {
	    
	}
}
