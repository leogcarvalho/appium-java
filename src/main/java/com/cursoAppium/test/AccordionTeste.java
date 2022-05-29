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
		
		//clicar na Op��o 1
		page.clicarOpcao("1");
		
		//verificar a descri��o da op��o 1
		Assert.assertEquals("Esta � a descri��o da op��o 1", page.obterTextoOpcao("1"));
	}

}
