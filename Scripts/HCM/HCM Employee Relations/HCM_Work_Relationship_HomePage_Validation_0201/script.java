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
		web.link("{{obj.HCM_Terminate_An_Employee_0199.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_Terminate_An_Employee_0199.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_Terminate_An_Employee_0199.My Client Groups}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_Terminate_An_Employee_0199.My Client Groups}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_Terminate_An_Employee_0199.My Client Groups}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		SearchEmployee(firstName,familyName, national_ID);
		
		//Perform action activity
		actions();
		
		
		//Terminate_Employee details
		Terminate_Employee();	
		
		
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_Terminate_An_Employee_0199.xlsx", true);
		
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
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").navigate(url);
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").maximize();
		//web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").navigate(url);
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.UID}}").pressTab();
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Terminate_An_Employee_0199.Sign_In}}").click();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(150, true);
		
	}
	public void SearchEmployee(String firstName,String familyName,String national_ID)throws Exception{
		//web.element("{{obj.HCM_Terminate_An_Employee_0199.Home}}").click();
				
		web.link("{{obj.HCM_Terminate_An_Employee_0199.Person_Management}}").click();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(null);
		{
			think(2.444);
		}
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Name}}").click();
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Name}}").setText(firstName+" "+familyName);
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.NID_Input}}").click();
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Terminate_An_Employee_0199.SearchButton}}").click();
		{
			think(2.214);
		}
	
	}
	
	public void actions() throws Exception{
		web.image(37, "{{obj.HCM_Terminate_An_Employee_0199.Action_Icon}}").click();
		{
			think(2.237);
		}
		web.element("{{obj.HCM_Terminate_An_Employee_0199.Personal_and_Employment}}").click();
		{
			think(2.088);
		}
		web.element(40, "{{obj.HCM_Terminate_An_Employee_0199.Employment}}").click();
		web.window(41, "{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(null);
		{
			think(4.411);
		}
		//web.element(53, "{{obj.HCM_Terminate_An_Employee_0199.web_span_Edit}}").focus();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").capturePage();
	}
	public void Terminate_Employee()throws Exception {
		//Click on Task Image
		web.image(147, "{{obj.HCM_Terminate_An_Employee_0199.web_img_Tasks}}").click();
		{
			think(4.288);
		}
		//Click on Work Relationship
		web.link("{{obj.HCM_Terminate_An_Employee_0199.web_a_Work_Relationship}}").click();
		{
			think(4.973);
		}
		String title = web.window(640, "{{obj.HCM_Terminate_An_Employee_0199.web_window}}").getTitle();
		info("Page title is : "+title);
//		////Click on Action
//		web.element("{{obj.HCM_Terminate_An_Employee_0199.web_span_Actions_1}}").click();
//		{
//			think(4.146);
//		}
//		//Click on Action drop downa nd select Terminate
//		web.link(151, "{{obj.HCM_Terminate_An_Employee_0199.web_a_37}}").click();
//		{
//			think(1.76);
//		}
//		web.element("{{obj.HCM_Terminate_An_Employee_0199.web_td_Terminate}}").click();
//		{
//			think(2.889);
//		}
//		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.web_input_text__FOpt1__FOr1_0__FONSr2_0__3}}").click();
//		{
//			think(2.944);
//		}
//		web.element("{{obj.HCM_Terminate_An_Employee_0199.web_li_Termination}}").click();
//		{
//			think(2.425);
//		}
//		web.element(155, "{{obj.HCM_Terminate_An_Employee_0199.web_html_1_2}}").click();
//		{
//			think(1.075);
//		}
//		//Set the termination date
//		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.TerminattionDate}}").click();
//		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.TerminattionDate}}").setText("15-May-2022");
//		{
//			think(2.784);
//		}
//		web.element(158, "{{obj.HCM_Terminate_An_Employee_0199.web_html_1_2}}").click();
//		{
//			think(2.156);
//		}
//		//Click on Review Button
//		web.button("{{obj.HCM_Terminate_An_Employee_0199.Terminate_Review}}").click();
//		{
//			think(4.891);
//		}
//		//Click on Submit Button
//		web.element("{{obj.HCM_Terminate_An_Employee_0199.Terminate_Submit}}")	.click();
//		{
//			think(3.037);
//		}
//		//Click on Yes Button
//		web.button("{{obj.HCM_Terminate_An_Employee_0199.Terminate_WarningDialog_OK}}").click();
//		{
//			think(2.783);
//		}
//		//Click on OK bUtton
//		web.button("{{obj.HCM_Terminate_An_Employee_0199.Terminate_ConfirmationDialog_OK}}").click();
//		{
//			think(2.822);
//		}
//		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").capturePage(); 
//		//Click on Done Button
//		web.element(163, "{{obj.HCM_Terminate_An_Employee_0199.web_span_Done}}").click();
//		{
//			think(2.221);
//		}
//		web.button("{{obj.HCM_Terminate_An_Employee_0199.web_button__FOpt1__FOr1_0__FONSr2_0__12}}").click();
		  
	
	}
	public void validation(String firstName,String familyName,String national_ID)throws Exception{
		web.element("{{obj.HCM_Terminate_An_Employee_0199.Home}}").click();
		{
			think(2.444);
		}	
		web.link("{{obj.HCM_Terminate_An_Employee_0199.Person_Management}}").click();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").waitForPage(null);		
		web.button("{{obj.HCM_Terminate_An_Employee_0199.ResetButton}}").click();
		{
			think(0.444);
		}
		web.button("{{obj.HCM_Terminate_An_Employee_0199.ResetButton}}").click();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Name}}").click();
		//web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Name}}").clearText();
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Name}}").setText(firstName+" "+familyName);
		//web.textBox("{{obj.HCM_Terminate_An_Employee_0199.Name}}").pressTab();
		{
			think(0.444);
		}
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.NID_Input}}").click();
		//web.textBox("{{obj.HCM_Terminate_An_Employee_0199.NID_Input}}").clearText();
		web.textBox("{{obj.HCM_Terminate_An_Employee_0199.NID_Input}}").setText(national_ID);
		{
			think(0.546);
		}
		web.button("{{obj.HCM_Terminate_An_Employee_0199.SearchButton}}").click();
		{
			think(4.214);
		}
		web.element("{{obj.HCM_Terminate_An_Employee_0199.PersonNumber}}").focus();
		{
			think(0.039);
		}
		web.element("{{obj.HCM_Terminate_An_Employee_0199.National_Id}}").focus();
		{
			think(0.079);
		}
		web.element("{{obj.HCM_Terminate_An_Employee_0199.web_span_Contingent_Worker}}").focus();
		{
			think(0.076);
		}
		web.link("{{obj.HCM_Terminate_An_Employee_0199.web_a_Syam_Bahadur}}").focus();
		web.window("{{obj.HCM_Terminate_An_Employee_0199.web_window}}").capturePage();
		{
			think(2.444);
		}		
	}

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_Terminate_An_Employee_0199.web_window}}").close();		

	}
}