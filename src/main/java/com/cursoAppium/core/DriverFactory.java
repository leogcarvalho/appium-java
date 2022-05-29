package com.cursoAppium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver(){
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	private static void createDriver() {
		// Configurações
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "52007dc003fd35df");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\leogc\\eclipse-workspace\\CursoAppium\\src\\main\\resources\\original.apk");
	    
	    // Setando URL
	    URL remoteUrl = null;
		try {
			remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Instanciando driver
	    driver = new AndroidDriver<MobileElement>(remoteUrl,desiredCapabilities);
	    
	    // Setando espera implicita
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
