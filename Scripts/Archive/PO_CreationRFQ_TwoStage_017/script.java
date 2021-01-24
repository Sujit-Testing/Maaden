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
		web.window(127, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
		web.window(129, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}").waitForPage(180,true);
		{
			think(5.657);
		}
		web.textBox(132,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_unamebean}}").click();
		
		web.textBox(133,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_unamebean}}").setText("SALEHY");
		
		web.textBox(134,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_unamebean}}").pressTab();
		
		web.textBox(135,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox(136,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_password_pwdbean}}")
				.pressEnter();
		web.window(137, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(180,true);
		
		web.link(140,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_MPC_SOURCING_BUYER}}")
				.click();
		web.window(141, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(180,true);
		
		web.link(144, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Sourcing}}")
				.click();
		web.window(145, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(1.615);
		}
		web.link(148,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_Sourcing_Home_Page}}").click();
		web.window(149, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(3.006);
		}
		web.link(152, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Requisitions}}")
				.click();
		web.window(153, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(1.897);
		}
		web.checkBox(
				156,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_ResultsTable_selected_0}}")
				.check(true);
		{
			think(2.509);
		}
		web.button(157,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_AddToDocumentBuilder}}")
				.click();
		web.window(158, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(1.536);
		}
		web.button(161, "{{obj.PO_CreationRFQ_TwoStage_017.web_button_Create}}")
				.click();
		web.window(162, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(5.787);
		}
		web.textBox(165,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Title}}")
				.click();
		{
			think(1.896);
		}
		web.textBox(166,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Title}}")
				.setText("RFQ_New_Demo4");
		{
			think(8.14);
		}
		web.checkBox(167,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_TwoPartCheck}}")
				.check(true);
		web.window(168, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(7.496);
		}
		web.button(171,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn}}")
				.click();
		web.window(172, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(0.72);
		}
		web.button(545,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_button_Add_Another_Row_3}}")
		.click();
web.window(546, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
		.waitForPage(null);
{
	think(0.094);
}
web.textBox(549,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_2_2}}").click();
{
	think(1.203);
}
web.textBox(550,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_2_2}}").setText("Majed Abdullah Abdulrahman Al-Yahya");
{
	think(10.644);
}
web.textBox(551,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_2_2}}").pressTab();
{
	think(123.6);
}
web.button(552,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_button_Add_Another_Row_3}}").click();
{
	think(36.347);
}
web.textBox(553,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_3_3}}").click();
{
	think(0.689);
}
web.textBox(554,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_3_3}}").setText("Mohemmad Aamer Suharwardi");
{
	think(8.218);
}
web.textBox(555,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_3_3}}").pressTab();
{
	think(147.158);
}
web.button(556,
		"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn_3}}")
		.click();
web.window(557, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
		.waitForPage(null);
{
	think(19.725);
}
		web.window(197, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(1.754);
		}
		web.checkBox(200,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_globalAgreementFlag}}")
				.check(true);
		{
			think(1.465);
		}
		web.textBox(201,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poStartDate}}")
				.click();
		{
			think(0.855);
		}
		web.textBox(202,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poStartDate}}")
				.setText("29-Sep-2019");
		{
			think(2.196);
		}
		web.textBox(203,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poEndDate}}")
				.click();
		{
			think(1.11);
		}
		web.textBox(204,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poEndDate}}")
				.setText("29-Sep-2019");
		{
			think(1.295);
		}
		web.textBox(205,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poAgreedAmount}}")
				.click();
		{
			think(1.49);
		}
		web.textBox(206,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poAgreedAmount}}")
				.setText("100000");
		{
			think(3.9);
		}
		web.textBox(207,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_poMinRelAmount}}")
				.click();
		{
			think(10.63);
		}
		web.selectBox(208,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_select_freightTerms}}")
				.selectOptionByText("DDP");
		{
			think(8.841);
		}
		web.element(209, "{{obj.PO_CreationRFQ_TwoStage_017.web_body_0}}")
				.click();
		{
			think(2.166);
		}
		web.checkBox(210,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_N9_selected_0}}")
				.check(true);
		{
			think(5.288);
		}
		web.button(211,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_AddSection}}")
				.click();
		web.window(212, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(1.76);
		}
		web.textBox(215,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_NameText}}")
				.click();
		{
			think(0.788);
		}
		web.textBox(216,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_NameText}}")
				.setText("Techinical");
		{
			think(8.983);
		}
		web.button(217,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_ApplyAddReq}}")
				.click();
		{
			think(19.206);
		}
		web.selectBox(218,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_select_ScoringMethod}}")
				.selectOptionByText("Manual");
		{
			think(4.513);
		}
		web.textBox(219,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Target}}")
				.click();
		{
			think(0.762);
		}
		web.textBox(220,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Target}}")
				.setText("100000");
		{
			think(2.656);
		}
		web.textBox(221,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Weight}}")
				.click();
		{
			think(1.254);
		}
		web.textBox(222,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Weight}}")
				.setText("50");
		{
			think(1.216);
		}
		web.textBox(223,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_KOScore}}")
				.click();
		{
			think(1.047);
		}
		web.textBox(224,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_KOScore}}")
				.setText("8");
		{
			think(15.511);
		}
		web.element(225, "{{obj.PO_CreationRFQ_TwoStage_017.web_body_0_1}}")
				.click();
		{
			think(0.599);
		}
		web.textArea(226, "{{obj.PO_CreationRFQ_TwoStage_017.web_body_0_1}}")
				.setText("<SPAN lang=EN-IN style='FONT-SIZE: 10pt; FONT-FAMILY: \"Arial\",sans-serif; BACKGROUND: yellow; COLOR: ##1f3864; mso-fareast-font-family: Calibri; mso-fareast-theme-font: minor-latin; mso-highlight: yellow; mso-ansi-language: EN-IN; mso-fareast-language: EN-IN; mso-bidi-language: AR-SA'>Machinery</SPAN>");
		{
			think(4.89);
		}
		web.button(227, "{{obj.PO_CreationRFQ_TwoStage_017.web_button_Apply}}")
				.click();
		web.window(228, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(6.979);
		}
		web.element(231, "{{obj.PO_CreationRFQ_TwoStage_017.web_body_0}}")
				.click();
		{
			think(3.88);
		}
		web.checkBox(232,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_N9_selected_0}}")
				.check(true);
		{
			think(1.815);
		}
		web.button(233,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_AddSection}}")
				.click();
		web.window(234, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(7.275);
		}
		web.textBox(237,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_NameText}}")
				.click();
		{
			think(0.475);
		}
		web.textBox(238,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_NameText}}")
				.setText("Commercial");
		{
			think(11.591);
		}
		web.button(239,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_ApplyAddReq}}")
				.click();
		{
			think(20.185);
		}
		web.element(240, "{{obj.PO_CreationRFQ_TwoStage_017.web_body_0_2}}")
				.click();
		{
			think(0.463);
		}
		web.textArea(241, "{{obj.PO_CreationRFQ_TwoStage_017.web_body_0_2}}")
				.setText(
						"<SPAN lang=EN-IN style='FONT-SIZE: 11pt; FONT-FAMILY: \"Calibri\",sans-serif; BACKGROUND: yellow; mso-fareast-font-family: Calibri; mso-fareast-theme-font: minor-latin; mso-highlight: yellow; mso-ansi-language: EN-IN; mso-fareast-language: EN-US; mso-bidi-language: AR-SA'>TurnOver</SPAN>");
		{
			think(1.42);
		}
		web.textBox(242,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Target}}")
				.click();
		{
			think(0.531);
		}
		web.textBox(243,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Target}}")
				.setText("100000");
		{
			think(5.59);
		}
		web.selectBox(244,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_select_ScoringMethod}}")
				.selectOptionByText("Manual");
		{
			think(3.08);
		}
		web.textBox(245,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Weight}}")
				.click();
		{
			think(0.689);
		}
		web.textBox(246,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_Weight}}")
				.setText("50");
		{
			think(1.08);
		}
		web.textBox(247,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_KOScore}}")
				.click();
		{
			think(1.0);
		}
		web.textBox(248,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_KOScore}}")
				.setText("8");
		{
			think(16.093);
		}
		web.checkBox(249,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_DisplayFlag}}")
				.check(true);
		{
			think(6.25);
		}
		web.button(250, "{{obj.PO_CreationRFQ_TwoStage_017.web_button_Apply}}")
				.click();
		web.window(251, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(1.686);
		}
		web.button(254,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn_1}}")
				.click();
		web.window(255, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(4.48);
		}
		web.link(258, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Lines}}")
				.click();
		web.window(259, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(6.861);
		}
		web.link(262,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_INDICATOR__LIGHT_LED_TR__}}")
				.click();
		web.window(263, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(5.665);
		}
		web.textBox(266,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_StartPrice}}")
				.click();
		{
			think(1.188);
		}
		web.textBox(267,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_StartPrice}}")
				.setText("15");
		{
			think(0.499);
		}
		web.textBox(268,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_StartPrice}}")
				.pressTab();
		{
			think(0.406);
		}
		web.textBox(269,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_TargetPrice}}")
				.setText("10");
		{
			think(9.126);
		}
		web.button(270,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn_2}}")
				.click();
		web.window(271, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(0.039);
		}
		web.button(275, "{{obj.PO_CreationRFQ_TwoStage_017.web_button_OkBtn}}")
				.click();
		web.window(276, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		
		web.element(279,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_td_SideNavBarCFSp1}}")
				.click();
		{
			think(1.351);
		}
		web.element(280, "{{obj.PO_CreationRFQ_TwoStage_017.web_td_Ranking}}")
				.click();
		{
			think(20.931);
		}
		web.link(281, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Controls}}")
				.click();
		web.window(282, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(3.467);
		}
		web.radioButton(285,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_radio_PreviewDateRadioGroup}}")
				.select();
		web.window(286, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(0.03);
		}
		web.element(289, "{{obj.PO_CreationRFQ_TwoStage_017.web_td_72}}")
				.click();
		{
			think(0.716);
		}
		web.radioButton(290,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_radio_OpenDateRadioGroup}}")
				.select();
		web.window(291, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(0.087);
		}
		web.checkBox(294,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_BidScopeCode}}")
				.check(true);
		{
			think(0.553);
		}
		web.checkBox(295,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_BidFrequencyCode}}")
				.check(true);
		{
			think(1.34);
		}
		web.checkBox(296,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_ManualClose}}")
				.check(true);
		{
			think(0.56);
		}
		web.checkBox(297,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_ManualExtend}}")
				.check(true);
		{
			think(9.3);
		}
		web.textBox(298,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_CloseBiddingDate}}")
				.click();
		{
			think(0.53);
		}
		web.textBox(299,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_CloseBiddingDate}}")
				.setText("29-Sep-2019 13:19:14");
		{
			think(1.581);
		}
		web.textBox(300,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_AwardDate}}")
				.click();
		{
			think(0.943);
		}
		web.textBox(301,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_AwardDate}}")
				.setText("29-Sep-2019 13:19:14");
		{
			think(2.815);
		}
		web.button(302,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn_uixr}}")
				.click();
		web.window(303, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(21.135);
		}
		web.link(309, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Suppliers}}")
				.click();
		web.window(310, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(2.141);
		}
		web.button(313,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_AddSupplierBtn}}")
				.click();
		web.window(314, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(20.805);
		}
		web.textBox(317,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_SupplierName}}")
				.click();
		{
			think(0.875);
		}
		web.textBox(318,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_SupplierName}}")
				.setText("FAHAD S AL-TAMIMI & PARTNERS COMPANY");
		{
			think(2.19);
		}
		web.button(319,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SearchButton}}")
				.click();
		web.window(320, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(1.285);
		}
		web.checkBox(323,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_ResultTable_selected_0}}")
				.check(true);
		{
			think(1.211);
		}
		web.button(324,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_AddToSuppListBtn}}")
				.click();
		web.window(325, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(9.824);
		}
		web.textBox(328,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_SupplierName}}")
				.click();
		{
			think(0.055);
		}
		web.textBox(329,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_SupplierName}}")
				.setText("R. B. HILTON SAUDI ARABIA LTD.");
		{
			think(2.005);
		}
		web.button(330,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SearchButton}}")
				.click();
		web.window(331, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(0.738);
		}
		web.checkBox(334,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_checkbox_ResultTable_selected_0}}")
				.check(true);
		{
			think(1.254);
		}
		web.button(335,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_AddToSuppListBtn}}")
				.click();
		web.window(336, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(8.373);
		}
		web.button(339,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_ApplyButton}}")
				.click();
		web.window(340, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(1.225);
		}
		web.button(343,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_ReviewBtn}}")
				.click();
		web.window(344, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(0.12);
		}
		web.button(347,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_Submit4ApprovalBtn}}")
				.click();
		web.window(348, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(1.729);
		}
		web.textArea(351,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_textarea_NoteToApprovers}}")
				.setText("Approve");
		{
			think(1.895);
		}
		web.button(352,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SubmitBtn_uixr}}")
				.click();
		web.window(353, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(5.675);
		}
		web.link(356,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_Requisitions_1}}")
				.click();
		web.window(357, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(4.41);
		}
		web.link(360, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Negotiations}}")
				.click();
		web.window(361, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(1.963);
		}
		web.link(364,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_69082_RFQ_New_Demo1}}")
				.click();
		web.window(365, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500, true);
		{
			think(4.454);
		}
		web.element(368,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_span_In_Process}}")
				.dblClick();
		{
			think(4.527);
		}
		web.button(369,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_CancelBtn}}")
				.click();
		{
			think(2.594);
		}
		web.confirmDialog(
				370,
				"{{obj.PO_CreationRFQ_TwoStage_017.web_dialog_confirm_The_changes_you_made_to_t}}")
				.clickOk();
		web.window(371, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
				.waitForPage(500,true);
		{
			think(2.525);
		}
		web.window(374, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}").close();







//
//		web.window(127, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}").navigate("http://riyoramgbm02.maaden.com:8050/");
//		web.window(129, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}").waitForPage(180,true);
//		{
//			think(5.657);
//		}
//		web.textBox(132,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_unamebean}}").click();
//		
//		web.textBox(133,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_unamebean}}").setText("SALEHY");
//		
//		web.textBox(134,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_unamebean}}").pressTab();
//		
//		web.textBox(135,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
//		
//		web.textBox(136,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_password_pwdbean}}")
//				.pressEnter();
//		web.window(137, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
//				.waitForPage(180,true);
//		
//		web.link(140,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_MPC_SOURCING_BUYER}}")
//				.click();
//		web.window(141, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
//				.waitForPage(180,true);
//		
//		web.link(144, "{{obj.PO_CreationRFQ_TwoStage_017.web_a_Sourcing}}")
//				.click();
//		web.window(145, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
//				.waitForPage(500,true);
//		{
//			think(1.615);
//		}
//		web.link(148,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_a_Sourcing_Home_Page}}").click();
//		web.window(149, "{{obj.PO_CreationRFQ_TwoStage_017.web_window}}")
//				.waitForPage(500,true);
//		{
//			think(3.006);
//		}
//		web.link(576,
//		"{{obj.PO_CreationRFQ_TwoStage_017.web_a_72082_RFQ_New_Demo3_2}}")
//		.click();
//		web.window(542, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
//				.waitForPage(null);
//		{
//			think(8.217);
//		}
//		web.button(545,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_Add_Another_Row_3}}")
//				.click();
//		web.window(546, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
//				.waitForPage(null);
//		{
//			think(0.094);
//		}
//		web.textBox(549,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_2_2}}").click();
//		{
//			think(1.203);
//		}
//		web.textBox(550,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_2_2}}").setText("Majed Abdullah Abdulrahman Al-Yahya");
//		{
//			think(10.644);
//		}
//		web.textBox(551,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_2_2}}").pressTab();
//		{
//			think(123.6);
//		}
//		web.button(552,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_Add_Another_Row_3}}").click();
//		{
//			think(36.347);
//		}
//		web.textBox(553,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_3_3}}").click();
//		{
//			think(0.689);
//		}
//		web.textBox(554,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_3_3}}").setText("Mohemmad Aamer Suharwardi");
//		{
//			think(8.218);
//		}
//		web.textBox(555,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_input_text_N7_Member_3_3}}").pressTab();
//		{
//			think(147.158);
//		}
//		web.button(556,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn_3}}")
//				.click();
//		web.window(557, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
//				.waitForPage(null);
//		{
//			think(19.725);
//		}
//		web.image(560, "{{obj.PO_CreationRFQ_TwoStage_017.web_img_Remove_1}}")
//				.click();
//		web.window(561, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
//				.waitForPage(null);
//		{
//			think(11.47);
//		}
//		web.image(565, "{{obj.PO_CreationRFQ_TwoStage_017.web_img_Remove_2}}")
//				.click();
//		web.window(566, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
//				.waitForPage(null);
//		{
//			think(1.711);
//		}
//		web.button(571,
//				"{{obj.PO_CreationRFQ_TwoStage_017.web_button_SaveBtn_3}}")
//				.click();
//		web.window(572, "{{obj.PO_CreationRFQ_TwoStage_017.web_window_0_4}}")
//				.waitForPage(null);
//		
		
	}

	public void finish() throws Exception {
	}
}
