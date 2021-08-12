package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExcluirTransacaoPage {
	
	public ExcluirTransacaoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[42,1267][1038,1435]']")
	private MobileElement transacao;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[42,456][1038,611]']")
	private MobileElement selecionarTransacao;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='EXCLUIR']")
	private MobileElement excluirTransacao;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SIM']")
	private MobileElement confirmarExclusao;
	
	public void primeiraTransacao() throws Exception {
		transacao.click();
	}

	public void selecionarTransacao() throws Exception {
		selecionarTransacao.click();
	}

	public void excluirTransacao() throws Exception {
		excluirTransacao.click();
	}
	public void confirmarExclusao() throws Exception {
		confirmarExclusao.click();
	}
}
