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
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.applet.api.AppletService applet;
	@ScriptService oracle.oats.scripting.modules.formsFT.api.FormsService forms;
	@FunctionLibrary("PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002") lib.maaden.orackeEBS.PO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002 pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002;
	static int time = 180;
	public void initialize() throws Exception {
		browser.launch();
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		getDatabank("PO_BlanketReleaseCreationWithoutPRAndApproval_007")
				.getNextDatabankRecord();
		web.window(426,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0}}")
				.navigate("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window(428,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_2}}")
				.waitForPage(time, true);
		
		web.textBox(
				431,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_text_unamebean}}")
				.click();
		{
			think(0.917);
		}
		web.textBox(
				432,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_text_unamebean}}")
				.setText("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.UID,PEETHAMBARANS}}");
		{
			think(0.806);
		}
		web.textBox(
				433,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_text_unamebean}}")
				.pressTab();
		{
			think(0.943);
		}
		web.textBox(
				434,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_password_pwdbean}}")
				.setPassword("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		{
			think(0.775);
		}
		web.textBox(
				435,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_password_pwdbean}}").pressEnter();
		web.window(436,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_3}}").waitForPage(time, true);
		{
			think(2.977);
		}
		web.link("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window(	"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_3}}").waitForPage(time, true);
		{
			think(10.149);
		}
		web.element("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_div_menuLayout_div}}").click();
		{
			think(2.055);
		}
		web.link("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_Purchase_Order}}").click();
		web.window("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_3}}").waitForPage(time, true);
		{
			think(2.194);
		}
		web.link(448,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_Releases}}")
				.click();
		web.window(449,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_1}}")
				.waitForPage(time, true);
		forms.captureScreenshot(453);
//		{
//			think(58.714);
//		}
//		forms.textField(
//				454,
//				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_OPERATING_UNI}}")
//				.setFocus();
//		{
//			think(2.434);
//		}
		forms.textField(
				455,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_PO_NUM_0}}")
				.openDialog();
		forms.captureScreenshot(457);
		{
			think(11.699);
		}
		forms.listOfValues("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_listOfValues}}").find("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.BPANumber,%741}}");
		{
			think(3.883);
		}
		forms.listOfValues(955,
		"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_listOfValues}}").select("741600012|Blanket Purchase Agreement|Document has been Approved|ADEL AL-ABDEL KAREEM EST.FOR UNIFORMS|Soheil Mirza|01-MAR-2016|01-MAR-2020");
		forms.captureScreenshot(461);
		{
			think(9.049);
		}
		forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_RELEASE_NUM_0}}").setFocus();
		String releaseNumber  = forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_RELEASE_NUM_0}}").getText();
		info("releaseNumber is : "+releaseNumber);
		forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_PO_NUM_0}}").setFocus();
		String pONumber  = forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_PO_NUM_0}}").getText();
		info("pONumber is: "+pONumber);
		forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_SHIPMENTS_SHIPMENT_NUM}}").setFocus();
		{
			think(0.014);
		}
		forms.statusBar(466,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_statusBar}}")
				.assertText(
						"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40105: Unable to resolve reference to item PO_HEADERS.VENDOR_ID.",
						MatchOption.Exact, 0);
		{
			think(2.314);
		}
		forms.window(
				467,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_window_PO_RELEASES}}")
				.activate(true);
		{
			think(0.325);
		}
		if(forms.alertDialog("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_alertDialog}}").exists()){
			forms.alertDialog("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_alertDialog}}").clickYes();
		}
			forms.captureScreenshot(470);
		{
			think(2.675);
		}
		if(forms.alertDialog("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_alertDialog}}").exists()){
				forms.alertDialog("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_alertDialog}}").clickYes();
			}
		forms.window(
				471,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_window_PO_RELEASES}}")
				.activate(true);
		forms.captureScreenshot(473);
		{
			think(0.194);
		}
		
		forms.captureScreenshot(476);
		{
			think(8.921);
		}
		forms.textField(
				477,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_SHIPMENTS_SOURCE_LINE_}}")
				.setText("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.LineNumber,1}}");
		{
			think(15.122);
		}
		forms.textField(
			971,
			"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_SHIPMENTS_SHIP_TO_ORGA}}").setText("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.listOfValues,MWP}}");
		//forms.listOfValues("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_listOfValues}}").select("MWP|MWP-Waad S Phospate Inventory Organization");
		forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_SHIPMENTS_QUANTITY_0}}").setText("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.Quantity,1}}");
		{
			think(5.92);
		}
		forms.textField(
				479,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_SHIPMENTS_NEED_BY_DATE}}").setText("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.NeedByDate,27-AUG-2021 00:00:00}}");
		{
			think(0.01);
		}
		forms.window(
				480,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_window_PO_RELEASES}}").clickToolBarButton("Save");
		{
			think(1.57);
		}
		forms.statusBar("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_statusBar}}").assertText("FormsFT AutoValidation: Verify StatusBar text value","FRM-40400: Transaction complete: 2 records applied and saved.",
						MatchOption.Exact, 0);
		{
			think(3.816);
		}
		forms.button(
				482,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_button_REL_CONTROL_APPROVAL_0}}")
				.click();
		forms.captureScreenshot(484);
		{
			think(4.743);
		}
		forms.button(
				485,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
				.click();
		forms.captureScreenshot(487);
		{
			think(18.882);
		}
		forms.textField(
				488,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_PO_RELEASES_PO_NUM_0}}")
				.setFocus();
		{
			think(0.008);
		}
		forms.window(
				489,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_window_PO_RELEASES}}")
				.close();
		{
			think(7.727);
		}
		forms.captureScreenshot(513);
		{
			think(0.171);
		}
		
		
		
		web.link(537,"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_Logout}}").click();
		web.window(538,
		"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_2}}").waitForPage(time, true);

		web.window(541,
		"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_4}}").close();
		forms.captureScreenshot(543);

		//call the function
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		
	
		browser.launch();
		think(44.604);
		web.window(426,
		"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0}}")
		.navigate("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.textBox(
				654,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_text_unamebean}}")
				.click();
		{
			think(0.745);
		}
		web.textBox(
				655,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_text_unamebean}}")
				.setText("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.UID,PEETHAMBARANS}}");
		{
			think(0.276);
		}
		web.textBox(
				656,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_text_unamebean}}")
				.pressTab();
		{
			think(0.404);
		}
		web.textBox(
				657,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_password_pwdbean}}")
				.setPassword("{{db.PO_BlanketReleaseCreationWithoutPRAndApproval_007.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		{
			think(0.67);
		}
		web.textBox(
				658,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(659,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_3}}")
				.waitForPage(null);
		{
			think(2.488);
		}
		web.link(
				662,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_MWSPC_PURCHASING_SUPERUSE}}")
				.click();
		web.window(663,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_3}}")
				.waitForPage(null);
		{
			think(9.167);
		}
		web.element(
				666,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_div_menuLayout_div}}").click();
		{
			think(1.843);
		}
		web.link(
				667,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_Purchase_Order}}").click();
		web.window(668,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_3}}").waitForPage(null);
		{
			think(4.54);
		}
		web.link(
				671,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_Purchase_Order_Summary_1}}")	.click();
		{
			think(0.022);
		}
		
		forms.textField(
				878,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_FIND_PO_NUM_0}}").setText(pONumber);
		{
			think(4.556);
		}
		forms.textField(
				879,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_FIND_RELEASE_NUM_0}}")
				.setText(releaseNumber);//
		{
			think(0.0);
		}
		forms.button(
				880,
				"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_button_FIND_FIND_0}}").click();
		{
			think(88.534);
		}
		forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
	{
		think(0.0);
	}
	String status = forms.textField("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").getText();
	info("status is : "+status);
	if(status.equalsIgnoreCase("Approved")){
		web.link("{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_a_Logout}}").click();
		web.window(882,"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_2}}").waitForPage(null);
	{	
	think(2.066);
	}
	web.window(885,
		"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_2}}").close();
	{
	think(0.231);
	}
	web.window(886,
		"{{obj.PO_BlanketReleaseCreationWithoutPRAndApproval_007.web_window_0_4}}").close();
		
	}

	}

	public void finish() throws Exception {
	}
}
