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
	String url,uid,pwd,email_Address,email_Comments = null;
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/** HCM_ManageContactInfo_Add_Address_0074
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_ManageContactInfo_Add_Address_0074.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		email_Address=(String) datatable.getValue("DataSheet", 0, "Email_Address");
		email_Comments = (String) datatable.getValue("DataSheet", 0, "Email_Comments");
		
		
		
		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").maximize();
		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").navigate(url);
		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.UID}}").setText(uid);
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.UID}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_ManageContactInfo_Add_Address_0074.Sign_In}}").click();
		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").waitForPage(150, true);
		{
			think(2.387);
		}
		
		if(web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.Me}}").exists(50, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.Me}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.Me}}").click();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_a_Family_and_Emergency_Cont}}").click();
		web.window(360,"{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").waitForPage(null);
		web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_a__FOpt1__FOr1_0__FONSr2_0__2}}").dblClick();
		}
		{
			think(10.454);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_h2_Address_1}}").dblClick();
		{
			think(0.454);
		}
		web.image("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_img_Expand_1}}").click();
		{
			think(1.372);
		}

		web.element("{{obj.HCM_ManageContactInfo_Add_Address_0074.Click_Add_Button}}").click();
		{
			think(1.538);
		}
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Country}}").click();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Country}}").setText("Saudi Arabia");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Country}}").pressTab();
		web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Type_DropDown}}").click();
		{
			think(1.65);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Address_0074.Home_Address}}").click();
		{
			think(1.507);
		}
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_input_text__FOpt1__FOr1_0__FONSr2_0__10}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_StartDate}}").setText("9/7/20");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_StartDate}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Line1}}").setText("111111");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Line1}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Line2}}").setText("111111");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Line2}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_PostOffice_Box}}").setText("123456");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_PostOffice_Box}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Streets}}").setText("Kol");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Streets}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_City}}").setText("WB");
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_City}}").pressTab();
		web.textBox("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_PostalCode}}").setText("123456");
		web.textArea("{{obj.HCM_ManageContactInfo_Add_Address_0074.Address_Comments}}").setText("Free Text");
		{
			think(4.892);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_span_Submit}}").click();
		{
			think(1.86);
		}
		web.element("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_span_We_are_submitting_your_ch_1}}").dblClick();

		
	}
	public void finish() throws Exception {
		//SignOut
//		web.element("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_svg_true}}").click();
//		{
//			think(3.667);
//		}
//		web.link("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_a__FOpt1__UISlg1}}").click();
//		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").waitForPage(150, true);
//		{
//			think(5.679);
//		}
//		web.button("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_button_Confirm}}").click();
//		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").waitForPage(150, true);
//		{
//			think(0.247);
//		}
//
//		web.window("{{obj.HCM_ManageContactInfo_Add_Address_0074.web_window}}").close();
	
	}
}









