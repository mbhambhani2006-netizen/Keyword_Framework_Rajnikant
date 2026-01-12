package com.testingclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	protected Keyword keyword;
	@BeforeMethod

	public void setUp() {
		keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	//@AfterMethod

	public void tearDown() {
		Keyword.driver.close();
	}

}
