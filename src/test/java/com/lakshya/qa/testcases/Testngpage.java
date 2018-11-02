package com.lakshya.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpage {
	
//	BeforeSuite
//	BeforeTest
//	BeforeClass
//	BeforeMethod
//	Test
//	AfterMethod
//	AfterClass
//	AfterTest
//	AfterSuite
					
		 
@BeforeSuite
		  public void beforeSuite() {
		   System.out.println("This is @BeforeSuite Annotion running...");
		  }
@BeforeTest
		  public void beforeTest() {
		   System.out.println("This is @BeforeTest Annotion running...");
		  }
@BeforeClass
		  public void beforeClass() {
		   System.out.println("This is @BeforeClass Annotion running...");
		  }
@BeforeMethod
		  public void beforeMethod() {
		   System.out.println("This is @BeforeMethod Annotion running...");
		  }
 @Test
		  public void test() {
		   System.out.println("This is @Test Annotion running...");
		  }

		  
		  
		  
@BeforeGroups
		  public void beforeGroups() {
		   System.out.println("This is @BeforeGroups Annotion running...");
		  }
		  
@AfterGroups
		  public void afterGroups() {
		   System.out.println("This is @AfterGroups Annotion running...");
		  }
		  
 @AfterClass
		  public void afterClass() {
		   System.out.println("This is @AfterClass Annotion running...");
		  }
@AfterMethod
		  public void afterMethod() {
			   System.out.println("This is @AfterMethod Annotion running...");
			  }
@AfterTest
		  public void afterTest() {
		   System.out.println("This is @AfterTest Annotion running...");
		  }
@AfterSuite
		  public void afterSuite() {
		   System.out.println("This is @AfterSuite Annotion running...");
		  }
		 
		}

