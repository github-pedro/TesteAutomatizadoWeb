package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.PageLogin;

public class StepLogin {
	
	WebDriver driver;
	
	
	@Dado("^que o usuario esteja na pagina principal do sistema$")
	public void que_o_usuario_esteja_na_pagina_principal_do_sistema() throws Throwable {
		Hooks.abrirUrl("https://www.saucedemo.com/");
	    driver = Hooks.getDriver();
	}
	
	@Dado("^que o usuario esteja logado$")
	public void que_o_usuario_esteja_logado() throws Throwable {
		PageLogin login = new PageLogin(driver);
		login.preencherUsuario("standard_user");
		login.preencherSenha("secret_sauce");
		login.clicarBotaoLogin();
	}

	@Quando("^preencher o campo Username como \"([^\"]*)\"$")
	public void preencher_o_campo_Username_como(String arg1) throws Throwable {
		PageLogin login = new PageLogin(driver);
		login.preencherUsuario(arg1);
	}

	@Quando("^preencher o campo Password como \"([^\"]*)\"$")
	public void preencher_o_campo_Password_como(String arg1) throws Throwable {
		PageLogin login = new PageLogin(driver);
		login.preencherSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		PageLogin login = new PageLogin(driver);
		login.clicarBotaoLogin();
	}

	@Entao("^o sistema deve autorizar o login, exibindo a pagina contendo os produtos\\.$")
	public void o_sistema_deve_autorizar_o_login_exibindo_a_pagina_contendo_os_produtos() throws Throwable {
		PageLogin login = new PageLogin(driver);
		login.validarProdutos();
	}
}
