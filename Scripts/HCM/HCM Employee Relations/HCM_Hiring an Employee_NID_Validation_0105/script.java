import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
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
	String url,uid,pwd,date,firstName,familyName,fatherName,grandFatherName,comments,hireDate,legalEmployer_SerchInput,legislationCode,
	dateOfBirth,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,businessUnit_Input,peopleGroup,nID_Country_Input,national_ID= null;
	String title =  "Contact Info - - Oracle Applications";
	//@FunctionLibrary("HCM_SequenceChecklist_Tasks_0093") lib.myCompany.myTeam.HCM_SequenceChecklist_Tasks_0093 hCM_SequenceChecklist_Tasks_0093;
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
			
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Hiring an Employee_NID_Validation_0105.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		hireDate=(String) datatable.getValue("DataSheet", 0, "HireDate");		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		fatherName=(String) datatable.getValue("DataSheet", 0, "FatherName");		
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
		businessUnit_Input = (String) datatable.getValue("DataSheet", 0, "BusinessUnit_Input");
		peopleGroup = (String) datatable.getValue("DataSheet", 0, "PeopleGroup");
		
		
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").maximize();
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").navigate(url);
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.UID}}").pressTab();
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Sign_In}}").click();
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.My Client Groups}}").click();
		{
			think(0.147);
		}
		}		
		//Click on New Person link	
		if(web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.New Person}}").exists(30, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.New Person}}").click();
		}
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(30, true);
		
		
		//Clik on Hire an Employee link
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire an Employee}}").click();
		{
			think(2.796);
		}
		
		//Provide Basic Details  hire date, 

		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire Date}}").click();
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire Date}}").setText(hireDate);
		{
			think(0.49);
		}
		//Provide Hire acton
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire Action}}").click();
		{
			think(0.077);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire}}").click();
		{
			think(0.98);
		}
		//Hire reason
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire Reason}}").click();
		{
			think(0.192);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Hire_to_fill_vacant_posit}}").click();
		{
			think(0.361);
		}
		//Legal Employer
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Legal Employer}}").click();
		{
			think(2.512);
		}
		//search Legal Employer and select
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.LegalEmployer_Search}}").click();
		{
			think(3.09);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.LegalEmployer_SerchInput}}").click();
		{
			think(0.79);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.LegalEmployer_SerchInput}}").setText(legalEmployer_SerchInput);
		{
			think(0.711);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.LegislationCode}}").click();
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.LegislationCode}}").setText(legislationCode);
		{
			think(0.77);
		}
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Legal Employer_Search}}").click();
		{
			think(3.348);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Select_LegalEmployer}}").click();
		{
			think(0.149);
		}
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.OK}}").click();
		{
			think(0.149);
		}
		
		
		 //Provide Personal Details
		 
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Title}}").click();
		{
			think(3.654);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Mr}}").click();
		{
			think(0.345);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.FirstName}}").click();
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.FirstName}}").setText(firstName);	
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.FatherName}}").setText(fatherName);		
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.GrandFatherName}}").setText(grandFatherName);		
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.FamilyName}}").setText(familyName);
		{
			think(0.39);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Gender}}").click();
		{
			think(0.986);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Male}}").click();
		{
			think(0.746);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.DateOfBirth}}").setText(dateOfBirth);
		{
			think(1.98);
		}
		
		//Add National Identifiers
		web.image("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Add_NID}}").click();
		{
			think(0.869);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID_CountryDropDown}}").click();
		{
			think(2.155);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID_Search}}").click();
		{
			think(3.547);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID_Country_Input}}").setText(nID_Country_Input);
		{
			think(0.801);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID_Country_Input}}").pressTab();
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID_Input_Search}}").click();
		{
			think(2.971);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.SelectResults}}").click();
		{
			think(1.444);
		}
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID_Dialog_OK}}").click();
		{
			think(2.787);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.National_ID_Type}}").click();
		{
			think(1.641);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Select_National_Identifier}}").click();
		{
			think(0.108);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.National_ID}}").setText(national_ID);
		
		{
			think(1.617);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_span_Next}}")	.click();
		if(web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Continue}}").exists(20, TimeUnit.SECONDS)){
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Continue}}").focus();
		info("Warning message shown as NID is previously allocate to other employee. Screenshot attached below.");
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").capturePage();
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Continue}}").click();		
		}
		
		//Provide Home Address
		 
		
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.CountryText}}").click();
		{
			think(0.896);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.CountryDropDown}}").click();
		{
			think(3.012);
		}		
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.CountrySearch}}").click();
		{
			think(2.012);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.CountryName}}").setText(countryName);
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Search}}").click();
				{
					think(2.215);
				}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.SelectResult}}").click();
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.SearchCountryNameOK}}").click();
				{
					think(2.393);
				}
		
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.AddressLine_1}}").setText(addressLine_1);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.AddressLine_2}}").setText(addressLine_2);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.POBox}}").setText(pOBox);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.City}}").setText(city);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.PostalCode}}").setText(postalCode);
		{
			think(0.343);
		}
	
		
		//AddressLine 1
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.AddressLine1_Label}}").focus();	
		{
			think(0.343);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.POBox_Lable}}").focus();
		//web.window(640, "{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").capturePage();
		//Capture the page -> New functionality added
		info("Capture the page below with New functionality added -> AddressLine_1 and POBox is not mandatory field Now");
		web.window(640, "{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").capturePage();
		
		//Clik on Next button
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Next}}").focus();
		info("Capture the page below with New functionality added -> AddressLine_1 and POBox is not mandatory field Now");
		web.window(640, "{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").capturePage();
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Next}}").click();
		{
			think(5.063);
		}
		//Provide Contract Details -> Employment Status

		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.EmploymentStatus}}").click();
		{
			think(0.972);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Single}}").click();
		{
			think(1.217);
		}
		//Provide Assignment-> Business Unit
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.BusinessUnit}}").click();
		{
			think(3.533);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.BusinessUnit_Search}}").click();
		{
			think(2.682);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.BusinessUnit_Input}}").setText(businessUnit_Input);
		{
			think(0.045);
		}
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.BusinessUnit_SearchButton}}").click();
		{
			think(1.939);
		}
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.SelectBusinessUnit_SearchResults}}").click();
		{
			think(0.797);
		}
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Click_OK}}").click();
		{
			think(3.966);
		}
		//peopleGroup details
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_input_text__FOpt1__FOr1_0__FONSr2_0__5}}").setText(peopleGroup);
		{
			think(2.567);
		}
		//Clik on Next button
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Next}}").click();
		{
			think(5.063);
		}
		//Clik on Next button
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Next}}").click();
		{
			think(5.063);
		}
		//Clik on Submit button
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Submit}}").click();
		{
			think(5.284);
		}
		//Click on Yes button
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.WarningDialog_YES}}").click();
		{
			think(5.547);
		}
		//Click on OK Button
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.ConfirmationDialog_OK}}").click();
		{
			think(5.547);
		}
		
		//Validation of the adding existing NID
		
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.BackButton}}").click();
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(null);
		
//		if(web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Home_Icon}}").exists(30, TimeUnit.SECONDS)){
//		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Home_Icon}}").click();
//		}
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(30, true);
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Person_Management}}").click();
		web.window("{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").waitForPage(30, true);
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Person_Name}}").click();
		{
			think(2.611);
		}
		web.textBox("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Person_Name}}").setText(firstName+" "+fatherName+" "+grandFatherName+" "+familyName);
		{
			think(1.26);
		}
		web.button("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Person_Search}}").click();
		{
			think(2.463);
		}
		web.link("{{obj.HCM_Hiring an Employee_NID_Validation_0105.Result_PersonName}}").focus();
		web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID}}").focus();
		String resultsNID = web.element("{{obj.HCM_Hiring an Employee_NID_Validation_0105.NID}}").getDisplayText();
		if(resultsNID.equalsIgnoreCase(national_ID)){
			info("Both NID matched, hence test case pass. Nid is - > "+resultsNID);
		}
				
		web.window(640, "{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").capturePage();
		{
			think(1.0);
		}
		
	}
	
	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Hiring an Employee_NID_Validation_0105.web_window}}").close();

		

	}
}