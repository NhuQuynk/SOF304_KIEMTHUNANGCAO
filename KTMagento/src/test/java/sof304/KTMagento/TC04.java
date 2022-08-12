package sof304.KTMagento;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
public class TC04 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String email, String pass,String emails) {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	  driver.findElement(By.xpath("//button[@id='send2']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
	  driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
	  driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys(emails);
	  driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
	  String message = driver.findElement(By.xpath("//span[contains(text(),'Your Wishlist has been shared.')]")).getText();
	  assertEquals(message,"Your Wishlist has been shared." );
  }

  @DataProvider(name = "dp")
  public Object[][] dp() { 
    	return new Object[][] {
    	     { "Huongg@gmail.com", "123456","Huongdx@gmail.com" }
    	    };
    
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://live.techpanda.org");
	  driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
