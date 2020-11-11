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
		
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Edit_MaritalStatus_0102.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		date=(String) datatable.getValue("DataSheet", 0, "Date");		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		
		
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").maximize();
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").navigate(url);
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Edit_MaritalStatus_0102.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Edit_MaritalStatus_0102.UID}}").pressTab();
		web.textBox("{{obj.HCM_Edit_MaritalStatus_0102.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Edit_MaritalStatus_0102.Sign_In}}").click();
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Edit_MaritalStatus_0102.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Edit_MaritalStatus_0102.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_Edit_MaritalStatus_0102.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Edit_MaritalStatus_0102.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Edit_MaritalStatus_0102.Me}}").click();
		{
			think(0.147);
		}
		}
		
		//Click on Personal_Details link
		web.link("{{obj.HCM_Edit_MaritalStatus_0102.web_a_Personal_Details}}").click();
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").waitForPage(null);				
		{
			think(5.389);
		}
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").capturePage();
		//Before Modify the status
		web.element(717, "{{obj.HCM_Edit_MaritalStatus_0102.BeforeEdit_MartialStatus}}").focus();
		info("Here is the screen shot captured below before Edit the Martial Status");
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").capturePage();
		{
			think(0.3);
		}
		//Edit the pencile icon
		web.image(719, "{{obj.HCM_Edit_MaritalStatus_0102.web_img_Edit_1}}").click();
		{
			think(2.786);
		}
		//Clik on the marital status input box
		web.textBox("{{obj.HCM_Edit_MaritalStatus_0102.MaritalStatusDropDown}}").click();
		{
			think(0.781);
		}
		//Choose the proper status
		web.element(721, "{{obj.HCM_Edit_MaritalStatus_0102.web_li_Married}}").click();
		{
			think(0.434);
		}
		//Provide the dates
		web.textBox("{{obj.HCM_Edit_MaritalStatus_0102.MaritalStatusChangeDate}}").click();
		web.textBox("{{obj.HCM_Edit_MaritalStatus_0102.MaritalStatusChangeDate}}").setText(date);
		{
			think(0.664);
		}
		//Provide the comments 
		web.textArea("{{obj.HCM_Edit_MaritalStatus_0102.Comments}}").setText(comments);
		
		{
			think(0.478);
		}
		//Ckcl on Submit button
		web.element(726, "{{obj.HCM_Edit_MaritalStatus_0102.web_span_Submit}}").click();
		{
			think(15.546);
		}
		//Capture the confirmation message
		web.element("{{obj.HCM_Edit_MaritalStatus_0102.web_span_We_are_submitting_your_ch}}").focus();
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").capturePage();
//		if(web.element("{{obj.HCM_Edit_MaritalStatus_0102.web_span_We_are_submitting_your_ch}}").exists(30, TimeUnit.SECONDS)){
//		web.element("{{obj.HCM_Edit_MaritalStatus_0102.web_span_We_are_submitting_your_ch}}").focus();
//		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").capturePage();
//		}
		{
			think(0.009);
		}
		//After Modify the status
		web.element("{{obj.HCM_Edit_MaritalStatus_0102.AfterEdit_MartialStatus}}").focus();
		info("Here is the screen shot captured below After Edit the Martial Status");
		web.window("{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").capturePage();

		
		
	}
	public void finish() throws Exception {
		//SignOut
	web.window(640, "{{obj.HCM_Edit_MaritalStatus_0102.web_window}}").close();

		

	}
}