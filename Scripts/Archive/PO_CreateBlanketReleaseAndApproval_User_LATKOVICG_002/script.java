import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.formsFT.api.*;
import oracle.oats.scripting.modules.applet.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;

	public void initialize() throws Exception {
		browser.launch();
		
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		web.window(30,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		{
			think(0.361);
		}
		web.window(31,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(32,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}").waitForPage(180, true);
		
		web.element(
				35,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_td_region5login}}").click();
		{
			think(1.911);
		}
		web.textBox(
				36,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_input_text_unamebean}}").click();
		{
			think(0.906);
		}
		web.textBox(
				37,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_input_text_unamebean}}").setText("LATKOVICG");
		{
			think(2.32);
		}
//		web.element(
//				38,
//				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_span__example__4u99v23_}}")
//				.click();
//		{
//			think(1.674);
//		}
		web.textBox(
				39,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_input_password_pwdbean}}")
				.dblClick();
		{
			think(1.222);
		}
		web.textBox(
				40,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(1.333);
		}
		web.textBox(
				41,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_input_password_pwdbean}}").pressEnter();
		web.window(42,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}")
				.waitForPage(null);
		{
			think(2.644);
		}
		web.link(
				45,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_a_Ma’aden_Waad_Al_Shamal_Ph_1}}")
				.click();
		web.window(46,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}")
				.waitForPage(null);
		{
			think(1.18);
		}
		web.button(
				50,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_button_Approve_1}}").click();
		web.window(51,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}")
				.waitForPage(null);
		{
			think(2.784);
		}
		web.window(54,
				"{{obj.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.web_window}}").close();
		
	
	}

	public void finish() throws Exception {
	}
}
