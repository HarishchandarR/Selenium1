package week4.class1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	@Test(dataProvider="fetchData", groups="Smoke")
	public void createLead(String cname, String fname, String lname) {	
		click(locateElement("linkText", "Create Lea"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));			
	}
	@DataProvider(name="fetchData")
	public String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0] ="TestLeaf";
		data[0][1] ="Gopinath";
		data[0][2] ="Jayakumar";
		
		data[1][0] ="TestLeaf";
		data[1][1] ="Gayatri";
		data[1][2] ="Krishna";
		return data;
		
	}
}
