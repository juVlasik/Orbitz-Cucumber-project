package com.orbitz.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;

	static {

		prop = new Properties();

		final String path = "config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			fis.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	public static String getProperty(String key) {
		
		return prop.getProperty(key);
	}
	
	

}
