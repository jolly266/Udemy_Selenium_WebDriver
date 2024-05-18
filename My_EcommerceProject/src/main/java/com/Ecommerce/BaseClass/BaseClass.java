package com.Ecommerce.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Ecommerce.actionDriver.ActionClass;

public class BaseClass {

	public static Properties conpro;
	public static WebDriver driver;
	

	@BeforeTest
	public void loadconfig() throws IOException {

		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\Confing.properties");
		conpro = new Properties();
		conpro.load(ip);
	}
	
	@Test
	public static void launchapp() throws IOException {

		String browsername = conpro.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (browsername.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(conpro.getProperty("url"));
		
		ActionClass.takescreenshot();
	}
}


