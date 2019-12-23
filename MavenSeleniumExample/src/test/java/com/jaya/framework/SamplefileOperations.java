package com.jaya.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class SamplefileOperations {

	FileInputStream fis = null;
	FileOutputStream fos = null;

	public static void main(String[] args) {

		SamplefileOperations obj = new SamplefileOperations();
//		obj.fileReadAndWrite("./res/Abc.txt", "./res/Output.txt");
		obj.readFileContent("./res/Abc.txt");
	}

	public void fileReadAndWrite(String inputFilepath, String outputFilepath) {
		try {
			fis = new FileInputStream(inputFilepath);
			fos = new FileOutputStream(outputFilepath);

			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void readFileContent(String filePath) {

		try {
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));

			String value;

			while ((value = br.readLine()) != null) {
				System.out.println(value);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
