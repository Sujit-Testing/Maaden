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
		String code = null;
		getDatabank("HCM_Search_ManagePosition_ByEmployee_Code_002").getNextDatabankRecord();
		web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").navigate("{{db.HCM_Search_ManagePosition_ByEmployee_Code_002.HCM_URL,https://ejop-test.login.em2.oraclecloud.com/}}");
		web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").waitForPage(180,true);
		//Maximizwe the Browser.
		web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").maximize();
		//LogIn the application
		web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.UID}}").setText("{{db.HCM_Search_ManagePosition_ByEmployee_Code_002.UserId,Sujit.swain}}");	
		web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Password}}").setPassword("{{db.HCM_Search_ManagePosition_ByEmployee_Code_002.Password,{{@deobfuscate(ZHLjwGuLQyMgupEPdJt44w==)}}}}");	
		web.button("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Sign_In}}").click();
		
		web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").waitForPage(180,true);
		//Welcome Screen
		if(web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.WelcomeScreen}}").exists()){
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.WelcomeScreen}}").click();
		}
		web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").waitForPage(null);
		//Click on My_Client_Groups
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.My_Client_Groups}}").click();
		{
			think(0.2);
		}
		//Click on Workforce_Structures
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Workforce_Structures}}").click();
		web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").waitForPage(180,true);
		
		//Focus on logOut icon 
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.LogOutIcon}}").focus();
		{
			think(6.00);	
		}
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Manage Positions}}").focus();
		{
			think(.10);	
		}
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Manage Positions}}").dblClick();
		{
			think(6.00);	
		}
		//web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_a_Manage_Positions}}").click();
//
//		if(web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_a_Manage_Positions}}").exists(15, TimeUnit.SECONDS)){
//			web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_a_Manage_Positions}}").click();
//		}
//		{
//			think(6.00);	
//		}
		if(web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Code}}").exists(20, TimeUnit.SECONDS)){
			web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Code}}").setText("{{db.HCM_Search_ManagePosition_ByEmployee_Code_002.PositionCode,101447}}");
			code = web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Code}}").getAttribute("value");
			info("Code ->"+ code);			

		}else{
			web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_a_Manage_Positions}}").click();
			
			{
				think(6.00);	
			}
			web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Code}}").setText("{{db.HCM_Search_ManagePosition_ByEmployee_Code_002.PositionCode,101447}}");
			code = web.textBox("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Code}}").getAttribute("value");
			info("Code ->"+ code);
		}
		
		
		web.button("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.SearchButton}}").click();
		{
		think(3.00);	
		}
		//No results found
//		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_div__FOpt1__FOr1_0__FOSritemN}}").focus();
//		info(web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_div__FOpt1__FOr1_0__FOSritemN}}").getDisplayText());
//		{
//			think(0.118);
//		}
		
		web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.SelectRecordByName}}").click();
		//Fetch the employee id and print
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Empployee_Id}}").focus();
		String employee_Code= web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Empployee_Id}}").getDisplayText();
		info("Employee code  : "+employee_Code);
		if(employee_Code.equals(code)){
			info("TC Pass as both code matched ");
		}else{
			info("TC Fail, as both code doesn't matched");
		}
		//Fetch the Employee Hirings Status and print
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Hiring Status}}").focus();
		info("Employee Hirings Status : "+web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Hiring Status}}").getDisplayText());
		//Fetch the Employee Position and print
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Position Name}}").focus();
		info("Position : "+web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Position Name}}").getDisplayText());	
		//Fetch the Dept and print
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Dept}}").focus();		
		info("Dept : "+web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Dept}}").getDisplayText());
		//Fetch the Job and print
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Job}}").focus();
		info("Job: " + web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Job}}").getDisplayText());
		web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_span_o}}").click();		
		{
			think(1.451);	
			
		}
		
	}
	
	public void finish() throws Exception {
		//LogOut and close the application
	web.element("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.LogOutIcon}}").click();
	{
		think(2.07);
	}
	web.link("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.Sign_Out}}").click();
	web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").waitForPage(180,true);
	web.window("{{obj.HCM_Search_ManagePosition_ByEmployee_Code_002.web_window}}").close();
		}
}
