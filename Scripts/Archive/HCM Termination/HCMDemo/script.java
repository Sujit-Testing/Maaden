import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.adf.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.adf.api.ADFService adf;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		getDatabank("HCMDemo").getNextDatabankRecord();
		web.window(117, "{{obj.HCMDemo.web_window}}").navigate("{{db.HCMDemo.URL,https://ejop-test.fa.em2.oraclecloud.com/}}");
		
		web.window(118, "{{obj.HCMDemo.web_window}}").navigate("{{db.HCMDemo.URL,https://ejop-test.fa.em2.oraclecloud.com/}}");
		web.window(119, "{{obj.HCMDemo.web_window}}").waitForPage(180,true);
		
		web.textBox(120, "{{obj.HCMDemo.web_input_text_userid}}").clearText();
		web.textBox(120, "{{obj.HCMDemo.web_input_text_userid}}").setText("{{db.HCMDemo.UID,SinghAR@maaden.com.sa}}");
		web.window(164, "{{obj.HCMDemo.web_window}}").capturePage();
		
		web.textBox(121, "{{obj.HCMDemo.web_input_text_userid}}").pressTab();
		web.textBox(122, "{{obj.HCMDemo.web_input_password_password}}").clearText();
		web.textBox(122, "{{obj.HCMDemo.web_input_password_password}}").setPassword("{{db.HCMDemo.PWD,{{@deobfuscate(ZHLjwGuLQyMgupEPdJt44w==)}}}}");
		
		web.textBox(123, "{{obj.HCMDemo.web_input_password_password}}").pressEnter();
		//web.window(124, "{{obj.HCMDemo.web_window_0_2}}").waitForPage(null);
//		{
//			think(10.576);
//		}
		if(web.alertDialog(126,"{{obj.HCMDemo.web_dialog_alert_The_setting_of__oracle_ad}}").exists()){
		web.alertDialog(126,"{{obj.HCMDemo.web_dialog_alert_The_setting_of__oracle_ad}}").clickOk();
		}
		
		if(web.link(127, "{{obj.HCMDemo.web_a_You_have_a_new_home_page_}}").exists(30, TimeUnit.SECONDS)){
		web.link(127, "{{obj.HCMDemo.web_a_You_have_a_new_home_page_}}").click();
		}
		//web.window(128, "{{obj.HCMDemo.web_window_0_3}}").waitForPage(null);
		{
			think(5.426);
		}
		web.link(130, "{{obj.HCMDemo.web_a_My_Client_Groups}}").click();
//		if(web.link(130, "{{obj.HCMDemo.web_a_My_Client_Groups}}").exists(30,TimeUnit.SECONDS)){
//		web.link(130, "{{obj.HCMDemo.web_a_My_Client_Groups}}").click();
//		}
		if(web.link(131, "{{obj.HCMDemo.web_a_Person_Management}}").exists(30, TimeUnit.SECONDS)){
		web.link(131, "{{obj.HCMDemo.web_a_Person_Management}}").click();
		}
		//web.window(132, "{{obj.HCMDemo.web_window}}").waitForPage(null);
		{
			think(7.101);
		}
		if(web.alertDialog(134,"{{obj.HCMDemo.web_dialog_alert_The_setting_of__oracle_ad}}").exists()){
		web.alertDialog(134,"{{obj.HCMDemo.web_dialog_alert_The_setting_of__oracle_ad}}").clickOk();
		}
		{
			think(2.643);
		}
		web.textBox(135,"{{obj.HCMDemo.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}").click();
		
		web.textBox(136,
				"{{obj.HCMDemo.web_input_text__FOpt1__FOr1_0__FONSr2_0_}}")	.setText("{{db.HCMDemo.Emp_Number,20274}}");
		web.window(164, "{{obj.HCMDemo.web_window}}").capturePage();
		
		web.button(137, "{{obj.HCMDemo.web_button__FOpt1__FOr1_0__FONSr2_0_}}").click();
		{
			think(2.746);
		}
//		web.textBox(138,
//				"{{obj.HCMDemo.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").click();
//		{
//			think(2.368);
//		}
//		web.textBox(139,
//				"{{obj.HCMDemo.web_input_text__FOpt1__FOr1_0__FONSr2_0__1}}").setText("ravi");
//		
//		web.button(140, "{{obj.HCMDemo.web_button__FOpt1__FOr1_0__FONSr2_0_}}")	.click();
		{
			think(3.137);
		}
		web.button(141,
				"{{obj.HCMDemo.web_button__FOpt1__FOr1_0__FONSr2_0__1}}")
				.click();
		
		web.element(142, "{{obj.HCMDemo.web_td_Personal_and_Employment}}")
				.click();
		
		web.element(143, "{{obj.HCMDemo.web_td_Manage_Work_Relationship}}")
				.click();
		//web.window(144, "{{obj.HCMDemo.web_window}}").waitForPage(null);
		{
			think(3.715);
		}
		if(web.alertDialog(146,"{{obj.HCMDemo.web_dialog_alert_The_setting_of__oracle_ad}}").exists()){
			
		web.alertDialog(146,"{{obj.HCMDemo.web_dialog_alert_The_setting_of__oracle_ad}}").clickOk();
		}
		{
			think(0.838);
		}
		if(web.dialog(147,"{{obj.HCMDemo.web_dialog_unknown_Message_from_webpage}}").exists()){
		web.dialog(147,"{{obj.HCMDemo.web_dialog_unknown_Message_from_webpage}}").clickButton(0);
		}
		{
			think(3.357);
		}
		web.link(148, "{{obj.HCMDemo.web_a_27}}").click();
		{
			think(3.893);
		}
		web.element(149, "{{obj.HCMDemo.web_td_Terminate}}").click();
		{
			think(7.355);
		}
		web.link(150, "{{obj.HCMDemo.web_a_41}}").click();
		{
			think(3.048);
		}
		web.element(151, "{{obj.HCMDemo.web_li_Work_location}}").click();
		
		web.textArea(152,
				"{{obj.HCMDemo.web_textarea__FOpt1__FOr1_0__FONSr2_0_}}")
				.setText("{{db.HCMDemo.FreeText,Tin}}");
		
		web.element(153, "{{obj.HCMDemo.web_label_Immediately}}").click();
		
		
		web.link(156, "{{obj.HCMDemo.web_a_50}}").click();
		
		web.element(157, "{{obj.HCMDemo.web_li_Yes}}").click();
		
		web.button(158,	"{{obj.HCMDemo.web_button__FOpt1__FOr1_0__FONSr2_0__2}}").click();
		{
			think(5.155);
		}
		if(web.element(159, "{{obj.HCMDemo.web_span_Cancel}}").exists(30,TimeUnit.SECONDS)){
		web.element(159, "{{obj.HCMDemo.web_span_Cancel}}").click();
		}
		{
			think(7.737);
		}
		web.button(160,	"{{obj.HCMDemo.web_button__FOpt1__FOr1_0__FONSr2_0__3}}").click();
		{
			think(10.495);
		}
//		web.element(161, "{{obj.HCMDemo.web_svg__FOpt1__UIScmil1u__icon}}").click();
//		{
//			think(9.32);
//		}
		web.link(162, "{{obj.HCMDemo.web_a_Sign_Out}}").click();
		//web.window(163, "{{obj.HCMDemo.web_window}}").waitForPage(null);
		{
			think(2.173);
		}
		web.window(164, "{{obj.HCMDemo.web_window}}").close();
		
	}
	
	public void finish() throws Exception {
	}
}
