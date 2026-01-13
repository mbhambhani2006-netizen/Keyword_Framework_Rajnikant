package com.testingclass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utils.Application;

public class TestBase {

	protected Keyword keyword;
	@BeforeMethod

	public void setUp() throws IOException {
		keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchURL(Application.getAppUrl("url"));

	}
	@AfterMethod

	public void tearDown() {
		Keyword.driver.close();
	}

}
