package com.lakshya.qa.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lakshya.qa.base.TestBase;
import com.lakshya.qa.testdata.TestData;

public class HelloTest extends TestBase{
	HelloTest hellotest;
	Screenshot screenshot;
	TestData testdata;
	
	
	public HelloTest(){
		super();
	}
		@BeforeMethod
		public void setup(){
			initialization();
		System.out.println("Have a Nice Day");
			
		}	
		@Test
		public void Startup() throws Exception{
		
		hellotest.testdata.ReadExcel();	
		hellotest.screenshot.takescreenshot();
		
		System.out.println("PAGE OPENED SUCCESFULLY");
		}
	
		
		@AfterMethod
		public void Tear(){
				driver.quit();
	}
	}


