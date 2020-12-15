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
	public void run() throws Exception {
		//Data Table	
		dataTable();
		//LogIn method
		logIn(url,uid,pwd);
		
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
		{
			think(3.796);
		}
		String title = web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").getTitle();
		{
			think(3.796);
		}
		info(title); //Pending Workers		
		String page[] = title.split(" ");
		String pageTitle = (String) (page[0]+" "+page[1]);
		info("pageTitle is -> "+pageTitle);
		if(pageTitle.equalsIgnoreCase("Pending Workers")){
			info("Test Case Pass, as title is matched. ");
		}else fail("Test Case fail, as title is not matched.");


		
	}
	public void logIn(String url, String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").navigate(url);
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").maximize();
		//web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").navigate(url);
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.UID}}").pressTab();
		web.textBox("{{obj.HCM_Converting a Pending Worker to Employee_0136.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Converting a Pending Worker to Employee_0136.Sign_In}}").click();
		web.window("{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").waitForPage(150, true);
		
	}	
	public void dataTable() throws Exception{
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
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Converting a Pending Worker to Employee_0136.web_window}}").close();		

	}
}