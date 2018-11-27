package com.lakshya.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lakshya.qa.utility.TestUtil;


public class TestBase {
		public static WebDriver driver;
		public static Properties prop;
		
		public TestBase(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("D:\\PROJECT\\WORKSPACE\\LAKSHYA\\src\\main\\java\\com\\lakshya\\qa\\configuration\\Configuration.Properties");
				prop.load(ip);
		
				}catch (FileNotFoundException e) {
						e.printStackTrace();
				}catch (IOException e) {
						e.printStackTrace();
				}
	}
		public void initialization(){
			String browserName = prop.getProperty("browser");
			if(browserName.equals("FF")) {
				System.setProperty("webdriver.chrome.driver","D:\\PROJECT\\LIB\\chromedriver.exe");
				driver = new ChromeDriver();
				}
				else if(browserName.equals("chrome")) {
					System.setProperty("webdriver.gecko.driver","D:\\PROJECT\\LIB\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
//					System.out.println(driver.manage().window().getSize());
//			        //Create object of Dimensions class
//			        Dimension d = new Dimension(480,620);
//			        //Resize the current window to the given dimension
//			        driver.manage().window().setSize(d);
//			        System.out.println(driver.manage().window().getSize());
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
					driver.get(prop.getProperty("url"));
					
		}
		
	}
}

			
