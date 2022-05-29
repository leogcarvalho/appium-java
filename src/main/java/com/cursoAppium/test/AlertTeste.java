package com.cursoAppium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cursoAppium.core.BaseTest;
import com.cursoAppium.page.AlertaPage;
import com.cursoAppium.page.MenuPage;

public class AlertTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();
	
	@Before
	public void setup() {
		// acessar menu alerta
		menu.acessarAlertas();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		
		//clicar em alerta confirm
		page.clicarAlertaConfirm();
		
		//verificar os textos
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.obterMensagemAlerta());
		
		//confirmar alerta
		page.confirmarAlerta();
		
		//verificar nova mensagem
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirmado", page.obterMensagemAlerta());
		
		//sair
		page.sair();
		
	}
	
	@Test
	public void deveClicarForaAlerta() {
		
		//clicar alerta simples
		page.clicarAlertaSimples();
		
		//clicar fora da caixa
		esperar(1000);
		page.clicarForaCaixa();
		
		//verificar que a msg do alerta não existe mais
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
