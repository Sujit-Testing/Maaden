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
		
		//Handle WelCome Page
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		
		//Terminate_Employee details
		Task();
		//Re hiring process
		ContingentWorkRelationship();
		
		//Validate the re hiring details
		validation(firstName, familyName, national_ID_Number);
		
		
		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.xlsx", true);
		
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
		peopleGroup =(String) datatable.getValue("DataSheet", 0, "PeopleGroup");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").maximize();
		//web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Sign_In}}").click();
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
						
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Person_Management}}").click();
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Name}}").click();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.NID_Input}}").click();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Terminated_CheckBox}}").click();
		{
			think(0.546);
		}
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.SearchButton}}").click();
		{
			think(2.214);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Active___Payroll_Eligible}}").focus();		

		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Sujit_Swain}}").click();		
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(30,true);
		{
			think(3.783);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_td_Add_Contingent_Work_Relat}}").focus();
		info("Before adding Pending Worker WorkR elationship, below is the screen shot..");
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").capturePage();
	}
	public void Task()throws Exception {
		//Click on Task Image
		if(web.image(147, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_img_Tasks}}").exists(10, TimeUnit.SECONDS)){
		web.image(147, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_img_Tasks}}").click();
		}
		
		//Click on Work Person
		
		web.link(174, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Create Work Relationship}}").click();
		{
			think(2.783);
		}
	
	}
	
	public void ContingentWorkRelationship() throws Exception{
		
		//Provide the basic details e;g- start dtae,action as rehiring, action reason
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.StartDate}}").click();
		{
			think(0.143);
		}
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Action_ReHiring}}").click();
		{
			think(0.929);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Add_Pending_Work_Relationship}}").click();
		{
			think(1.908);
		}
		//Action Reason is not required as field is disabled
//		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.ActionReason}}").click();
//		{
//			think(1.249);
//		}
//		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Action_Reason}}").click();
//		{
//			think(1.177);
//		}
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_60}}").click();
		{
			think(1.2);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Ma_aden_Legal_Employer}}").click();
		{
			think(1.2);
		}
		web.link(257, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_61}}").click();
		{
			think(1.051);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Contingentworker}}").click();
		// Chek all the below segment if it is retriving data from the terminated employee eg- First_Name, Father_Name,Grandfather_Name,Family_Name,NID
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.First_Name}}").focus();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Father_Name}}").focus();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Grandfather_Name}}").focus();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Family_Name}}").focus();
		
				
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.NID}}").focus();
		{
			think(0.041);
		}
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").capturePage();

		//Click on next
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_div__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(7.088);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Next}}").click();
		{
			think(5.125);
		}
		

		//Provide Employment Status
		if(web.link(226,
				"{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Employment_Status}}")
				.exists(10, TimeUnit.SECONDS)){
		web.link(226, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Employment_Status}}").click();
		{
			think(2.806);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Single}}").click();
		{
			think(2.59);
		}
		}
		//Provide Business Unit	
		web.link(228, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Business_Unit}}").click();
		{
			think(4.85);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Ma_aden_Aluminium_Company}}").click();
		{
			think(2.821);
		}

		//Provide People Group details
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.People Group}}").click();
		{
			think(0.034);
		}
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.People Group}}").setText(peopleGroup);
		{
			think(1.577);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Next}}").click();
		{
			think(10.524);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_x}}").click();
		{
			think(10.722);
		}
		if(web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Submit_1}}").isDisplayed()){
			web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Submit_1}}").click();
		{
			think(7.399);
		}
		}else web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Submit_1}}").waitFor(10);{
			web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_x}}").click();
			{
				think(10.722);
			}
			web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Submit_1}}").click();
			
		}
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Yes_Button}}").click();
		{
			think(10.983);
		}
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.OK_Button_Click}}").click();
		{
			think(15.417);
		}

	}
	
	public void validation(String firstName,String familyName,String national_ID_Number)throws Exception{
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Home}}").click();
		{
			think(4.444);
		}	
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Person_Management}}").click();
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Name}}").click();
		//web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Name}}").clearText();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.Name}}").pressTab();
		{
			think(0.444);
		}
//		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.NID_Input}}").click();
//		//web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.NID_Input}}").setText(national_ID);
//		{
//			think(0.546);
//		}
		web.button("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_span_Active___Payroll_Eligible}}").focus();
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Syam_Bahadur}}").focus();		
		
		web.link("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_a_Sujit_Swain}}").click();
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").waitForPage(30,true);
		{
			think(3.783);
		}
		web.element("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_td_Add_Contingent_Work_Relat}}").focus();
		
		info("After adding Pending Worker WorkR elationship, below is the screen shot..");
		web.window("{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_ManuallyCreatingWorkRelationship_For_Contigent_Worker_0214.web_window}}").close();		

	}
}