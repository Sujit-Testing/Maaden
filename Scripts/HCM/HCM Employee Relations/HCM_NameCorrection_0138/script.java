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
	String url,uid,pwd,date,firstName,correctFirstName,familyName,correctFamilyName,middleName,grandFatherName,comments,proposedStartDate,legalEmployer_SerchInput,legislationCode,
	dateOfBirth,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
			
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_NameCorrection_0138.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		proposedStartDate=(String) datatable.getValue("DataSheet", 0, "PlacementDate");		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		
		correctFirstName=(String) datatable.getValue("DataSheet", 0, "CorrectFirstName");		
		correctFamilyName=(String) datatable.getValue("DataSheet", 0, "CorrectFamilyName");
		
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");
		legalEmployer_SerchInput=(String) datatable.getValue("DataSheet", 0, "LegalEmployer_SerchInput");		
		legislationCode=(String) datatable.getValue("DataSheet", 0, "LegislationCode");
		dateOfBirth=(String) datatable.getValue("DataSheet", 0, "DateOfBirth");	
		nID_Country_Input=(String) datatable.getValue("DataSheet", 0, "NID_Country_Input");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		countryName=(String) datatable.getValue("DataSheet", 0, "CountryName");
		addressLine_1=(String) datatable.getValue("DataSheet", 0, "AddressLine_1");		
		addressLine_2=(String) datatable.getValue("DataSheet", 0, "AddressLine_2");
		pOBox=(String) datatable.getValue("DataSheet", 0, "POBox");		
		city=(String) datatable.getValue("DataSheet", 0, "City");
		postalCode=(String) datatable.getValue("DataSheet", 0, "PostalCode");
		employmentStatus = (String) datatable.getValue("DataSheet", 0, "EmploymentStatus");
		businessUnit_Input = (String) datatable.getValue("DataSheet", 0, "BusinessUnit_Input");
		projectedEndDate = (String) datatable.getValue("DataSheet", 0, "ProjectedEndDate");
		peopleGroup = (String) datatable.getValue("DataSheet", 0, "PeopleGroup");
		countryCode=(String) datatable.getValue("DataSheet", 0, "CountryCode");
		areaCode = (String) datatable.getValue("DataSheet", 0, "AreaCode");
		phoneNumber = (String) datatable.getValue("DataSheet", 0, "PhoneNumber");
		email = (String) datatable.getValue("DataSheet", 0, "Email");
//		probationPeriod = (String) datatable.getValue("DataSheet", 0, "ProbationPeriod");
//		noticePeriod = (String) datatable.getValue("DataSheet", 0, "NoticePeriod");
		
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").navigate(url);
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").maximize();
		//web.window("{{obj.HCM_NameCorrection_0138.web_window}}").navigate(url);
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_NameCorrection_0138.UID}}").setText(uid);
		web.textBox("{{obj.HCM_NameCorrection_0138.UID}}").pressTab();
		web.textBox("{{obj.HCM_NameCorrection_0138.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_NameCorrection_0138.Sign_In}}").click();
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_NameCorrection_0138.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_NameCorrection_0138.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_NameCorrection_0138.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_NameCorrection_0138.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_NameCorrection_0138.My Client Groups}}").click();
		{
			think(3.147);
		}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		actions();
		
		
		//Edit Activity		
		edit(correctFirstName, correctFamilyName);
		
		//Validate the changes
		validation(firstName,familyName, national_ID);		
		
	}
	
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_NameCorrection_0138.Home}}").click();
				
		web.link("{{obj.HCM_NameCorrection_0138.Person_Management}}").click();
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_NameCorrection_0138.Name}}").click();
		web.textBox("{{obj.HCM_NameCorrection_0138.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_NameCorrection_0138.NID_Input}}").click();
		web.textBox("{{obj.HCM_NameCorrection_0138.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_NameCorrection_0138.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_NameCorrection_0138.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_NameCorrection_0138.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_NameCorrection_0138.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_NameCorrection_0138.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_NameCorrection_0138.Action_Icon}}").click();
		{
			think(1.237);
		}
		web.element("{{obj.HCM_NameCorrection_0138.Personal_and_Employment}}").click();
		{
			think(0.088);
		}
		web.element(40, "{{obj.HCM_NameCorrection_0138.Person}}").click();
		web.window(41, "{{obj.HCM_NameCorrection_0138.web_window_0_1}}").waitForPage(null);
		{
			think(4.411);
		}
	}
	public void edit(String correctFirstName, String correctFamilyName) throws Exception{
		web.link(43, "{{obj.HCM_NameCorrection_0138.Edit}}").click();
		{
			think(2.453);
		}
		web.element(44, "{{obj.HCM_NameCorrection_0138.web_td_Correct}}").click();
		{
			think(6.916);
		}
		web.textBox("{{obj.HCM_NameCorrection_0138.First_Name}}").click();
		web.textBox("{{obj.HCM_NameCorrection_0138.First_Name}}").setText(correctFirstName);
		web.textBox("{{obj.HCM_NameCorrection_0138.Family_Name}}").click();
		web.textBox("{{obj.HCM_NameCorrection_0138.Family_Name}}").setText(correctFamilyName);
		web.button("{{obj.HCM_NameCorrection_0138.OK_Button}}").click();
		{
			think(0.368);
		}
		web.element(50, "{{obj.HCM_NameCorrection_0138.Submit_Button}}").click();
		{
			think(4.878);
		}
		web.button("{{obj.HCM_NameCorrection_0138.web_button__FOpt1__FOr1_0__FONSr2_0__4}}").click();
		{
			think(4.687);
		}
		web.button("{{obj.HCM_NameCorrection_0138.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(2.687);
		}
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_NameCorrection_0138.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_NameCorrection_0138.Person_Management}}").click();
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_NameCorrection_0138.Name}}").click();
		web.textBox("{{obj.HCM_NameCorrection_0138.Name}}").setText(correctFirstName+" "+correctFamilyName);
		web.textBox("{{obj.HCM_NameCorrection_0138.NID_Input}}").click();
		web.textBox("{{obj.HCM_NameCorrection_0138.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_NameCorrection_0138.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_NameCorrection_0138.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_NameCorrection_0138.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_NameCorrection_0138.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_NameCorrection_0138.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_NameCorrection_0138.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_NameCorrection_0138.web_window}}").close();		

	}
}