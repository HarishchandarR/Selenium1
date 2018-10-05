package week3.class2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		WebElement src = driver.findElementById("txtStationFrom");
		src.clear();
		src.sendKeys("sbc", Keys.TAB);
		
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("mdu", Keys.TAB);
		//driver.findElementById("chkSelectDateOnly").click();
		WebElement table =
				driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = 
				table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (WebElement eachRow : rows) {
		List<WebElement> column = 
				eachRow.findElements(By.tagName("td"));
		System.out.println(column.get(1).getText());
		}		
	}

}
