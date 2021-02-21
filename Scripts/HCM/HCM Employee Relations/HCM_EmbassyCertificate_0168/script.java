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
	countryCode,areaCode,phoneNumber,email,probationPeriod,noticePeriod,passport_Number,passport_Authorize_Country,passport_IssueDate,passport_ExpireDate= null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_EmbassyCertificate_0168.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_EmbassyCertificate_0168.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_EmbassyCertificate_0168.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_EmbassyCertificate_0168.Letters and Certificates}}").exists(30, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_EmbassyCertificate_0168.Letters and Certificates}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_EmbassyCertificate_0168.Letters and Certificates}}").click();
			{
				think(3.147);
			}
		}	
		//Search the employee
		//SearchEmployee(firstName,familyName, national_ID);
		web.link("{{obj.HCM_EmbassyCertificate_0168.web_a_Embassy_Certificate}}").click();
		web.window(165, "{{obj.HCM_EmbassyCertificate_0168.web_window_1}}").waitForPage(null);
		{
			think(3.791);
		}
		web.element(167, "{{obj.HCM_EmbassyCertificate_0168.web_span__}}").click();
		{
			think(2.236);
		}
		web.element("{{obj.HCM_EmbassyCertificate_0168.web_div_With_total_salary}}").click();
		{
			think(2.771);
		}
		web.button("{{obj.HCM_EmbassyCertificate_0168.web_button_reportViewApply}}").click();
		{
			think(2.771);
		}
		//web.element("{{obj.HCM_EmbassyCertificate_0168.web_div__________________________}}").click();
		web.window(165, "{{obj.HCM_EmbassyCertificate_0168.web_window_1}}").capturePage();
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_EmbassyCertificate_0168.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_EmbassyCertificate_0168.web_window}}").navigate(url);
		web.window("{{obj.HCM_EmbassyCertificate_0168.web_window}}").maximize();
		web.window("{{obj.HCM_EmbassyCertificate_0168.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_EmbassyCertificate_0168.UID}}").setText(uid);
		web.textBox("{{obj.HCM_EmbassyCertificate_0168.UID}}").pressTab();
		web.textBox("{{obj.HCM_EmbassyCertificate_0168.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_EmbassyCertificate_0168.Sign_In}}").click();
		web.window("{{obj.HCM_EmbassyCertificate_0168.web_window}}").waitForPage(150, true);
		
	}
	
	
	public void finish() throws Exception {
		//SignOut
		web.window(165, "{{obj.HCM_EmbassyCertificate_0168.web_window_1}}").close();
		{
			think(1.771);
		}
		web.window(640, "{{obj.HCM_EmbassyCertificate_0168.web_window}}").close();		

	}
}