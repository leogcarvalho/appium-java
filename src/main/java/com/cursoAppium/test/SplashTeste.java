package com.cursoAppium.test;

import org.junit.Assert;
import org.junit.Test;

import com.cursoAppium.core.BaseTest;
import com.cursoAppium.page.MenuPage;
import com.cursoAppium.page.SplashPage;

public class SplashTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		menu.acessarSplash();
		page.isTelaSplashVisivel();
		page.aguardarSplashSumir();
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
		
	}

}
