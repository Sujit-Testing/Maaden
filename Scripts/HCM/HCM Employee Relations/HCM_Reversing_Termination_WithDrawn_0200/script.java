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
	String url,uid,pwd,date,firstName,emergencyContact_FirstName,familyName,emergencyContact_FamilyName,middleName,grandFatherName,comments,effective_Start_Date,
	legalEmployer_SerchInput,legislationCode,airTicketEligibility,educationAllowanceEligibility,
	retirementExtension_Date,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Terminate_An_Employee_0199.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Terminate_An_Employee_0199.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}	
		
		//withdrawn the termination
		withdraw();
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Terminate_An_Employee_0199.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");		
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");			
		retirementExtension_Date=(String) datatable.getValue("DataSheet", 0, "RetirementExtension_Date");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").navigate(url);
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").maximize();
		//web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").navigate(url);
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.UID}}").pressTab();
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Terminate_An_Employee_0199.Sign_In}}").click();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(150, true);
		
	
	}
	public void withdraw() throws Exception{
		//Click on Bell icon
		web.element(183, "{{obj.HCM_Terminate_An_Employee_0199.Bell_Icon}}").click();
		//Click on Show All
		web.button("{{obj.HCM_Terminate_An_Employee_0199.Show_All}}").click();
		{
			think(5.118);
		}
		//Click on Worklist
		web.button("{{obj.HCM_Terminate_An_Employee_0199.WorkList}}").click();
		web.window(171, "{{obj.HCM_Terminate_An_Employee_0199.web_window_1}}").waitForPage(null);
		{
			think(2.0);
		}
		//Click on initiated task
		web.link("{{obj.HCM_Terminate_An_Employee_0199.web_a_Initiated_Tasks_}}").click();
		{
			think(3.181);
		}
		//Select the task
		web.link("{{obj.HCM_Terminate_An_Employee_0199.web_a_Resignation_for_Mohammad_}}").click();
		web.window(175, "{{obj.HCM_Terminate_An_Employee_0199.web_window_2}}").waitForPage(null);
		{
			think(2.153);
		}
		//Select action as withdrawn
		web.element(177, "{{obj.HCM_Terminate_An_Employee_0199.web_div_52}}").click();
		{
			think(2.598);
		}
		web.element("{{obj.HCM_Terminate_An_Employee_0199.web_td_Withdraw}}").click();
		{
			think(4.622);
		}
		web.textArea("{{obj.HCM_Terminate_An_Employee_0199.Comments}}").setText("withdrawn");
		{
			think(1.486);
		}
		//Clik on submit
		web.link(180, "{{obj.HCM_Terminate_An_Employee_0199.web_a_Submit_1}}").click();
		{
			think(2.462);
		}
	}

	public void finish() throws Exception {
		//SignOut
		web.window(182, "{{obj.HCM_Terminate_An_Employee_0199.web_window_1}}").close();
		web.window(640, "{{obj.HCM_Terminate_An_Employee_0199.web_window}}").close();		

	}
}