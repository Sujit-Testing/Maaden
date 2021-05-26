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
	legalEmployer_SerchInput,legislationCode,airTicketEligibility,
	retirementExtension_Date,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod,personNumber,selectDate,endDate= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee();
		
		//Perform action activity
		actions();
		
		//Click on Enrollments and Adjustment
		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Enrollments_and_Adjustment}}").click();
		{
			think(0.674);
		}
		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_a_60}}").click();
		{
			think(0.674);
		}
		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Update Enrollment}}").click();
		{
			think(1.806);
		}
		//web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Select Plan}}").click();
//		{
//			think(2.68);
//		}
//		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Accompany_Sick}}").click();
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Start Date}}").click();		
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Start Date}}").setText(startDate);
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.End Date}}").setText(endDate);
		web.button("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.UpdateEnrollment_Submit}}").click();
		{
			think(2.693);
		}
		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Accruals}}").click();
		{
			think(2.186);
		}
		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_a_58}}").click();
		{
			think(1.273);
		}
		//Select "Run Accruals for All Active Plans"
		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Run Accruals for All Active Plans}}").click();
		{
			think(2.674);
		}
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Select Date}}").click();
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Select Date}}").setText(selectDate);
		
		web.button("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Yes_Button_RunAccrualsAllActivePlans}}").click();
		{
			think(10.873);
		}
//		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_span_15}}").focus();
//		{
//			think(0.052);
//		}
//		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_td_Calendar_Days}}").focus();
//		{
//			think(0.083);
//		}
//		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_a_Accompany_Sick}}").focus();
		web.window(640, "{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").capturePage();
		
		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\Absence\\HCM_ManagingAbsence_Update_PlanBalance_0235.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");
		endDate=(String) datatable.getValue("DataSheet", 0, "EndDate");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");			
		selectDate=(String) datatable.getValue("DataSheet", 0, "SelectDate");
		personNumber=(String) datatable.getValue("DataSheet", 0, "PersonNumber");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").maximize();
		//web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Sign_In}}").click();
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee()throws Exception{
		//web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Home}}").click();
				
		web.link("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Person_Management}}").click();
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Person Number}}").click();
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Person Number}}").setText(personNumber);
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Name}}").click();
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.NID_Input}}").click();
		web.textBox("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.NID_Input}}").setText(national_ID);
		{
			think(1.546);
		}
		web.button("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.SearchButton}}").dblClick();
		{
			think(2.214);
		}
	
	}
	
	public void actions() throws Exception{
		web.button(37, "{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Action_Icon}}").click();
		{
			think(2.237);
		}
		web.element("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Absences}}").click();
		{
			think(2.088);
		}
		web.element(40, "{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.Absence Records}}").click();
		web.window(41, "{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_span_Edit}}").focus();
		web.window("{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").capturePage();
	
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_ManagingAbsence_Update_PlanBalance_0235.web_window}}").close();		

	}
}