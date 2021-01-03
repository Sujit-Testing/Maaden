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
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		actions();
		
		//Add New Emergency Contact
		edit_Correct_Contact();		
		
		
		//submit Activity		
		submit();
		
		//Validate the changes
		validation(firstName,familyName, national_ID);
		actions();
		
		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Edit_Update_EmergencyContact_0146.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		
		emergencyContact_FirstName=(String) datatable.getValue("DataSheet", 0, "EmergencyContact_FirstName");		
		emergencyContact_FamilyName=(String) datatable.getValue("DataSheet", 0, "EmergencyContact_FamilyName");
		
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");
		legalEmployer_SerchInput=(String) datatable.getValue("DataSheet", 0, "LegalEmployer_SerchInput");		
		legislationCode=(String) datatable.getValue("DataSheet", 0, "LegislationCode");
		dateOfBirth=(String) datatable.getValue("DataSheet", 0, "DateOfBirth");
		
		airTicketEligibility=(String) datatable.getValue("DataSheet", 0, "AirTicketEligibility");
		educationAllowanceEligibility=(String) datatable.getValue("DataSheet", 0, "EducationAllowanceEligibility");
		
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
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").navigate(url);
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").maximize();
		//web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").navigate(url);
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.UID}}").pressTab();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.Sign_In}}").click();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.Home}}").click();
				
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.Person_Management}}").click();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Name}}").click();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.NID_Input}}").click();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Edit_Update_EmergencyContact_0146.Action_Icon}}").click();
		{
			think(1.237);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.Personal_and_Employment}}").click();
		{
			think(0.088);
		}
		web.element(40, "{{obj.HCM_Edit_Update_EmergencyContact_0146.Person}}").click();
		web.window(41, "{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_Edit_Update_EmergencyContact_0146.web_span_Edit}}").focus();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").capturePage();
	}
	public void edit_Correct_Contact()throws Exception {
		//Clik on Contact tab
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.Contacts}}").click();
		{
			think(1.321);
		}
		//Click on Emergency_Contact
		web.image("{{obj.HCM_Edit_Update_EmergencyContact_0146.Emergency_Contact}}").click();
		{
			think(0.702);
		}
		//Click on Edit
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_span_Edit_2}}").click();
		{
			think(1.89);
		}
		//Click Edit->Update
		web.link(122, "{{obj.HCM_Edit_Update_EmergencyContact_0146.web_a_Edit}}").click();
		{
			think(1.407);
		}
		//Select Update
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_Update}}").click();
		{
			think(1.407);
		}
		//EffectiveDate
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Effective_Date}}").click();
		{
			think(1.853);
		}
		//Click on OK Button
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.Web_OK}}").click();

//		//Click on Create Button
//		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.Create}}").click();
		{
			think(1.801);
		}
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Contact Type}}").click();
		{
			think(2.241);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.Brother}}").click();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Emergency Contact}}").click();
		{
			think(1.278);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_li_No}}").click();
		//web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Effective_Start_Date}}").setText(effective_Start_Date);
		//web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Effective_Start_Date}}").pressTab();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Air Ticket Eligibility}}").setText(airTicketEligibility);
		
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Education Allowance Eligibility}}").setText(educationAllowanceEligibility);
		{
			think(1.609);
		}

//		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Personal_Info_Title}}").click();
//		{
//			think(2.894);
//		}
//		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.Mr.}}").click();
//		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Personal Info_FirstName}}").setText(emergencyContact_FirstName);
//		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Personal Info_LastName}}").setText(emergencyContact_FamilyName);
//		{
//			think(1.896);
//		}
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.Personal Info_OK_Button}}").click();	   
		
	}
	public void submit() throws Exception{
		//Click on Edit
//		web.element(92, "{{obj.HCM_Edit_Update_EmergencyContact_0146.web_span_Edit_1}}").click();
//		{
//			think(0.634);
//		}
//		//Click on Delete
//		web.element(94, "{{obj.HCM_Edit_Update_EmergencyContact_0146.web_td_Delete}}").click();
//		{
//			think(1.455);
//		}
//		//Click on OK(Pop Up)
//		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_button__FOpt1__FOr1_0__FONSr2_0__6}}").click();
//		{
//			think(0.455);
//		}		
		//Click on Submit
		web.element(50, "{{obj.HCM_Edit_Update_EmergencyContact_0146.Submit_Button}}").click();
		{
			think(2.878);
		}
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_button__FOpt1__FOr1_0__FONSr2_0__4}}").click();
		{
			think(2.687);
		}
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(2.687);
		}
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.Person_Management}}").click();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Name}}").click();
		//web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Name}}").clearText();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.Name}}").pressTab();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.NID_Input}}").click();
		//web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_Edit_Update_EmergencyContact_0146.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Edit_Update_EmergencyContact_0146.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_Edit_Update_EmergencyContact_0146.web_window}}").close();		

	}
}