package com.cursoAppium.page;

import org.openqa.selenium.By;

import com.cursoAppium.core.BasePage;

public class AbasPage extends BasePage {
	
	public void acessarAba(String num) {
		clicarPorTexto("ABA " + num);
	}
	
	public String obterConteudoAba(String numAba) {
		return obterTexto(By.xpath("//*[@text='Este � o conte�do da Aba "+numAba+"']"));
	}

}
