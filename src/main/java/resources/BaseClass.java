package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	
	public void initbrowser() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\testngmaven\\src\\main\\java\\resources\\data.properties");
		
		
		Properties prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			WebDriver driver= new ChromeDriver();
			 
		}else if(browsername.equalsIgnoreCase("firefox")) {
			
			WebDriver driver=new FirefoxDriver();
			
			
		}
		else
		{
			System.out.println(enter browser name);
		}
	}

}
