package com.cursoAppium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {

	@Test
	public void somaDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "52007dc003fd35df");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	    desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	     
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl,desiredCapabilities);
	    
	    MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"2\"]/android.widget.ImageView");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Mais\"]/android.widget.ImageView");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"2\"]/android.widget.ImageView");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("4 Visualizar resultado");
	    
	    String resultadoAtual = el4.getText();
	    System.out.println(resultadoAtual);
	    org.junit.Assert.assertEquals("4", resultadoAtual);
	    
	    driver.quit();
	}

}
