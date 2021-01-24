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
		web.link("{{obj.HCM_Update_Visa_Information_0165.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Update_Visa_Information_0165.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Update_Visa_Information_0165.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Update_Visa_Information_0165.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Update_Visa_Information_0165.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		actions();
		
		
		//Add New Emergency Contact
		editVisa();
			
		
		//submit Activity		
		submit();
		
		//Validate the changes
		validation(firstName,familyName, national_ID);
		//actions();
		

		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Update_Visa_Information_0165.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		
		passport_Number=(String) datatable.getValue("DataSheet", 0, "Passport_Number");
		passport_Authorize_Country=(String) datatable.getValue("DataSheet", 0, "Passport_Authorize_Country");		
		passport_IssueDate=(String) datatable.getValue("DataSheet", 0, "Passport_IssueDate");
		passport_ExpireDate=(String) datatable.getValue("DataSheet", 0, "Passport_ExpireDate");		
		
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").navigate(url);
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").maximize();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.UID}}").pressTab();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Update_Visa_Information_0165.Sign_In}}").click();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Update_Visa_Information_0165.Home}}").click();
				
		web.link("{{obj.HCM_Update_Visa_Information_0165.Person_Management}}").click();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Name}}").click();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.NID_Input}}").click();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Update_Visa_Information_0165.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Update_Visa_Information_0165.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Update_Visa_Information_0165.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Update_Visa_Information_0165.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Update_Visa_Information_0165.Action_Icon}}").click();
		{
			think(3.237);
		}
		web.element("{{obj.HCM_Update_Visa_Information_0165.Personal_and_Employment}}").click();
		{
			think(0.088);
		}
		web.element(40, "{{obj.HCM_Update_Visa_Information_0165.Person}}").click();
		web.window(41, "{{obj.HCM_Update_Visa_Information_0165.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_Update_Visa_Information_0165.web_span_Edit}}").focus();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").capturePage();
	}
	public void editVisa()throws Exception {
		//Clik on Contact tab
		web.link("{{obj.HCM_Update_Visa_Information_0165.Documents}}").click();
		{
			think(3.321);
		}
		//Click on Edit option from passport section
		web.element("{{obj.HCM_Update_Visa_Information_0165.Edit_2}}").click();
		{
			think(1.305);
		}
		web.element("{{obj.HCM_Update_Visa_Information_0165.Update_2}}").click();
		{
			think(2.377);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.web_input_text__Date}}").click();
		{
			think(0.074);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.web_button_OK}}").click();	
		{
			think(1.305);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_IssuingCountry}}").click();
		{
			think(0.558);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_type}}").click();
		{
			think(1.685);
		}
		web.element("{{obj.HCM_Update_Visa_Information_0165.web_li_Iqama}}").click();
		{
			think(1.788);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_Number}}").click();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_Number}}").setText(passport_Number);
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_IssueDate}}").click();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_IssueDate}}").setText(passport_IssueDate);
		{
			think(2.702);
		}
//		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_EntryDate}}").click();
//		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_EntryDate}}").setText("10-sep-2006");
//		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_EntryDate}}").click();
//		{
//			think(2.662);
//		}
		
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_ExpirationDate}}").click();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Visa_ExpirationDate}}").setText(passport_ExpireDate);
		{
			think(0.726);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.Button_OK}}").click();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").capturePage();
		{
			think(2.878);
		}		
	}
	public void submit() throws Exception{
		
		//Click on Submit
		web.element(50, "{{obj.HCM_Update_Visa_Information_0165.Submit_Button}}").click();
		{
			think(2.878);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.web_button__FOpt1__FOr1_0__FONSr2_0__4}}").click();
		{
			think(2.687);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(2.687);
		}
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Update_Visa_Information_0165.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_Update_Visa_Information_0165.Person_Management}}").click();
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Update_Visa_Information_0165.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Name}}").click();
		//web.textBox("{{obj.HCM_Update_Visa_Information_0165.Name}}").clearText();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Update_Visa_Information_0165.Name}}").pressTab();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.NID_Input}}").click();
		//web.textBox("{{obj.HCM_Update_Visa_Information_0165.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_Update_Visa_Information_0165.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Update_Visa_Information_0165.SearchButton}}").click();
		{
			think(2.214);
		}
		//Call the action method to do the validation
		
		actions();
		
		web.link("{{obj.HCM_Update_Visa_Information_0165.Documents}}").click();
		{
			think(1.321);
		}
		//Validate Secton
		web.element("{{obj.HCM_Update_Visa_Information_0165.web_span_Saudi_Arabia}}").click();
		web.element("{{obj.HCM_Update_Visa_Information_0165.web_span_Iqama}}").focus();
//		web.element("{{obj.HCM_Update_Visa_Information_0165.web_span_10_Sep_2000}}").focus();
//		web.element("{{obj.HCM_Update_Visa_Information_0165.web_span_100000000}}").focus();
		
		web.window("{{obj.HCM_Update_Visa_Information_0165.web_window}}").capturePage();
				
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Update_Visa_Information_0165.web_window}}").close();		

	}
}