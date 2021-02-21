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
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.You have a new home page!}}").focus();
		{
			think(1.147);
		}
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_window}}").waitForPage(150, true);
		{
			think(3.147);
		}
		//Click on My Client Groups Tab
		if(web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Letters and Certificates}}").exists(30, TimeUnit.SECONDS)){
			web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Letters and Certificates}}").focus();
			{
				think(0.147);
			}
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Letters and Certificates}}").click();
			{
				think(3.147);
			}
		}	
		//Click on Employment Certificate
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Employment_Certificate}}").dblClick();
		
		web.window(165, "{{obj.HCM_EmbassyCertificate_Employment_English_0171.EmploymentCertificate_Windows}}").waitForPage(null);
		{
			think(3.791);
		}
		/*
		//Click on Employment_Arabic Tab
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Employment_Arabic}}").click();
		{
			think(2.334);
		}
		web.element("{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_span___1}}").click();
		{
			think(1.398);
		}
		web.element("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Without salary}}").click();
		{
			think(2.731);
		}
		web.button("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Apply}}").click();
		{
			think(4.107);
		}
		web.window(165, "{{obj.HCM_EmbassyCertificate_Employment_English_0171.EmploymentCertificate_Windows}}").capturePage();
		*/
		
		//Click on Employment_English Tab
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Employment_English}}").click();
		{
			think(3.029);
		}
		web.button("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Apply}}").click();
		{
			think(4.871);
		}
		web.window(165, "{{obj.HCM_EmbassyCertificate_Employment_English_0171.EmploymentCertificate_Windows}}").capturePage();
		/*
		//Click on Employment_English_Arab Tab
		web.link("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Employment_English_Arab__}}").click();
		{
			think(2.209);
		}
		web.button("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Apply}}").click();
		web.window(165, "{{obj.HCM_EmbassyCertificate_Employment_English_0171.EmploymentCertificate_Windows}}").capturePage();
		*/
		
	}
	public void dataTableAndDeclaration() throws Exception{		
		datatable.importExcel("C:\\apps\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Relations\\HCM_EmbassyCertificate_Employment_English_0171.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");	
	
	}
	public void logIn(String url,String uid,String pwd) throws Exception{
		web.window("{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_window}}").navigate(url);
		web.window("{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_window}}").maximize();
		web.window("{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_EmbassyCertificate_Employment_English_0171.UID}}").setText(uid);
		web.textBox("{{obj.HCM_EmbassyCertificate_Employment_English_0171.UID}}").pressTab();
		web.textBox("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_EmbassyCertificate_Employment_English_0171.Sign_In}}").click();
		web.window("{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_window}}").waitForPage(150, true);
		
	}
	
	
	public void finish() throws Exception {
		//SignOut
		web.window(165, "{{obj.HCM_EmbassyCertificate_Employment_English_0171.EmploymentCertificate_Windows}}").close();
		{
			think(1.771);
		}
		web.window(640, "{{obj.HCM_EmbassyCertificate_Employment_English_0171.web_window}}").close();		

	}
}