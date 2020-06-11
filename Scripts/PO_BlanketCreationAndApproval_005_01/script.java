import java.util.concurrent.TimeUnit;

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
		
		getDatabank("PO_BlanketCreationAndApproval_005").getNextDatabankRecord();
		web.window(34,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").navigate("{{db.PO_BlanketCreationAndApproval_005.URL,http://riyoramgbm02.maaden.com:8050/}}");
		{
			think(0.329);
		}
		web.window(35,"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").navigate("{{db.PO_BlanketCreationAndApproval_005.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window(36,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);
		
		web.textBox(39,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_UID}}").click();
	
		web.textBox(40,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_UID}}").setText("{{db.PO_BlanketCreationAndApproval_005.UID,PEETHAMBARANS}}");
	
		web.textBox(41,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_UID}}").pressTab();
	
		web.textBox(42,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_PWD}}").setPassword("{{db.PO_BlanketCreationAndApproval_005.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
	
		web.button(43,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_button_SubmitButton}}")
				.click();
		web.window(44,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);;
	
		web.link("{{obj.PO_BlanketCreationAndApproval_005_01.web_MWSPC_PURCHASING_SUPERUSE}}").click();
		{
			think(5.01);
		}
		web.window(48,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);;
	
		web.element(51,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_div_menuLayout_div}}").click();
		{
			think(3.01);
		}
		web.link("{{obj.PO_BlanketCreationAndApproval_005_01.web_a_Purchase_Order}}").click();
		{
			think(5.01);
		}
//		web.window(53,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);;
//		
		web.link(56,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_Purchase_Orders}}")
				.click();
		web.window("{{obj.PO_BlanketCreationAndApproval_005_01.web_window_1}}")	.waitForPage(time,true);;
		forms.captureScreenshot(61);
		
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_OPERATING_UNIT}}").setFocus();
		if(forms.textField(
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_Type}}").exists(time, TimeUnit.SECONDS))
		{			
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_Type}}").setText("{{db.PO_BlanketCreationAndApproval_005.Type,Blanket Purchase Agreement}}");
		{
			think(0.008);
		}
		}
		if(forms.textField(
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_SupplierName}}").exists(time, TimeUnit.SECONDS)){
			forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_SupplierName}}").setText("{{db.PO_BlanketCreationAndApproval_005.Supplier,GENERAL INDUSTRIES Co. Ltd.}}");
			{
				think(0.008);
			}
		}
		if(forms.textField(
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_SiteName}}").exists(time, TimeUnit.SECONDS)){
			forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_SiteName}}").setText("{{db.PO_BlanketCreationAndApproval_005.Site,AL KHOBAR}}");	
			{
				think(0.008);
			}
		}
		
		if(forms.textField(
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_AmountAgreed}}")
				.exists(time, TimeUnit.SECONDS)){
			forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_AmountAgreed}}").setText("{{db.PO_BlanketCreationAndApproval_005.AmountAgreed,100000}}");
			{
				think(0.008);
			}
		}
		
				
		forms.checkBox("{{obj.PO_BlanketCreationAndApproval_005_01.forms_GlobalAgreementCheckBox}}").check(true);
		{
			think(5.008);
		}
		
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_ItemNumber}}").setFocus();
		{
			think(0.008);
		}
		forms.statusBar(360,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_statusBar}}").assertText(	"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40202: Field must be entered.", MatchOption.Exact,	0);
		forms.captureScreenshot(362);
		
		
		
		
		if(forms.textField(
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_IncoTerm}}").exists(time, TimeUnit.SECONDS)){
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_IncoTerm}}").setText("{{db.PO_BlanketCreationAndApproval_005.IncoTerm,DDP}}");	
		}
		
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_StartDate}}").setText("25-JUL-2019");
		
		forms.textField(
				368,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_EndDate}}").setText("21-DEC-2021");
		{
			think(0.012);
		}
		forms.window(369,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_PO_HEADER_DETAIL}}").close();
		forms.captureScreenshot(371);
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_DESC_FLEX_0}}").setFocus();
		forms.captureScreenshot(496);
		{
			think(0.314);
		}
		forms.flexWindow(497,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_flexWindow}}").setText("Discount Note", "", "{{db.PO_BlanketCreationAndApproval_005.Note,Note}}");
		{
			think(2.549);
		}
		forms.flexWindow(498,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_flexWindow}}").setText("Discount Amount", "", "{{db.PO_BlanketCreationAndApproval_005.Amount,10}}");
		{
			think(2.549);
		}
		
		forms.flexWindow("{{obj.PO_BlanketCreationAndApproval_005_01.forms_flexWindow}}").setTextAndClickOk("Currency", "", "{{db.PO_BlanketCreationAndApproval_005.Currency1,AED}}");
		forms.captureScreenshot(501);
		{
			think(6.425);
		}
		forms.textField(
				372,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_Type}}").setFocus();
		{
			think(5.374);
		}
		forms.textField(
				373,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_ItemNumber}}").setText("{{db.PO_BlanketCreationAndApproval_005.Item,1000350101}}");
		{
			think(10.76);
		}
		forms.textField(
				374,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_Price}}").setText("{{db.PO_BlanketCreationAndApproval_005.Price,100}}");
		{
			think(0.012);
		}
		forms.window(375,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_PO_HEADERS}}").clickToolBarButton("Save");
		{
			think(1.096);
		}
		forms.statusBar(376,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_statusBar}}")
				.assertText(
						"FormsFT AutoValidation: Verify StatusBar text value",
						"FRM-40400: Transaction complete: 2 records applied and saved.",
						MatchOption.Exact, 0);
		
		//forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_SEGMENT1_0}}").exists(180, TimeUnit.SECONDS);
			
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
		String pONumber = forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_SEGMENT1_0}}").getText();
		info("pONumber is -> "+pONumber);
		forms.captureScreenshot();
		
		forms.button(
				378,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_button_PO_CONTROL_APPROVE_0}}")
				.click();
		forms.captureScreenshot(380);
		{
			think(7.748);
		}
		forms.button(
				381,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_button_PO_APPROVE_WF_OK_BUTTON_0}}")
				.click();
		forms.captureScreenshot(383);
		{
			think(15.523);
		}
		forms.textField(
				384,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_OPERATING_UNIT}}")
				.setFocus();
		{
			think(0.012);
		}
		forms.window(385,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_PO_HEADERS}}").close();
		
		forms.captureScreenshot(409);
		
	
		web.link(483,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_a_Logout}}")
				.click();
		web.window(484,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}")
				.waitForPage(time,true);;
	
		web.window(487,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window_1}}")
				.close();

		//Call the function
		browser.launch();
		pO_CreateBlanketReleaseAndApproval_User_LATKOVICG_002.run();
		
		
		
		//Open and checking the status of the PO Number
		browser.launch();
		

		
		web.window(608,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}")
				.navigate("{{db.PO_BlanketCreationAndApproval_005.URL,http://riyoramgbm02.maaden.com:8050/}}");
		{
			think(0.366);
		}
		web.window(609,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}")
				.navigate("{{db.PO_BlanketCreationAndApproval_005.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window(610,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}")
				.waitForPage(time,true);;
	
		web.textBox(613,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_UID}}")
				.click();
		{
			think(0.902);
		}
		web.textBox(614,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_UID}}").setText("{{db.PO_BlanketCreationAndApproval_005.UID,PEETHAMBARANS}}");
	
		web.textBox(615,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_UID}}").pressTab();
		
		web.textBox(616,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_PWD}}").setPassword("{{db.PO_BlanketCreationAndApproval_005.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
	
		web.button(617,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_button_SubmitButton}}")	.click();
		web.window(618,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);;
	
		web.link(621,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_MWSPC_PURCHASING_SUPERUSE}}")	.click();
		{
			think(6.577);
		}
		web.window(622,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);;
	
		web.element(625,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_div_menuLayout_div}}").click();
		{
			think(3.577);
		}
		web.link(626,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_a_Purchase_Order}}").click();
		web.window(627,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}")
				.waitForPage(time,true);;
		
		web.link(630,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_Purchase_Order_Summary_1}}")
				.click();
		web.window(631,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window_1}}")
				.waitForPage(time,true);;
		forms.captureScreenshot(635);
		
		forms.textField(
				636,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_FIND_OPERATING_UNIT_0}}")
				.setFocus();
		{
			think(3.725);
		}
		forms.textField(637,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_FIND_PO_NUM_0}}").setText(pONumber);
		{
			think(0.015);
		}
		forms.button(638,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_button_FIND_FIND_0}}")
				.click();
		forms.captureScreenshot(640);
		{
			think(22.933);
		}
		forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").setFocus();
		String status=forms.textField("{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_HEADERS_FOLDER_AUTHORIZAT}}").getText();
		if(status.equalsIgnoreCase("Approved")){
			info("Status has been changed from Incomplete to "+status);
			
		}
		forms.window(642,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_HEADERS_FOLDER}}").selectMenu("Inquire|View Action History");
		forms.captureScreenshot(644);
		{
			think(9.677);
		}
		forms.textField(
				645,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_ACTION_HISTORY_ACTION_}}").setFocus();
		{
			think(0.0);
		}
		forms.window(646,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_PO_ACTION_HISTORY}}")
				.close();
		forms.captureScreenshot(648);
		{
			think(5.115);
		}
		forms.window(649,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_HEADERS_FOLDER}}")
				.close();
		forms.captureScreenshot(651);
		{
			think(4.611);
		}
		forms.textField(
				652,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		{
			think(0.015);
		}
		forms.window(653,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_window_FIND}}").close();
		forms.captureScreenshot(655);
		{
			think(3.461);
		}
		forms.close(656);
		forms.captureScreenshot(658);
		{
			think(3.771);
		}
		forms.choiceBox(659,
				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_choiceBox}}").clickButton("OK");
		{
			think(15.424);
		}
		web.link(660,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_a_Logout}}").click();
		web.window(661,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").waitForPage(time,true);;
		
		web.window(664,
				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window_1}}").close();
		web.window(610,
		"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}").close();
//		web.window(665,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.web_window}}")
//				.navigate(
//						"http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE##");
//		forms.captureScreenshot(668);
//		{
//			think(14.474);
//		}
//		forms.textField(669,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_Type}}")
//				.setFocus();
//		{
//			think(5.193);
//		}
//		forms.textField(
//				670,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_textField_PO_HEADERS_DESC_FLEX_0}}")
//				.setFocus();
//		forms.captureScreenshot(672);
//		{
//			think(0.274);
//		}
//		forms.flexWindow(673,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_flexWindow}}")
//				.setText("Discount Note", "", "note");
//		{
//			think(2.462);
//		}
//		forms.flexWindow(674,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_flexWindow}}")
//				.setText("Discount Amount", "", "10");
//		{
//			think(4.312);
//		}
//		forms.flexWindow(675,
//				"{{obj.PO_BlanketCreationAndApproval_005_01.forms_flexWindow}}")
//				.setTextAndClickOk("Currency", "", "AED");

	}

	public void finish() throws Exception {
	}
}
