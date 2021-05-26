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
	legalEmployer_SerchInput,legislationCode,airTicketEligibility,justification,contractEndDate;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_ViewPerformanceRatingHistory_0232.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_ViewPerformanceRatingHistory_0232.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		web.link(268, "{{obj.HCM_ViewPerformanceRatingHistory_0232.My_Team}}").click();
		{
			think(0.452);
		}
		
		web.link("{{obj.HCM_ViewPerformanceRatingHistory_0232.My_Team_Image}}").click();
		web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").waitForPage(30,true);
		{
			think(2.126);
		}
		if(web.link("{{obj.HCM_ViewPerformanceRatingHistory_0232.Select_Employee}}").exists(15, TimeUnit.SECONDS)){
		web.link("{{obj.HCM_ViewPerformanceRatingHistory_0232.Select_Employee}}").dblClick();
		{
			think(3.126);
		} 
		}
		web.element("{{obj.HCM_ViewPerformanceRatingHistory_0232.ShowMore}}").click();
		{
			think(3.97);
		}
		web.element("{{obj.HCM_ViewPerformanceRatingHistory_0232.Skills and Qualifications}}").click();
		{
			think(2.97);
		}
		web.window(640, "{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").capturePage();
		web.image("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_img_Expand}}").click();
		{
			think(3.605);
		}
		web.element(	"{{obj.HCM_ViewPerformanceRatingHistory_0232.web_span_2015}}").dblClick();
		web.element("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_label_x3b8}}").dblClick();
		{
			think(0.606);
		}
		web.image(	"{{obj.HCM_ViewPerformanceRatingHistory_0232.web_img_Expand_1}}").click();
		{
			think(3.856);
		}
		web.image("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_img_Expand_2}}").click();
		{
			think(3.798);
		}
		web.image("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_img_Expand_3}}").click();
		{
			think(3.798);
		}		
		web.element("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_h2_Previous_Employment_Detai}}").dblClick();
		web.element("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_h2_Previous_Employment_Detai}}").click();
		{
			think(1.506);
		}
		web.image("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_img_Collapse}}").click();
		{
			think(1.588);
		}
		web.image("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_img_Expand_4}}").click();
		web.window(640, "{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").capturePage();
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Manager Self Service\\HCM_ViewPerformanceRatingHistory_0232.xlsx", true);
		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		
				
		firstName=(String) datatable.getValue("DataSheet", 0, "FirstName");		
		familyName=(String) datatable.getValue("DataSheet", 0, "FamilyName");
		middleName=(String) datatable.getValue("DataSheet", 0, "MiddleName");		
		grandFatherName=(String) datatable.getValue("DataSheet", 0, "GrandFatherName");	
		contractEndDate =(String) datatable.getValue("DataSheet", 0, "ContractEndDate");
		justification=(String) datatable.getValue("DataSheet", 0, "Justification");		
	}
	public void validation(){
		
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").navigate(url);
		{
			think(5.0);
		}
		System.out.println("URL is ->"+url);
		
		web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").maximize();
		//web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").navigate(url);
		web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ViewPerformanceRatingHistory_0232.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ViewPerformanceRatingHistory_0232.UID}}").pressTab();
		web.textBox("{{obj.HCM_ViewPerformanceRatingHistory_0232.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ViewPerformanceRatingHistory_0232.Sign_In}}").click();
		web.window("{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").waitForPage(50, true);
		{
			think(3.0);
		}
	}
		
	

	public void finish() throws Exception {
		//SignOut
		//web.window(640, "{{obj.HCM_ViewPerformanceRatingHistory_0232.web_window}}").close();		

	}
}