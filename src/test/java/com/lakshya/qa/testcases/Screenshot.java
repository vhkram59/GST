package com.lakshya.qa.testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.lakshya.qa.base.TestBase;

public class Screenshot extends TestBase {

	public void takescreenshot(){
			
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:\\PROJECT\\REPOSITORY\\Screenshot");
		
		try{
		FileUtils.copyFile(scrfile, destfile);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			
		}
		}		
	
}


//File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);