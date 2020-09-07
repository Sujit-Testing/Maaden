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
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		
		web.window("/web:window[@index='0' or @title='https://ejop-test.login.em2.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DUwPZv10x5U%2B3mIubEg4moKZjBGxOwfdPv2LxXjj91AZXE2IKvjWlw4PZN7hFmdTG%2BIK3mLxNDVQcHOUeIHbxIV%2FGW62UEUF7w%2BcOks6YUPO%2Banxcs7awvdnZSbGln%2BV0cB37%2BKn6OoFs846LQbMIZrWQnSGMYj07%2Fusz6VkQtef18L2%2B0EmtpWYaHcBCd2BRK32UgWghscnWPkDXG2QCt%2FiifKF2SOKTSXxYqFN6PmUgBXAqmkaXK4Eq4LgL85H8mpXorM3dMU4nAmVUj6WkEoGBNWBW7g%2BnU%2BHtbQbK3BisRvUHabfzeHZSQtitqM5VzrCID8SR7NlmFCL2w39w1u6U08BDkhFI6EBxrHqi6X1Wah6zz561jEiZTbrw4Fzlgcc0KpBfJ4w2HZT3tpVGWqCXtOJLW7gKJFoERDWDYBE9MCrsajDC31HH5Phf0Kb%2F2Qy5ISbfAeEBMw4yvvjeAdbxCk3lTP7yd05VAtQGa6qIjbnchK2DRhbm2Fz7pHoqbOmcAJX3mQVEQOdLUmWcrQ%3D%3D agentid%3DOraFusionApp_11AG ver%3D1 crmethod%3D2%26cksum%3D1b47fe7bc793dfb61781450c52bd6e238d44e697&ECID-Context=1.005dBmlYgvR8Xrg_lDc9yZ0003ZW0001Pq%3BkXjE']").navigate(
				"https://ejop-test.login.em2.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DUwPZv10x5U%2B3mIubEg4moKZjBGxOwfdPv2LxXjj91AZXE2IKvjWlw4PZN7hFmdTG%2BIK3mLxNDVQcHOUeIHbxIV%2FGW62UEUF7w%2BcOks6YUPO%2Banxcs7awvdnZSbGln%2BV0cB37%2BKn6OoFs846LQbMIZrWQnSGMYj07%2Fusz6VkQtef18L2%2B0EmtpWYaHcBCd2BRK32UgWghscnWPkDXG2QCt%2FiifKF2SOKTSXxYqFN6PmUgBXAqmkaXK4Eq4LgL85H8mpXorM3dMU4nAmVUj6WkEoGBNWBW7g%2BnU%2BHtbQbK3BisRvUHabfzeHZSQtitqM5VzrCID8SR7NlmFCL2w39w1u6U08BDkhFI6EBxrHqi6X1Wah6zz561jEiZTbrw4Fzlgcc0KpBfJ4w2HZT3tpVGWqCXtOJLW7gKJFoERDWDYBE9MCrsajDC31HH5Phf0Kb%2F2Qy5ISbfAeEBMw4yvvjeAdbxCk3lTP7yd05VAtQGa6qIjbnchK2DRhbm2Fz7pHoqbOmcAJX3mQVEQOdLUmWcrQ%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D1b47fe7bc793dfb61781450c52bd6e238d44e697&ECID-Context=1.005dBmlYgvR8Xrg_lDc9yZ0003ZW0001Pq%3BkXjE");
		web.window(28, "/web:window[@index='0' or @title='Sign In']").waitForPage(null);
		
		web
				.textBox(
						14,
						"/web:window[@index='0' or @title='Sign In']/web:document[@index='0']/web:form[@id='Login' or @name='loginForm' or @index='0']/web:input_text[@id='userid' or @name='userid' or @index='0']")
				.click();
		{
			think(1.61);
		}
		web
				.textBox(
						15,
						"/web:window[@index='0' or @title='Sign In']/web:document[@index='0']/web:form[@id='Login' or @name='loginForm' or @index='0']/web:input_text[@id='userid' or @name='userid' or @index='0']")
				.setText("Sujit.swain");
		{
			think(0.859);
		}
		web
				.textBox(
						16,
						"/web:window[@index='0' or @title='Sign In']/web:document[@index='0']/web:form[@id='Login' or @name='loginForm' or @index='0']/web:input_text[@id='userid' or @name='userid' or @index='0']")
				.pressTab();
		{
			think(0.899);
		}
		web
				.textBox(
						17,
						"/web:window[@index='0' or @title='Sign In']/web:document[@index='0']/web:form[@id='Login' or @name='loginForm' or @index='0']/web:input_password[@id='password' or @name='password' or @index='0']")
				.setPassword(deobfuscate("ZHLjwGuLQyMgupEPdJt44w=="));
		{
			think(1.823);
		}
		web
				.button(
						18,
						"/web:window[@index='0' or @title='Sign In']/web:document[@index='0']/web:form[@id='Login' or @name='loginForm' or @index='0']/web:button[@id='btnActive' or @index='1']")
				.click();
		web.window(19,
				"/web:window[@index='0' or @title='Oracle Applications']")
				.waitForPage(null);
		{
			think(6.627);
		}
		web
				.link(
						21,
						"/web:window[@index='0' or @title='Oracle Applications']/web:document[@index='0' or @name='4jpalsy6k']/web:a[@id='groupNode_my_information_0' or @text='Me' or @index='28']")
				.click();
		{
			think(17.062);
		}
		web
				.link(
						22,
						"/web:window[@index='0' or @title='Oracle Applications']/web:document[@index='0' or @name='4jpalsy6k']/web:a[@id='PER_HCMPEOPLETOP_FUSE_PER_INFO_4' or @text='Personal Information' or @href='https://ejop-test.fa.em2.oraclecloud.com/fscmUI/faces/FuseWelcome?_afrLoop=7054425493939531&_afrWindowMode=0&_afrWindowId=null&_adf.ctrl-state=6rfretldt_1&_afrFS=16&_afrMT=screen&_afrMFW=1536&_afrMFH=710&_afrMFDW=1536&_afrMFDH=864&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=120&_afrMFG=0&_afrMFS=0&_afrMFO=0#' or @index='43']")
				.click();
		web
				.window(
						23,
						"/web:window[@index='0' or @title='Personal Info - Personal Information - Oracle Applications']")
				.waitForPage(null);
		{
			think(1.837);
		}
		web
				.element(
						25,
						"/web:window[@index='0' or @title='Personal Info - Personal Information - Oracle Applications']/web:document[@index='0' or @name='h5cncgop']/web:span[@text='Contact Info' or @index='23']")
				.click();
		{
			think(12.858);
		}
		web
				.image(
						26,
						"/web:window[@index='0' or @title='Contact Info - Personal Information - Oracle Applications']/web:document[@index='0' or @name='h5cncgop']/web:img[@alt='Edit' or @id='_FOpt1:_FOr1:0:_FOSrPER_HCMPEOPLETOP_FUSE_PER_INFO:0:MAnt2:1:contUpl:UPsp1:addrRgn:0:addrPce:addrsLv:0:addrPse:PSEcil6::icon' or @index='27' or @src='https://ejop-test.fa.em2.oraclecloud.com/hcmUI/images/applcore/fuseplus/patterns/func_pencil_16_ena.png']")
				.click();
		

	}
	
	public void finish() throws Exception {
	}
}
