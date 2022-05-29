package com.cursoAppium.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.cursoAppium.core.BaseTest;
import com.cursoAppium.page.FormularioPage;
import com.cursoAppium.page.MenuPage;

public class FormularioTeste extends BaseTest {
	
	//private AndroidDriver<MobileElement> driver;
	
	//private DSL dsl = new DSL();
	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
	    
	    // Selecionar Formulario
		menu.acessarFormulario();
		//dsl.clicarPorTexto("Formulário");
	    //MobileElement btnFormulario = driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']"));
	    //btnFormulario.click();
	}
	
	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
   
	    // Escrever Nome
		formulario.escreverNome("Leonardo");
		//dsl.escrever(MobileBy.AccessibilityId("nome"), "Leonardo");
	    
	    // Checar nome Escrito
	    assertEquals("Leonardo", formulario.obterNome());
	}
	
	@Test
	public void deveInteragirCombo() throws MalformedURLException {

	    // clicar no comboBox
		formulario.selecionarCombo("PS4");
		//dsl.selecionarCombo(MobileBy.AccessibilityId("console"), "PS4");
	    
	    // verificar opção selecionada
	    //String resAtualCombo = dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	    Assert.assertEquals("PS4", formulario.obterValorCombo());
	}
	
	@Test
	public void deveInteragirCheckbox() throws MalformedURLException {
	    
	    // clicar no checkbox
	    //MobileElement chkbox = driver.findElement(MobileBy.AccessibilityId("check"));
	    
	    
	    // verifica se o elemento não está checkado
		Assert.assertFalse(formulario.isCheckMarcado());
		Assert.assertTrue(formulario.isSwitchMarcado());
	    //Assert.assertFalse(dsl.isCheckMarcado(MobileBy.AccessibilityId("check")));
	    	    
	    // clicar no checkbox
	    formulario.clicarCheckbox();
	    formulario.clicarSwitch();
	    //dsl.clicar(MobileBy.AccessibilityId("check"));

	       
	    // verificar opção selecionada
	    Assert.assertTrue(formulario.isCheckMarcado());
	    Assert.assertFalse(formulario.isSwitchMarcado());
	    //Assert.assertTrue(dsl.isCheckMarcado(MobileBy.AccessibilityId("check")));
	}
	
	@Test
	public void deveRealizarCadastro() throws MalformedURLException {
	        
	    //preencher nome
		formulario.escreverNome("Leonardo");
		//dsl.escrever(MobileBy.AccessibilityId("nome"), "Leonardo");
	    
	    //selecionar PS4
		formulario.selecionarCombo("PS4");
		//dsl.selecionarCombo(MobileBy.AccessibilityId("console"), "PS4");
	    
	    //marcar checkbox
		Assert.assertFalse(formulario.isCheckMarcado());
		formulario.clicarCheckbox();
	    //MobileElement chkboxMarcado = driver.findElement(MobileBy.AccessibilityId("check"));
	    //Assert.assertTrue(chkboxMarcado.getAttribute("checked").equals("false"));
	    //chkboxMarcado.click();
	    
	    //desmarcar switch
		Assert.assertTrue(formulario.isSwitchMarcado());
		formulario.clicarSwitch();
	    //MobileElement swtch= driver.findElement(MobileBy.AccessibilityId("switch"));
	    //Assert.assertTrue(swtch.getAttribute("checked").equals("true"));
	    //swtch.click();
	    
	    //clica em salvar
		formulario.salvar();
		//dsl.clicarPorTexto("SALVAR");
	    //driver.findElement(By.xpath("//android.widget.TextView[@text='SALVAR']")).click();
	    
	    //pegando o resultado atual apos salvar
		String nome = formulario.obterNomeCadastrado();
	    //MobileElement nome = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	    //Assert.assertEquals("Leonardo", nome.getText());
	    Assert.assertTrue(nome.endsWith("Leonardo"));
	    
	    String combo = formulario.obterComboCadastrado();
	    //MobileElement combo = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	    //Assert.assertEquals("PS4", combo.getText());
	    Assert.assertTrue(combo.endsWith("ps4"));
	    
	    String swit = formulario.obterSwitchMarcado();
	    //MobileElement swit = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	    Assert.assertTrue(swit.endsWith("Off"));
	    
	    String chkbox = formulario.obterCheckMarcado();
	    //MobileElement chkbox = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	    Assert.assertTrue(chkbox.endsWith("Marcado"));
	    
	}
	
	@Test
	public void deveAlterarData() {
		formulario.clicarPorTexto("01/01/2000");
		formulario.clicarPorTexto("13");
		formulario.clicarPorTexto("OK");
		Assert.assertTrue(formulario.existeElementoPorTexto("13/2/2000"));
	}
	
}
