import java.text.SimpleDateFormat;
import java.util.Date;
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
	String url,uid,pwd,issuing_Country,passport_Number,issuingAuthority,issueDate,expiration_Date,issuingLocation,name,comments= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Delete_Passport_Information_0118.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		issuing_Country=(String) datatable.getValue("DataSheet", 0, "Issuing_Country");
		passport_Number=(String) datatable.getValue("DataSheet", 0, "Passport_Number");
		issuingAuthority=(String) datatable.getValue("DataSheet", 0, "IssuingAuthority");
		issueDate=(String) datatable.getValue("DataSheet", 0, "IssueDate");
		expiration_Date=(String) datatable.getValue("DataSheet", 0, "Expiration_Date");
		issuingLocation=(String) datatable.getValue("DataSheet", 0, "IssuingLocation");
		name=(String) datatable.getValue("DataSheet", 0, "Name");
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
			
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").maximize();
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Delete_Passport_Information_0118.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_Passport_Information_0118.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_Passport_Information_0118.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_Passport_Information_0118.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Delete_Passport_Information_0118.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Delete_Passport_Information_0118.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_Delete_Passport_Information_0118.Me}}").click();
		{
			think(0.868);
		}
		//Clik on Identification Info
		web.link("{{obj.HCM_Delete_Passport_Information_0118.Identification Info}}").click();
		{
			think(6.785);
		}
		//Clik on Edit Button
		web.image("{{obj.HCM_Delete_Passport_Information_0118.web_img_Edit}}").dblClick();
		
		//web.element("{{obj.HCM_Delete_Passport_Information_0118.Add}}").click();
		if(web.element("{{obj.HCM_Delete_Passport_Information_0118.web_img_Edit}}").exists(30, TimeUnit.SECONDS)){
		web.image("{{obj.HCM_Delete_Passport_Information_0118.web_img_Edit}}").click();		
		}
		{
			think(1.646);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0118.Delete}}").click();
		{
			think(5.646);
		}
	
		//Clik on Back Button
		web.element("{{obj.HCM_Delete_Passport_Information_0118.Back_Button}}").click();
		web.window(850, "{{obj.HCM_Delete_Passport_Information_0118.web_window}}").waitForPage(null);
		{
			think(2.021);
		}
		//Click on Me button
		web.link("{{obj.HCM_Delete_Passport_Information_0118.Me}}").click();
		{
			think(0.868);
		}
		//Clik on Identification Info
		web.link("{{obj.HCM_Delete_Passport_Information_0118.Identification Info}}").click();
		{
			think(6.785);
		}
		//web.link(852,"{{obj.HCM_Delete_Passport_Information_0118.web_a_Identification_Info}}").click();
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").waitForPage(null);
		{
			think(3.021);
		}
		web.link("{{obj.HCM_Delete_Passport_Information_0118.See how it is going}}").click();
		{
			think(6.838);
		}
		//web.element("{{obj.HCM_Delete_Passport_Information_0118.web_span_Mohammad_Mahtab_Khan}}").dblClick();
		web.element("{{obj.HCM_Delete_Passport_Information_0118.web_html_1_2}}").click();
		{
			think(0.491);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0118.web_html_1_2}}").click();
		{
			think(0.491);
		}
		web.link("{{obj.HCM_Delete_Passport_Information_0118.Show Detail}}").click();
		{
			think(1.22);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0118.web_strong__1}}").dblClick();	
				
		info("Approval is under process. Here is the screenshot captured below...");
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").capturePage();
		
		
		
	}
	public void finish() throws Exception {
		//SignOut
		//web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_Delete_Passport_Information_0118.web_window}}").close();

	}
}