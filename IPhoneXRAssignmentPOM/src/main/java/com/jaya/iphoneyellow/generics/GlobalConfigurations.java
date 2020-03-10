package com.jaya.iphoneyellow.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

public class GlobalConfigurations {

//	private FileInputStream stream;
	FileInputStream stream;
	public Properties properties = new Properties();

	@BeforeSuite
	public void readPropertiesFile(String configFilePath) {

		try {
			properties = new Properties();
			stream = new FileInputStream(configFilePath);
			properties.load(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
