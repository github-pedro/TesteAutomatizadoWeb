package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlterarTransacaoPage {
	
	public AlterarTransacaoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Família']")
	private MobileElement opcaoCategoria;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	private MobileElement botaoEditar;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Salvar']")
	private MobileElement botaoSalvar;
	
	public void acionarBotaoEditar() throws Exception {
		botaoEditar.click();
	}

	public void alterarCategoria() throws Exception {
		opcaoCategoria.click();
	}

	public void salvarAlteracao() throws Exception {
		botaoSalvar.click();
	}
	
}
