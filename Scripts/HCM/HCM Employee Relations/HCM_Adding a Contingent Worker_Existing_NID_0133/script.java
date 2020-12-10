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
	String url,uid,pwd,date,firstName,familyName,middleName,grandFatherName,comments,placementDate,legalEmployer_SerchInput,legislationCode,
	dateOfBirth,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
			
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Adding a Contingent Worker_Existing_NID_0133.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		placementDate=(String) datatable.getValue("DataSheet", 0, "PlacementDate");		
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
		
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").navigate(url);
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").maximize();
		//web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").navigate(url);
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.UID}}").pressTab();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Sign_In}}").click();
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.My Client Groups}}").click();
		{
			think(3.147);
		}
		}	
		
		//Click on New Person link	

		
		if(web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.New Person}}").exists(30, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.New Person}}").dblClick();
		}
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(30, true);
		{
			think(3.796);
		}
		
		//Clik on "Adding a Contingent Worker" link
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Add a Contingent Worker}}").focus();
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Add a Contingent Worker}}").dblClick();
		{
			think(5.796);
		}
		
		
		//Add Basic Details
		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Placement Date}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Placement Date}}").setText(placementDate);
		{
			think(0.916);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Placement Action}}").click();
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Add_Contingent_Worker}}").click();
		{
			think(0.258);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Placement Reason}}").click();
		{
			think(0.204);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Placement_to_fill_vacant}}").click();
		{
			think(0.178);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Legal Employer}}").click();
		{
			think(1.757);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Ma_aden_Legal_Employer}}").click();
		{
			think(1.757);
		}
		
		 
		
		//Provide Personal Details
		 
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Title}}").click();
		{
			think(0.798);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Mr}}").click();
		{
			think(1.681);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.First Name}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.First Name}}").setText(firstName); 
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.First Name}}").pressTab();
		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.FamilyName}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.FamilyName}}").setText(familyName);
		{
			think(1.615);
		}
		
//		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Middle Name}}").click();
//		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Middle Name}}").setText(middleName);
//		{
//			think(0.838);
//		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Male}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Gender}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Gender}}").setText(dateOfBirth);
		{
			think(3.389);
		}
		
		
		
		
		//Provide 	NID Details		
		
		//Validate NID Details
		NID(national_ID);
	
		
		//Click Next

		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Next_Button}}").click();
		if(web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_button__FOpt1__FOr1_0__FONSr2_0_}}").exists(30, TimeUnit.SECONDS))
		{
			web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_button__FOpt1__FOr1_0__FONSr2_0_}}").click();
		}
		{
			think(1.049);
		}
		
		// Provide Home Address
		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_Country}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_Country}}").setText(countryName);
		{
			think(2.098);
		}		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_Line1}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_Line1}}").setText(addressLine_1);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_Line2}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_Line2}}").setText(addressLine_2);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_POBox}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_POBox}}").setText(pOBox);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_City}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_City}}").setText(city);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_PostalCode}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.HomeAddress_PostalCode}}").setText(postalCode);
		{
			think(1.049);
		}
		
		//Click Next

		next();
		
		//Work Relationship Details
		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Hijri Hire Date}}").setText("10-10-2009");
		{
			think(1.235);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Notice Perod Recovery}}").click();
		{
			think(1.301);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Select Notice Period Recovery}}").click();

		//Provide Contract Details
		contractDetails(employmentStatus);
		
		//Provide Assignment details
		assignmentDetails(businessUnit_Input,projectedEndDate);
		
		//Provide Job details
		job(peopleGroup);
		
		//Next
		next();
		//Next
		next();
		//Submit 
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Submit}}").click();
		{
			think(4.097);
		}
		web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.WarningDialog_Yes}}").click();
		{
			think(11.961);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Confirmation_OK}}").click();
		
		
		//Validation of Contingent Worker creation
		validation(firstName,familyName, national_ID);
		
	
	}
	public void contractDetails(String employmentStatus) throws Exception
	{
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Contract_Type}}").click();
		{
			think(1.391);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_li_Specified_contract}}").click();
		{
			think(2.562);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.EmploymentStatus}}").setText(employmentStatus);
	}
	public void assignmentDetails(String businessUnit_Input, String projectedEndDate)throws Exception{
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Business Unit}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Business Unit}}").setText(businessUnit_Input);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Business Unit}}").pressTab();
		{
			think(1.899);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Person Type}}").click();
		{
			think(1.829);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_li_Contingent_Worker}}").click();
		{
			think(1.3);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Assignment Status}}").click();
		{
			think(1.41);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_li_Active___Payroll_Eligible}}").click();
		{
			think(1.767);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Projected End Date}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Projected End Date}}").setText(projectedEndDate);		
		
	}
	public void job(String peopleGroup){
		try {
			web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.PeopleGroup}}").click();
			web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.PeopleGroup}}").setText(peopleGroup);
		} catch (AbstractScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void next(){
		try {
			web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Next_Button}}").click();
			{
				think(4.049);
			}
			if(web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_button__FOpt1__FOr1_0__FONSr2_0_}}").exists(30, TimeUnit.SECONDS))
			{
				web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_button__FOpt1__FOr1_0__FONSr2_0_}}").click();
				{
					think(4.049);
				}
			}			
			
		} catch (AbstractScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void validation(String firstName,String familyName,String national_ID){

		try {
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Home}}").click();
		
			web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(null);
		
		{
			think(1.562);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Person_Management}}").click();
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Name}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.NID_Input}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").capturePage();
		
		web.link("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_a_Syam_Bahadur}}").click();		
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").waitForPage(null);
		{
			think(6.887);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_span_Contingent_worker_1}}").focus();
		{
			think(2.526);
		}		
		web.window("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").capturePage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void NID(String national_ID){
		try{
						
			web.image("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.NID_Add_Row}}").click();
			{
				think(5.694);
			}
			web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.NID_Type}}").click();
			{
				think(3.721);
			}
			web.element("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_li_Civil_Identity_Number}}").click();
			{
				think(1.754);
			}
			web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Number}}").click();
			web.textBox("{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.Number}}").setText(national_ID);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Adding a Contingent Worker_Existing_NID_0133.web_window}}").close();		

	}
}