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
	String url,uid,pwd = null;
	
		
	public void initialize() throws Exception {
		browser.launch();
	}
		
	public void run() throws Exception {
		
		
		//Data Table Declaration and define the data table entity
		dataTableAndDeclaration();
		
		//LogIn
		logIn(url, uid, pwd);		
		
		//Handle WelCome Page
		web.link("{{obj.HCM_No_ObjectionCertificate_0178.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_No_ObjectionCertificate_0178.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_No_ObjectionCertificate_0178.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_No_ObjectionCertificate_0178.Letters and Certificates}}").exists(30, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_No_ObjectionCertificate_0178.Letters and Certificates}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_No_ObjectionCertificate_0178.Letters and Certificates}}").click();
			{
				think(3.147);
			}
		}	
		//Click on Employment Certificate
		web.link("{{obj.HCM_No_ObjectionCertificate_0178.No Objection Certificate}}").click();
		web.window("{{obj.HCM_No_ObjectionCertificate_0178.web_window_1}}").waitForPage(150, true);
		
		
		
		//Call the NoObjectionCertificate Report and take the screen shot
		NoObjectionCertificate();
		
	
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_No_ObjectionCertificate_0178.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_No_ObjectionCertificate_0178.web_window}}").navigate(url);
		web.window("{{obj.HCM_No_ObjectionCertificate_0178.web_window}}").maximize();
		web.window("{{obj.HCM_No_ObjectionCertificate_0178.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_No_ObjectionCertificate_0178.UID}}").setText(uid);
		web.textBox("{{obj.HCM_No_ObjectionCertificate_0178.UID}}").pressTab();
		web.textBox("{{obj.HCM_No_ObjectionCertificate_0178.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_No_ObjectionCertificate_0178.Sign_In}}").click();
		web.window("{{obj.HCM_No_ObjectionCertificate_0178.web_window}}").waitForPage(150, true);
		
	}
	public void NoObjectionCertificate() throws Exception{
		web.link("{{obj.HCM_No_ObjectionCertificate_0178.web_a_NoObjectionCertificate}}").click();
		{
			think(2.067);
		}
		web.button("{{obj.HCM_No_ObjectionCertificate_0178.web_button_reportViewApply}}").click();
		{
			think(2.067);
		}
		web.window(165, "{{obj.HCM_No_ObjectionCertificate_0178.web_window_1}}").capturePage();
	}
	
	public void finish() throws Exception {
		//SignOut
		web.window(165, "{{obj.HCM_No_ObjectionCertificate_0178.web_window_1}}").close();
		{
			think(0.771);
		}
		web.window(640, "{{obj.HCM_No_ObjectionCertificate_0178.web_window}}").close();		

	}
}