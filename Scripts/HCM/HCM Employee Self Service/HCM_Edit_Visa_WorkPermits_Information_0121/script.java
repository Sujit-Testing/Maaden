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
	String url,uid,pwd,issuing_Country,startDate,visa_Number,issuingAuthority,issueDate,expiration_Date,hijri_IssueDate,hijri_Expiration_Date,comments= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Edit_Visa_WorkPermits_Information_0121.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		issuing_Country=(String) datatable.getValue("DataSheet", 0, "Issuing_Country");
		startDate=(String) datatable.getValue("DataSheet", 0, "StartDate");
		visa_Number=(String) datatable.getValue("DataSheet", 0, "Visa_Number");
		issuingAuthority=(String) datatable.getValue("DataSheet", 0, "IssuingAuthority");
		issueDate=(String) datatable.getValue("DataSheet", 0, "IssueDate");
		expiration_Date=(String) datatable.getValue("DataSheet", 0, "Expiration_Date");
		hijri_IssueDate=(String) datatable.getValue("DataSheet", 0, "Hijri_IssueDate");
		hijri_Expiration_Date=(String) datatable.getValue("DataSheet", 0, "Hijri_Expiration_Date");
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
			
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").maximize();
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").navigate(url);
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.UID}}").pressTab();
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Sign_In}}").click();
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Me}}").click();
		{
			think(0.868);
		}
		//Clik on Identification Info
		web.link("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Identification Info}}").click();
		{
			think(6.785);
		}
		//Click on expand Button
		web.image("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Expand}}").click();
		//Click on Add Button
		{
			think(5.868);
		}
		//Click on Edit image to edit the Visa info
		web.image("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_img_Edit}}").click();
		{
			think(2.868);
		}
		//Provide vsa/work permit details

		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Visa Change Date}}").setText(startDate);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Visa Change Date}}").pressTab();
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.VisaType}}").click();
		{
			think(0.482);
		}
		web.element("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Iqama}}").click();
		{
			think(0.803);
		}
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.VisaCategory}}").click();
		web.link("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(0.951);
		}
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Visa_Number}}").setText(visa_Number);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Visa_Status}}").click();
		{
			think(0.52);
		}
		web.element("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Active}}").click();
		{
			think(0.934);
		}
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Issuing Authority}}").setText(issuingAuthority);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Issue Date}}").setText(issueDate);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Expairation Date}}").setText(expiration_Date);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Expairation Date}}").pressTab();
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Hijri Issue Date}}").setText(hijri_IssueDate);
		//web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Hijri Issue Date}}").setText(hijri_IssueDate);
		//web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Hijri Expiration Date}}").setText(hijri_Expiration_Date);
		web.textBox("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Hijri Expiration Date}}").setText(hijri_Expiration_Date);
		web.textArea("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Comments}}").setText(comments);
		{
			think(1.818);
		}
		//web.element("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_html_1}}").click();
		web.link("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.Submit}}").click();
		{
			think(6.938);
		}

		info("Edited visa details screenshot captured below...");
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").capturePage();
		
	}
	public void finish() throws Exception {
		//SignOut
		//web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_Edit_Visa_WorkPermits_Information_0121.web_window}}").close();

	}
}