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
		web.window(2, "{{obj.HCM_DefectTesting.web_window_0}}")
				.navigate(
						"https://ejop-test.login.em2.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DUwPZv10x5U%2B3mIubEg4moKZjBGxOwfdPv2LxXjj91AZXE2IKvjWlw4PZN7hFmdTG%2BIK3mLxNDVQcHOUeIHbxIV%2FGW62UEUF7w%2BcOks6YUPO%2Banxcs7awvdnZSbGln%2BV0cB37%2BKn6OoFs846LQbMIZrWQnSGMYj07%2Fusz6VkQtef18L2%2B0EmtpWYaHcBCd2BRK32UgWghscnWPkDXG2QCt%2FiifKF2SOKTSXxYqFN6PmUgBXAqmkaXK4Eq4LgL85H8mpXorM3dMU4nAmVUj6WkEoGBNWBW7g%2BnU%2BHtbQbK3BisRvUHabfzeHZSQtitqM5VzrCID8SR7NlmFCL2w39w1u6U08BDkhFI6EBxrHqi6X1Wah6zz561jEiZTbrw4Fzlgcc0KpBfJ4w2HZT3tpVGWqCXtOJLW7gKJFoERDWDYBE9MCrsajDC31HH5Phf0Kb%2F2Qy5ISbfAeEBMw4yvvjeAdbxCk3lTP7yd05VAtQGa6qIjbnchK2DRhbm2Fz7pHoqbOmcAJX3mQVEQOdLUmWcrQ%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D1b47fe7bc793dfb61781450c52bd6e238d44e697&ECID-Context=1.005dBmlYgvR8Xrg_lDc9yZ0003ZW0001Pq%3BkXjE");
		web.window(4, "{{obj.HCM_DefectTesting.web_window_0_1}}").waitForPage(
				null);
		
		web.textBox(5, "{{obj.HCM_DefectTesting.web_input_text_userid}}")
				.setText("Sujit.swain");
		
		web.textBox(6, "{{obj.HCM_DefectTesting.web_input_text_userid}}")
				.pressTab();
		
		web.button(7, "{{obj.HCM_DefectTesting.web_button_btnActive}}").click();
		web.window(8, "{{obj.HCM_DefectTesting.web_window_0_2}}").waitForPage(
				null);
		
		web.link(10,
				"{{obj.HCM_DefectTesting.web_a_groupNode_workforce_manag}}")
				.click();
		
		web.link(11,
				"{{obj.HCM_DefectTesting.web_a_itemNode_workforce_manage}}")
				.click();
		web.window(12, "{{obj.HCM_DefectTesting.web_window_0_3}}").waitForPage(
				null);
		
		adf.commandLink(15,
				"{{obj.HCM_DefectTesting.web_ADFCommandLink__FOpt1__FOr1__FOSritemNod}}")
				.click();
		{
			think(0.285);
		}
		
		adf.inputText(17,
				"{{obj.HCM_DefectTesting.web_ADFInputText__FOpt1__FOr1__FOSritemNod}}")
				.setValue("manager");
				adf.query(18, "{{obj.HCM_DefectTesting.web_ADFQuery_Search}}")
				.clickButton("Search");
		{
			think(0.1);
		}
		adf.table(19,
				"{{obj.HCM_DefectTesting.web_ADFTable__FOpt1__FOr1__FOSritemNod}}")
				.rowSelectByIndex(0);
		{
			think(0.11);
		}
		adf.commandLink(20,
				"{{obj.HCM_DefectTesting.web_ADFCommandLink__FOpt1__FOr1__FOSritemNod_1}}")
				.click();
		{
			think(6.807);
		}
		adf.commandToolbarButton(
				21,
				"{{obj.HCM_DefectTesting.web_ADFCommandToolbarButton__FOpt1__FOr1__FOSritemNod}}")
				.clickButton();
		{
			think(4.504);
		}
		adf.commandImageLink(22,
				"{{obj.HCM_DefectTesting.web_ADFCommandImageLink__FOpt1__UIScmil1u}}")
				.click();
		{
			think(6.199);
		}
		adf.commandLink(23,
				"{{obj.HCM_DefectTesting.web_ADFCommandLink__FOpt1__UISlg1}}")
				.click();
		web.window(24, "{{obj.HCM_DefectTesting.web_window_0_5}}").waitForPage(
				null);

	}
	
	public void finish() throws Exception {
	}
}
