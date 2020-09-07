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
	String url,uid,pwd,country,areaCode,phone_Number = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageContactInfo_Add_Phone_Number_0068.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		country=(String) datatable.getValue("DataSheet", 0, "Country");
		areaCode = (String) datatable.getValue("DataSheet", 0, "AreaCode");
		phone_Number =  (String) datatable.getValue("DataSheet", 0, "Phone_Number");
		
		
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").maximize();
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Sign_In}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		
		if(web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Me}}").click();
		{
			think(3.147);
		}
		
		}
		if(web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.PersonalInformation}}").exists(150, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.PersonalInformation}}").focus();
			{
			think(0.3);
		}
		
		web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.PersonalInformation}}").click();
		}
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").waitForPage(150, true);
		if(web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Family_and_Emergency_Contact}}").exists(100, TimeUnit.SECONDS)){
			web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Family_and_Emergency_Contact}}").focus();
			{
				think(0.147);
			}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Family_and_Emergency_Contact}}").click();
		}
		{
			think(8.147);
		}
		if(web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.MyContact}}").exists(100, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.MyContact}}").focus();
			{
				think(1.946);
			}
		web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.MyContact}}").click();
		}
		{
			think(1.946);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_html_1}}").click();
		{
			think(2.446);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Communication}}").focus();
		{
			think(0.175);
		}
		web.image("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Communication_Dropdown}}").click();
		{
			think(0.411);
		}
		web.element(295,"{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_span_Add}}").click();
		//web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Add_DropDown}}").click();
		{
			think(0.397);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Phone_Details}}").click();
		{
			think(0.759);
		}
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.PhoneType}}").click();
		{
			think(0.61);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Work_Phone}}").click();
		{
			think(0.194);
		}
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.PhoneType}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Country}}").setText(country);
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Country}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.AreaCode}}").setText(areaCode);
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.AreaCode}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Phone_Number}}").setText(phone_Number);
		{
			think(1.819);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Submit}}").click();
		{
			think(4.188);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_span_We_are_submitting_your_ch}}").dblClick();
		{
			think(1.714);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_html_1}}").click();
		{
			think(1.03);
		}
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").capturePage();
//		web
//				.image(292,
//						"{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Communication_Dropdown}}")
//				.click();
//		web
//				.image(293,
//						"{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_img_Collapse}}")
//				.click();
//		{
//			think(2.843);
//		}
//		web
//				.image(294,
//						"{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.Communication_Dropdown}}")
//				.click();
//	
		
	}
	public void finish() throws Exception {
		//SignOut
		web.element("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_svg_true}}").click();
		{
			think(3.667);
		}
		web.link("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_a__FOpt1__UISlg1}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").waitForPage(150, true);
		{
			think(5.679);
		}
		web.button("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_button_Confirm}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").waitForPage(150, true);
		{
			think(0.247);
		}

	web.window("{{obj.HCM_ManageContactInfo_Add_Phone_Number_0068.web_window}}").close();
	
	}
}









