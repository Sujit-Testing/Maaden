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
	String url,uid,pwd,date,firstName,familyName,middleName,grandFatherName,comments,placementDate,legalEmployer_SerchInput,legislationCode,
	dateOfBirth,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,businessUnit_Input,peopleGroup,nID_Country_Input,national_ID,
	countryCode,areaCode,phoneNumber,email= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
			
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Adding a Contingent Worker_0132.xlsx", true);
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
		businessUnit_Input = (String) datatable.getValue("DataSheet", 0, "BusinessUnit_Input");
		peopleGroup = (String) datatable.getValue("DataSheet", 0, "PeopleGroup");
		countryCode=(String) datatable.getValue("DataSheet", 0, "CountryCode");
		areaCode = (String) datatable.getValue("DataSheet", 0, "AreaCode");
		phoneNumber = (String) datatable.getValue("DataSheet", 0, "PhoneNumber");
		email = (String) datatable.getValue("DataSheet", 0, "Email");
		
		
		web.window("{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").maximize();
		web.window("{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").navigate(url);
		web.window("{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.UID}}").pressTab();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Adding a Contingent Worker_0132.Sign_In}}").click();
		web.window("{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Adding a Contingent Worker_0132.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Adding a Contingent Worker_0132.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.My Client Groups}}").click();
		{
			think(3.147);
		}
		}	
		
		//Click on New Person link	

		
		if(web.link("{{obj.HCM_Adding a Contingent Worker_0132.New Person}}").exists(30, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.New Person}}").dblClick();
		}
		web.window("{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").waitForPage(30, true);
		{
			think(3.796);
		}
		
		//Clik on "Adding a Contingent Worker" link
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.Add a Contingent Worker}}").focus();
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.Add a Contingent Worker}}").dblClick();
		{
			think(5.796);
		}
		
		
		//Add Basic Details
		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Placement Date}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Placement Date}}").setText(placementDate);
		{
			think(0.916);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Placement Action}}").click();
		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Add_Contingent_Worker}}").click();
		{
			think(0.258);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.Placement Reason}}").click();
		{
			think(0.204);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Placement_to_fill_vacant}}").click();
		{
			think(0.178);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.Legal Employer}}").click();
		{
			think(1.757);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Ma_aden_Legal_Employer}}").click();
		{
			think(1.757);
		}
		
		 
		
		//Provide Personal Details
		 
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.Title}}").click();
		{
			think(0.798);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Mr}}").click();
		{
			think(1.681);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.First Name}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.First Name}}").setText(firstName);
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.First Name}}").pressTab();
		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.FamilyName}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.FamilyName}}").setText(familyName);
		{
			think(1.615);
		}
		
//		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Middle Name}}").click();
//		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Middle Name}}").setText(middleName);
//		{
//			think(0.838);
//		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Gender}}").click();
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.Gender}}").setText(dateOfBirth);
		{
			think(1.389);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Male}}").click();
		
		
		
		//Provide 	NID Details		
		
		
		web.image("{{obj.HCM_Adding a Contingent Worker_0132.NID_Add}}").click();
		{
			think(1.684);
		}
		//Search Country
//		web.link("{{obj.HCM_Adding a Contingent Worker_0132.NID_Country_DropDown}}").click();
//		{
//			think(0.079);
//		}
//		web.link("{{obj.HCM_Adding a Contingent Worker_0132.NID_Country_Search}}").click();
//		{
//			think(1.614);
//		}
//		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.NID_Country_Input}}").click();
//		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.NID_Country_Input}}").setText(nID_Country_Input);
//		{
//			think(0.167);
//		}
//		web.button("{{obj.HCM_Adding a Contingent Worker_0132.NID_Country_Input_Search}}").click();
//		{
//			think(1.0);
//		}
//		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Select_Country}}").click();
//		{
//			think(0.214);
//		}
//		web.button("{{obj.HCM_Adding a Contingent Worker_0132.NID_Country_PopUp_OK}}").click();
		{
			think(2.532);
		}
		web.link("{{obj.HCM_Adding a Contingent Worker_0132.NID_Type_DropDown}}").click();
		{
			think(3.427);
		}
		web.element("{{obj.HCM_Adding a Contingent Worker_0132.Select_Civil_Identity_Number}}").click();
		{
			think(3.033);
		}
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.NID_Number}}").click();		
		web.textBox("{{obj.HCM_Adding a Contingent Worker_0132.NID_Number}}").setText(national_ID);
		{
			think(1.049);
		}
	
		//Click Next

		web.link("{{obj.HCM_Adding a Contingent Worker_0132.Next_Button}}").click();
		web.button("{{obj.HCM_Adding a Contingent Worker_0132.web_button__FOpt1__FOr1_0__FONSr2_0_}}").click();
		
		
		
	
		
	}
	
	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_Adding a Contingent Worker_0132.web_window}}").close();		

	}
}