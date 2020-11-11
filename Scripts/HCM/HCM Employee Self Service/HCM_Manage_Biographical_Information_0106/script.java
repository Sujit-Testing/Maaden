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
	String url,uid,pwd,date,firstName,familyName,fatherName,grandFatherName,comments = null;
	String title =  "Contact Info - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
	
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy"); 
//		Date date = new Date();
//		System.out.println(formatter.format(date));
		
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Manage_Biographical_Information_0106.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		
		
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").maximize();
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").navigate(url);
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Manage_Biographical_Information_0106.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Manage_Biographical_Information_0106.UID}}").pressTab();
		web.textBox("{{obj.HCM_Manage_Biographical_Information_0106.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Manage_Biographical_Information_0106.Sign_In}}").click();
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Manage_Biographical_Information_0106.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Manage_Biographical_Information_0106.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_Manage_Biographical_Information_0106.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Manage_Biographical_Information_0106.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Manage_Biographical_Information_0106.Me}}").click();
		{
			think(0.147);
		}
		}
		
		//Click on Personal_Details link
		web.link("{{obj.HCM_Manage_Biographical_Information_0106.web_a_Personal_Details}}").click();
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").waitForPage(null);				
		{
			think(2.389);
		}
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").capturePage();	
		//Click on Biographical_Information drop down
		
		web.image("{{obj.HCM_Manage_Biographical_Information_0106.Biographical}}").click();
		{
			think(12.389);
		}
		//Check if date of birth is not editable field
		if(web.element("{{obj.HCM_Manage_Biographical_Information_0106.DateOfBirth}}").exists(30, TimeUnit.SECONDS)){
		web.element("{{obj.HCM_Manage_Biographical_Information_0106.DateOfBirth}}").focus();
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").capturePage();
		}
		
		
	}
	public void finish() throws Exception {
		//SignOut
		web.window("{{obj.HCM_Manage_Biographical_Information_0106.web_window}}").close();
	}
}