package com.jaya.bdd.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalSettings {
	private FileInputStream stream;
	public Properties properties = new Properties();

	public void readGlobalSettings(String configFilePath) {
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
