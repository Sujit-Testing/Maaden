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
	dateOfBirth,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod,passport_Number,passport_Authorize_Country,passport_IssueDate,passport_ExpireDate= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Delete_Passport_Information_0161.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Delete_Passport_Information_0161.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Delete_Passport_Information_0161.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Delete_Passport_Information_0161.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Delete_Passport_Information_0161.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		actions();
		
		//Add New Emergency Contact
		editPassport();		
		
		//submit Activity		
		submit();
		
		//Validate the changes
		validation(firstName,familyName, national_ID);
		//actions();

		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Delete_Passport_Information_0161.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
//		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");		
//		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		//nID_Country_Input=(String) datatable.getValue("DataSheet", 0, "NID_Country_Input");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		
		passport_Number=(String) datatable.getValue("DataSheet", 0, "Passport_Number");
		passport_Authorize_Country=(String) datatable.getValue("DataSheet", 0, "Passport_Authorize_Country");		
		passport_IssueDate=(String) datatable.getValue("DataSheet", 0, "Passport_IssueDate");
		passport_ExpireDate=(String) datatable.getValue("DataSheet", 0, "Passport_ExpireDate");		
		
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").maximize();
		//web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_Passport_Information_0161.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Delete_Passport_Information_0161.Home}}").click();
				
		web.link("{{obj.HCM_Delete_Passport_Information_0161.Person_Management}}").click();
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Name}}").click();
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.NID_Input}}").click();
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Delete_Passport_Information_0161.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0161.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0161.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0161.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Delete_Passport_Information_0161.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Delete_Passport_Information_0161.Action_Icon}}").click();
		{
			think(3.237);
		}
		web.element("{{obj.HCM_Delete_Passport_Information_0161.Personal_and_Employment}}").click();
		{
			think(0.088);
		}
		web.element(40, "{{obj.HCM_Delete_Passport_Information_0161.Person}}").click();
		web.window(41, "{{obj.HCM_Delete_Passport_Information_0161.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_Delete_Passport_Information_0161.web_span_Edit}}").focus();
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").capturePage();
	}
	public void editPassport()throws Exception {
		//Clik on Contact tab
		web.link("{{obj.HCM_Delete_Passport_Information_0161.Documents}}").click();
		{
			think(3.321);
		}
		//Click on Edit option from passport section
		
		web.image("{{obj.HCM_Delete_Passport_Information_0161.Edit_Passport}}").click();
		{
			think(1.219);
		}
		web.image("{{obj.HCM_Delete_Passport_Information_0161.Delete_Passport_Button}}").click();
		{
			think(1.894);
		}
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Issing_Country}}").click();
//		{
//			think(0.245);
//		}
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Type}}").click();
//		{
//			think(0.462);
//		}
//		web.element("{{obj.HCM_Delete_Passport_Information_0161.Passport_Regular}}").click();
//		{
//			think(1.211);
//		}
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Number}}").click();
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Number}}").setText(passport_Number);
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Number}}").pressTab();
//		{
//			think(0.066);
//		}
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Authorize_Country}}").setText(passport_Authorize_Country);
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_Authorize_Country}}").pressTab();
//		{
//			think(0.087);
//		}
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_IssueDate}}").setText(passport_IssueDate);
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_IssueDate}}").pressTab();
//		{
//			think(0.0185);
//		}
//		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Passport_ExpireDate}}").setText(passport_ExpireDate);
//		{
//			think(2.722);
//		}
		web.element("{{obj.HCM_Delete_Passport_Information_0161.Passport_Dialog_OK}}").click();	
		{
			think(2.878);
		}
		
	}
	public void submit() throws Exception{
		
		//Click on Submit
		web.element(50, "{{obj.HCM_Delete_Passport_Information_0161.Submit_Button}}").click();
		{
			think(2.878);
		}
		web.button("{{obj.HCM_Delete_Passport_Information_0161.web_button__FOpt1__FOr1_0__FONSr2_0__4}}").click();
		{
			think(2.687);
		}
		web.button("{{obj.HCM_Delete_Passport_Information_0161.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(2.687);
		}
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Delete_Passport_Information_0161.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_Delete_Passport_Information_0161.Person_Management}}").click();
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Delete_Passport_Information_0161.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Delete_Passport_Information_0161.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Name}}").click();
		//web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Name}}").clearText();
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Delete_Passport_Information_0161.Name}}").pressTab();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.NID_Input}}").click();
		//web.textBox("{{obj.HCM_Delete_Passport_Information_0161.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_Delete_Passport_Information_0161.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Delete_Passport_Information_0161.SearchButton}}").click();
		{
			think(2.214);
		}
		//Call the action method to do the validation
		
		actions();
		
		web.link("{{obj.HCM_Delete_Passport_Information_0161.Documents}}").click();
		{
			think(1.321);
		}
		
		web.window("{{obj.HCM_Delete_Passport_Information_0161.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_Delete_Passport_Information_0161.web_window}}").close();		

	}
}