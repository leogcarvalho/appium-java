package com.cursoAppium.page;

import org.openqa.selenium.By;

import com.cursoAppium.core.BasePage;

import io.appium.java_client.MobileBy;

public class FormularioPage extends BasePage {
	
	//private DSL dsl = new DSL();
	
	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String texto) {
		selecionarCombo(MobileBy.AccessibilityId("console"), texto);
	}
	
	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clicarCheckbox() {
		clicar(MobileBy.AccessibilityId("check"));
	}
	
	public Boolean isCheckMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("check"));
	}
	
	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isSwitchMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void salvar() {
		clicarPorTexto("SALVAR");
	}
	
	public String obterNomeCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String obterComboCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String obterSwitchMarcado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}
	
	public String obterCheckMarcado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	}

}
