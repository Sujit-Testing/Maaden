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
	String url,uid,pwd,date,firstName,familyName,middleName,grandFatherName,comments,proposedStartDate,legalEmployer_SerchInput,legislationCode,
	dateOfBirth,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
			
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Converting a Pending Worker to Employee_0136.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		proposedStartDate=(String) datatable.getValue("DataSheet", 0, "PlacementDate");		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
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
		probationPeriod = (String) datatable.getValue("DataSheet", 0, "ProbationPeriod");
		noticePeriod = (String) datatable.getValue("DataSheet", 0, "NoticePeriod");
		
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").navigate(url);
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").maximize();
		//web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").navigate(url);
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.UID}}").pressTab();
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Converting a Pending Worker to Employee_0136.Sign_In}}").click();
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.My Client Groups}}").click();
		{
			think(3.147);
		}
		}	
		//Validation of Contingent Worker creation
//		validation(firstName,familyName, national_ID);
//		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.Home}}").click();
		
		
		//Click on New Person link	
		
		if(web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.New Person}}").exists(30, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.New Person}}").dblClick();
		}
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(30, true);
		{
			think(3.796);
		}
		//Click on Pending_Workers
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_a_Pending_Workers}}").click();

		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.SearchBox}}").click();
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.SearchBox}}").setText(firstName+" "+familyName);
		{
			think(0.053);
		}
		web.image("{{obj.HCM_Converting a Pending Worker to Employee_0136.Search}}").click();
		{
			think(3.316);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.CheckBox}}").click();
		{
			think(1.00);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_span_Actions}}").click();
	
		{
			think(2.00);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.Quick_Convert}}").click();
		{
			think(2.000);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_span_The_selected_pending_work}}").focus();
		{
			think(1.912);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.OK}}").click();
		{
			think(2.048);
		}
		
		//Validation of Contingent Worker creation
		
		validation(firstName,familyName, national_ID);
		
		
		
//		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.Pending Workers_Action}}").click();
//		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window_0_1}}").waitForPage(null);
		
		
		
	}
	
	public void validation(String firstName,String familyName,String national_ID){

		try {
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.Home}}").click();
		
			web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(null);
		
		{
			think(1.562);
		}
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.Person_Management}}").click();
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.Name}}").click();
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.NID_Input}}").click();
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Converting a Pending Worker to Employee_0136.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").capturePage();
		
//		web.link("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_a_Syam_Bahadur}}").click();		
//		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(null);
//		{
//			think(6.887);
//		}
//		web.element("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_span_Contingent_worker_1}}").focus();
//		{
//			think(2.526);
//		}		
//		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").capturePage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").close();		

	}
}