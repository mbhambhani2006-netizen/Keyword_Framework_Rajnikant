package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static String getLocator(String key) throws FileNotFoundException {

		String filePath = System.getProperty("user.dir")
				+ "\\src\\\\main\\resources\\PropertiesFiles\\locators.properties";

		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);

	}
}
