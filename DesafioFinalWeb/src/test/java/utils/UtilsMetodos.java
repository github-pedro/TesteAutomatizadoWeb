package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;

public class UtilsMetodos {
	
	public void aguardarElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
}
