import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
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
	String url,uid,pwd,date,firstName,emergencyContact_FirstName,familyName,emergencyContact_FamilyName,middleName,grandFatherName,comments,startDate,
	legalEmployer_SerchInput,national_ID,personNumber,endDate,adjustmentAmount= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_UpdateWorkSchedule_0239.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_UpdateWorkSchedule_0239.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_UpdateWorkSchedule_0239.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_UpdateWorkSchedule_0239.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_UpdateWorkSchedule_0239.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee();
		
		//Perform action activity
		actions();
		
	
		
//		web.image(197, "{{obj.HCM_UpdateWorkSchedule_0239.Add_Row}}").click();
//		{
//			think(0.523);
//		}
		
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.StartDate}}").setText(startDate);
		{
			think(1.456);
		}
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.StartDate}}").pressTab();
		
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.EndDate}}").setText(endDate);
		{
			think(0.459);
		}
		
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.Schedules_Name}}").click();
		{
			think(0.28);
		}
		web.link(209, "{{obj.HCM_UpdateWorkSchedule_0239.web_a_59}}").click();
		{
			think(2.451);
		}
		web.element("{{obj.HCM_UpdateWorkSchedule_0239.Work_schedule_12Hrs__Shif}}").click();
		{
			think(2.843);
		}
//		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.web_input_text__FOpt1__FOr1_0__FONSr2_0__8}}").click();
//		{
//			think(1.592);
//		}
//		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.web_input_text__FOpt1__FOr1_0__FONSr2_0__8}}").setText("Work schedule 12Hrs. Shift 7OFF/7W GrpD");
//		{
//			think(1.835);
//		}
		web.element(213, "{{obj.HCM_UpdateWorkSchedule_0239.Primery}}").click();
		{
			think(0.352);
		}
		web.element(214, "{{obj.HCM_UpdateWorkSchedule_0239.No}}").click();
		{
			think(0.344);
		}
		web.element(215, "{{obj.HCM_UpdateWorkSchedule_0239.web_html_1_3}}").click();
		{
			think(0.639);
		}
		web.element("{{obj.HCM_UpdateWorkSchedule_0239.Review}}").click();
		{
			think(5.759);
		}
		web.link(217, "{{obj.HCM_UpdateWorkSchedule_0239.Submit_1}}").click();
		{
			think(3.709);
		}
		web.button("{{obj.HCM_UpdateWorkSchedule_0239.WarningDialogBox_Yes}}").click();
		{
			think(4.655);
		}
		web.button("{{obj.HCM_UpdateWorkSchedule_0239.Confirm_DialogBox_OK}}").click();
		{
			think(1.911);
		}
		
		web.element(227, "{{obj.HCM_UpdateWorkSchedule_0239.Home_Icon}}")
				.click();
		web.window(228, "{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").waitForPage(null);
		//Search the employee
		SearchEmployee();
		
		//Perform action activity
		actions();
		web.image(197, "{{obj.HCM_UpdateWorkSchedule_0239.Add_Row}}").focus();
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").capturePage();
		
		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\Absence\\HCM_UpdateWorkSchedule_0239.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");		
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");			
		endDate=(String) datatable.getValue("DataSheet", 0, "EndDate");
		personNumber=(String) datatable.getValue("DataSheet", 0, "PersonNumber");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		adjustmentAmount=(String) datatable.getValue("DataSheet", 0, "AdjustmentAmount");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").navigate(url);
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").maximize();
		//web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").navigate(url);
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.UID}}").setText(uid);
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.UID}}").pressTab();
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_UpdateWorkSchedule_0239.Sign_In}}").click();
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee()throws Exception{
		//web.element("{{obj.HCM_UpdateWorkSchedule_0239.Home}}").click();
				
		web.link("{{obj.HCM_UpdateWorkSchedule_0239.Person_Management}}").click();
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.Person Number}}").click();
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.Person Number}}").setText(personNumber);
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.Name}}").click();
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.NID_Input}}").click();
		web.textBox("{{obj.HCM_UpdateWorkSchedule_0239.NID_Input}}").setText(national_ID);
		{
			think(1.546);
		}
		web.button("{{obj.HCM_UpdateWorkSchedule_0239.SearchButton}}").dblClick();
		{
			think(2.214);
		}
		web.window(640, "{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").capturePage();
	
	}
	
	public void actions() throws Exception{
		web.button(37, "{{obj.HCM_UpdateWorkSchedule_0239.Action_Icon}}").click();
		{
			think(2.237);
		}
		web.element("{{obj.HCM_UpdateWorkSchedule_0239.Absences}}").click();
		{
			think(2.088);
		}
		web.element(40, "{{obj.HCM_UpdateWorkSchedule_0239.Work Schedule Assignment}}").click();
		web.window(41, "{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_UpdateWorkSchedule_0239.web_span_Edit}}").focus();
		web.window("{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").capturePage();
	
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_UpdateWorkSchedule_0239.web_window}}").close();		

	}
}