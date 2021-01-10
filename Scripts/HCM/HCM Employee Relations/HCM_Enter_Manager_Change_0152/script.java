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
	String url,uid,pwd,date,firstName,manager_FirstName,familyName,manager_FamilyName,middleName,grandFatherName,comments,effective_Start_Date,
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
		web.link("{{obj.HCM_Enter_Manager_Change_0152.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Enter_Manager_Change_0152.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Enter_Manager_Change_0152.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Status change of employee
		StatusChange();
		//Click on Manager Name
		
		
		
		//updateManagerName();
		
				
		//Validate the changes
		//validation(firstName,familyName, national_ID);
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Enter_Manager_Change_0152.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");		
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		
		manager_FirstName=(String) datatable.getValue("DataSheet", 0, "Manager_FirstName");		
		manager_FamilyName=(String) datatable.getValue("DataSheet", 0, "Manager_FamilyName");
		
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
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").navigate(url);
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").maximize();
		//web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").navigate(url);
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.UID}}").pressTab();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Enter_Manager_Change_0152.Sign_In}}").click();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Enter_Manager_Change_0152.Home}}").click();
				
		web.link("{{obj.HCM_Enter_Manager_Change_0152.Person_Management}}").click();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Name_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Name_Input}}").setText(firstName + " " + familyName);
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.NID_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Enter_Manager_Change_0152.SearchButton}}").click();
		{
			think(4.214);
		}

		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_Contingent_Worker}}").click();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.web_a_Syam_Bahadur}}").click();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").capturePage();
		{
			think(4.444);
		}		
	}
	public void StatusChange() throws Exception{
		web.element(163, "{{obj.HCM_Enter_Manager_Change_0152.Employment_Edit}}").click();
		{
			think(2.303);
		}
		web.element(164, "{{obj.HCM_Enter_Manager_Change_0152.Employment_Update}}").click();
		{
			think(2.303);
		}
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.UpdateEmployment_EffectiveStartDate}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.UpdateEmployment_EffectiveStartDate}}").setText(effective_Start_Date);
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.UpdateEmployment_Action}}").click();
		{
			think(2.303);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_li_Assignment_Change}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.UpdateEmployment_ActionReason}}").click();
		{
			think(0.443);
		}
		web.element(170, "{{obj.HCM_Enter_Manager_Change_0152.UpdateEmployment_PopUp_OK}}").click();
		{
			think(3.736);
		}
		//Update Manager name
		
		updateManagerName();
		
		//Click on Review button
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_Review}}").click();
		{
			think(8.404);
		}
		web.link(187, "{{obj.HCM_Enter_Manager_Change_0152.web_a_Submit}}").click();
		{
			think(4.118);
		}
		//Click Yes
		web.button("{{obj.HCM_Enter_Manager_Change_0152.web_button__FOpt1__FOr1_0__FONSr2_0__8}}").click();
		{
			think(13.896);
		}
		//Click OK
		web.button("{{obj.HCM_Enter_Manager_Change_0152.web_button__FOpt1__FOr1_0__FONSr2_0__9}}").click();
		{
			think(3.896);
		}
		
		//Validate the changes and take the screenshot
		//Vlidate Manager Name
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_label_af_inputComboboxListOfVal}}").focus();
		{
			think(0.06);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_Line_manager}}").focus();
		{
			think(0.056);
		}
		//Vlidate Manager Type
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_SUJIT_KUMAR_BARIK}}").focus();
		{
			think(0.056);
		}
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").capturePage();
	}
	public void updateManagerName() throws Exception{
		web.link(196, "{{obj.HCM_Enter_Manager_Change_0152.web_a_107}}").click();
		{
			think(3.349);
		}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.ManagerName_Search}}").click();
		{
			think(4.025);
		}
		web.button("{{obj.HCM_Enter_Manager_Change_0152.Reset_Button}}").click();
		{
			think(4.193);
		}
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Manager_Name}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Manager_Name}}").setText(manager_FirstName+" "+manager_FamilyName);
		{
			think(0.55);
		}
		//Search
		web.button("{{obj.HCM_Enter_Manager_Change_0152.web_button__FOpt1__FOr1_0__FONSr2_0__10}}").click();
		{
			think(2.698);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.SelectManagerName}}").click();
		{
			think(0.593);
		}
		web.button("{{obj.HCM_Enter_Manager_Change_0152.ManagerNameSearch_PopUp_OK}}").click();
		{
			think(2.698);
		}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.web_a_108}}").click();
		{
			think(1.198);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.Line_manager}}").click();
		{
			think(1.198);
		}
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").capturePage();
	}
	
	
	public void contact()throws Exception {
		//Clik on Contact tab
		web.link("{{obj.HCM_Enter_Manager_Change_0152.Contacts}}").click();
		{
			think(1.321);
		}
		//Click on Emergency_Contact
		web.image("{{obj.HCM_Enter_Manager_Change_0152.Emergency_Contact}}").click();
		{
			think(0.702);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.Delete_Button}}").click();
		{
			think(2.878);
		}
		//Click Yes Button
		web.button("{{obj.HCM_Enter_Manager_Change_0152.web_button__FOpt1__FOr1_0__FONSr2_0__6}}").click();
		
	}
	
	
	public void submit() throws Exception{
	
		//Click on Submit
		web.element(50, "{{obj.HCM_Enter_Manager_Change_0152.Submit_Button}}").click();
		{
			think(2.878);
		}
		web.button("{{obj.HCM_Enter_Manager_Change_0152.Reset}}").click();
		{
			think(2.687);
		}
		web.button("{{obj.HCM_Enter_Manager_Change_0152.web_button__FOpt1__FOr1_0__FONSr2_0__5}}").click();
		{
			think(2.687);
		}
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Enter_Manager_Change_0152.Home}}").click();
		{
			think(2.444);
		}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.My Client Groups}}").click();
		web.link("{{obj.HCM_Enter_Manager_Change_0152.Person_Management}}").click();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Name_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.Name_Input}}").setText(firstName + " " + familyName);
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.NID_Input}}").click();
		web.textBox("{{obj.HCM_Enter_Manager_Change_0152.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Enter_Manager_Change_0152.SearchButton}}").click();
		{
			think(4.214);
		}

		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_Contingent_Worker}}").click();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Enter_Manager_Change_0152.web_a_Syam_Bahadur}}").click();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").capturePage();
		{
			think(2.444);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_Trainee}}").focus();
		{
			think(0.139);
		}
		web.element("{{obj.HCM_Enter_Manager_Change_0152.web_span_Shift_Group}}").focus();
		{
			think(0.09);
		}
		web.element(195, "{{obj.HCM_Enter_Manager_Change_0152.web_span_41}}").focus();
		web.window("{{obj.HCM_Enter_Manager_Change_0152.web_window}}").capturePage();
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Enter_Manager_Change_0152.web_window}}").close();		

	}
}