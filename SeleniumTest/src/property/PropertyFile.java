package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.SeleniumTest;

public class PropertyFile {
	static Properties prop = new Properties();
	static String directory = System.getProperty("user.dir");
	public static void main(String[] args) {
		readPropertyFile();
		setPropertyFile();
		readPropertyFile();
		
	}
	
	public static void readPropertyFile(){
		
		
		
		try {
			
			InputStream input = new FileInputStream(directory+"/src/property/keynote.properties");
			prop.load(input);
			SeleniumTest.Browser = prop.getProperty("browser");
			System.out.println(SeleniumTest.Browser);
			
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void setPropertyFile(){
		OutputStream output;
		try {
			output = new FileOutputStream(directory+"/src/property/keynote.properties");
			prop.setProperty("test", "pass");
			prop.setProperty("browser", "Chrome");
			prop.store(output,"done");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
