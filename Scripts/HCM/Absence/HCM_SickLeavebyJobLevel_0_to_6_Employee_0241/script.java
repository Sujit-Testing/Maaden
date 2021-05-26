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
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	String url,uid,pwd,date,startDate,endDate,re_JoiningDate,aprover1_UID,aprover1_PWD,	
	aprover2_UID,aprover2_PWD,aprover3_UID,aprover3_PWD,aprover4_UID,aprover4_PWD,path= null;
	@FunctionLibrary("HCM_Aprove_Request") lib.myCompany.myTeam.HCM_Aprove_Request hCM_Aprove_Request;
	@FunctionLibrary("File_Upload_RobotClass") lib.myCompany.myTeam.File_Upload_RobotClass file_Upload_RobotClass;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
	   DataTableService parDatatable = datatable.getGlobalDatatable(); 
			

		//hCM_Aprove_Request.run();
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Me}}").click();
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Time_and_Absences}}").click();
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").waitForPage(null);
		{
			think(3.602);
		}
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_html_1}}").click();
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Create_Absence}}").focus();
		{
			think(0.095);
		}
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Create_Absence}}").dblClick();
		{
			think(3.895);
		}
		
		if(web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Absence_Type}}").exists(2, TimeUnit.SECONDS)){
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Absence_Type}}").click();
		{
			think(5.23);
		}
		} else {
			web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Create_Absence}}").dblClick();
			{
				think(5.351);
			}
			//Add Absence

			web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Absence_Type}}").click();
		}
		//web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Absence_Type}}").click();
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Absence_Type}}").setText("Sick Leave");
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Absence_Type}}").click();
		//web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_div__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(2.485);
		}
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Select_Absence_Type_Sick_Leave}}").click();
		{
			think(5.527);
		}
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Start Date}}").setText(startDate);
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").capturePage();
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Start Date}}").pressTab();
		{
			think(1.83);
		}
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.End Date}}").click();
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.End Date}}").setText(endDate);
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.End Date}}").pressTab();
		{
			think(0.634);
		}
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Attachement}}").click();
		{
			think(0.815);
		}
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Add_File}}").click();
		{
			think(1.803);
		}
		
		//Call Robot class method to upload files.
		file_Upload_RobotClass.fileUpload(path);
		
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Re_Joining Date}}").click();
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Re_Joining Date}}").setText(re_JoiningDate);
		{
			think(2.952);
		}
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Start Date}}").setText(startDate);
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Submit}}").click();
		{
			think(2.952);
		}
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Home}}").click();
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").waitForPage(null);
		
		//Click on Tool->WorkList->My_Tasks-Initiated_Tasks->Click on request list
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Tools}}").click();
		{
			think(2.712);
		}
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Worklist}}").click();
		{
			think(2.727);
		}
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.My_Tasks}}").click();
		{
			think(2.516);
		}
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Initiated_Tasks}}").click();
		{
			think(2.21);
		}
		String approval_Request = web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_a_Approval_of_Sick_Leave_Ab}}").getDisplayText();
		info(approval_Request );
//		//Setting value in the data table
//		 parDatatable.setValue(1, "A", approval_Request);
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_a_Approval_of_Sick_Leave_Ab}}").click();
		web.link("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_a_Approval_of_Sick_Leave_Ab}}").click();
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window_1}}").waitForPage(null);
		{
			think(1.181);
		}
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window_1}}").maximize();
		//web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_div_pglscroll}}").click();		
		
		
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_strong__1}}").focus();
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_strong__1_1}}").focus();
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_strong__1_2}}").focus();
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_strong__1_3}}").focus();
		web.element("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_strong__1_4}}").focus();
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window_1}}").capturePage();
		{
			think(1.21);
		}

	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\Absence\\HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
//		aprover1_UID=(String) datatable.getValue("DataSheet", 0, "Aprover1_UID");
//		aprover1_PWD=(String) datatable.getValue("DataSheet", 0, "Aprover1_PWD");
//		aprover2_UID=(String) datatable.getValue("DataSheet", 0, "Aprover2_UID");
//		aprover2_PWD=(String) datatable.getValue("DataSheet", 0, "Aprover2_PWD");
//		aprover3_UID=(String) datatable.getValue("DataSheet", 0, "Aprover3_UID");
//		aprover3_PWD=(String) datatable.getValue("DataSheet", 0, "Aprover3_PWD");
//		aprover4_UID=(String) datatable.getValue("DataSheet", 0, "Aprover4_UID");
//		aprover4_PWD=(String) datatable.getValue("DataSheet", 0, "Aprover4_PWD");
		
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");	
		endDate=(String) datatable.getValue("DataSheet", 0, "EndDate");
		path=(String) datatable.getValue("DataSheet", 0, "Path");
		re_JoiningDate=(String) datatable.getValue("DataSheet", 0, "Re_JoiningDate");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").navigate(url);
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").maximize();
		//web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").navigate(url);
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.UID}}").setText(uid);
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.UID}}").pressTab();
		web.textBox("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.Sign_In}}").click();
		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").waitForPage(150, true);
		
	}


	public void finish() throws Exception {
		//SignOut
//		web.window("{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window_1}}").close();
//		{
//			think(1.21);
//		}
//		web.window(640, "{{obj.HCM_SickLeavebyJobLevel_0_to_6_Employee_0241.web_window}}").close();		

	}
}