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
	String url,uid,pwd,searchBox_Value= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {		
		
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_View_Organizational_Chart_0123.xlsx", true);		
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		searchBox_Value=(String) datatable.getValue("DataSheet", 0, "SearchBox_Value");
			
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").maximize();
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").navigate(url);
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_View_Organizational_Chart_0123.UID}}").setText(uid);
		web.textBox("{{obj.HCM_View_Organizational_Chart_0123.UID}}").pressTab();
		web.textBox("{{obj.HCM_View_Organizational_Chart_0123.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_View_Organizational_Chart_0123.Sign_In}}").click();
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_View_Organizational_Chart_0123.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_View_Organizational_Chart_0123.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_View_Organizational_Chart_0123.Me}}").click();
		{
			think(0.868);
		}
		//Clik on Identification Info

		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").capturePage();
		web.link("{{obj.HCM_View_Organizational_Chart_0123.Directory}}").click();
		{
			think(5.791);
		}
		web.element("{{obj.HCM_View_Organizational_Chart_0123.web_svg_true}}").click();
		{
			think(6.312);
		}
		web.textBox("{{obj.HCM_View_Organizational_Chart_0123.SearchBox}}").click();
		web.textBox("{{obj.HCM_View_Organizational_Chart_0123.SearchBox}}").setText(searchBox_Value);
		{
			think(0.513);
		}
		web.image("{{obj.HCM_View_Organizational_Chart_0123.SearchMagnfingGlass}}").click();
		{
			think(1.513);
		}
		info("Screenshot taken below for proof of Organizational_Chart displayed below. ");
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").capturePage();
		web.image("{{obj.HCM_View_Organizational_Chart_0123.SignOut_img}}").click();
		{
			think(3.843);
		}
		web.link("{{obj.HCM_View_Organizational_Chart_0123.Sign Out}}").click();
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").waitForPage(30,true);
		if(web.button(945,	"{{obj.HCM_View_Organizational_Chart_0123.web_button_Confirm}}").exists(30, TimeUnit.SECONDS)){
		web.button(945,	"{{obj.HCM_View_Organizational_Chart_0123.web_button_Confirm}}").click();
		}
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").waitForPage(null);
		
		
		
		
	}
	public void finish() throws Exception {
		//SignOut
		//web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_View_Organizational_Chart_0123.web_window}}").close();

	}
}