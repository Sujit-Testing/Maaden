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
		web.window(2, "{{obj.PasswordChange_SWAINSW.web_window_0}}").navigate("http://riysoaclone.maaden.com:8010");
		web.window(4, "{{obj.PasswordChange_SWAINSW.web_window_0_1}}")
				.waitForPage(null);
		{
			think(1.418);
		}
		web.textBox(7,
				"{{obj.PasswordChange_SWAINSW.web_input_text_unamebean}}")
				.click();
		web.textBox(8,
				"{{obj.PasswordChange_SWAINSW.web_input_text_unamebean}}")
				.setText("swainsw");
		
		web.textBox(9,
				"{{obj.PasswordChange_SWAINSW.web_input_text_unamebean}}")
				.pressTab();
		
		web.textBox(10,
				"{{obj.PasswordChange_SWAINSW.web_input_password_pwdbean}}")
				.setPassword(deobfuscate("dzpvm14k/ONNdv66/asezg=="));
		
		web.textBox(11,
				"{{obj.PasswordChange_SWAINSW.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(12, "{{obj.PasswordChange_SWAINSW.web_window_0_2}}")
				.waitForPage(null);
		web.link(17,
				"{{obj.PasswordChange_SWAINSW.web_a_System_Administrator}}").click();
		web.window(18, "{{obj.PasswordChange_SWAINSW.web_window_0_2}}")
				.waitForPage(null);
		{
			think(6.316);
		}
		//click on sccurity
		web.element(22, "{{obj.PasswordChange_SWAINSW.web_li_20420_1_67864_0}}").click();
		{
			think(2.737);
		}
		//Click on USER
		web.link(23, "{{obj.PasswordChange_SWAINSW.web_a_User}}").click();
		web.window(24, "{{obj.PasswordChange_SWAINSW.web_window_0_2}}")
				.waitForPage(null);
		{
			think(0.971);
		}
		//define
		web.link(27, "{{obj.PasswordChange_SWAINSW.web_a_Define}}").click();
		web.window(28, "{{obj.PasswordChange_SWAINSW.web_window_1}}")
				.waitForPage(180,true);
		forms.captureScreenshot(32);
		
		forms.textField(33,"{{obj.PasswordChange_SWAINSW.forms_textField_USER_USER_NAME_0}}").invokeSoftKey("ENTER_QUERY");
		{
			think(1.13);
		}
		forms.textField(34,"{{obj.PasswordChange_SWAINSW.forms_textField_USER_USER_NAME_0}}").setText("PEETHAMBARANS");
		{
			think(0.059);
		}
		forms.textField(35,
				"{{obj.PasswordChange_SWAINSW.forms_textField_USER_USER_NAME_0}}")
				.invokeSoftKey("EXECUTE_QUERY");
		{
			think(11.535);
		}
		forms.textField(36,
				"{{obj.PasswordChange_SWAINSW.forms_textField_USER_USER_PASSWORD_0}}")
				.setText("welcome1234");
		{
			think(0.057);
		}
		forms.textField(37,
				"{{obj.PasswordChange_SWAINSW.forms_textField_USER_USER_PASSWORD_0}}")
				.invokeSoftKey("RETURN");
		{
			think(7.125);
		}
		forms.textField(38,
				"{{obj.PasswordChange_SWAINSW.forms_textField_USER_USER_PASSWORD_0}}")
				.setText("welcome1234");
		{
			think(0.008);
		}
		forms.window(39,
				"{{obj.PasswordChange_SWAINSW.forms_window_USER_WINDOW}}")
				.clickToolBarButton("Save");
		{
			think(0.005);
		}
		forms.statusBar(40, "{{obj.PasswordChange_SWAINSW.forms_statusBar}}")
				.assertText(
						"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40400: Transaction complete: 1 records applied and saved.",
						MatchOption.Exact, 0);
		{
			think(62.855);
		}
		web.window(41, "{{obj.PasswordChange_SWAINSW.web_window_0_2}}").close();
		{
			think(2.295);
		}
		web.window(42, "{{obj.PasswordChange_SWAINSW.web_window_0_3}}").close();
		{
			think(0.253);
		}
		forms.close(43);
		forms.captureScreenshot(45);
		
	}

	public void finish() throws Exception {
	}
}
