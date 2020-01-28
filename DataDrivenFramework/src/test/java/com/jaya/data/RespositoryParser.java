package com.jaya.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class RespositoryParser {

	private static FileInputStream stream;
	private String repositoryFile;
	private static Properties propertyFile = new Properties();

	private static RespositoryParser parserInstance = null;

// because of this below method, file loads for single time while executing for number of times
	public RespositoryParser(String fileName) throws IOException {
		this.repositoryFile = fileName;
		stream = new FileInputStream(repositoryFile);
		propertyFile.load(stream);
	}
	//  it is a singleton pattern which creates an object and uses as a single reference for every execution instead 
	// creating an object for every execution which is for memory saving
	public static RespositoryParser getInstance(String repositoryFile) {
		if (parserInstance == null)
			try {
				parserInstance = new RespositoryParser(repositoryFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return parserInstance;
	}

	public By getbjectLocator(String locatorName) {

		String locatorProperty = propertyFile.getProperty(locatorName);
		System.out.println(locatorProperty.toString());
		String locatorType = locatorProperty.split(":")[0];
		String locatorValue = locatorProperty.split(":")[1];

		By locator = null;
		switch (locatorType) {
		case "Id":
			locator = By.id(locatorValue);
			break;
		case "Name":
			locator = By.name(locatorValue);
			break;
		case "CssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "LinkText":
			locator = By.linkText(locatorValue);
			break;
		case "PartialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TagName":
			locator = By.tagName(locatorValue);
			break;
		case "Xpath":
			locator = By.xpath(locatorValue);
			break;
		}
		return locator;
	}

}
