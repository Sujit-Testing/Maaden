import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String url,uid,pwd,country,startDate,line1,line2,city,pinCode,state,comments = null;
	String OriginalTitle =  "Contact Info";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_CreateNewAddress_Employee_0097.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		country=(String) datatable.getValue("DataSheet", 0, "Country");	
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");	
		line1=(String) datatable.getValue("DataSheet", 0, "Line1");	
		line2=(String) datatable.getValue("DataSheet", 0, "Line2");	
		city=(String) datatable.getValue("DataSheet", 0, "City");	
		pinCode=(String) datatable.getValue("DataSheet", 0, "PinCode");	
		state=(String) datatable.getValue("DataSheet", 0, "State");
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").maximize();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").navigate(url);
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.UID}}").setText(uid);
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.UID}}").pressTab();
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_CreateNewAddress_Employee_0097.Sign_In}}").click();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_CreateNewAddress_Employee_0097.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_CreateNewAddress_Employee_0097.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.Me}}").click();
		{
			think(0.147);
		}
		}
		//Click on Contact_Info		
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.web_a_Contact_Info_1}}").click();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").waitForPage(50, true);
		
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").capturePage();
		//Verify Page Title
		String pageTitle = web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
		String splitTitle[] = pageTitle.split(" ");
		String title =  splitTitle[0]+" "+splitTitle[1];
		info("Here we are landing "+title+" page");
				
		if(title.equalsIgnoreCase(OriginalTitle)){
			info("Test Case pass, as page title is return correctly.");
		}else fail("Test Case fail, as page title is return inCorrectly.");
		{
			think(2.166);
		}	
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").capturePage();
		//Clik on Add Button
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.AddButton}}").click();
		{
			think(3.586);
		}
		//Provide the address detals
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Country}}").click();
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Country}}").setText(country);
		{
			think(0.502);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.India}}").click();
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Country}}").pressTab();
		//Select Address Type
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.AddressType}}").click();//setText("Select a value");
		{
			think(0.5002);
		}
		web.element(690,"{{obj.HCM_CreateNewAddress_Employee_0097.KingdomAddress}}").click();
		{
			think(0.296);
		}
		
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.AddressType}}").pressTab();
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.StartDate}}").setText(startDate);		
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.StartDate}}").pressTab();		
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Address_Line_1}}").setText(line1);
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Address_Line_1}}").pressTab();
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Address_Line_2}}").setText(line2);
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.Address_Line_2}}").pressTab();
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.City_Town}}").setText(city);
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.City_Town}}").pressTab();		
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.PinCode}}").setText(pinCode);	
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.PinCode}}").pressTab();		
		web.textBox("{{obj.HCM_CreateNewAddress_Employee_0097.State}}").setText(state);		
		web.textArea("{{obj.HCM_CreateNewAddress_Employee_0097.Comments}}").setText(comments);
		
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.web_a_Submit}}").click();
		
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").capturePage();
		{
			think(8.404);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.SubmssionConfirmation_MSG}}").focus();
		{
			think(0.887);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_html_1_2}}").click();
		{
			think(1.629);
		}
		//Click BacK Button
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.BackButton}}").click();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").waitForPage(null);
		{
			think(1.375);
		}
		//Clik on contact button again
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.web_a_Contact_Info_2}}").click();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").waitForPage(null);
		{
			think(4.65);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_html_1_3}}").click();
		{
			think(2.86);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_span_Approval_in_progress__1}}").focus();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").capturePage();
		{
			think(0.032);
		}
		web.link(715,"{{obj.HCM_CreateNewAddress_Employee_0097.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(7.297);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_html_1_3}}").click();
		{
			think(2.297);
		}
		//Clik on Show link to check the approver group
		web.link("{{obj.HCM_CreateNewAddress_Employee_0097.web_a_BIP_NOTIF_discloseHref}}").click();
		{
			think(5.482);
		}
		
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_html_background__rgb_255__0__1}}").click();
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_html_1_3}}").click();
		{
			think(2.182);
		}
		web.element("{{obj.HCM_CreateNewAddress_Employee_0097.web_strong__1_1}}").focus();
		web.window("{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").capturePage();

		
		
	}
	public void finish() throws Exception {
		//SignOut

	//web.window(640, "{{obj.HCM_CreateNewAddress_Employee_0097.web_window}}").close();

		

	}
}