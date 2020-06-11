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
	 * Scenario - Internal_Requisition
	 * Steps-
	 * 1)Login the application 
	 * 2)Opening the iProcurement_Home_Page
	 * 3)Click the Copy image
	 * 4)Click CheckOut Button
	 * 5)Click Next Button - >Get the No Approval Text
	 * 6)Click Next Button-> Click Submit Button
	 * 7)Capture the Requisition Number
	 * 8)Click Continue Shopping Button
	 * 9)Capture the approval status
	 * 10)LogOut the application
	 * 
	 */
	public void run() throws Exception {
		getDatabank("PO_Internal_Requisition_00128").getNextDatabankRecord();
		//Login the application 
		web.window(2, "{{obj.PO_Internal_Requisition_00128.web_window}}").navigate("{{db.PO_Internal_Requisition_00128.URL,http://riyoramgbm02.maaden.com:8050/OA_HTML/OA.jsp?OAFunc=OAHOMEPAGE}}");		
		web.window(5, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);		
		web.textBox("{{obj.PO_Internal_Requisition_00128.UID}}").setText("{{db.PO_Internal_Requisition_00128.UID,ENEZIK}}");			
		web.textBox("{{obj.PO_Internal_Requisition_00128.PWD}}").setPassword("{{db.PO_Internal_Requisition_00128.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		web.button("{{obj.PO_Internal_Requisition_00128.Login_SubmitButton}}").click();		
		web.window(12, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		
		//Opening the iProcurement_Home_Page
		web.link("{{obj.PO_Internal_Requisition_00128.MAC_ROLLING_IPROCUREMENT}}").click();
		web.window(16, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);		
		web.link("{{obj.PO_Internal_Requisition_00128.iProcurement_Home_Page}}").click();
		web.window(20, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		
		//Click the Copy image
		web.image("{{obj.PO_Internal_Requisition_00128.web_img_Copy_Requisitions}}").click();
		web.window(24, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		//Click CheckOut Button
		web.button("{{obj.PO_Internal_Requisition_00128.Checkout_Button}}").click();
		web.window(28, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		//Click Next Button
		web.button("{{obj.PO_Internal_Requisition_00128.Next_Button}}").click();
		web.window(32, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		//Get the No Approval Text
		web.element("{{obj.PO_Internal_Requisition_00128.No_Approvals_Required_Text}}").dblClick();
		info("Approval Text  -> "+web.element("{{obj.PO_Internal_Requisition_00128.No_Approvals_Required_Text}}").getDisplayText());
		//Click Next Button	
		web.button("{{obj.PO_Internal_Requisition_00128.web_button_Ne_SPAN_class_xq_Oracle_O_1}}").click();
		web.window(39, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		//Click Submit Button
		web.button("{{obj.PO_Internal_Requisition_00128.SubmitButton}}").click();
		web.window(43, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		//Get the requisition Number after creation
		web.element("{{obj.PO_Internal_Requisition_00128.web_b_Requisition_6311902377}}").focus();
		web.window(43, "{{obj.PO_Internal_Requisition_00128.web_window}}").capturePage();
		info(web.element("{{obj.PO_Internal_Requisition_00128.web_b_Requisition_6311902377}}").getDisplayText());
		String requisitionText = web.element("{{obj.PO_Internal_Requisition_00128.web_b_Requisition_6311902377}}").getDisplayText();
		String[] requisitionValue = requisitionText.split(" ");
		info("Created Requition is -> "+requisitionValue[1]);
		//Click Continue_Shopping button
		web.button("{{obj.PO_Internal_Requisition_00128.Continue_Shopping}}").click();
		web.window("{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);
		//Get Requisition Status
		web.element(51, "{{obj.PO_Internal_Requisition_00128.Approved}}").focus();
		info("Created requisition status is -> "+web.element(51, "{{obj.PO_Internal_Requisition_00128.Approved}}").getDisplayText());
		web.window(43, "{{obj.PO_Internal_Requisition_00128.web_window}}").capturePage();
		
	}

	public void finish() throws Exception {
		//Logout
		web.link(52, "{{obj.PO_Internal_Requisition_00128.Logout}}").click();
		web.window(53, "{{obj.PO_Internal_Requisition_00128.web_window}}").waitForPage(180,true);		
		web.window(56, "{{obj.PO_Internal_Requisition_00128.web_window}}").close();
	}
}
