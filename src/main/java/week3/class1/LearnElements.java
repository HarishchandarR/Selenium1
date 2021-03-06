package week3.class1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.crystalcruises.com/cruises/calendar?year=2018");
		List<WebElement> allQuote =
				driver.findElementsByLinkText
				("Request A Quote".toUpperCase());
		System.out.println(allQuote.size());
		allQuote.get(0).click();
		for (WebElement qu : allQuote) {
			System.out.println(qu.getText());
		}


	}

}
