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
	String url,uid,pwd,country,areaCode,phone_Number,comments = null;
	String title =  "Contact Info - - Oracle Applications";
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ContactInfo_EditPhone_0083.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
		country=(String) datatable.getValue("DataSheet", 0, "Country");	
		areaCode=(String) datatable.getValue("DataSheet", 0, "AreaCode");
		phone_Number=(String) datatable.getValue("DataSheet", 0, "Phone_Number");
		comments=(String) datatable.getValue("DataSheet", 0, "Comments");
		
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").maximize();
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").navigate(url);
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.UID}}").pressTab();
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ContactInfo_EditPhone_0083.Sign_In}}").click();
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		//Click on Me Tab
		if(web.link("{{obj.HCM_ContactInfo_EditPhone_0083.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ContactInfo_EditPhone_0083.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ContactInfo_EditPhone_0083.Me}}").click();
		{
			think(0.147);
		}
		}
		//Click on Contact_Info		
		web.link("{{obj.HCM_ContactInfo_EditPhone_0083.web_a_Contact_Info_1}}").click();
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").waitForPage(50, true);
		
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").capturePage();
		//Verify Page Title
		String pageTitle = web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").getTitle();
		info("Page title is -> "+pageTitle);
				
		if(pageTitle.equalsIgnoreCase(title)){
			info("Test Case pass, as page title is return correctly.");
		}else fail("Test Case fail, as page title is return inCorrectly.");
		{
			think(1.166);
		}
		web.image(657, "{{obj.HCM_ContactInfo_EditPhone_0083.web_img_Edit}}").focus();
		web.image(657, "{{obj.HCM_ContactInfo_EditPhone_0083.web_img_Edit}}").dblClick();
		/*
		//Click on Add button
		web.element("{{obj.HCM_ContactInfo_EditPhone_0083.web_span_Add}}").click();
		{
			think(0.803);
		}
		//Choose type details
		web.element("{{obj.HCM_ContactInfo_EditPhone_0083.web_td_Phone_Details}}").click();
		{
			think(0.524);
		}
		*/
		//Choose phone type
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(1.456);
		}
		//Select Pager
		web.element(628, "{{obj.HCM_ContactInfo_EditPhone_0083.web_li_Pager}}").click();
		{
			think(0.423);
		}
		//Provide country details
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").click();
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").setText(country);
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").pressTab();
		//Set Area code
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0__2}}").setText(areaCode);
		//Set phone number
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0__2}}").pressTab();		
		web.textBox("{{obj.HCM_ContactInfo_EditPhone_0083.web_input_text__FOpt1__FOr1_0__FONSr2_0__3}}").setText(phone_Number);
		//Set Comments
		web.textArea("{{obj.HCM_ContactInfo_EditPhone_0083.web_textarea__FOpt1__FOr1_0__FONSr2_0_}}").setText(comments);
		{
			think(1.566);
		}
		//Clik on Submit button
		web.element(636, "{{obj.HCM_ContactInfo_EditPhone_0083.web_span_m}}").click();
		{
			think(5.089);
		}
		
		//Click Back Button
		web.element("{{obj.HCM_ContactInfo_EditPhone_0083.web_svg_true_1}}").click();
		web.window(642, "{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").waitForPage(50, true);
		{
			think(3.347);
		}
		//Click Again the Contact Info link to see the confirmation message
		web.link("{{obj.HCM_ContactInfo_EditPhone_0083.web_a_Contact_Info_1}}").click();
		web.window(645, "{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").waitForPage(50, true);
		{
			think(1.987);
		}
		//Confirmation message
		web.element("{{obj.HCM_ContactInfo_EditPhone_0083.web_span_Approval_in_progress_}}").dblClick();
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").capturePage();
		{
			think(0.01);
		}
		web.element(648,
						"{{obj.HCM_ContactInfo_EditPhone_0083.web_span_Approval_in_progress_}}")
				.click();
		{
			think(0.039);
		}
		web.link("{{obj.HCM_ContactInfo_EditPhone_0083.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(18.575);
		}
		web.element("{{obj.HCM_ContactInfo_EditPhone_0083.web_span_Change_Personal_Informati}}").dblClick();
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").capturePage();
		{
			think(1.832);
		}
		web.element(651, "{{obj.HCM_ContactInfo_EditPhone_0083.web_html_1_1}}").click();
		{
			think(3.084);
		}
		web.link("{{obj.HCM_ContactInfo_EditPhone_0083.web_a_BIP_NOTIF_discloseHref}}").click();
		{
			think(1.415);
		}
		web.element(653, "{{obj.HCM_ContactInfo_EditPhone_0083.web_strong__1}}").dblClick();
		web.window("{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").capturePage();
		{
			think(0.014);
		}
		web.element(654, "{{obj.HCM_ContactInfo_EditPhone_0083.web_strong__1}}").click();
		{
			think(0.333);
		}
		web.element(655, "{{obj.HCM_ContactInfo_EditPhone_0083.web_html_1_1}}").click();
		{
			think(2.344);
		}
		//web.element("{{obj.HCM_ContactInfo_EditPhone_0083.web_span_Withdraw}}").click();
	
		
		
			
		
	}
	public void finish() throws Exception {
		//SignOut

	web.element(637, "{{obj.HCM_ContactInfo_EditPhone_0083.web_html_1}}").click();
	{
		think(1.917);
	}
	web.element(638, "{{obj.HCM_ContactInfo_EditPhone_0083.web_svg_true}}").click();
	{
		think(4.936);
	}
	web.link("{{obj.HCM_ContactInfo_EditPhone_0083.web_a__FOpt1__UISlg1}}").click();
	web.window(640, "{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").waitForPage(50, true);
	web.window(640, "{{obj.HCM_ContactInfo_EditPhone_0083.web_window}}").close();

		

	}
}