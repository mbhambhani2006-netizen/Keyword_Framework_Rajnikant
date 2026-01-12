package com.testingclass;

public class InvalidBrowserName extends Error {
	
	String browserName;
	
	public InvalidBrowserName(String browserName) {
		this.browserName=browserName;
	}
	
	@Override
	public String getMessage() {
		return "browser name is invalid "+ this.browserName;
	}

}
