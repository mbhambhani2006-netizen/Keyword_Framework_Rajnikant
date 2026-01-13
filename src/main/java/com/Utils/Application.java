package com.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application {
	
	public static String getAppUrl(String Key) throws IOException  {
		String path=System.getProperty("user.dir")+"\\src\\main\\resources\\PropertiesFiles\\app.properties";
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		return prop.getProperty(Key);
		
		
	}

}
