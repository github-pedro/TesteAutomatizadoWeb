package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NovaTransacaoPage {
	public NovaTransacaoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
	private MobileElement botaoAddTransacao;
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement campoEditText;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]")
	private MobileElement calculadora;
	@AndroidFindBy(accessibility = "9")
	private MobileElement numero1;
	@AndroidFindBy(accessibility = "0")
	private MobileElement numero2;
	@AndroidFindBy(accessibility = "=")
	private MobileElement acionarIgual;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Transporte']")
	private MobileElement opcaoCategoria;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='22']")
	private MobileElement confirmarValor;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Adicionar']")
	private MobileElement adicionarTransacao;

	public void novaTransacao() throws Exception {
		botaoAddTransacao.click();
	}

	public void calculadora() throws Exception {
		calculadora.click();
	}

	public void primeiroNumero() throws Exception {
		numero1.click();
	}

	public void segundoNumero() throws Exception {
		numero2.click();
	}

	public void acionarIgual() throws Exception {
		acionarIgual.click();
	}

	public void confirmarValor() throws Exception {
		confirmarValor.click();
	}

	public void adicionarCategoria() throws Exception {
		opcaoCategoria.click();
	}

	public void adicionarTransacao() throws Exception {
		adicionarTransacao.click();
	}
}
