package week3.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe ");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement eleElec = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement eleOppo = driver.findElementByXPath("//a[text()='OPPO']");
		Actions builder = new Actions(driver);
		builder.moveToElement(eleElec).pause(2000).click(eleOppo).perform();
	

	}

}
