import java.util.concurrent.TimeUnit;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@ScriptService oracle.oats.scripting.modules.datatable.api.DataTableService datatable;
	
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		web.window(71, "{{obj.HCM_LogIn_LogOut.web_window}}").navigate("https://ejop-test.login.em2.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DUwPZv10x5U%2B3mIubEg4moKZjBGxOwfdPv2LxXjj91AZXE2IKvjWlw4PZN7hFmdTG%2BIK3mLxNDVQcHOUeIHbxIV%2FGW62UEUF7w%2BcOks6YUPO%2Banxcs7awvdnZSbGln%2BV0cB37%2BKn6OoFs846LQbMIZrWQnSGMYj07%2Fusz6VkQtef18L2%2B0EmtpWYaHcBCd2BRK32UgWghscnWPkDXG2QCt%2FiifKF2SOKTSXxYqFN6PmUgBXAqmkaXK4Eq4LgL85H8mpXorM3dMU4nAmVUj6WkEoGBNWBW7g%2BnU%2BHtbQbK3BisRvUHabfzeHZSQtitqM5VzrCID8SR7NlmFCL2w39w1u6U08BDkhFI6EBxrHqi6X1Wah6zz561jEiZTbrw4Fzlgcc0KpBfJ4w2HZT3tpVGWqCXtOJLW7gKJFoERDWDYBE9MCrsajDC31HH5Phf0Kb%2F2Qy5ISbfAeEBMw4yvvjeAdbxCk3lTP7yd05VAtQGa6qIjbnchK2DRhbm2Fz7pHoqbOmcAJX3mQVEQOdLUmWcrQ%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D1b47fe7bc793dfb61781450c52bd6e238d44e697&ECID-Context=1.005dBmlYgvR8Xrg_lDc9yZ0003ZW0001Pq%3BkXjE");
		web.window(73, "{{obj.HCM_LogIn_LogOut.web_window}}").waitForPage(90, true);
	
		web.textBox(74, "{{obj.HCM_LogIn_LogOut.web_input_text_userid}}").setText("AlMutiriH@test.com.sa");
		web.textBox(76, "{{obj.HCM_LogIn_LogOut.web_input_password_password}}").setPassword(deobfuscate("ZHLjwGuLQyMgupEPdJt44w=="));
		web.button(77, "{{obj.HCM_LogIn_LogOut.web_button_btnActive}}").click();
		
		web.window(78, "{{obj.HCM_LogIn_LogOut.web_window}}").waitForPage(90, true);		
		web.link(80, "{{obj.HCM_LogIn_LogOut.Me_Icon}}").click();
		{
			think(2.525);
		}
				
	
		
	}
	public void finish() throws Exception {
		
		//LogOut and close the application
		web.element(81, "{{obj.HCM_LogIn_LogOut.web_svg_pt1__UIScmil1u__icon}}").click();
		{
			think(3.054);
		}
		web.link(82, "{{obj.HCM_LogIn_LogOut.web_a_pt1__UISlg1}}").click();
		
		web.window(83, "{{obj.HCM_LogIn_LogOut.web_window}}").waitForPage(90, true);		
		web.button(84, "{{obj.HCM_LogIn_LogOut.web_button_Confirm}}").click();
		web.window(85, "{{obj.HCM_LogIn_LogOut.web_window}}").waitForPage(90, true);
		
		web.window(86, "{{obj.HCM_LogIn_LogOut.web_window}}").close();
	
		}
}
