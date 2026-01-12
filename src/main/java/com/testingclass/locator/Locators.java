package com.testingclass.locator;

public interface Locators {
	//variables in Interface are static,Final,public
	String username="//input[@name='username']";
	String password="//input[@name='password']";
    String login="//button[text()=' Login ']" ;
    String login_PIM="//span[text()='PIM']";    
    String add_btn="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
    String first_name="//input[@name='firstName']";
    String middle_name="//input[@name='middleName']";
    String last_name="//input[@name='lastName']";
    String save_btn="//button[text()=' Save ']";
  
}
