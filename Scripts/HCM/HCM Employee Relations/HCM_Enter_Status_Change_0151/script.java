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
		web.link("{{obj.HCM_Enter_Status_Change_0151.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Enter_Status_Change_0151.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Enter_Status_Change_0151.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Enter_Status_Change_0151.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Enter_Status_Change_0151.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Status change of employee
		StatusChange();
				
		//Validate the changes
		validation(firstName,familyName, national_ID);
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Enter_Status_Change_0151.xlsx", true);
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
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").navigate(url);
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").maximize();
		//web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").navigate(url);
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.UID}}").pressTab();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Enter_Status_Change_0151.Sign_In}}").click();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Enter_Status_Change_0151.Home}}").click();
				
		web.link("{{obj.HCM_Enter_Status_Change_0151.Person_Management}}").click();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Name_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Name_Input}}").setText(firstName + " " + familyName);
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.NID_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Enter_Status_Change_0151.SearchButton}}").click();
		{
			think(4.214);
		}

		web.element("{{obj.HCM_Enter_Status_Change_0151.web_span_Contingent_Worker}}").click();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Enter_Status_Change_0151.web_a_Syam_Bahadur}}").click();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").capturePage();
		{
			think(4.444);
		}		
	}
	public void StatusChange() throws Exception{
		web.element(163, "{{obj.HCM_Enter_Status_Change_0151.Employment_Edit}}").click();
		{
			think(2.303);
		}
		web.element(164, "{{obj.HCM_Enter_Status_Change_0151.Employment_Update}}").click();
		{
			think(2.303);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.UpdateEmployment_EffectiveStartDate}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.UpdateEmployment_EffectiveStartDate}}").setText(effective_Start_Date);
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.UpdateEmployment_Action}}").click();
		{
			think(2.303);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_li_Assignment_Change}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.UpdateEmployment_ActionReason}}").click();
		{
			think(0.443);
		}
		web.element(170, "{{obj.HCM_Enter_Status_Change_0151.UpdateEmployment_PopUp_OK}}").click();
		{
			think(1.736);
		}
//		web.element(171, "{{obj.HCM_Enter_Status_Change_0151.web_html_1_1}}").click();
//		{
//			think(12.474);
//		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Update_JOB}}").click();
		{
			think(0.3);
		}
		web.link(173, "{{obj.HCM_Enter_Status_Change_0151.web_a_77}}").click();
		{
			think(2.567);
		}
		web.link(174, "{{obj.HCM_Enter_Status_Change_0151.web_a_Search____1}}").click();
		{
			think(2.824);
		}
		web.button("{{obj.HCM_Enter_Status_Change_0151.Reset}}").click();
		{
			think(1.813);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.SearchAndSelect_JobName}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.SearchAndSelect_JobName}}").setText(legalEmployer_SerchInput);
		{
			think(0.627);
		}
		//Click on Search
		web.button("{{obj.HCM_Enter_Status_Change_0151.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(3.855);
		}
		web.element(179, "{{obj.HCM_Enter_Status_Change_0151.web_td_Trainee}}").click();
		{
			think(1.724);
		}
		//Click on OK
		web.button("{{obj.HCM_Enter_Status_Change_0151.web_button__FOpt1__FOr1_0__FONSr2_0__7}}").click();
		{
			think(1.855);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Assignment Category}}").click();
		{
			think(2.0);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_li_Shift_Group}}").click();
		{
			think(2.0);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Working Hours}}").click();
		{
			think(2.0);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Working Hours}}").setText("41");
		{
			think(2.0);
		}
		web.element(185, "{{obj.HCM_Enter_Status_Change_0151.web_html_1_1}}").click();
		{
			think(0.235);
		}
		//Click on Review button
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_span_Review}}").click();
		{
			think(8.404);
		}
		web.link(187, "{{obj.HCM_Enter_Status_Change_0151.web_a_Submit}}").click();
		{
			think(4.118);
		}
		//Click Yes
		web.button("{{obj.HCM_Enter_Status_Change_0151.web_button__FOpt1__FOr1_0__FONSr2_0__8}}").click();
		{
			think(13.896);
		}
		//Click OK
		web.button("{{obj.HCM_Enter_Status_Change_0151.web_button__FOpt1__FOr1_0__FONSr2_0__9}}").click();
		{
			think(3.896);
		}
	}
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Enter_Status_Change_0151.Action_Icon}}").click();
		{
			think(1.237);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.Personal_and_Employment}}").click();
		{
			think(0.088);
		}
		web.element(40, "{{obj.HCM_Enter_Status_Change_0151.Person}}").click();
		web.window(41, "{{obj.HCM_Enter_Status_Change_0151.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_Enter_Status_Change_0151.web_span_Edit}}").focus();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").capturePage();
	}
	public void contact()throws Exception {
		//Clik on Contact tab
		web.link("{{obj.HCM_Enter_Status_Change_0151.Contacts}}").click();
		{
			think(1.321);
		}
		//Click on Emergency_Contact
		web.image("{{obj.HCM_Enter_Status_Change_0151.Emergency_Contact}}").click();
		{
			think(0.702);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.Delete_Button}}").click();
		{
			think(2.878);
		}
		//Click Yes Button
		web.button("{{obj.HCM_Enter_Status_Change_0151.web_button__FOpt1__FOr1_0__FONSr2_0__6}}").click();
		
	}
	public void CreateContactFromExistingPerson()throws Exception {
		//Provide contact details
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson_ContactType}}").click();
		{
			think(1.4);
		}
		//Emergency Contact	
		web.element("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson__Emergency}}").click();
		{
			think(1.472);
		}
		
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(1.251);
		}
		//Click Yes
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_li_Yes}}").click();
		{
			think(0.804);
		}
		//Effective Start Date
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson_EffectiveStartDate}}").click();
		web.link("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson_EducationAllowanceElligibility}}").click();
		{
			think(0.485);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_td_Child_2}}").click();
		{
			think(0.135);
		}
		web.link("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson_AitTicketElligibility}}").click();
		{
			think(1.743);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_td_Child_2}}").click();
		{
			think(3.492);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.web_input_text__FOpt1__FOr1_0__FONSr2_0__6}}").click();
		{
			think(1.65);
		}
		web.link("{{obj.HCM_Enter_Status_Change_0151.web_a_78}}").click();
		{
			think(2.33);
		}
		//Search the emergency name to be added 
		web.link("{{obj.HCM_Enter_Status_Change_0151.web_a_Search___}}").click();
		{
			think(2.783);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Name_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Name_Input}}").setText(emergencyContact_FirstName+" "+emergencyContact_FamilyName);
		{
			think(0.235);
		}
		web.button("{{obj.HCM_Enter_Status_Change_0151.Search_NameDetails}}").click();
		{
			think(1.465);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.SelectName}}").click();
		{
			think(3.251);
		}
		//Clikc OK Buton
		web.button("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson_Dialog_OK}}").click();
		{
			think(2.866);
		}
		//Clikc OK Buton
		web.button("{{obj.HCM_Enter_Status_Change_0151.CreateContactFromExistingPerson_Dialog_OKButton}}").click();
		
	}
	
	public void submit() throws Exception{
	
		//Click on Submit
		web.element(50, "{{obj.HCM_Enter_Status_Change_0151.Submit_Button}}").click();
		{
			think(2.878);
		}
		web.button("{{obj.HCM_Enter_Status_Change_0151.Reset}}").click();
		{
			think(2.687);
		}
		web.button("{{obj.HCM_Enter_Status_Change_0151.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(2.687);
		}
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Enter_Status_Change_0151.Home}}").click();
		{
			think(2.444);
		}
		web.link("{{obj.HCM_Enter_Status_Change_0151.My Client Groups}}").click();
		web.link("{{obj.HCM_Enter_Status_Change_0151.Person_Management}}").click();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Name_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.Name_Input}}").setText(firstName + " " + familyName);
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.NID_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Status_Change_0151.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Enter_Status_Change_0151.SearchButton}}").click();
		{
			think(4.214);
		}

		web.element("{{obj.HCM_Enter_Status_Change_0151.web_span_Contingent_Worker}}").click();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Enter_Status_Change_0151.web_a_Syam_Bahadur}}").click();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").capturePage();
		{
			think(2.444);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_span_Trainee}}").focus();
		{
			think(0.139);
		}
		web.element("{{obj.HCM_Enter_Status_Change_0151.web_span_Shift_Group}}").focus();
		{
			think(0.09);
		}
		web.element(195, "{{obj.HCM_Enter_Status_Change_0151.web_span_41}}").focus();
		web.window("{{obj.HCM_Enter_Status_Change_0151.web_window}}").capturePage();
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Enter_Status_Change_0151.web_window}}").close();		

	}
}