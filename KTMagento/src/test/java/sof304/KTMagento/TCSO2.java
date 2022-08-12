package sof304.KTMagento;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TCSO2 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String email) {
	  driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys(email);
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
  }

  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      {"huyas1@gmail.com"},{"huyas2@gmail.com"},{"huyas3@gmail.com"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://live.techpanda.org");
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[5]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("AMMMM");
		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("ASDFGH");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Huyeefn");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("hanah2@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("adbajsfs12A");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("adbajsfs12A");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'TV')]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
		
			
		
  }

  @AfterTest
  public void afterTest() {
		//driver.close();
  }

}
