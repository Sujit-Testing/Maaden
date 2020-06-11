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
	 * As per the discussion with Developer in new instance approval is not required where as old instance in which I am working, is required for the approval
	 */
	public void run() throws Exception {
		getDatabank("PO_InternalRequisition_014").getNextDatabankRecord();
		web.window(518, "{{obj.PO_InternalRequisition_014.web_window}}").navigate("{{db.PO_InternalRequisition_014.URL,http://riyoramgbm02.maaden.com:8050/}}");
		//web.window(520, "{{obj.PO_InternalRequisition_014.web_window}}").navigate("{{db.PO_InternalRequisition_014.URL,http://riyoramgbm02.maaden.com:8050/}}");
		web.window(521, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(5.132);
		}
		web.textBox(524,
				"{{obj.PO_InternalRequisition_014.web_UID}}").click();
		
		web.textBox(525,
				"{{obj.PO_InternalRequisition_014.web_UID}}").setText("{{db.PO_InternalRequisition_014.UID,PEETHAMBARANS}}");
	
		web.textBox(526,
				"{{obj.PO_InternalRequisition_014.web_UID}}").pressTab();
		
		web.textBox(527,
				"{{obj.PO_InternalRequisition_014.web_Password}}").setPassword("{{db.PO_InternalRequisition_014.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		
		web.textBox(528,
				"{{obj.PO_InternalRequisition_014.web_Password}}").pressEnter();
		web.window(529, "{{obj.PO_InternalRequisition_014.web_window}}").waitForPage(null);
		{
			think(3.244);
		}
		web.link(532,
				"{{obj.PO_InternalRequisition_014.web_a_MAC_ROLLING_IPROCUREMENT}}").click();
		web.window(533, "{{obj.PO_InternalRequisition_014.web_window}}").waitForPage(null);
		{
			think(4.14);
		}
		web.link(536,
				"{{obj.PO_InternalRequisition_014.web_a_iProcurement_Home_Page}}").click();
		web.window(537, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(0.752);
		}
		web.selectBox(631,
		"{{obj.PO_InternalRequisition_014.web_select_SearchableStores}}")
		.selectOptionByText("Office Supplies (global)");
		web.textBox(540,
				"{{obj.PO_InternalRequisition_014.web_input_text_SearchTextInput}}")
				.click();
		{
			think(0.457);
		}
		web.textBox(541,
				"{{obj.PO_InternalRequisition_014.web_input_text_SearchTextInput}}")
				.setText("{{db.PO_InternalRequisition_014.SearchKeyWord,hp%}}");
		{
			think(3.139);
		}
		web.button(542,
				"{{obj.PO_InternalRequisition_014.web_button_SearchBoxGo}}")
				.click();
		web.window(543, "{{obj.PO_InternalRequisition_014.web_window}}").waitForPage(null);
		{
			think(3.46);
		}
		web.element(546,
				"{{obj.PO_InternalRequisition_014.web_span_1000015357}}")
				.click();
		{
			think(3.496);
		}
		web.button(547,
				"{{obj.PO_InternalRequisition_014.web_button_SearchResultsTableRN1_Add}}")
				.click();
		web.window(548, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(2.288);
		}
		web.button(551,
				"{{obj.PO_InternalRequisition_014.web_button_Checkout}}")
				.click();
		web.window(552, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(2.412);
		}
		web.button(555,
				"{{obj.PO_InternalRequisition_014.web_CheckoutButton}}")
				.click();
		web.window(556, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(2.364);
		}
		web.textBox(559,
				"{{obj.PO_InternalRequisition_014.web_input_text_DeliverToLocation}}")
				.click();
		{
			think(1.285);
		}
		web.textBox(560,
				"{{obj.PO_InternalRequisition_014.web_input_text_DeliverToLocation}}")
				.click();
		{
			think(0.028);
		}
		web.textBox(561,
				"{{obj.PO_InternalRequisition_014.web_input_text_DeliverToLocation}}")
				.setText("{{db.PO_InternalRequisition_014.Deliver_To_Location,Al-Jubail}}");
		{
			think(8.143);
		}
		web.button(562,
				"{{obj.PO_InternalRequisition_014.web_FirstPageNextButton}}")
				.click();
		web.window(563, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(1.639);
		}
		web.button(566,
				"{{obj.PO_InternalRequisition_014.web_SecondPageNextButton}}")
				.click();
		web.window(567, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(1.116);
		}
		web.button(570,
				"{{obj.PO_InternalRequisition_014.web_button_SubmitButton_uixr}}")
				.click();
		web.window(571, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(1.194);
		}
		web.button(574,
				"{{obj.PO_InternalRequisition_014.web_button_Continue_Shopping}}")
				.click();
		web.window(575, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(1.368);
		}
		String status = web.element(578, "{{obj.PO_InternalRequisition_014.web_td_In_Process}}").getDisplayText();
		info("status is -> "+status);
		web.element(578, "{{obj.PO_InternalRequisition_014.web_td_In_Process}}").click();
		{
			think(1.038);
		}
//		web.link(579, "{{obj.PO_InternalRequisition_014.web_a_In_Process}}")
//				.click();
		web.window(580, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(6.357);
		}
		web.link(583, "{{obj.PO_InternalRequisition_014.web_a_Logout}}")
				.click();
		web.window(584, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(5.859);
		}
		web.textBox(587,
				"{{obj.PO_InternalRequisition_014.web_UID}}")
				.click();
		{
			think(0.549);
		}
		web.textBox(588,
				"{{obj.PO_InternalRequisition_014.web_UID}}")
				.setText("{{db.PO_InternalRequisition_014.Approver_User,RAWTHERS}}");
		{
			think(0.235);
		}
		web.textBox(589,
				"{{obj.PO_InternalRequisition_014.web_UID}}")
				.pressTab();
		{
			think(1.663);
		}
		web.textBox(590,
				"{{obj.PO_InternalRequisition_014.web_Password}}")
				.setPassword("{{db.PO_InternalRequisition_014.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		{
			think(0.809);
		}
		web.textBox(591,
				"{{obj.PO_InternalRequisition_014.web_Password}}")
				.pressEnter();
		web.window(592, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(2.022);
		}
		web.link(595,
				"{{obj.PO_InternalRequisition_014.web_a_Purchase_Requisition_6311}}")
				.click();
		web.window(596, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(0.271);
		}
		web.button(600, "{{obj.PO_InternalRequisition_014.web_button_Approve}}")
				.click();
		web.window(601, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(1.819);
		}
		web.link(604, "{{obj.PO_InternalRequisition_014.web_a_Logout_1}}")
				.click();
		web.window(605, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(3.69);
		}
		web.textBox(608,
				"{{obj.PO_InternalRequisition_014.web_UID}}")
				.click();
		{
			think(0.541);
		}
		web.textBox(609,
				"{{obj.PO_InternalRequisition_014.web_UID}}")
				.setText("{{db.PO_InternalRequisition_014.UID,PEETHAMBARANS}}");
		{
			think(1.343);
		}
		web.textBox(610,
				"{{obj.PO_InternalRequisition_014.web_UID}}")
				.pressTab();
		{
			think(0.431);
		}
		web.textBox(611,
				"{{obj.PO_InternalRequisition_014.web_Password}}")
				.setPassword("{{db.PO_InternalRequisition_014.PWD,{{@deobfuscate(vWeMH+MT9Gy3Y8SojsL+Mg==)}}}}");
		{
			think(0.363);
		}
		web.textBox(612,
				"{{obj.PO_InternalRequisition_014.web_Password}}")
				.pressEnter();
		web.window(613, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(3.444);
		}
		web.link(616,
				"{{obj.PO_InternalRequisition_014.web_a_MAC_ROLLING_IPROCUREMENT}}")
				.click();
		web.window(617, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(0.973);
		}
		web.link(620,
				"{{obj.PO_InternalRequisition_014.web_a_iProcurement_Home_Page_1}}")
				.click();
		web.window(621, "{{obj.PO_InternalRequisition_014.web_window}}")
				.waitForPage(null);
		{
			think(2.739);
		}
		web.element(624, "{{obj.PO_InternalRequisition_014.web_td_Approved}}").click();
		String status1 = web.element(624, "{{obj.PO_InternalRequisition_014.web_td_Approved}}").getDisplayText();
		if(status1.equalsIgnoreCase("Approved")){
			info("status1-->"+status1);
			web.link(625, "{{obj.PO_InternalRequisition_014.web_a_Logout_2}}").click();
			web.window(626, "{{obj.PO_InternalRequisition_014.web_window}}").waitForPage(null);
			
		}
		
				
		web.window(626, "{{obj.PO_InternalRequisition_014.web_window}}").close();
		
		
				
		
	}

	public void finish() throws Exception {
	}
}
