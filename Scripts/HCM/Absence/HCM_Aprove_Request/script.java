import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.datatable.api.DataTableService;
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
	String url,uid,pwd,date,firstName,emergencyContact_FirstName,familyName,emergencyContact_FamilyName,middleName,grandFatherName,comments,startDate,
	legalEmployer_SerchInput,national_ID,personNumber,endDate,adjustmentAmount,re_JoiningDate,approval_Request= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		DataTableService parDatatable = datatable.getGlobalDatatable();
		
		//get the value from the data Table from the previous script
		approval_Request= parDatatable.getValue(1, "A").toString();
		info("approval_Request ---> "+approval_Request);
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Aprove_Request.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Aprove_Request.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Aprove_Request.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		
		//Click on Tool->WorkList->My_Tasks-MyTasks->Click on request list
		web.link("{{obj.HCM_Aprove_Request.Tools}}").click();
		{
			think(2.712);
		}
		web.link("{{obj.HCM_Aprove_Request.Worklist}}").click();
		{
			think(2.727);
		}
		web.link("{{obj.HCM_Aprove_Request.My_Tasks}}").click();
		{
			think(2.516);
		}
		web.link("{{obj.HCM_Aprove_Request.MyTasks}}").click();
		{
			think(2.21);
		}
		if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_1}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_1}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_2}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_2}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_3}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_3}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_4}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_4}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_5}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_5}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_6}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_6}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_7}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_7}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_8}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_8}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_9}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_9}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_10}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_10}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_11}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_11}}").click();
		}else if(approval_Request.equalsIgnoreCase(web.link("{{obj.HCM_Aprove_Request.Request_12}}").getDisplayText())){
		web.link("{{obj.HCM_Aprove_Request.Request_12}}").click();
		}

		web.window("{{obj.HCM_Aprove_Request.web_window_1}}").waitForPage(null);
		{
			think(2.181);
		}
		web.window("{{obj.HCM_Aprove_Request.web_window_1}}").maximize();
		web.button("{{obj.HCM_Aprove_Request.web_button_r1_0_bip_up_UPsp1_bipt_cb}}").click();
		{
			think(8.166);
		}
		web.textArea("{{obj.HCM_Aprove_Request.web_textarea_r1_0_bip_up_UPsp1_bip_rpp}}").setText(comments);
		{
			think(4.351);
		}
		web.link(284, "{{obj.HCM_Aprove_Request.web_a_Submit}}").click();
		{
			think(4.674);
		}
		web.window(285, "{{obj.HCM_Aprove_Request.web_window_1}}").close();
		{
			think(1.674);
		}
		web.window(640, "{{obj.HCM_Aprove_Request.web_window}}").close();
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\Absence\\HCM_Aprove_Request.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");	
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Aprove_Request.web_window}}").navigate(url);
		web.window("{{obj.HCM_Aprove_Request.web_window}}").maximize();
		//web.window("{{obj.HCM_Aprove_Request.web_window}}").navigate(url);
		web.window("{{obj.HCM_Aprove_Request.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Aprove_Request.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Aprove_Request.UID}}").pressTab();
		web.textBox("{{obj.HCM_Aprove_Request.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Aprove_Request.Sign_In}}").click();
		web.window("{{obj.HCM_Aprove_Request.web_window}}").waitForPage(150, true);
		
	}


	public void finish() throws Exception {
		//SignOut
	
		web.window(640, "{{obj.HCM_Aprove_Request.web_window}}").close();		

	}
}