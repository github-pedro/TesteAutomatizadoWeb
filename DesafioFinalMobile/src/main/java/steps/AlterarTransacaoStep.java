package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.AlterarTransacaoPage;

public class AlterarTransacaoStep {
	
	AlterarTransacaoPage ap = new AlterarTransacaoPage(driver);
	
	@Dado("acionar o botao Lapis")
	public void acionarOBotaoLapis() throws Exception {
	    ap.acionarBotaoEditar();
	}

	@Dado("acionar a categoria Familia")
	public void acionarACategoriaFamilia() throws Exception {
	    ap.alterarCategoria();
	}

	@Dado("acionar o botao Salvar")
	public void acionarOBotaoSalvar() throws Exception {
	    ap.salvarAlteracao();
	}

	@Entao("o app ira alterar a transacao escolhida")
	public void oAppIraAlterarATransacaoEscolhida() {
	   
	}

}
