package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;

import week4.class2.ReadExcel;

public class ProjectMethods extends SeMethods {
	//@Parameters({"url", "uname", "pwd"})
	public String sheetname;
	public String testName;
	public String desc;
	public String author;
	public String category;
	@BeforeSuite
	public void beforeSuite(){
		startResult();	
	}
	@BeforeClass
	public void startTestcase(){
		startTestCase(testName, desc);
	}
	//@BeforeMethod(groups="common")	
	/*public void login(String URL, String username, String password) {
		startApp("chrome", URL);
		WebElement eleUname = locateElement("id", "username");
		type(eleUname, username);
		type(locateElement("id", "password"), password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		}*/
	@BeforeMethod
	public void login() {
		beforeMethod(author,category);
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}
	@AfterMethod
	//@AfterMethod(groups="common")
	public void logout() {
		closeBrowser();	
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	@DataProvider(name="pulldata")
	public String[][] getData() throws IOException {
		ReadExcel obj = new ReadExcel();
		return obj.excelData(sheetname);




	}
}
