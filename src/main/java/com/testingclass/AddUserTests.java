package com.testingclass;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.Utils.PropertiesUtil;
import com.testingclass.locator.Locator;
import com.testingclass.locator.Locators;

public class AddUserTests extends TestBase {
	
	@Test
	
	public void varifyIfNamesOfAlreadyCreatedUserPopulatesInList() throws FileNotFoundException {
		keyword.waitForElementToVisible(By.xpath(Locators.username));
		keyword.enterText(Locators.username, "Admin");
		keyword.enterText(Locators.password, "admin123");
		keyword.clickable(Locators.login);
		keyword.waitForElementToVisible(By.xpath(Locators.login_PIM));
		keyword.clickable(Locators.login_PIM);
		keyword.waitForElementToVisible(By.xpath(Locators.add_btn));
		keyword.clickable(Locators.add_btn);
		keyword.waitForElementToVisible(By.xpath(Locators.first_name));
		keyword.enterText(PropertiesUtil.getLocator("first_name"), "Shrikant");
		keyword.enterText(Locators.middle_name, "panda");
		keyword.enterText(Locators.last_name, "jee");
		keyword.waitForElementToVisible(By.xpath(Locators.save_btn));
		keyword.clickable(Locators.save_btn);
	}
		
		
		
	

}
