package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.PageAddToCart;

public class StepAddToCart {
	
	
	@Quando("^acionar o produto Sauce Labs Backpack$")
	public void acionar_o_produto_Sauce_Labs_Backpack() throws Throwable {
		PageAddToCart login = new PageAddToCart(Hooks.getDriver());
		login.clicarProduto();
		
	}

	@Quando("^clicar no botao Add To Cart$")
	public void clicar_no_botao_Add_To_Cart() throws Throwable {
		PageAddToCart login = new PageAddToCart(Hooks.getDriver());
		login.clicarAddToCart();
		
	}

	@Entao("^o sistema deve adicionar o produto ao carrinho, exibindo o botao REMOVE\\.$")
	public void o_sistema_deve_adicionar_o_produto_ao_carrinho_exibindo_o_botao_REMOVE() throws Throwable {
		PageAddToCart login = new PageAddToCart(Hooks.getDriver());
		login.validarAdd();
	}

}
