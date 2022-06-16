package testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	public class Annotationstestng {
		  @Test(priority=1,enabled=true)
		  public void a() {
		 
		 System.out.println("Test Case a");
		  }
		  @Test(priority=2,enabled=true)
		  public void b() {
		 
		 System.out.println("Test Case b");
		  }
		  @BeforeMethod
		  public void beforeMethod() {
		 System.out.println("BeforeMethod");
		  }

		  @AfterMethod
		  public void afterMethod() {
		 System.out.println("AfterMethod");
		  }

		  @BeforeClass
		  public void beforeClass() {
		 System.out.println("beforeClass");
		  }

		  @AfterClass
		  public void afterClass() {
		 System.out.println("afterClass");
		  }

		  @BeforeTest
		  public void beforeTest() {
		 System.out.println("beforeTest");
		  }

		  @AfterTest
		  public void afterTest() {
		 System.out.println("afterTest");
		  }

		  @BeforeSuite
		  public void beforeSuite() {
		 System.out.println("BeforeSuite");
		  }

		  @AfterSuite
		  public void afterSuite() {
		 System.out.println("afterSuite");
		  }

		}


