package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import property.PropertyFile;

public class SeleniumTest {
	
	static WebDriver driver;
	public static String Browser;
	static String projectDirectory = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		PropertyFile.readPropertyFile();
		setDriverProperty();
		runTest();
		
	}
	
	
	public static void setDriverProperty(){
		
		if(Browser.equals("Chrome")){
			
		System.setProperty("webdriver.chrome.driver",projectDirectory+"/lib/driver/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else{
			System.out.println("No browser selected");
		}

}
	public static void runTest(){
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.quit();
	}
}