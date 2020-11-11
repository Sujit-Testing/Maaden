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
	String url,uid,pwd,lastWorkingDate= null;
	
	public void initialize() throws Exception {
		browser.launch();
	}		
	
	public void run() throws Exception {
	
		datatable.importExcel("C:\\OracleATS\\OFT\\Maaden\\Test Data\\HCM Employee Self Service\\HCM_Submit_Resignation_PastDate_N_0115.xlsx", true);
		url=(String) datatable.getValue("DataSheet", 0, "URL");
		uid=(String) datatable.getValue("DataSheet", 0, "UID");
		pwd=(String) datatable.getValue("DataSheet", 0, "PWD");
		lastWorkingDate=(String) datatable.getValue("DataSheet", 0, "LastWorkingDate");
			
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").maximize();
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").navigate(url);
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").waitForPage(50, true);
		web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.UID}}").setText(uid);
		web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.UID}}").pressTab();
		web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Password}}").setPassword(pwd);
		web.button("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Sign_In}}").click();
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").waitForPage(150, true);
		//Handle WelCome Page
		web.link("{{obj.HCM_Submit_Resignation_PastDate_N_0115.You have a new home page!}}").focus();
		{
			think(3.147);
		}
		web.link("{{obj.HCM_Submit_Resignation_PastDate_N_0115.You have a new home page!}}").dblClick();
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").waitForPage(150, true);
		{
			think(1.147);
		}
		
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").capturePage();
		//Clik on Me
		web.link("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Me}}").click();
		{
			think(0.868);
		}
		//Clik on More
		web.link("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Show More}}").click();
		{
			think(1.785);
		}

		//Clik on Resignation
		web.link("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Resignation}}").click();
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").waitForPage(null);

		//Providing regination details
		//Last Working Date
		web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Last Working Date}}").click();
		web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Last Working Date}}").setText(lastWorkingDate);
		web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Last Working Date}}").pressTab();
		{
			think(0.044);
		}
		//Reason for let the resign
		web.element("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_span_Why_are_you_resigning_}}").click();
		{
			think(0.083);
		}
		//web.textBox("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Why are you resigning}}").setText(resigning);
		//Clik on drop Down Box
		web.link("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_a__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(0.149);
		}
		//Select Better Salaryt option
		web.element("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Select_Better_Salary}}").click();
		{
			think(0.579);
		}
		web.button("{{obj.HCM_Submit_Resignation_PastDate_N_0115.Continue}}").click();
		{
			think(0.71);
		}
		info("Approval is under process. Here is the screenshot captured below...");
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").capturePage();	
	}
	public void finish() throws Exception {
		//SignOut
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").waitForPage(null);
		//Close both wndows
		web.window("{{obj.HCM_Submit_Resignation_PastDate_N_0115.web_window}}").close();

	}
}