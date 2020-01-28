package org.mp.planselection.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalSettings {
	
	private FileInputStream stream;
	public Properties properties;
	
	public String readGlobalSetting(String configFilePath) {
		try {
			stream = new FileInputStream(configFilePath);
			properties.load(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		
		return configFilePath;
	}

}
