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
			
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Create a Pending Worker_0134.xlsx", true);
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
		
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").navigate(url);
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").maximize();
		//web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").navigate(url);
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.UID}}").pressTab();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Create a Pending Worker_0134.Sign_In}}").click();
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Create a Pending Worker_0134.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Create a Pending Worker_0134.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Create a Pending Worker_0134.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Create a Pending Worker_0134.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Create a Pending Worker_0134.My Client Groups}}").click();
		{
			think(3.147);
		}
		}	
		
		//Click on New Person link	
		
		if(web.link("{{obj.HCM_Create a Pending Worker_0134.New Person}}").exists(30, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Create a Pending Worker_0134.New Person}}").dblClick();
		}
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(30, true);
		{
			think(3.796);
		}
		
		//Clik on "Adding a Contingent Worker" link
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").focus();
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").click();
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").pressTab();
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").pressTab();
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").pressTab();
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").pressTab();
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Add_a_Pending_Worker}}").pressEnter();
		{
			think(3.334);
		}
		
		// Provide Basic Details
		basicDetails(proposedStartDate);		
		
		//Provide Personal Details
		personalDetails(firstName,familyName,dateOfBirth);		 
	
		//Validate NID Details
		NID(national_ID);
		
		//Click Next
		next();
		continueClick();
		
		//Provide Address of the worker
		address(countryName,addressLine_1,addressLine_2,pOBox,city,postalCode);
		
		//Click Next
		next();
		continueClick();

		//Click Next
		next();		

		//Provide Contract Details
		contractDetails(employmentStatus);
		
		//Provide Assignment details
		assignmentDetails(businessUnit_Input,projectedEndDate);
		
		//Provide Job details
		job(peopleGroup);
		
		//Provide Probation Period
		Probation_Notice_Period(probationPeriod,noticePeriod);
		
		//Next
		next();
		
		//Next
		next();
		
		//Submit 
		web.element("{{obj.HCM_Create a Pending Worker_0134.Submit}}").click();
		{
			think(4.097);
		}
		web.button("{{obj.HCM_Create a Pending Worker_0134.WarningDialog_Yes}}").click();
		{
			think(11.961);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.Confirmation_OK}}").click();
		
		
		//Validation of Contingent Worker creation
		validation(firstName,familyName, national_ID);
		

		
	}
	public void basicDetails(String proposedStartDate) throws Exception{
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Proposed Start Date}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Proposed Start Date}}").setText(proposedStartDate);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Action}}").click();
		web.element("{{obj.HCM_Create a Pending Worker_0134.Add_Pending_Worker}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Action Reason}}").click();
		web.element("{{obj.HCM_Create a Pending Worker_0134.Future_hire_to_fill_vacan}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Legal Employer}}").click();		
		web.link(1173, "{{obj.HCM_Create a Pending Worker_0134.web_a_49}}").click();
		{
			think(3.607);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.Ma_aden_Legal_Employer}}").click();
		{
			think(1.94);
		}
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Proposed Worker Type}}").click();
		{
			think(1.871);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.web_li_Employee}}").click();
	}
	public void personalDetails(String firstName, String familyName,String dateOfBirth)throws Exception{
		
		web.link("{{obj.HCM_Create a Pending Worker_0134.Title}}").click();
		{
			think(0.798);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.Mr}}").click();
		{
			think(1.681);
		}
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.First Name}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.First Name}}").setText(firstName); 
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.First Name}}").pressTab();
		
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.FamilyName}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.FamilyName}}").setText(familyName);
		{
			think(1.615);
		}
		
//		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Middle Name}}").click();
//		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Middle Name}}").setText(middleName);
//		{
//			think(0.838);
//		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.Male}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.DOB}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.DOB}}").setText(dateOfBirth);
		{
			think(3.389);
		}
	}
	public void NID(String national_ID){
		try{
						
			web.image("{{obj.HCM_Create a Pending Worker_0134.NID_Add_Row}}").click();
			{
				think(2.694);
			}
			web.textBox("{{obj.HCM_Create a Pending Worker_0134.NID_Type}}").click();
			{
				think(1.721);
			}
			web.element("{{obj.HCM_Create a Pending Worker_0134.web_li_Civil_Identity_Number}}").click();
			{
				think(1.754);
			}
			web.textBox("{{obj.HCM_Create a Pending Worker_0134.NationalID}}").click();
			web.textBox("{{obj.HCM_Create a Pending Worker_0134.NationalID}}").setText(national_ID);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void next(){
		try {
			web.link("{{obj.HCM_Create a Pending Worker_0134.Next_Button}}").click();
			{
				think(4.049);
			}
					
			
		} catch (AbstractScriptException e) {			
			e.printStackTrace();
		}		
	}
	public void continueClick() throws Exception{
		if(web.button("{{obj.HCM_Create a Pending Worker_0134.web_button__FOpt1__FOr1_0__FONSr2_0_}}").exists(5, TimeUnit.SECONDS))
		{
			web.button("{{obj.HCM_Create a Pending Worker_0134.web_button__FOpt1__FOr1_0__FONSr2_0_}}").click();
			{
				think(1.049);
			}
		}	
		
	}
	public void address(String countryName, String addressLine_1,String addressLine_2,String pOBox,String city,String postalCode) throws Exception{
//		// Provide Home Address
		
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_Country}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_Country}}").setText(countryName);
		{
			think(2.098);
		}		
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_Line1}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_Line1}}").setText(addressLine_1);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_Line2}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_Line2}}").setText(addressLine_2);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_POBox}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_POBox}}").setText(pOBox);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_City}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_City}}").setText(city);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_PostalCode}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.HomeAddress_PostalCode}}").setText(postalCode);
		{
			think(1.049);
		}
		
	}
	public void contractDetails(String employmentStatus) throws Exception
	{
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Contract_Type}}").click();
		{
			think(1.747);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.web_li_Specified_contract}}").click();
		{
			think(0.747);
		}
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.ProjectedEndDate}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.ProjectedEndDate}}").setText(projectedEndDate);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.EmploymentStatus}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.EmploymentStatus}}").setText(employmentStatus);
		
	}
	public void assignmentDetails(String businessUnit_Input, String projectedEndDate)throws Exception{
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Business Unit}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Business Unit}}").setText(businessUnit_Input);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Business Unit}}").pressTab();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Person Type}}").click();
		{
			think(1.829);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.web_li_Contingent_Worker}}").click();
		{
			think(1.3);
		}
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Assignment Status}}").click();
		{
			think(1.41);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.web_li_Active___Payroll_Eligible}}").click();
		{
			think(1.767);
		}
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Projected End Date}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Projected End Date}}").setText(projectedEndDate);		
		
	}
	public void job(String peopleGroup){
		try {
			web.textBox("{{obj.HCM_Create a Pending Worker_0134.PeopleGroup}}").click();
			web.textBox("{{obj.HCM_Create a Pending Worker_0134.PeopleGroup}}").setText(peopleGroup);
		} catch (AbstractScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void Probation_Notice_Period(String probationPeriod,String noticePeriod)throws Exception{
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.ProbationPeriod}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.ProbationPeriod}}").setText(probationPeriod);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.ProbationPeriod_Time}}").click();
		{
			think(2.886);
		}
		web.element(15, "{{obj.HCM_Create a Pending Worker_0134.web_li_Days}}").click();

		//Provide Notice period
//		web.textBox("{{obj.HCM_Create a Pending Worker_0134.NoticePeriod}}").click();
//		web.textBox("{{obj.HCM_Create a Pending Worker_0134.NoticePeriod}}").setText(noticePeriod);
//		
//		web.textBox("{{obj.HCM_Create a Pending Worker_0134.NoticePeriod_Time}}").click();
//		{
//			think(2.886);
//		}
//		web.element(19, "{{obj.HCM_Create a Pending Worker_0134.web_li_Days}}").click();
		}
	public void validation(String firstName,String familyName,String national_ID){

		try {
		web.element("{{obj.HCM_Create a Pending Worker_0134.Home}}").click();
		
			web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(null);
		
		{
			think(1.562);
		}
		web.link("{{obj.HCM_Create a Pending Worker_0134.Person_Management}}").click();
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Name}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.NID_Input}}").click();
		web.textBox("{{obj.HCM_Create a Pending Worker_0134.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Create a Pending Worker_0134.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").capturePage();
		
		web.link("{{obj.HCM_Create a Pending Worker_0134.web_a_Syam_Bahadur}}").click();		
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").waitForPage(null);
		{
			think(6.887);
		}
		web.element("{{obj.HCM_Create a Pending Worker_0134.web_span_Contingent_worker_1}}").focus();
		{
			think(2.526);
		}		
		web.window("{{obj.HCM_Create a Pending Worker_0134.web_window}}").capturePage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Create a Pending Worker_0134.web_window}}").close();		

	}
}