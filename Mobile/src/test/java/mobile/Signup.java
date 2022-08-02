package mobile;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signup {
	@Test
	public void Demo()
	{
       System.out.println("hello");
    }
	@Test
	public void beforemethod()
	{
       System.out.println("i will execute before every case test method");
    }
	@Test                       //we can write single class in multiple testcases
	public void SecondTest()
	{
      System.out.println("bye");
      
}
	@AfterMethod
	public void afterMethod()
	{
       System.out.println("i will execute after every case test method");
    }
	@AfterTest
	public void lastexecution()
	{
       System.out.println("I will execute last");
    }
}
