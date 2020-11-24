import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.Test;

class TestDemoBlaze {

	WebDriver driver;
	
	@BeforeEach
	void prefix() {
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		driver = new ChromeDriver();
	}
	
	//test Add to Cart
	@Test
	void test() {
		addToCart_iPhone("iPhone 6 32gb");
	}
	
	void addToCart_iPhone(String phone) {
		driver.get("https://www.demoblaze.com/prod.html?idp_=5");
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		driver.get("https://www.demoblaze.com/cart.html");
		
		
	}
	
	void login() {
		String nameText = "helloWorld";
		driver.get("https://www.demoblaze.com/");
		
		
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("TrentHenry");
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("cs3250");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
		driver.close();
	}

}
