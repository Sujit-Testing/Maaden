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
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_0}}").navigate("http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE");
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_0_1}}").waitForPage(180,true);
		
		web.textBox("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_input_text_unamebean}}").click();
		web.textBox("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_input_text_unamebean}}").setText("PEETHAMBARANS");
		
		web.textBox("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_input_text_unamebean}}").pressTab();
		
		web.textBox("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_input_password_pwdbean}}").setPassword(deobfuscate("vWeMH+MT9Gy3Y8SojsL+Mg=="));
		
		web.textBox("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_input_password_pwdbean}}").pressEnter();
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_0_2}}").waitForPage(180,true);
		
		web.link("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_a_MWSPC_PURCHASING_SUPERUSE}}").click();
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_0_2}}").waitForPage(180,true);
		
		web.element("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_div_menuLayout_div}}").click();
		{
			think(1.914);
		}
		
		web.link("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_a_Purchase_Order}}").click();		
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_0_2}}").waitForPage(180,true);
		
		web.link("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_a_Purchase_Order_Summary}}").click();
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_1}}").waitForPage(180,true);
		forms.captureScreenshot(33);
		
		forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		
		forms.tab("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_tab_LIST_REGION_CONTROL}}").select("Related Documents");
		
		
		forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_FIND_INVOICE_NUM_0}}").openDialog();
		forms.captureScreenshot(52);
		
		forms.listOfValues("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_listOfValues}}").find("019/2018");
		{
			think(0.39);
		}
		forms.listOfValues("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_listOfValues}}").select("019/2018|09-DEC-2018|ADVANCED CONCEPTS CONTRACTING CO.LTD");
		forms.captureScreenshot(56);
		
		forms.button("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_button_FIND_FIND_0}}").click();
		forms.captureScreenshot(59);
		{
			think(1.914);
		}
		forms.button("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_button_SHIPMENTS_FOLDER_CONTROL_}}").click();
		forms.captureScreenshot(62);
		{
			think(2.39);
		}
		
		forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_PO_HEADERS_OPERATING_UNIT}}").setFocus();
		
		forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_PO_HEADERS_SEGMENT1_0}}").setFocus();
		info("PO Number->"+forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_PO_HEADERS_SEGMENT1_0}}").getText());
		
		forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_PO_HEADERS_STATUS_0}}").setFocus();
		info(forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_PO_HEADERS_STATUS_0}}").getText());
		
		forms.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_window_PO_HEADERS}}").close();
		{
			think(0.304);
		}
		forms.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_window_SHIPMENTS_FOLDER}}").activate(true);
		forms.captureScreenshot(69);
		
		forms.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_window_SHIPMENTS_FOLDER}}").close();
		forms.captureScreenshot(72);
		
		forms.textField("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_textField_FIND_OPERATING_UNIT_0}}").setFocus();
		{
			think(0.016);
		}
		forms.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_window_FIND}}").close();
		forms.captureScreenshot(76);
		
		forms.close(77);
		forms.captureScreenshot(79);
		
		forms.choiceBox("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.forms_choiceBox}}").clickButton("OK");
		
		web.link(81,
				"{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_a_Logout}}").click();
		web.window(82,
				"{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_0_1}}").waitForPage(180,true);
		
		web.dialog("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_dialog_unknown_Do_you_want_to_close_all_}}").clickButton(0);
	
		web.window("{{obj.PO_Search_FindPODetailsUsing_Invoice_Number_00102.web_window_1}}").close();

	}

	public void finish() throws Exception {
	}
}
