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
		getDatabank("LogIn_LogOut_HCMCloud").getNextDatabankRecord();
		web.window(8, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").navigate("{{db.LogIn_LogOut_HCMCloud.URL,https://ejop-test.login.em2.oraclecloud.com/}}");		
		web.window(10, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").waitForPage(30, true);		
		web.textBox(11, "{{obj.LogIn_LogOut_HCMCloud.web_input_text_userid}}").setText("{{db.LogIn_LogOut_HCMCloud.UID,Sujit.swain}}");
		web.textBox(12, "{{obj.LogIn_LogOut_HCMCloud.web_input_text_userid}}").pressTab();
		web.textBox(13,"{{obj.LogIn_LogOut_HCMCloud.web_input_password_password}}").setPassword("{{db.LogIn_LogOut_HCMCloud.PWD,{{@deobfuscate(ZHLjwGuLQyMgupEPdJt44w==)}}}}");
		web.textBox("{{obj.LogIn_LogOut_HCMCloud.web_input_password_password}}").pressEnter();
		web.window(15, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").waitForPage(30, true);
		//Handle New Home Page
		web.link("{{obj.LogIn_LogOut_HCMCloud.web_a_You_have_a_new_home_page_}}").click();
		web.window(18, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").waitForPage(30, true);
		
		
	}
	
	public void finish() throws Exception {
		web.element("{{obj.LogIn_LogOut_HCMCloud.web_svg_pt1__UIScmil1u__icon}}").click();
		{
			think(2.094);
		}
		web.link(21, "{{obj.LogIn_LogOut_HCMCloud.web_a_Sign_Out}}").click();
		web.window(22, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").waitForPage(30, true);		
		//web.button(23, "{{obj.LogIn_LogOut_HCMCloud.web_button_Confirm}}").click();
		web.window(24, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").waitForPage(30, true);
		web.window(27, "{{obj.LogIn_LogOut_HCMCloud.web_window}}").close();
	}
}
