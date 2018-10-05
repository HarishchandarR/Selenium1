package week1.day1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
//Launch the Chrome browser	
System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe ");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//Launch the URL and login to leaftaps
driver.get("http://leaftaps.com/opentaps");
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
//Get the text and print the text displayed in the Homepage
String text=driver.findElementById("form").getText();
System.out.println(text);
//Navigate to the Create Lead page from the Homepage
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
//Fill mandatory fields in Create Lead form
driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
driver.findElementById("createLeadForm_firstName").sendKeys("Harish");
driver.findElementById("createLeadForm_lastName").sendKeys("R");
driver.findElementByClassName("smallSubmit").click();
//Get the first name of the created lead and Print it
String aaa=driver.findElementById("viewLead_firstName_sp").getText();
System.out.println(aaa);
//Validate the text displayed is as expected
if (aaa.contains("Harish1")) {

System.out.println("Text present");
}
else {
	System.out.println("Text not present");
	}
driver.close();
	}
}

//end of testcase
