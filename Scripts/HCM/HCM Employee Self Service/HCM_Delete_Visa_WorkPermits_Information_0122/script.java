import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.datatable.api.DataTableService;
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
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Delete_Visa_WorkPermits_Information_0122.xlsx", true);		
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
			
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").maximize();
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").navigate(url);
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.UID}}").pressTab();
		web.textBox("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.Sign_In}}").click();
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.Me}}").click();
		{
			think(0.868);
		}
		//Clik on Identification Info
		web.link("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.Identification Info}}").click();
		{
			think(6.785);
		}
		//Click on expand Button
		web.image("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.Expand}}").dblClick();
		//Click on Add Button
		{
			think(5.868);
		}
		//Click on Edit image to edit the Visa info
		web.image("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_img_Edit}}").click();
		{
			think(2.868);
		}
	//Delete the visa info
		web.element("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_span_Delete}}").click();
		{
			think(6.938);
		}

		info("Deleted visa details screenshot captured below...");
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").capturePage();
		
		{
			think(2.43);
		}
		web
				.element(918,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_html_1_2}}")
				.click();
		{
			think(1.418);
		}
		web
				.element(919,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_svg_true_1}}")
				.click();
		web
				.window(920,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}")
				.waitForPage(null);
		{
			think(3.284);
		}
		
		web
				.link(
						928,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_a_Identification_Info_1}}")
				.click();
		web
				.window(929,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}")
				.waitForPage(null);
		{
			think(2.372);
		}
		web
				.element(931,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_html_1_3}}")
				.click();
		{
			think(1.506);
		}
		web
				.element(
						932,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_td__FOpt1__FOr1_0__FONSr2_0_}}")
				.click();
		{
			think(1.454);
		}
		web
				.image(933,
						"{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_img_Expand_1}}")
				.click();
		{
			think(3.35);
		}
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").capturePage();
		web.link("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_a__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		{
			think(5.777);
		}
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").capturePage();
		web.element("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_span_Withdraw}}").click();
		
	}
	public void finish() throws Exception {
		//SignOut
		//web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_Delete_Visa_WorkPermits_Information_0122.web_window}}").close();

	}
}