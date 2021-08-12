package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.PageCheckout;
import pageobjects.PageLogin;

public class StepCheckout {
	
	@Quando("^acionar o botao do carrinho$")
	public void acionar_o_botao_do_carrinho() throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.clicarCarrinho();
	}

	@Quando("^clicar no botao Checkout$")
	public void clicar_no_botao_Checkout() throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.clicarCheckout();
	}

	@Quando("^informar o campo Fist Name como \"([^\"]*)\"$")
	public void informar_o_campo_Fist_Name_como(String arg1) throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.preencherFirstName(arg1);
	}

	@Quando("^informar o campo Last Name como \"([^\"]*)\"$")
	public void informar_o_campo_Last_Name_como(String arg1) throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.preencherLastName(arg1);
	}

	@Quando("^informar o campo Postal Code como \"([^\"]*)\"$")
	public void informar_o_campo_Postal_Code_como(String arg1) throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.preencherPostalCode(arg1);
	}

	@Quando("^clicar no botao Continue$")
	public void clicar_no_botao_Continue() throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.clicarContinue();
	}

	@Quando("^clicar no botao Finish$")
	public void clicar_no_botao_Finish() throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.clicarFinish();
	}

	@Entao("^o sistema ira validar o checkout sem nenhum item, exibindo a pagina de agradecimento\\.$")
	public void o_sistema_ira_validar_o_checkout_sem_nenhum_item_exibindo_a_pagina_de_agradecimento() throws Throwable {
		PageCheckout pc = new PageCheckout(Hooks.getDriver());
		pc.validarCheckout();
	}
}
