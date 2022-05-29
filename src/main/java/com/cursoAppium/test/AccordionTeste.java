package com.cursoAppium.test;

import org.junit.Assert;
import org.junit.Test;

import com.cursoAppium.core.BaseTest;
import com.cursoAppium.page.AccordionPage;
import com.cursoAppium.page.MenuPage;

public class AccordionTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		//acessar menu accordion
		menu.acessarAccordion();
		
		//clicar na Opção 1
		page.clicarOpcao("1");
		
		//verificar a descrição da opção 1
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterTextoOpcao("1"));
	}

}
