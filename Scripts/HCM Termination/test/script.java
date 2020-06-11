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
		web.window(2,
				"/web:window[@index='0' or @title='Oracle Applications Home Page']")
				.navigate(
						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?page=/oracle/apps/fnd/framework/navigate/webui/HomePG&homePage=Y&OAPB=FWK_HOMEPAGE_BRAND&transactionid=1649826081&oapc=2&oas=G-xLSmqQnkQUsiIAVEVIzQ..##");
		{
			think(8.46);
		}
		web.link(
				4,
				"/web:window[@index='0' or @title='Oracle Applications Home Page']/web:document[@index='0']/web:a[@text='Run' or @href=\"javascript:launchForm(&apos;http://riyoramgbm02.maaden.com:8050/OA_HTML/RF.jsp?function_id=75&resp_id=55428&resp_appl_id=201&security_group_id=0&lang_code=US&oas=9fLJQs0VuLwQ92xbxLCtfQ..&apos;)\" or @index='139']")
				.click();
		web.window(5,
				"/web:window[@index='0' or @title='Oracle Applications Home Page']")
				.waitForPage(null);
		{
			think(212.004);
		}
		web.dialog(9,
				"/web:dialog_unknown[@text='Internet Explorer' or @index='0']")
				.clickButton(0);
		{
			think(39.384);
		}
		web.window(
				10,
				"/web:window[@index='2' or @title='http://riyoramgbm02.maaden.com:8050/OA_CGI/FNDWRR.exe?temp_id=81817350']")
				.close();
		{
			think(61328.045);
		}
		web.window(11,
				"/web:window[@index='0' or @title='Oracle Applications Home Page']")
				.close();
		{
			think(2.345);
		}
		web.window(12,
				"/web:window[@index='0' or @title='Oracle Applications R12']")
				.close();

	}

	public void finish() throws Exception {
	}
}
