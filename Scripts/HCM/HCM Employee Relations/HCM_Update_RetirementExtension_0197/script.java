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
	retirementExtension_Date,countryName,addressLine_1,addressLine_2,pOBox,city,postalCode,employmentStatus,businessUnit_Input,projectedEndDate,peopleGroup,nID_Country_Input,national_ID,
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
		web.link("{{obj.HCM_Update_RetirementExtension_0197.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Update_RetirementExtension_0197.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Update_RetirementExtension_0197.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Update_RetirementExtension_0197.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Update_RetirementExtension_0197.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		actions();
		
		//Perform Retirement Extension
		RetirementExtension_Update();	
		
		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Update_RetirementExtension_0197.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
		effective_Start_Date=(String) datatable.getValue("DataSheet", 0, "Effective_Start_Date");		
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");			
		retirementExtension_Date=(String) datatable.getValue("DataSheet", 0, "RetirementExtension_Date");
		national_ID=(String) datatable.getValue("DataSheet", 0, "National_ID");
		
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").navigate(url);
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").maximize();
		//web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").navigate(url);
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.UID}}").pressTab();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Update_RetirementExtension_0197.Sign_In}}").click();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Update_RetirementExtension_0197.Home}}").click();
				
		web.link("{{obj.HCM_Update_RetirementExtension_0197.Person_Management}}").click();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Name}}").click();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.NID_Input}}").click();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Update_RetirementExtension_0197.SearchButton}}").click();
		{
			think(2.214);
		}
	
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Update_RetirementExtension_0197.Action_Icon}}").click();
		{
			think(2.237);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.Personal_and_Employment}}").click();
		{
			think(2.088);
		}
		web.element(40, "{{obj.HCM_Update_RetirementExtension_0197.Employment}}").click();
		web.window(41, "{{obj.HCM_Update_RetirementExtension_0197.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_Update_RetirementExtension_0197.web_span_Edit}}").focus();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").capturePage();
	}
	public void RetirementExtension_Update()throws Exception {
		//Click on Edit
		web.link(127, "{{obj.HCM_Update_RetirementExtension_0197.Employement_Edit_Button}}").click();
		{
			think(1.122);
		}
		//Click on Update
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_td_Update_2}}").click();
		{
			think(1.013);
		}
		//Click on Effective start date
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}")	.click();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").setText(effective_Start_Date);
		{
			think(0.93);
		}
		
		//Select proper action value 
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(1.424);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_li_Assignment_Change}}").click();
		{
			think(2.44);
		}
		//Click on OK Button
		web.button("{{obj.HCM_Update_RetirementExtension_0197.Update_Employement_OK_Button}}").click();
		{
			think(4.091);
		}

		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.RetirementExtension_Date}}").click();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.RetirementExtension_Date}}").setText(retirementExtension_Date);
		{
			think(2.49);
		}

		//Click on Review Button
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_span_Review}}").click();
		{
			think(10.489);
		}
		//Click on Submit Button
		web.link("{{obj.HCM_Update_RetirementExtension_0197.web_a_Submit}}").click();
		{
			think(3.673);
		}
		//Click on Yes Button
		web.button("{{obj.HCM_Update_RetirementExtension_0197.web_button__FOpt1__FOr1_0__FONSr2_0__8}}").click();
		{
			think(17.171);
		}
		//Click on OK Button
		web.button("{{obj.HCM_Update_RetirementExtension_0197.web_button__FOpt1__FOr1_0__FONSr2_0__9}}").click();
		{
			think(2.603);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_html_1_1}}").click();
		{
			think(0.307);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_html_1_1}}").click();
		{
			think(1.154);
		}
		//Validate the newly entered Retirement Extension date
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_td_01_Jan_2049}}").focus();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").capturePage();   
	
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Update_RetirementExtension_0197.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_Update_RetirementExtension_0197.Person_Management}}").click();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Update_RetirementExtension_0197.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Update_RetirementExtension_0197.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Name}}").click();
		//web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Name}}").clearText();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Update_RetirementExtension_0197.Name}}").pressTab();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.NID_Input}}").click();
		//web.textBox("{{obj.HCM_Update_RetirementExtension_0197.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_Update_RetirementExtension_0197.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Update_RetirementExtension_0197.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Update_RetirementExtension_0197.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Update_RetirementExtension_0197.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Update_RetirementExtension_0197.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		web.window(640, "{{obj.HCM_Update_RetirementExtension_0197.web_window}}").close();		

	}
}