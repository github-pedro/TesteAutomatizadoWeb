package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMetodos;

public class PageCheckout extends UtilsMetodos {

	protected WebDriver driver;

	public PageCheckout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
	private WebElement botaoCarrinho;
	
	@FindBy(how = How.ID, using = "checkout")
	private WebElement botaoCheckout;
	
	@FindBy (how = How.ID , using = "first-name")
	private WebElement firstName;
	
	@FindBy (how = How.ID , using = "last-name")
	private WebElement lastName;
	
	@FindBy (how = How.ID , using = "postal-code")
	private WebElement postalCode;
	
	@FindBy(how = How.ID, using = "continue")
	private WebElement botaoContinue;
	
	@FindBy(how = How.ID, using = "finish")
	private WebElement botaoFinish;
	
	@FindBy(how = How.ID, using = "back-to-products")
	private WebElement validarCheckout;
	
	
	public void clicarCarrinho() {
		aguardarElemento(botaoCarrinho);
		botaoCarrinho.click();
	}
	public void clicarCheckout() {
		aguardarElemento(botaoCheckout);
		botaoCheckout.click();
	}
	
	public void preencherFirstName(String nome) {
		aguardarElemento(firstName);
		firstName.sendKeys(nome);
	}
	public void preencherLastName(String sobrenome) {
		aguardarElemento(lastName);
		lastName.sendKeys(sobrenome);
	}
	public void preencherPostalCode(String code) {
		aguardarElemento(postalCode);
		postalCode.sendKeys(code);
	}
	public void clicarContinue() {
		aguardarElemento(botaoContinue);
		botaoContinue.click();
	}
	public void clicarFinish() {
		aguardarElemento(botaoFinish);
		botaoFinish.click();
	}
	public void validarCheckout() {
		aguardarElemento(validarCheckout);
		assertTrue(validarCheckout.isEnabled());
	}

	
	

}
