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
		web.window(2, "{{obj.PO_Approver_User_ALDREESE_017.web_window_0}}")
				.navigate(
						"http://riysoaclone.maaden.com:8010/OA_HTML/RF.jsp?function_id=31160&resp_id=-1&resp_appl_id=-1&security_group_id=0&lang_code=US&params=OvBUmRu46sAt.69pyuIAVg&oas=iULLGYppcvVzyvNU0BbE9g..");
		web.window(4, "{{obj.PO_Approver_User_ALDREESE_017.web_window_0_1}}")
				.waitForPage(null);
		{
			think(0.819);
		}
		web.textBox(7,
				"{{obj.PO_Approver_User_ALDREESE_017.web_input_text_unamebean}}")
				.click();
		{
			think(0.805);
		}
		web.textBox(8,
				"{{obj.PO_Approver_User_ALDREESE_017.web_input_text_unamebean}}")
				.setText("ALDREESE");
		{
			think(0.415);
		}
		web.textBox(9,
				"{{obj.PO_Approver_User_ALDREESE_017.web_input_text_unamebean}}")
				.pressTab();
		{
			think(0.724);
		}
		web.textBox(10,
				"{{obj.PO_Approver_User_ALDREESE_017.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		{
			think(0.177);
		}
		web.textBox(11,
				"{{obj.PO_Approver_User_ALDREESE_017.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(12, "{{obj.PO_Approver_User_ALDREESE_017.web_window_0_2}}")
				.waitForPage(null);
		{
			think(22.378);
		}
		web.link(15,
				"{{obj.PO_Approver_User_ALDREESE_017.web_a_Approval_Required__RFQ_68}}")
				.click();
		web.window(16, "{{obj.PO_Approver_User_ALDREESE_017.web_window_0_3}}")
				.waitForPage(null);
		{
			think(6.16);
		}
		web.button(19,
				"{{obj.PO_Approver_User_ALDREESE_017.web_button_Approve}}")
				.click();
		web.window(20, "{{obj.PO_Approver_User_ALDREESE_017.web_window_0_2}}")
				.waitForPage(null);
		{
			think(3.202);
		}
		web.window(23, "{{obj.PO_Approver_User_ALDREESE_017.web_window_0_2}}")
				.close();

	}

	public void finish() throws Exception {
	}
}
