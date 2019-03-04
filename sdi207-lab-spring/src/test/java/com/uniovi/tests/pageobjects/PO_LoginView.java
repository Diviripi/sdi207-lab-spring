package com.uniovi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_LoginView  extends PO_NavView{

	public static void fillForm(WebDriver driver, String username, String password) {
		WebElement dni = driver.findElement(By.name("username"));
		dni.click();
		dni.clear();
		dni.sendKeys(username);

		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.click();
		passwordElement.clear();
		passwordElement.sendKeys(password);
	
		//Pulsar el boton de Alta.
		By boton = By.className("btn");
		driver.findElement(boton).click();
	}

}
