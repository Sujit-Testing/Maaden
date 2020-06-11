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
	static int time = 180;
	
	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		getDatabank("User_PasswordReset").getNextDatabankRecord();
		web.window(2, "{{obj.User_PasswordReset.web_window_0}}").navigate("{{db.User_PasswordReset.url,http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE}}");
		web.window(4, "{{obj.User_PasswordReset.web_window_0_1}}").waitForPage(time,true);
		
		web.textBox(7, "{{obj.User_PasswordReset.web_input_text_unamebean}}").click();
		
		web.textBox(8, "{{obj.User_PasswordReset.web_input_text_unamebean}}").setText("{{db.User_PasswordReset.user,SWAINSW}}");
		
		web.textBox(9, "{{obj.User_PasswordReset.web_input_text_unamebean}}").pressTab();
		
				
		web.textBox(17, "{{obj.User_PasswordReset.web_input_password_pwdbean}}").setPassword(deobfuscate("dzpvm14k/ONNdv66/asezg=="));
		
		web.textBox(18, "{{obj.User_PasswordReset.web_input_password_pwdbean}}").pressEnter();
		web.window(19, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
		
		
		
		
		
		web.link(94, "{{obj.User_PasswordReset.web_a_System_Administrator}}").click();
		web.window(95, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
		
//		web.element(98, "{{obj.User_PasswordReset.web_div_menuLayout_div_2}}").click();
//		{
//			think(3.788);
//		}
		web.link(99, "{{obj.User_PasswordReset.web_a_Security_1}}").click();
		web.window(100, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
		
		web.link(103, "{{obj.User_PasswordReset.web_a_User_1}}").click();
		web.window(104, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
		
		web.link(107, "{{obj.User_PasswordReset.web_a_Define}}").click();
		web.window(108, "{{obj.User_PasswordReset.web_window_1}}").waitForPage(time,true);

		
		
//		
//		
//		
//		web.element(22, "{{obj.User_PasswordReset.web_div_menuLayout_div}}").click();
//		{
//			think(0.5);
//		}
//		
//		web.image(23, "{{obj.User_PasswordReset.web_img_Expand}}").click();
//		
//		web.window(24, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
//		
//		web.element(27, "{{obj.User_PasswordReset.web_div_menuLayout_div_1}}").click();
//		{
//			think(0.5);
//		}
//		
//		web.link(28, "{{obj.User_PasswordReset.web_a_Security}}").click();
//		web.window(29, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
//		
//		web.link(32, "{{obj.User_PasswordReset.web_a_User}}").click();
//		web.window(33, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
//		
//		web.link(36, "{{obj.User_PasswordReset.web_a_Define}}").click();
//		web.window(37, "{{obj.User_PasswordReset.web_window_1}}").waitForPage(time,true);
		forms.captureScreenshot(41);
		
		forms.textField("{{obj.User_PasswordReset.forms_textField_USER_USER_NAME_0}}").setFocus();
		
		forms.window(43, "{{obj.User_PasswordReset.forms_window_USER_WINDOW}}").clickToolBarButton("Find...");
		forms.captureScreenshot(45);
		{
			think(0.2);
		}
		forms.listOfValues(46, "{{obj.User_PasswordReset.forms_listOfValues}}").find("{{db.User_PasswordReset.user_Name,PEETHAMBARANS}}");
		
		forms.window(47, "{{obj.User_PasswordReset.forms_window_USER_WINDOW}}").activate(true);
		forms.captureScreenshot(49);
		{
			think(0.2);
		}
		forms.listOfValues(50, "{{obj.User_PasswordReset.forms_listOfValues}}").select("{{db.User_PasswordReset.user_Name,PEETHAMBARANS}}");
		forms.captureScreenshot(52);
		
		forms.textField("{{obj.User_PasswordReset.forms_textField_USER_USER_PASSWORD_0}}").setText("{{db.User_PasswordReset.newPasswordToReset,welcome1}}");
		
		forms.textField("{{obj.User_PasswordReset.forms_textField_USER_USER_PASSWORD_0}}").invokeSoftKey("RETURN");
		
		forms.textField("{{obj.User_PasswordReset.forms_textField_USER_USER_PASSWORD_0}}").setText("{{db.User_PasswordReset.newPasswordToReset,welcome1}}");
		
		forms.window(56, "{{obj.User_PasswordReset.forms_window_USER_WINDOW}}").clickToolBarButton("Save");
		{
			think(0.004);
		}
		forms.statusBar(57, "{{obj.User_PasswordReset.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40400: Transaction complete: 1 records applied and saved.",
						MatchOption.Exact, 0);
		forms.captureScreenshot(59);
		{
			think(2.932);
		}
		forms.close(60);
		forms.captureScreenshot(62);
		
		forms.choiceBox(63, "{{obj.User_PasswordReset.forms_choiceBox}}").clickButton("OK");
		
		web.link(64, "{{obj.User_PasswordReset.web_a_Logout}}").click();
		web.window(65, "{{obj.User_PasswordReset.web_window_0_1}}")
				.waitForPage(time,true);
		
		web.textBox(68, "{{obj.User_PasswordReset.web_input_text_unamebean}}").click();
		
		web.textBox(69, "{{obj.User_PasswordReset.web_input_text_unamebean}}").setText("{{db.User_PasswordReset.user_Name,PEETHAMBARANS}}");
		
		web.textBox(70, "{{obj.User_PasswordReset.web_input_text_unamebean}}").pressTab();
		
		web.textBox(71, "{{obj.User_PasswordReset.web_input_password_pwdbean}}").setPassword("{{db.User_PasswordReset.newPasswordToReset,{{@deobfuscate(4zusrct2Oc8OaAiVmHHImw==)}}}}");
		
		web.button(72, "{{obj.User_PasswordReset.web_button_SubmitButton}}").click();
		web.window(73, "{{obj.User_PasswordReset.web_window_0_3}}").waitForPage(time,true);
		
		web.textBox("{{obj.User_PasswordReset.web_input_password_password}}").click();
		
		web.textBox(77,
				"{{obj.User_PasswordReset.web_input_password_password}}").setPassword("{{db.User_PasswordReset.newPasswordToReset,{{@deobfuscate(4zusrct2Oc8OaAiVmHHImw==)}}}}");
		
		web.textBox("{{obj.User_PasswordReset.web_input_password_password}}").pressTab();
		
		web.textBox(79,
				"{{obj.User_PasswordReset.web_input_password_newPassword}}").setPassword("{{db.User_PasswordReset.ChangePassword,{{@deobfuscate(yN/PRambUKU6TB6bYyXqJg==)}}}}");
		
		web.textBox(80,
				"{{obj.User_PasswordReset.web_input_password_newPassword}}").pressTab();
		
		web.textBox("{{obj.User_PasswordReset.web_input_password_newPassword2}}").setPassword("{{db.User_PasswordReset.ChangePassword,{{@deobfuscate(yN/PRambUKU6TB6bYyXqJg==)}}}}");
		
		web.button(82, "{{obj.User_PasswordReset.web_button_Submit}}").click();
		web.window(83, "{{obj.User_PasswordReset.web_window_0_2}}").waitForPage(time,true);
		
		web.link(87, "{{obj.User_PasswordReset.web_a_Logout_1}}").click();
		web.window(88, "{{obj.User_PasswordReset.web_window_0_1}}").waitForPage(time,true);
		
//		if(web.dialog("{{obj.User_PasswordReset.web_dialog_unknown_Do_you_want_to_close_all_}}").exists()){
//			web.dialog("{{obj.User_PasswordReset.web_dialog_unknown_Do_you_want_to_close_all_}}").clickButton(0);
//			{
//				think(0.347);
//			}
//		}
		
		
		web.window(92, "{{obj.User_PasswordReset.web_window_0_1}}").close();
		
		
		
		
	}

	public void finish() throws Exception {
	}
}
