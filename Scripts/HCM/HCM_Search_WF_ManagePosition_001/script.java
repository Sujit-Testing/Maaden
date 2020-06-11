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
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		getDatabank("HCM_Search_WF_ManagePosition_ByName_001").getNextDatabankRecord();
		web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").navigate("{{db.HCM_Search_WF_ManagePosition_ByName_001.HCM_URL,https://ejop-test.login.em2.oraclecloud.com/}}");
		web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").waitForPage(180,true);
		//Maximizwe the Browser.
		web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").maximize();
		//LogIn the application
		web.textBox("{{obj.HCM_Search_WF_ManagePosition_ByName_001.UID}}").setText("{{db.HCM_Search_WF_ManagePosition_ByName_001.UserId,Sujit.swain}}");
		web.textBox("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Password}}").setPassword("{{db.HCM_Search_WF_ManagePosition_ByName_001.Password,{{@deobfuscate(ZHLjwGuLQyMgupEPdJt44w==)}}}}");	
		web.button("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Sign_In}}").click();
		
		web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").waitForPage(180,true);
		//Welcome Screen
		if(web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.WelcomeScreen}}").exists()){
		web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.WelcomeScreen}}").click();
		}
		web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").waitForPage(null);
		//Click on My_Client_Groups
		web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.My_Client_Groups}}").click();
		//Click on Workforce_Structures
		web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Workforce_Structures}}").click();
		web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").waitForPage(180,true);
		
		//LogOut and close the application
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.LogOutIcon}}").focus();
		{
			think(6.0);
		}
		web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Manage Positions}}").dblClick();
		
		if(web.textBox("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Name}}").exists(20, TimeUnit.SECONDS)){
			web.textBox("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Name}}").setText("{{db.HCM_Search_WF_ManagePosition_ByName_001.PositionName,Vice President}}");			

		}else{
			web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_a_Manage_Positions}}").dblClick();
			{
				think(6.00);	
			}
			web.textBox("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Name}}").setText("{{db.HCM_Search_WF_ManagePosition_ByName_001.PositionName,Vice President}}");
		}
		
		
		web.button("{{obj.HCM_Search_WF_ManagePosition_ByName_001.SearchButton}}").click();
		{
		think(3.00);	
		}
		//No results found
//		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_div__FOpt1__FOr1_0__FOSritemN}}").focus();
//		info(web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_div__FOpt1__FOr1_0__FOSritemN}}").getDisplayText());
//		{
//			think(0.118);
//		}
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.SelectRecordByName}}").click();
		//web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.SelectRecordByName}}").click();
		 {
			think(2.0);
		}
		
		//Fetch the employee id and print
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Empployee_Id}}").focus();
		info("Employee code  : "+web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Empployee_Id}}").getDisplayText());
		//Fetch the Employee Hirings Status and print
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Hiring Status}}").focus();
		info("Employee Hirings Status : "+web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Hiring Status}}").getDisplayText());
		//Fetch the Employee Position and print
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Position Name}}").focus();
		info("Position : "+web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Position Name}}").getDisplayText());	
		//Fetch the Dept and print
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Dept}}").focus();		
		info("Dept : "+web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Dept}}").getDisplayText());
		//Fetch the Job and print
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Job}}").focus();
		info("Job: " + web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Job}}").getDisplayText());
		web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_span_o}}").click();		
		{
			think(1.451);	
			
		}
		
		
		
	}
	
	public void finish() throws Exception {
		//LogOut and close the application
	web.element("{{obj.HCM_Search_WF_ManagePosition_ByName_001.LogOutIcon}}").click();
	{
		think(2.07);
	}
	web.link("{{obj.HCM_Search_WF_ManagePosition_ByName_001.Sign_Out}}").click();
	web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").waitForPage(180,true);
	web.window("{{obj.HCM_Search_WF_ManagePosition_ByName_001.web_window}}").close();
		}
}
