package com.cursoAppium.test;

import org.junit.Assert;
import org.junit.Test;

import com.cursoAppium.core.BaseTest;
import com.cursoAppium.page.AbasPage;
import com.cursoAppium.page.MenuPage;

public class AbasTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();
	
	@Test
	public void deveInteragirComAbas() {
		//acessar menu abas
		menu.acessarAbas();
		
		//verificar que está na aba 1
		Assert.assertEquals("Este é o conteúdo da Aba 1", page.obterConteudoAba("1"));
		
		//acessar aba 2
		page.acessarAba("2");
		
		//verificar que está na aba 2
		Assert.assertEquals("Este é o conteúdo da Aba 2", page.obterConteudoAba("2"));
	}

}
