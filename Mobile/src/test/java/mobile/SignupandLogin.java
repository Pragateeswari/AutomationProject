package mobile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignupandLogin extends Lanuch{
	
		@Test
		(dependsOnMethods= {"Lanching_the_Browser"})
		public void Sign_for_mobiles() throws InterruptedException
		{
			WebElement Signin = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
			Signin.click();
			WebElement Signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
			Signin.click();
			WebElement firstname = driver.findElement(By.xpath("//input[@id='myName']"));
			firstname.sendKeys("Praga");
			WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			Last_name.sendKeys("Soman");
			WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
			Email.sendKeys("pragateeswarisoman98@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
			password.sendKeys("Praga@98");
			WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
			Phone_number.sendKeys("8489958135");
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
			bio_story.sendKeys("Pragateeswari is the employee whose join the qulitest company in the last 2 month back");
			driver.findElement(By.xpath("//input[@type='date']")).click();
			driver.findElement(By.xpath("//button[@type='Submit']")).click();
			Alert A1 = driver.switchTo().alert();A1.accept();
			

			
		}
	}


