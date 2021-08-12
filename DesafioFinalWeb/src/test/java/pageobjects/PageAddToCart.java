package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMetodos;

public class PageAddToCart extends UtilsMetodos{
	protected WebDriver driver;
	
	public PageAddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (how = How.ID , using = "item_4_title_link")
	private WebElement produto;
	
	@FindBy (how = How.ID , using = "add-to-cart-sauce-labs-backpack")
	private WebElement botaoAddToCart;
	
	@FindBy (how = How.ID , using = "remove-sauce-labs-backpack")
	private WebElement botaoRemove;
	
	public void clicarProduto() {
		aguardarElemento(produto);
		produto.click();
	}
	public void clicarAddToCart() {
		aguardarElemento(botaoAddToCart);
		botaoAddToCart.click();
	}
	public void validarAdd() {
		aguardarElemento(botaoRemove);
		assertTrue(botaoRemove.isDisplayed());
	}
	
}
