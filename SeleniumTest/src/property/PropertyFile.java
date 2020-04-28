package property;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import test.SeleniumTest;

public class PropertyFile {
	
	static String directory = System.getProperty("user.dir");
	public static void main(String[] args) {
		readPropertyFile();
	}
	
	public static void readPropertyFile(){
		
		Properties prop = new Properties();
		
		try {
			
			InputStream input = new FileInputStream(directory+"/src/property/keynote.properties");
			prop.load(input);
			SeleniumTest.Browser = prop.getProperty("browser");
			System.out.println(SeleniumTest.Browser);
			
		} 
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
