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
		web.window(2, "{{obj.PO_Approver_User_JONESM.web_window_0}}").navigate(
				"http://riyoramgbm02.maaden.com:8050/");
		{
			think(0.292);
		}
		web.window(4, "{{obj.PO_Approver_User_JONESM.web_window_0_1}}")
				.navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(5, "{{obj.PO_Approver_User_JONESM.web_window_0_2}}")
				.waitForPage(null);
		{
			think(16.736);
		}
		web.textBox(8,
				"{{obj.PO_Approver_User_JONESM.web_input_text_unamebean}}")
				.click();
		
		web.textBox(9,
				"{{obj.PO_Approver_User_JONESM.web_input_text_unamebean}}")
				.setText("JONESM");
		
		web.textBox(10,
				"{{obj.PO_Approver_User_JONESM.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("dzpvm14k/ONNdv66/asezg=="));
		
		web.textBox(11,
				"{{obj.PO_Approver_User_JONESM.web_input_password_pwdbean}}")
				.click();
		
		web.textBox(12,
				"{{obj.PO_Approver_User_JONESM.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(13,
				"{{obj.PO_Approver_User_JONESM.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(14, "{{obj.PO_Approver_User_JONESM.web_window_0_3}}")
				.waitForPage(null);
		{
			think(21.109);
		}
		web.link(17,
				"{{obj.PO_Approver_User_JONESM.web_a_Purchase_Requisition_7118}}")
				.click();
		web.window(18, "{{obj.PO_Approver_User_JONESM.web_window_0_4}}")
				.waitForPage(null);
		{
			think(0.214);
		}
		web.button(22, "{{obj.PO_Approver_User_JONESM.web_button_Approve}}")
				.click();
		web.window(23, "{{obj.PO_Approver_User_JONESM.web_window_0_3}}")
				.waitForPage(null);
		web.window(23, "{{obj.PO_Approver_User_JONESM.web_window_0_3}}").close();

	}

	public void finish() throws Exception {
	}
}
