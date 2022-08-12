package sof304.KTMagento;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TC03 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void TaoTK(String name, String middleName, String LastName, String Email, String Pass, String Confirm) {
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(name);
	  driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys(middleName);
	  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
	  driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(Email);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pass);
	  driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys(Confirm);
	  driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	  String mes = driver.findElement(By.xpath("//span[contains(text(),'Thank you for registering with Main Website Store.')]")).getText();
	  assertEquals(mes, "Thank you for registering with Main Website Store.");
  }

  @DataProvider(name= "dp")
  public Object[][] dp() {
    return new Object[][] {
    	{"Huong","Huongg","Huonggg","Huongg@gmail.com","123456","123456" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://live.techpanda.org");
	  driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]")).click();
	  driver.findElement(By.xpath("//header/div[1]/div[5]/div[1]/ul[1]/li[1]/a[1]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
