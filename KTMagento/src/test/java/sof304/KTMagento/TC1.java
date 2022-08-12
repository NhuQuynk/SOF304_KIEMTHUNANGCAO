package sof304.KTMagento;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TC1 {
	WebDriver driver;

	@Test
	public void TaoMoiTK() {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("AMMMM");
		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("ASDFGH");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Huyeefn");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("H333@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("adbajsfs12A");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("adbajsfs12A");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Thank you for registering with Main Website Store.')]")).getText(), "Thank you for registering with Main Website Store.");
		driver.findElement(By.xpath("//a[contains(text(),'TV')]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'TV')]")).click();

		driver.findElement(By.xpath("//tbody/tr[@id='item_54445']/td[3]/div[1]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[@id='item_54445']/td[3]/div[1]/div[1]/input[1]")).sendKeys("20");
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys("Huyen@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
		assertEquals(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]")).getText(), "Your Wishlist has been shared.");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://live.techpanda.org");
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[5]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		

	}

	@AfterTest
	public void afterTest() {
	driver.close();

	}
 
}
