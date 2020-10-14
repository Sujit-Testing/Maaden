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
	String url,uid,pwd = null;
	String OriginalTitle =  "Contact Info";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ContactInfoPage_TitleValidation_0096.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");			
		
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").maximize();
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").navigate(url);
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ContactInfoPage_TitleValidation_0096.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ContactInfoPage_TitleValidation_0096.UID}}").pressTab();
		web.textBox("{{obj.HCM_ContactInfoPage_TitleValidation_0096.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ContactInfoPage_TitleValidation_0096.Sign_In}}").click();
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_ContactInfoPage_TitleValidation_0096.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ContactInfoPage_TitleValidation_0096.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_ContactInfoPage_TitleValidation_0096.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ContactInfoPage_TitleValidation_0096.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ContactInfoPage_TitleValidation_0096.Me}}").click();
		{
			think(0.147);
		}
		}
		//Click on Contact_Info		
		web.link("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_a_Contact_Info_1}}").click();
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").waitForPage(50, true);
		
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").capturePage();
		//Verify Page Title
		String pageTitle = web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").getTitle();
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
	
		
		web.window("{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").capturePage();
		
		
	}
	public void finish() throws Exception {
		//SignOut

	web.window(640, "{{obj.HCM_ContactInfoPage_TitleValidation_0096.web_window}}").close();

		

	}
}