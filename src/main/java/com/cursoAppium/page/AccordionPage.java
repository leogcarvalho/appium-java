package com.cursoAppium.page;

import org.openqa.selenium.By;

import com.cursoAppium.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void clicarOpcao(String numeroOpcao) {
		clicarPorTexto("Opção " + numeroOpcao);
	}
	
	public String obterTextoOpcao(String numeroOpcao) {
		return obterTexto(By.xpath("//*[@text='Esta é a descrição da opção "+numeroOpcao+"']"));
	}

}
