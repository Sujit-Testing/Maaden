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
	String url,uid,pwd,country,startDate,line1,line2,pO_Box,streets,city,postalCode,comments = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** 
	 * HCM_ManageContactInfo_Edit_Address_0075
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageContactInfo_Edit_Address_0075.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		country=(String) datatable.getValue("DataSheet", 0, "Country");
		startDate = (String) datatable.getValue("DataSheet", 0, "StartDate");
		line1 = (String) datatable.getValue("DataSheet", 0, "Line1");
		line2 = (String) datatable.getValue("DataSheet", 0, "Line1");
		pO_Box = (String) datatable.getValue("DataSheet", 0, "PO_Box");
		streets = (String) datatable.getValue("DataSheet", 0, "Streets");
		city = (String) datatable.getValue("DataSheet", 0, "City");
		postalCode = (String) datatable.getValue("DataSheet", 0, "PostalCode");
		comments = (String) datatable.getValue("DataSheet", 0, "Comments");
		
		
		
		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").maximize();
		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Sign_In}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		
		if(web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Me}}").click();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_a_Family_and_Emergency_Cont}}").click();
		web.window(360,"{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").waitForPage(null);
		web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.My_Contact}}").focus();
		}
		{
			think(2.454);
		}
		web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.My_Contact}}").dblClick();
	
		{
			think(5.454);
		}
		web.element("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_h2_Address_1}}").dblClick();
		{
			think(1.454);
		}
		web.image("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_img_Expand_1}}").click();
		{
			think(5.372);
		}
		web.image("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_img_Edit}}").click();
/*
		web.element("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Click_Add_Button}}").click();
		{
			think(1.538);
		}
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Country}}").click();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Country}}").setText(country);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Country}}").pressTab();
		web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Type_DropDown}}").click();
		{
			think(1.65);
		}
		web.element("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Home_Address}}").click();
		{
			think(1.507);
		}
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_input_text__FOpt1__FOr1_0__FONSr2_0__10}}").pressTab();
		*/
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_StartDate}}").setText(startDate);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_StartDate}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Line1}}").setText(line1);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Line1}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Line2}}").setText(line2);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Line2}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_PostOffice_Box}}").setText(pO_Box);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_PostOffice_Box}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Streets}}").setText(streets);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Streets}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_City}}").setText(city);
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_City}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_PostalCode}}").setText(postalCode);
		web.textArea("{{obj.HCM_ManageContactInfo_Edit_Address_0075.Address_Comments}}").setText(comments);
		{
			think(4.892);
		}
		web.element("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_span_Submit}}").click();
		{
			think(1.86);
		}
		web.element("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_span_We_are_submitting_your_ch_1}}").focus();
		web.window(360,"{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").capturePage();
		//web.element("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_span_Submit_1}}").click();
		
	
			
		
		
	}
	public void finish() throws Exception {
		//SignOut

		web.image("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_img_Sujit___Swain}}").click();
		{
			think(4.362);
		}
		web.link("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_a__FOpt1__UISlg1_1}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").waitForPage(null);
		{
			think(1.898);
		}
		web.button("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_button_Confirm_1}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").waitForPage(null);
		{
			think(0.458);
		}

		web.window("{{obj.HCM_ManageContactInfo_Edit_Address_0075.web_window}}").close();

	}
}









