package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMetodos;

public class PageLogin extends UtilsMetodos{
	
	protected WebDriver driver;
	
	public PageLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID , using = "user-name")
	private WebElement usuario;
	
	@FindBy (how = How.ID , using = "password")
	private WebElement senha;
	
	@FindBy (how = How.ID , using = "login-button")
	private WebElement botaologin;
	
	@FindBy (how = How.CLASS_NAME, using = "title")
	private WebElement produtos;
	
	public void preencherUsuario(String nomeUsuario) {
		aguardarElemento(usuario);
		usuario.sendKeys(nomeUsuario);
	}
	
	public void preencherSenha(String senhaUsuario) {
		aguardarElemento(senha);
		senha.sendKeys(senhaUsuario);
	}
	public void clicarBotaoLogin() {
		aguardarElemento(botaologin);
		botaologin.click();
	}
	public void validarProdutos(){
		aguardarElemento(produtos);
		assertTrue(produtos.isEnabled());
	}
	
}
