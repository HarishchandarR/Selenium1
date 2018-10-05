package week6.class2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe ");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL and login
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	WebElement table = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/table");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		//List <WebElement> column = driver.findElements(By.tagName("td"));
		String perct = "80%";
		rows.size();
		for (int i = 0; i < rows.size(); i++) {
			 
			String temp2 = rows.get(i).getText();
			
			if (temp2.contains(perct)) {
			driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[3]/td[3]/input")).click();
			break;
			}
				
			}
			
			
			
		}
			
		

	}


