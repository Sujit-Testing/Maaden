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
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod,country_Name,national_ID_Number,issue_Date,expiration_Date= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);
//Testing		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
				
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");			
		
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		peopleGroup =(String) datatable.getValue("DataSheet", 0, "PeopleGroup");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").navigate(url);
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").maximize();
		//web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").navigate(url);
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.UID}}").pressTab();
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Sign_In}}").click();
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(150, true);
		//web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").close();	
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
						
		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Person_Management}}").click();
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Name}}").click();
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.NID_Input}}").click();
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Terminated_CheckBox}}").click();
//		{
//			think(0.546);
//		}
		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.SearchButton}}").click();
		{
			think(2.214);
		}
		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_span_Active___Payroll_Eligible}}").focus();		

		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_a_Sujit_Swain}}").click();		
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(30,true);
		{
			think(1.783);
		}
		//web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_td_Add_Contingent_Work_Relat}}").focus();
		info("Before Cancel Work Relationship, below is the screen shot..");
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").capturePage();
		
		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Select_User}}").click();
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(null);
		{
			think(1.083);
		}
	}
	
	
	public void CancelWorkRelationship() throws Exception{
		
		//Click on Task
		web.image("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Task_Image}}").click();
		{
			think(2.284);
		}
		//Click on manage work relationship
		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Manage_Work_Relationship}}").click();
		{
			think(2.822);
		}
		//Click on action
		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_a_Actions}}").click();
		{
			think(0.921);
		}
		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_a_30}}").click();
		{
			think(1.793);
		}
		//Click on  cancel work relationship
		boolean cancelWorkRelationship = web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Cancel_Work_Relationship}}").isDisplayed();

		if(cancelWorkRelationship==false){
			info("Test Case pass as cancel Work Relationship option is not displayed for invalid payroll employee..");			
		}else fail("Test Case fail as cancel Work Relationship option is displayed for invalid payroll employee..");	
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Cancel_Work_Relationship}}").click();
//		{
//			think(2.989);
//		}
//		//Click on submit button
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Cancel_Work_Relationship_Submit}}").click();
//		{
//			think(2.752);
//		}		
//		
//		//Click on  yes
//		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Yes_WarningDialog}}").click();
//		{
//			think(5.392);
//		}
//		web.window(640, "{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").capturePage();
		//Click on OK
//		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.OK_PopUpDialog}}").click();
//		{
//			think(18.172);
//		}
		//web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_html_1_2}}").click();
		

	}
	
	public void validation(String firstName,String familyName,String national_ID_Number)throws Exception{
		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Home}}").click();
		{
			think(4.444);
		}	
		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Person_Management}}").click();
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Name}}").click();
		//web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Name}}").clearText();
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.Name}}").pressTab();
		{
			think(0.444);
		}
//		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.NID_Input}}").click();
//		//web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.NID_Input}}").setText(national_ID);
//		{
//			think(0.546);
//		}
		web.button("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.SearchButton}}").click();
		{
			think(4.214);
		}
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.PersonNumber}}").focus();
//		{
//			think(0.039);
//		}
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.National_Id}}").focus();
//		{
//			think(0.079);
//		}
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_span_Contingent_Worker}}").focus();
//		{
//			think(0.076);
//		}
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_span_Active___Payroll_Eligible}}").focus();
//		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_a_Syam_Bahadur}}").focus();		
//		
//		web.link("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_a_Sujit_Swain}}").click();
//		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").waitForPage(30,true);
//		{
//			think(3.783);
//		}
//		web.element("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_td_Add_Contingent_Work_Relat}}").focus();
//		
		info("After Cancel Work Relationship, below is the screen shot..");
		web.window("{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_Cancel_Work_Relationship_for_Inactive_Payroll_Employee_N_0224.web_window}}").close();		

	}
}