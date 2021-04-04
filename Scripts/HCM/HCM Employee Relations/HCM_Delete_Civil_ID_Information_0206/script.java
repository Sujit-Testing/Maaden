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
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		//actions();
		
		
		//Terminate_Employee details
		Add_Civil_ID_Information();
		//Click on Person link
		
		validation(firstName, familyName, national_ID_Number);
		
		

		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Delete_Civil_ID_Information_0206.xlsx", true);
		
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
		
		
//		country_Name=(String) datatable.getValue("DataSheet", 0, "Country_Name");		
//		national_ID_Number=(String) datatable.getValue("DataSheet", 0, "National_ID_Number");			
//		issue_Date=(String) datatable.getValue("DataSheet", 0, "Issue_Date");
//		expiration_Date=(String) datatable.getValue("DataSheet", 0, "Expiration_Date");
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").maximize();
		//web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.Home}}").click();
				
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.Person_Management}}").click();
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Name}}").click();
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.NID_Input}}").click();
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.SearchButton}}").click();
		{
			think(2.214);
		}
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.web_a_Sujit_Swain}}").click();
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window_0_1}}").waitForPage(null);
		{
			think(2.444);
		}
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Delete_Civil_ID_Information_0206.Action_Icon}}").click();
		{
			think(2.237);
		}
		web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.Personal_and_Employment}}").click();
		{
			think(2.088);
		}
		web.element(40, "{{obj.HCM_Delete_Civil_ID_Information_0206.Employment}}").click();
		web.window(41, "{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").capturePage();
	}
	public void Add_Civil_ID_Information()throws Exception {
		//Click on Task Image
		web.image(147, "{{obj.HCM_Delete_Civil_ID_Information_0206.web_img_Tasks}}").click();
		{
			think(1.288);
		}
		//Click on Work Person
		
		web.link(174, "{{obj.HCM_Delete_Civil_ID_Information_0206.web_a_Person}}").click();
		{
			think(2.783);
		}
		//Click on Edit
		web.image(176, "{{obj.HCM_Delete_Civil_ID_Information_0206.web_img_Edit}}").click();
		{
			think(1.627);
		}
		web.image("{{obj.HCM_Delete_Civil_ID_Information_0206.Delete_Row}}").click();
		{
			think(1.566);
		}
		

		//Click on OK Button
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.web_button__FOpt1__FOr1_0__FONSr2_0__10}}").click();
		{
			think(4.161);
		}
		web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.web_div__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(3.813);
		}
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.Warning_Dialog_Yes}}").click();
		{
			think(5.183);
		}
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.ConfirmationDialog_OK}}").click();
		{
			think(4.996);
		}
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.web_button__FOpt1__FOr1_0__FONSr2_0__14}}").click();
		//web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window_0_3}}").waitForPage(null);
		{
			think(4.996);
		}
	
	}
	public void validation(String firstName,String familyName,String national_ID_Number)throws Exception{
		web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.Person_Management}}").click();
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Name}}").click();
		//web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Name}}").clearText();
		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.Name}}").pressTab();
		{
			think(0.444);
		}
//		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.NID_Input}}").click();
//		//web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.NID_Input}}").clearText();
//		web.textBox("{{obj.HCM_Delete_Civil_ID_Information_0206.NID_Input}}").setText(national_ID_Number);
//		{
//			think(0.546);
//		}
		web.button("{{obj.HCM_Delete_Civil_ID_Information_0206.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Delete_Civil_ID_Information_0206.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Delete_Civil_ID_Information_0206.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Delete_Civil_ID_Information_0206.web_window}}").close();		

	}
}