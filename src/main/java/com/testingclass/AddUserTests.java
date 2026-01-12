package com.testingclass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.testingclass.locator.Locator;
import com.testingclass.locator.Locators;

public class AddUserTests extends TestBase {
	
	@Test
	
	public void varifyIfNamesOfAlreadyCreatedUserPopulatesInList() {
		keyword.waitForElementToVisible(By.xpath("//input[@name='username']"));
		keyword.enterText(Locators.username, "Admin");
		keyword.enterText(Locators.password, "admin123");
		keyword.clickable(Locators.login);
		keyword.waitForElementToVisible(By.xpath("//span[text()='PIM']"));
		keyword.clickable(Locators.login_PIM);
		keyword.waitForElementToVisible(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		keyword.clickable(Locators.add_btn);
		keyword.waitForElementToVisible(By.xpath("//input[@name='firstName']"));
		keyword.enterText(Locators.first_name, "Shrikant");
		keyword.enterText(Locators.middle_name, "panda");
		keyword.enterText(Locators.last_name, "jee");
		keyword.clickable(Locators.save_btn);
	}
		
		
		
	

}
