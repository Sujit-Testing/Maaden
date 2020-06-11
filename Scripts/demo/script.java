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
		web.window(27, "{{obj.d.web_window_0}}")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window(28, "{{obj.d.web_window_0_1}}").waitForPage(null);
		{
			think(2.828);
		}
		web.textBox(31, "{{obj.d.web_input_text_unamebean}}").click();
		{
			think(5.374);
		}
		web.textBox(32, "{{obj.d.web_input_text_unamebean}}").setText("PEETHAMBARANS");
		{
			think(1.081);
		}
		web.button(33, "{{obj.d.web_button_SubmitButton}}").click();
		web.window(34, "{{obj.d.web_window_0_2}}").waitForPage(null);
		{
			think(4.541);
		}
		web.link(38, "{{obj.d.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window(39, "{{obj.d.web_window_0_2}}").waitForPage(null);
		{
			think(7.434);
		}
		web.link(43, "{{obj.d.web_a_AutoCreate}}").click();
		web.window(44, "{{obj.d.web_window_1}}").waitForPage(null);
		forms.captureScreenshot(49);
		{
			think(74.343);
		}
		forms.textField(50,
				"{{obj.d.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		{
			think(0.007);
		}
		forms.button(51, "{{obj.d.forms_button_FIND_REQ_LINES_CLEAR_0}}")
				.click();
		forms.textField(52,
				"{{obj.d.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		{
			think(0.006);
		}
		forms.button(53, "{{obj.d.forms_button_FIND_REQ_LINES_CLEAR_0}}")
				.click();
		forms.textField(54,
				"{{obj.d.forms_textField_FIND_REQ_LINES_OPERATING_}}")
				.setFocus();
		{
			think(0.024);
		}
		forms.button(55, "{{obj.d.forms_button_FIND_REQ_LINES_CLEAR_0}}")
				.click();
		

	}

	public void finish() throws Exception {
	}
}
