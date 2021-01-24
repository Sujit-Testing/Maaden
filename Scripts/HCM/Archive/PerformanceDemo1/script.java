import oracle.oats.scripting.modules.basic.api.internal.*;
import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.http.api.*;
import oracle.oats.scripting.modules.http.api.HTTPService.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.http.api.HTTPService http;
	
	public void initialize() throws Exception {
		http.setAcceptLanguage("en-US");
		http.setUserAgent("CiscoWebexMeetings-Win/40.6.6");
		
	}
	
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		beginStep("[1] No Title", 0);
		{
			http.get(
					2,
					"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
					null,
					http.headers(
							http.header(
									"Cisco-Device-URL",
									"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
									Header.HeaderAction.Modify),
							http.header(
									"TrackingID",
									"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_95",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[2] No Title", -1772);
		{
			http.get(
					7,
					"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
					null,
					http.headers(
							http.header(
									"Cisco-Device-URL",
									"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
									Header.HeaderAction.Modify),
							http.header(
									"TrackingID",
									"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_96",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[3] No Title", -2063);
		{
			http.get(
					11,
					"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
					null,
					http.headers(
							http.header(
									"Cisco-Device-URL",
									"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
									Header.HeaderAction.Modify),
							http.header(
									"TrackingID",
									"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_94",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[4] No Title", 64006);
		{
			http.get(
					15,
					"http://w3-01.ibm.com/download/standardsoftware/browserCfg/IE11-site.xml",
					null, null, true, "ASCII", "ASCII");
		}
		endStep();
		beginStep("[5] No Title", 3872);
		{
			http.get(
					19,
					"https://iecvlist.microsoft.com/IE11/1478281996/iecompatviewlist.xml",
					null, null, true, "utf-8", "utf-8");
		}
		endStep();
		beginStep("[6] No Title", 10346);
		{
			{
				http.addCookie(
						"S=billing-ui-v3=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW:billing-ui-v3-efe=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SIDCC=AJi4QfHog0EkN1FQ9qTPIAJQssAjQFLcyfDtro6TJABIviRm-LM33-BhwIZBTGk-D9vcFmMtGzh_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"OGPC=19009731-4:19011552-8:19015316-1:19015254-1:19015744-2:19008539-4:19010605-1:19008544-1:19016466-1:19008535-1:19010599-2:; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-HSID=AvXz8BPZp3TMgDUKp; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SSID=AoFm8iqvtvLQUPOFO; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"1P_JAR=2020-07-23-11; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZOkm5Suqxq6jE2B8AmpvHy8w.; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"OGP=-19009731:-19010599:-19008539:; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-SSID=AoFm8iqvtvLQUPOFO; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SEARCH_SAMESITE=CgQIoZAB; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"HSID=AvXz8BPZp3TMgDUKp; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"CONSENT=YES+IN.en+202006; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"ANID=AHWqTUmEqbt5XWuoonrL-yYEasRo_wCGp6JmlfBwAtVKmu-ohEWJFXBVTyTG5Frp; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PSID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZO-gnCuRSoMCqCpIko33HsOg.; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"NID=204=r3nsDRFBWLdi2uKoANZwNr8e3qNt8YFUJ07A9aJGshTsReczfOMTylu3N03wo_xhnfoCqldzVJsFvaBRpY8sMPtttYD8APm1WyQsy19nz9mr_vkPZLkLcqajEJS97ut0laWWy6cGWAKd0lh2H9POq83izlast-lSlXOVBlnNp8vUYXwPvtouSRm_iDQhApwPP8loEohWfEqANAvO5f2RA6xv1S3S8Q-wCfbAlZgdKk53c65eRX3bFPr4l7plkWstukYF2B8jtcJY0z0bOQ; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"PLAY_ACTIVE_ACCOUNT=ICrt_XL61NBE_S0rhk8RpG0k65e0XwQVdDlvB6kxiQ8=sujit.kuna@gmail.com; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"OTZ=5551932_34_34__34_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"_ga=GA1.3.1520983777.1578989329; domain=play.google.com; path=/",
						null);
			}
			http.post(
					23,
					"https://play.google.com/log",
					http.querystring(http.param("format", "json"),
							http.param("hasfast", "true"),
							http.param("authuser", "0")),
					http.postdata(http
							.param("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\"]],996,[[\"1595510191364\",null,[],null,null,null,null,\"[[[66684,null,[],2],[1]]]\",null,null,null,null,null,null,null,null,null,null,null,[],5,null,null,null,null,null,[]]],\"1595510202051\",[],null,null,null,null,null,null,null,null,0]")),
					http.headers(http.header("Origin",
							"https://mail.google.com",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "max-age=0",
							Header.HeaderAction.Modify), http.header(
							"Content-Type",
							"application/x-www-form-urlencoded;charset=utf-8",
							Header.HeaderAction.Modify),
							http.header("X-Goog-AuthUser", "0",
									Header.HeaderAction.Modify), http.header(
									"Referer",
									"https://mail.google.com/mail/u/0/",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
		}
		endStep();
		beginStep("[7] No Title", 3883);
		{
			http.get(
					27,
					"https://ejop-test.login.em2.oraclecloud.com/oam/server/obrareq.cgi",
					http.querystring(
							http.param("encquery%3DUwPZv10x5U%2B3mIubEg4moKZjBGxOwfdPv2LxXjj91AZXE2IKvjWlw4PZN7hFmdTG%2BIK3mLxNDVQcHOUeIHbxIV%2FGW62UEUF7w%2BcOks6YUPO%2Banxcs7awvdnZSbGln%2BV0cB37%2BKn6OoFs846LQbMIZrWQnSGMYj07%2Fusz6VkQtef18L2%2B0EmtpWYaHcBCd2BRK32UgWghscnWPkDXG2QCt%2FiifKF2SOKTSXxYqFN6PmUgBXAqmkaXK4Eq4LgL85H8mpXorM3dMU4nAmVUj6WkEoGBNWBW7g%2BnU%2BHtbQbK3BisRvUHabfzeHZSQtitqM5VzrCID8SR7NlmFCL2w39w1u6U08BDkhFI6EBxrHqi6X1Wah6zz561jEiZTbrw4Fzlgcc0KpBfJ4w2HZT3tpVGWqCXtOJLW7gKJFoERDWDYBE9MCrsajDC31HH5Phf0Kb%2F2Qy5ISbfAeEBMw4yvvjeAdbxCk3lTP7yd05VAtQGa6qIjbnchK2DRhbm2Fz7pHoqbOmcAJX3mQVEQOdLUmWcrQ%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D1b47fe7bc793dfb61781450c52bd6e238d44e697"),
							http.param("ECID-Context",
									"1.005dBmlYgvR8Xrg_lDc9yZ0003ZW0001Pq;kXjE")),
					null, true, "UTF8", "UTF8");
			{
				http.solveXPath("web.input.buttonAction",
						".//INPUT[@name='buttonAction']/@value", "null", 0,
						EncodeOptions.None);
			}
		}
		endStep();
		beginStep("[8] No Title", 968);
		{
			http.options(
					31,
					"https://play.google.com/log",
					http.querystring(http.param("format", "json"),
							http.param("hasfast", "true"),
							http.param("u", "0"), http.param("authuser", "0")),
					null,
					http.headers(
							http.header("Origin",
									"https://hangouts.google.com",
									Header.HeaderAction.Modify),
							http.header(
									"Access-Control-Request-Headers",
									"authorization,content-encoding,content-type,x-goog-authuser",
									Header.HeaderAction.Modify),
							http.header("Access-Control-Request-Method",
									"POST", Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://hangouts.google.com/webchat/u/0/load?client=sm&prop=gmail&nav=true&fid=gtn-roster-iframe-id&os=Win32&stime=1595503457329&xpc=%7B%22cn%22%3A%22uu4u3s%22%2C%22tp%22%3A1%2C%22ifrid%22%3A%22gtn-roster-iframe-id%22%2C%22pu%22%3A%22https%3A%2F%2Fhangouts.google.com%2Fwebchat%2Fu%2F0%2F%22%7D&ec=%5B%22ci%3Aec%22%2Ctrue%2Ctrue%2Cfalse%5D&pvt=AMP3uWbnWpq2Si6urYvDkj7w2etfvj7MmWaLoYGlwpgZvbJ_QcTUunrShlmYVicHLGtGzaT25sW8yJONWXqT9tstvyfYddpr1g%3D%3D&href=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%3Frel%3D1&pos=l&uiv=2&hl=en&hpc=true&hsm=true&hrc=true&pal=1&uqp=false&gooa=false&gltsi=true&gusm=true&sl=false&hs=%5B%22h_hs%22%2Cnull%2Cnull%2C%5B2%2C0%5D%5D&moleh=380&mmoleh=36&two=https%3A%2F%2Fmail.google.com&host=1&zx=png7qrpd2bka",
									Header.HeaderAction.Modify)), true, null,
					"UTF8");
		}
		endStep();
		beginStep("[9] No Title", 16);
		{
			http.addCookie(
					"SIDCC=AJi4QfHo1QbfJzyuKefQo9TkKPr-BbdI8fg20s98vVjEDEfje-p1EGmjMjVs2-hzcTHgx4I-Bwqx; domain=play.google.com; path=/",
					null);
			http.post(
					35,
					"https://play.google.com/log",
					http.querystring(http.param("format", "json"),
							http.param("hasfast", "true"),
							http.param("u", "0"), http.param("authuser", "0")),
					http.postdata(http
							.param("{{@resourceFile(109.postData.rsc, UTF-8, true)}}")),
					http.headers(
							http.header("Origin",
									"https://hangouts.google.com",
									Header.HeaderAction.Modify),
							http.header("Content-Encoding", "gzip",
									Header.HeaderAction.Modify),
							http.header("Content-Type", "application/binary",
									Header.HeaderAction.Modify),
							http.header("X-Goog-AuthUser", "0",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://hangouts.google.com/webchat/u/0/load?client=sm&prop=gmail&nav=true&fid=gtn-roster-iframe-id&os=Win32&stime=1595503457329&xpc=%7B%22cn%22%3A%22uu4u3s%22%2C%22tp%22%3A1%2C%22ifrid%22%3A%22gtn-roster-iframe-id%22%2C%22pu%22%3A%22https%3A%2F%2Fhangouts.google.com%2Fwebchat%2Fu%2F0%2F%22%7D&ec=%5B%22ci%3Aec%22%2Ctrue%2Ctrue%2Cfalse%5D&pvt=AMP3uWbnWpq2Si6urYvDkj7w2etfvj7MmWaLoYGlwpgZvbJ_QcTUunrShlmYVicHLGtGzaT25sW8yJONWXqT9tstvyfYddpr1g%3D%3D&href=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%3Frel%3D1&pos=l&uiv=2&hl=en&hpc=true&hsm=true&hrc=true&pal=1&uqp=false&gooa=false&gltsi=true&gusm=true&sl=false&hs=%5B%22h_hs%22%2Cnull%2Cnull%2C%5B2%2C0%5D%5D&moleh=380&mmoleh=36&two=https%3A%2F%2Fmail.google.com&host=1&zx=png7qrpd2bka",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
			beginStep("[1] No Title", -1847);
			{
				http.get(
						52,
						"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
						null,
						http.headers(
								http.header(
										"Cisco-Device-URL",
										"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
										Header.HeaderAction.Modify),
								http.header(
										"TrackingID",
										"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_103",
										Header.HeaderAction.Modify)), true,
						"UTF8", "UTF8");
			}
			endStep();
			beginStep("[1] No Title", -1753);
			{
				http.get(
						48,
						"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
						null,
						http.headers(
								http.header(
										"Cisco-Device-URL",
										"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
										Header.HeaderAction.Modify),
								http.header(
										"TrackingID",
										"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_104",
										Header.HeaderAction.Modify)), true,
						"UTF8", "UTF8");
			}
			endStep();
		}
		endStep();
		beginStep("[10] No Title", 0);
		{
			http.get(
					44,
					"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
					null,
					http.headers(
							http.header(
									"Cisco-Device-URL",
									"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
									Header.HeaderAction.Modify),
							http.header(
									"TrackingID",
									"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_101",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[11] No Title", -1923);
		{
			http.get(
					56,
					"https://calliope-a.wbx2.com/calliope/api/discovery/v1/clusters",
					null,
					http.headers(
							http.header(
									"Cisco-Device-URL",
									"https://wdm-a.wbx2.com/wdm/api/v1/devices/ce0a33cb-7186-4255-96c8-676791fddd2a",
									Header.HeaderAction.Modify),
							http.header(
									"TrackingID",
									"WIN_8427445b-d1f2-4cab-b162-95e47336cf67_102",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[12] No Title", 35476);
		{
			http.get(
					60,
					"https://iecvlist.microsoft.com/IE11/1478281996/iecompatviewlist.xml",
					null, null, true, "utf-8", "utf-8");
		}
		endStep();
		beginStep("[13] No Title", -457);
		{
			http.get(
					64,
					"https://ejop-test.login.em2.oraclecloud.com/oam/server/obrareq.cgi",
					http.querystring(
							http.param("encquery%3DUwPZv10x5U%2B3mIubEg4moKZjBGxOwfdPv2LxXjj91AZXE2IKvjWlw4PZN7hFmdTG%2BIK3mLxNDVQcHOUeIHbxIV%2FGW62UEUF7w%2BcOks6YUPO%2Banxcs7awvdnZSbGln%2BV0cB37%2BKn6OoFs846LQbMIZrWQnSGMYj07%2Fusz6VkQtef18L2%2B0EmtpWYaHcBCd2BRK32UgWghscnWPkDXG2QCt%2FiifKF2SOKTSXxYqFN6PmUgBXAqmkaXK4Eq4LgL85H8mpXorM3dMU4nAmVUj6WkEoGBNWBW7g%2BnU%2BHtbQbK3BisRvUHabfzeHZSQtitqM5VzrCID8SR7NlmFCL2w39w1u6U08BDkhFI6EBxrHqi6X1Wah6zz561jEiZTbrw4Fzlgcc0KpBfJ4w2HZT3tpVGWqCXtOJLW7gKJFoERDWDYBE9MCrsajDC31HH5Phf0Kb%2F2Qy5ISbfAeEBMw4yvvjeAdbxCk3lTP7yd05VAtQGa6qIjbnchK2DRhbm2Fz7pHoqbOmcAJX3mQVEQOdLUmWcrQ%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D1b47fe7bc793dfb61781450c52bd6e238d44e697"),
							http.param("ECID-Context",
									"1.005dBmlYgvR8Xrg_lDc9yZ0003ZW0001Pq;kXjE")),
					null, true, "UTF8", "UTF8");
			{
				http.solveXPath("web.input.buttonAction",
						".//INPUT[@name='buttonAction']/@value", "null", 0,
						EncodeOptions.None);
				http.solveXPath("web.formaction.loginForm",
						".//FORM[@name='loginForm']/@action",
						"/oam/server/auth_cred_submit", 0, EncodeOptions.None);
				http.solveXPath("web.input.requestid_xmldecode",
						".//INPUT[@name='request_id']/@value",
						"&#45;4729238861670748044", 0, EncodeOptions.XMLDecode);
				http.solveXPath("web.input.oammt",
						".//INPUT[@name='oam_mt']/@value", "null", 0,
						EncodeOptions.None);
				http.solveXPath("web.input.ovm",
						".//INPUT[@name='ovm']/@value", "null", 0,
						EncodeOptions.None);
				http.solveXPath("web.input.cloud",
						".//INPUT[@name='cloud']/@value", "null", 0,
						EncodeOptions.None);
				http.solveGroupJavaScript(new String[] {
						http.javaScriptPath("web.jscript.httpsejoptestlogin_9",
								1, 5, 1, 0),
						http.javaScriptPath("web.jscript.httpsejoptestlogin_1",
								1, 1, 0, 0) });
			}
		}
		endStep();
		beginStep("[14] No Title", 25478);
		{
			http.get(
					68,
					"http://w3-01.ibm.com/download/standardsoftware/browserCfg/IE11-site.xml",
					null, null, true, "ASCII", "ASCII");
		}
		endStep();
		beginStep("[15] No Title", 31878);
		{
			http.options(72, "https://play.google.com/log",
					http.querystring(http.param("format", "json"),
							http.param("hasfast", "true"),
							http.param("authuser", "0")), null, http.headers(
							http.header("Origin", "https://mail.google.com",
									Header.HeaderAction.Modify), http.header(
									"Cache-Control", "max-age=0",
									Header.HeaderAction.Modify), http.header(
									"Access-Control-Request-Headers",
									"authorization,x-goog-authuser",
									Header.HeaderAction.Modify), http.header(
									"Access-Control-Request-Method", "POST",
									Header.HeaderAction.Modify), http.header(
									"Referer",
									"https://mail.google.com/mail/u/0/",
									Header.HeaderAction.Modify)), true, null,
					"UTF8");
		}
		endStep();
		beginStep("[16] No Title", 0);
		{
			{
				http.addCookie(
						"S=billing-ui-v3=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW:billing-ui-v3-efe=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SIDCC=AJi4QfGMN4B1PLL4mq1Km-PCyVxD77Az019nW47BcmM35vrtwcSWArlLaLcvhtWFkn4wECOkQ9xS; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"OGPC=19009731-4:19011552-8:19015316-1:19015254-1:19015744-2:19008539-4:19010605-1:19008544-1:19016466-1:19008535-1:19010599-2:; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-HSID=AvXz8BPZp3TMgDUKp; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SSID=AoFm8iqvtvLQUPOFO; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"1P_JAR=2020-07-23-11; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZOkm5Suqxq6jE2B8AmpvHy8w.; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"OGP=-19009731:-19010599:-19008539:; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-SSID=AoFm8iqvtvLQUPOFO; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"SEARCH_SAMESITE=CgQIoZAB; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"HSID=AvXz8BPZp3TMgDUKp; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"CONSENT=YES+IN.en+202006; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"ANID=AHWqTUmEqbt5XWuoonrL-yYEasRo_wCGp6JmlfBwAtVKmu-ohEWJFXBVTyTG5Frp; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PSID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZO-gnCuRSoMCqCpIko33HsOg.; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"NID=204=r3nsDRFBWLdi2uKoANZwNr8e3qNt8YFUJ07A9aJGshTsReczfOMTylu3N03wo_xhnfoCqldzVJsFvaBRpY8sMPtttYD8APm1WyQsy19nz9mr_vkPZLkLcqajEJS97ut0laWWy6cGWAKd0lh2H9POq83izlast-lSlXOVBlnNp8vUYXwPvtouSRm_iDQhApwPP8loEohWfEqANAvO5f2RA6xv1S3S8Q-wCfbAlZgdKk53c65eRX3bFPr4l7plkWstukYF2B8jtcJY0z0bOQ; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"PLAY_ACTIVE_ACCOUNT=ICrt_XL61NBE_S0rhk8RpG0k65e0XwQVdDlvB6kxiQ8=sujit.kuna@gmail.com; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"OTZ=5551932_34_34__34_; domain=play.google.com; path=/",
						null);
				http.addCookie(
						"_ga=GA1.3.1520983777.1578989329; domain=play.google.com; path=/",
						null);
			}
			http.post(
					76,
					"https://play.google.com/log",
					http.querystring(http.param("format", "json"),
							http.param("hasfast", "true"),
							http.param("authuser", "0")),
					http.postdata(http
							.param("[[1,{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},[{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},\"en\"]],407,[[\"1595510372062\",{{web.input.buttonAction,null}},[],{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},\"[23,1595510372062000,\\\"!4OOl48JCc-UIJfLWMvZYQ0kT-Oov_voCAAABq1IAAAAemQG56RtIVY_nmAB-ziyrbY4K9c4vmLsUXZLBN-D5JjK7RrIIGi_aDrdfoJh8m0bd--hRw3gDBQ4datABgggojeeiWbfY5qCnrKjf6qy5bgEudOKsvnNY63PeO8hqBkmzxq-iJ4fmaRpWgW45WLwKbktDQuPSgSoGK2q0S9H6ULdX3mRrodlbtytZA3zuPllucBeuI7-IxUDuOci3ca1PizHiUeEGa3zt7s4KBAssMkpEXugep_QbzkWqrxTKQzdAMZTWMexHrnQf7k4NV7RGzsEaf6AgTTdVu6D5733EZKC2ylRgI5QLXJTjA55Z5VXgEUKgELXTgPIfW4omRmuG6NXH1S_-zQ2BHRM0ueUbkfBU02X4WLpLi5lVE1r39VI0Qxz7jWMFHnTcZCzbz9TvDd6r5ZO7Le8RLRYpt-MNlKH8ARW8U4LQi2lUbn4qesQ2xld_Kv9g3iIW9dONaGhTEHeczhgh5Y5G5OUXRANmGpCYQh6J613sZyl8AgvSK8N_iSm_a6cBE8Mex8clFImIE0A24VJ79hvWZRurDolM6D5fONjDm9JBlX13dXqwwQUHV65Tv5mjVK4kuLXs\\\",1004918236,false]\",{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},[],24,{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},[]]],\"1595510372062\",[],{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},{{web.input.buttonAction,null}},0]")),
					http.headers(http.header("Origin",
							"https://mail.google.com",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "max-age=0",
							Header.HeaderAction.Modify), http.header(
							"Content-Type",
							"application/x-www-form-urlencoded;charset=utf-8",
							Header.HeaderAction.Modify),
							http.header("X-Goog-AuthUser", "0",
									Header.HeaderAction.Modify), http.header(
									"Referer",
									"https://mail.google.com/mail/u/0/",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
		}
		endStep();
		beginStep("[17] No Title", 886);
		{
			http.xmlPost(
					80,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"gHQxI7VZ7rrwZopSGq+njw=="), http
							.param("MSURS-MAC=NTEBmF/FSzQ%3d")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>40F68CA2-397C-E375-FE4B-C28AF13340EC</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU></RU><RI>0.0.0.0</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9vYW0vc2VydmVyL29icmFyZXEuY2dpP2VuY3F1ZXJ5JTNEVXdQWnYxMHg1VSUyQjNtSXViRWc0bW9LWmpCR3hPd2ZkUHYyTHhYamo5MUFaWEUySUt2aldsdzRQWk43aEZtZFRHJTJCSUszbUx4TkRWUWNIT1VlSUhieElWJTJGR1c2MlVFVUY3dyUyQmNPa3M2WVVQTyUyQmFueGNzN2F3dmRuWlNiR2xuJTJCVjBjQjM3JTJCS242T29Gczg0NkxRYk1JWnJXUW5TR01ZajA3JTJGdXN6NlZrUXRlZjE4TDIlMkIwRW10cFdZYUhjQkNkMkJSSzMyVWdXZ2hzY25XUGtEWEcyUUN0JTJGaWlmS0YyU09LVFNYeFlxRk42UG1VZ0JYQXFta2FYSzRFcTRMZ0w4NUg4bXBYb3JNM2RNVTRuQW1WVWo2V2tFb0dCTldCVzdnJTJCblUlMkJIdGJRYkszQmlzUnZVSGFiZnplSFpTUXRpdHFNNVZ6ckNJRDhTUjdObG1GQ0wydzM5dzF1NlUwOEJEa2hGSTZFQnhySHFpNlgxV2FoNnp6NTYxakVpWlRicnc0RnpsZ2NjMEtwQmZKNHcySFpUM3RwVkdXcUNYdE9KTFc3Z0tKRm9FUkRXRFlCRTlNQ3JzYWpEQzMxSEg1UGhmMEtiJTJGMlF5NUlTYmZBZUVCTXc0eXZ2amVBZGJ4Q2szbFRQN3lkMDVWQXRRR2E2cUlqYm5jaEsyRFJoYm0yRno3cEhvcWJPbWNBSlgzbVFWRVFPZExVbVdjclElM0QlM0QlMjBhZ2VudGlkJTNET3JhRnVzaW9uQXBwXzExQUclMjB2ZXIlM0QxJTIwY3JtZXRob2QlM0QyJTI2Y2tzdW0lM0QxYjQ3ZmU3YmM3OTNkZmI2MTc4MTQ1MGM1MmJkNmUyMzhkNDRlNjk3JkVDSUQtQ29udGV4dD0xLjAwNWRCbWxZZ3ZSOFhyZ19sRGM5eVowMDAzWlcwMDAxUHElM0JrWGpF</URL><O>POST</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9vYW0vc2VydmVyL2F1dGhfY3JlZF9zdWJtaXQ=</URL><O>POST</O><T>ACTION</T><HIP>0.0.0.0</HIP></Rq></R><WA/><PRT/></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
			{
				http.solveXPath(
						"xml.S",
						"/*[local-name()='RepLookupResponse']/*[local-name()='RepLookupResult'][1]/*[local-name()='Rs'][1]/*[local-name()='S'][1]/text()[1]",
						"0", 0, EncodeOptions.None);
				http.solveXPath(
						"xml.T",
						"/*[local-name()='RepLookupResponse']/*[local-name()='T'][1]/text()[1]",
						"40F68CA2-397C-E375-FE4B-C28AF13340EC", 0,
						EncodeOptions.None);
			}
		}
		endStep();
		beginStep("[18] No Title", 8201);
		{
			http.xmlPost(
					84,
					"https://t.urs.microsoft.com/urstelemetry.asmx",
					http.querystring(
							http.param("MSTel-Client-Key=WrizM3c9scvHCA0/FgASdA%3d%3d"),
							http.param("MSTel-MAC", "+Rtn1MFsN70=")),
					"<T v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><O>POST</O><ID>D7BE2A1C-9AB9-4490-91C9-0900FCF0E434</ID><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9vYW0vc2VydmVyL29icmFyZXEuY2dpP2VuY3F1ZXJ5JTNEVXdQWnYxMHg1VSUyQjNtSXViRWc0bW9LWmpCR3hPd2ZkUHYyTHhYamo5MUFaWEUySUt2aldsdzRQWk43aEZtZFRHJTJCSUszbUx4TkRWUWNIT1VlSUhieElWJTJGR1c2MlVFVUY3dyUyQmNPa3M2WVVQTyUyQmFueGNzN2F3dmRuWlNiR2xuJTJCVjBjQjM3JTJCS242T29Gczg0NkxRYk1JWnJXUW5TR01ZajA3JTJGdXN6NlZrUXRlZjE4TDIlMkIwRW10cFdZYUhjQkNkMkJSSzMyVWdXZ2hzY25XUGtEWEcyUUN0JTJGaWlmS0YyU09LVFNYeFlxRk42UG1VZ0JYQXFta2FYSzRFcTRMZ0w4NUg4bXBYb3JNM2RNVTRuQW1WVWo2V2tFb0dCTldCVzdnJTJCblUlMkJIdGJRYkszQmlzUnZVSGFiZnplSFpTUXRpdHFNNVZ6ckNJRDhTUjdObG1GQ0wydzM5dzF1NlUwOEJEa2hGSTZFQnhySHFpNlgxV2FoNnp6NTYxakVpWlRicnc0RnpsZ2NjMEtwQmZKNHcySFpUM3RwVkdXcUNYdE9KTFc3Z0tKRm9FUkRXRFlCRTlNQ3JzYWpEQzMxSEg1UGhmMEtiJTJGMlF5NUlTYmZBZUVCTXc0eXZ2amVBZGJ4Q2szbFRQN3lkMDVWQXRRR2E2cUlqYm5jaEsyRFJoYm0yRno3cEhvcWJPbWNBSlgzbVFWRVFPZExVbVdjclElM0QlM0QlMjBhZ2VudGlkJTNET3JhRnVzaW9uQXBwXzExQUclMjB2ZXIlM0QxJTIwY3JtZXRob2QlM0QyJTI2Y2tzdW0lM0QxYjQ3ZmU3YmM3OTNkZmI2MTc4MTQ1MGM1MmJkNmUyMzhkNDRlNjk3JkVDSUQtQ29udGV4dD0xLjAwNWRCbWxZZ3ZSOFhyZ19sRGM5eVowMDAzWlcwMDAxUHElM0JrWGpF</URL><RU/><RI>0.0.0.0</RI><HIP>9.81.217.53</HIP><UI>2e5fe3853debd0ba033faddd11535b8e1a237b5fd58bcf0f5d97a7e5fca480f3</UI><S>{{xml.S,0}}</S><DI>9.0.144.50</DI><Y><T>B|0|100.0000</T><T>I|0|100.0000</T><T>D|0|95.0000</T><T>P|0|100.0000|6.5000</T><T>F|2|0.0070|0.0070|0.0070</T><T>R|0|100.0000</T><T>U|2|1.0000</T><T>W|0|0.0050</T><T>H|0|100.0000</T><T>O|0|100.0000</T><T>T|0|100.0000</T><T>PP|1|100.0000</T></Y><M>KFHN</M><Fs><F><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9vYW0vc2VydmVyL29icmFyZXEuY2dpP2VuY3F1ZXJ5JTNEVXdQWnYxMHg1VSUyQjNtSXViRWc0bW9LWmpCR3hPd2ZkUHYyTHhYamo5MUFaWEUySUt2aldsdzRQWk43aEZtZFRHJTJCSUszbUx4TkRWUWNIT1VlSUhieElWJTJGR1c2MlVFVUY3dyUyQmNPa3M2WVVQTyUyQmFueGNzN2F3dmRuWlNiR2xuJTJCVjBjQjM3JTJCS242T29Gczg0NkxRYk1JWnJXUW5TR01ZajA3JTJGdXN6NlZrUXRlZjE4TDIlMkIwRW10cFdZYUhjQkNkMkJSSzMyVWdXZ2hzY25XUGtEWEcyUUN0JTJGaWlmS0YyU09LVFNYeFlxRk42UG1VZ0JYQXFta2FYSzRFcTRMZ0w4NUg4bXBYb3JNM2RNVTRuQW1WVWo2V2tFb0dCTldCVzdnJTJCblUlMkJIdGJRYkszQmlzUnZVSGFiZnplSFpTUXRpdHFNNVZ6ckNJRDhTUjdObG1GQ0wydzM5dzF1NlUwOEJEa2hGSTZFQnhySHFpNlgxV2FoNnp6NTYxakVpWlRicnc0RnpsZ2NjMEtwQmZKNHcySFpUM3RwVkdXcUNYdE9KTFc3Z0tKRm9FUkRXRFlCRTlNQ3JzYWpEQzMxSEg1UGhmMEtiJTJGMlF5NUlTYmZBZUVCTXc0eXZ2amVBZGJ4Q2szbFRQN3lkMDVWQXRRR2E2cUlqYm5jaEsyRFJoYm0yRno3cEhvcWJPbWNBSlgzbVFWRVFPZExVbVdjclElM0QlM0QlMjBhZ2VudGlkJTNET3JhRnVzaW9uQXBwXzExQUclMjB2ZXIlM0QxJTIwY3JtZXRob2QlM0QyJTI2Y2tzdW0lM0QxYjQ3ZmU3YmM3OTNkZmI2MTc4MTQ1MGM1MmJkNmUyMzhkNDRlNjk3JkVDSUQtQ29udGV4dD0xLjAwNWRCbWxZZ3ZSOFhyZ19sRGM5eVowMDAzWlcwMDAxUHElM0JrWGpF</URL><Z>KFHN</Z><H>10410000|4|0|80000060|FC0|0,2</H><K>5300690067006e0049006e003a005300690067006e0049006e003b005300690067006e004f006e003b005300690067006e0049006e003a00</K><T>TOP</T><HIP>9.81.217.53</HIP><SC/><SH>a7b25f5009780880</SH><NS/><SSL/><SSLLen/><REDIR/></F></Fs><WA/><GS/><Err/></T>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[19] No Title", 2434);
		{
			http.window(88, "window[@index='{{xml.S,0}}']")
					.post("https://ejop-test.login.em2.oraclecloud.com{{web.formaction.loginForm,/oam/server/auth_cred_submit}}",
							null,
							http.postdata(
									http.param("userid", "Sujit.swain"),
									http.param("password", "Welcome123"),
									http.param("request_id",
											"{{web.input.requestid_xmldecode,&##45;4729238861670748044}}"),
									http.param("oam_mt",
											"{{web.input.oammt,null}}"),
									http.param("ovm", "{{web.input.ovm,null}}"),
									http.param("cloud",
											"{{web.input.cloud,null}}"),
									http.param("buttonAction",
											"{{web.jscript.httpsejoptestlogin_9,local}}"),
									http.param("Languages",
											"{{web.jscript.httpsejoptestlogin_1,en-us}}")),
							http.headers(http.header("Cache-Control",
									"no-cache", Header.HeaderAction.Modify)),
							true, "UTF8", "UTF8");
			{
				http.solveGroupJavaScript(
						"window[@index='0']",
						new String[] {
								http.javaScriptPath(
										"web.jscript.httpsejoptestlogin_18", 1,
										0, 148, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestlogin_37", 1,
										0, 38, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestlogin_20", 1,
										0, 50, 0) });
			}
		}
		endStep();
		beginStep("[20] Oracle Applications", 100);
		{
			http.window(112, "window[@index='{{xml.S,0}}']")
					.get("https://ejop-test.fa.em2.oraclecloud.com/fscmUI/faces/FuseWelcome", http.querystring(
									http.param("_afrLoop",
											"{{web.jscript.httpsejoptestlogin_18,4216746897155487}}"),
									http.param("_afrWindowMode", "{{xml.S,0}}"),
									http.param("_afrWindowId", "null"),
									http.param("_adf.ctrl-state",
											"{{web.jscript.httpsejoptestlogin_37,dshy71f5x_1}}"),
									http.param("_afrFS", "16"),
									http.param("_afrMT",
											"{{web.jscript.httpsejoptestlogin_20,screen}}"),
									http.param("_afrMFW", "1920"), http.param(
											"_afrMFH", "878"), http.param(
											"_afrMFDW", "1920"), http.param(
											"_afrMFDH", "1080"), http.param(
											"_afrMFC", "8"), http.param(
											"_afrMFCI", "{{xml.S,0}}"), http
											.param("_afrMFM", "{{xml.S,0}}"),
									http.param("_afrMFR", "96"), http.param(
											"_afrMFG", "{{xml.S,0}}"), http
											.param("_afrMFS", "{{xml.S,0}}"),
									http.param("_afrMFO", "{{xml.S,0}}")), null, true, "UTF8", "UTF8");
			{
				http.solveXPath(
						"web.formaction.f1",
						"/window[@index='0']",
						".//form[@name='f1']/@action",
						"https://ejop-test.fa.em2.oraclecloud.com/fscmUI/faces/FuseWelcome?_adf.ctrl-state=dshy71f5x_5",
						0, EncodeOptions.None);
				http.solveXPath(
						"web.input.orgapachemyfacestrinidadfa",
						"/window[@index='0']",
						".//input[@name='org.apache.myfaces.trinidad.faces.FORM']/@value",
						"f1", 0, EncodeOptions.None);
				http.solveXPath("web.input.javaxfacesViewState",
						"/window[@index='0']",
						".//input[@name='javax.faces.ViewState']/@value",
						"!128sqchlal", 0, EncodeOptions.None);
				http.solveGroupJavaScript(
						"/window[@index='0']", new String[] {
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_671",
										1, 101, 597, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_587",
										1, 101, 907, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_373",
										1, 101, 651, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_92", 1,
										15, 10, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_780",
										1, 101, 726, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_388",
										1, 101, 732, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_357",
										1, 101, 3, 0) });
				http.solveRefererHeader(
						"referer.httpsejoptestfaem2oraclecl",
						"/window[@index='0']",
						"/fscmUI/faces/FuseWelcome?_afrLoop=4216746897155487&_afrWindowMode=0&_afrWindowId=null&_adf.ctrl-state=dshy71f5x_1&_afrFS=16&_afrMT=screen&_afrMFW=1920&_afrMFH=878&_afrMFDW=1920&_afrMFDH=1080&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");
			}
		}
		endStep();
		beginStep("[21] No Title", -1187);
		{
			http.xmlPost(
					116,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"7YeHjUqTooo15kJgQ01AfA=="), http
							.param("MSURS-MAC=zG/2nj/j%2bPM%3d")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9vYW0vc2VydmVyL29icmFyZXEuY2dpP2VuY3F1ZXJ5JTNEVXdQWnYxMHg1VSUyQjNtSXViRWc0bW9LWmpCR3hPd2ZkUHYyTHhYamo5MUFaWEUySUt2aldsdzRQWk43aEZtZFRHJTJCSUszbUx4TkRWUWNIT1VlSUhieElWJTJGR1c2MlVFVUY3dyUyQmNPa3M2WVVQTyUyQmFueGNzN2F3dmRuWlNiR2xuJTJCVjBjQjM3JTJCS242T29Gczg0NkxRYk1JWnJXUW5TR01ZajA3JTJGdXN6NlZrUXRlZjE4TDIlMkIwRW10cFdZYUhjQkNkMkJSSzMyVWdXZ2hzY25XUGtEWEcyUUN0JTJGaWlmS0YyU09LVFNYeFlxRk42UG1VZ0JYQXFta2FYSzRFcTRMZ0w4NUg4bXBYb3JNM2RNVTRuQW1WVWo2V2tFb0dCTldCVzdnJTJCblUlMkJIdGJRYkszQmlzUnZVSGFiZnplSFpTUXRpdHFNNVZ6ckNJRDhTUjdObG1GQ0wydzM5dzF1NlUwOEJEa2hGSTZFQnhySHFpNlgxV2FoNnp6NTYxakVpWlRicnc0RnpsZ2NjMEtwQmZKNHcySFpUM3RwVkdXcUNYdE9KTFc3Z0tKRm9FUkRXRFlCRTlNQ3JzYWpEQzMxSEg1UGhmMEtiJTJGMlF5NUlTYmZBZUVCTXc0eXZ2amVBZGJ4Q2szbFRQN3lkMDVWQXRRR2E2cUlqYm5jaEsyRFJoYm0yRno3cEhvcWJPbWNBSlgzbVFWRVFPZExVbVdjclElM0QlM0QlMjBhZ2VudGlkJTNET3JhRnVzaW9uQXBwXzExQUclMjB2ZXIlM0QxJTIwY3JtZXRob2QlM0QyJTI2Y2tzdW0lM0QxYjQ3ZmU3YmM3OTNkZmI2MTc4MTQ1MGM1MmJkNmUyMzhkNDRlNjk3JkVDSUQtQ29udGV4dD0xLjAwNWRCbWxZZ3ZSOFhyZ19sRGM5eVowMDAzWlcwMDAxUHElM0JrWGpF</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU=</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>802</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[22] No Title", 995);
		{
			http.xmlPost(
					120,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"9o6RNCXtDg5gK8eDJL2uag=="), http.param(
							"MSURS-MAC", "mwW2+JAuKls=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU=</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU/X2Fmckxvb3A9NDIxNjc0Njg5NzE1NTQ4NyZfYWZyV2luZG93TW9kZT0wJl9hZnJXaW5kb3dJZD1udWxsJl9hZGYuY3RybC1zdGF0ZT1kc2h5NzFmNXhfMSZfYWZyRlM9MTYmX2Fmck1UPXNjcmVlbiZfYWZyTUZXPTE5MjAmX2Fmck1GSD04NzgmX2Fmck1GRFc9MTkyMCZfYWZyTUZESD0xMDgwJl9hZnJNRkM9OCZfYWZyTUZDST0wJl9hZnJNRk09MCZfYWZyTUZSPTk2Jl9hZnJNRkc9MCZfYWZyTUZTPTAmX2Fmck1GTz0w</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>904</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[23] No Title", -897);
		{
			{
				http.addCookie(
						"COMPASS=bigtop-sync=Co8BAAlriVedUbSjH88lbO3W5qSp3_ZTP-V7e2FL_GxYkSGz-BhK3AwIoVwR-xKNeYOtsxWLJcqDoxtkaPTmMk6r0gh-iy8R6QOtumVy1-u_HawtGQLfp_coGIcTjFzb2JHcJJE5vUffbTy3DO5jBj3FYnO9BZb3STDdPnWty1S0RCTWdWDOwZtLVFIypm4hWckQ5K3m-AUaoQEACWuJVwzDN3lN3JnkQAA8BiXRYNTnZGhFXxb0YglnTDHYOZLXHQZfRJsh4OOGYhJgxXs5ufwG3KIt6UfLFeAzyNzIuPRz184U627j9Su5YoudH86DKyg02tvpObRQSBC7uYQsFZ6Ak93vU_MNtAO9uuwiuBIS9JxozsiuG01dLj25SJuogxhxdsRQVguqcUDSdXSzMFR_m3MPHJxXxCeB2A; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"S=billing-ui-v3=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW:billing-ui-v3-efe=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"OGPC=19009731-4:19011552-8:19015316-1:19015254-1:19015744-2:19008539-4:19010605-1:19008544-1:19016466-1:19008535-1:19010599-2:; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-HSID=AvXz8BPZp3TMgDUKp; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"SSID=AoFm8iqvtvLQUPOFO; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"SAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"1P_JAR=2020-07-23-11; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"SID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZOkm5Suqxq6jE2B8AmpvHy8w.; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"OGP=-19009731:-19010599:-19008539:; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-SSID=AoFm8iqvtvLQUPOFO; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"SEARCH_SAMESITE=CgQIoZAB; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"HSID=AvXz8BPZp3TMgDUKp; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"CONSENT=YES+IN.en+202006; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"ANID=AHWqTUmEqbt5XWuoonrL-yYEasRo_wCGp6JmlfBwAtVKmu-ohEWJFXBVTyTG5Frp; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PSID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZO-gnCuRSoMCqCpIko33HsOg.; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"NID=204=r3nsDRFBWLdi2uKoANZwNr8e3qNt8YFUJ07A9aJGshTsReczfOMTylu3N03wo_xhnfoCqldzVJsFvaBRpY8sMPtttYD8APm1WyQsy19nz9mr_vkPZLkLcqajEJS97ut0laWWy6cGWAKd0lh2H9POq83izlast-lSlXOVBlnNp8vUYXwPvtouSRm_iDQhApwPP8loEohWfEqANAvO5f2RA6xv1S3S8Q-wCfbAlZgdKk53c65eRX3bFPr4l7plkWstukYF2B8jtcJY0z0bOQ; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Host-GMAIL_SCH=nsl; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"OSID=yweurtXn4PzpgqKAMzJXU73P0H2CUkgROMlCvb9zeAQtCHZlmmpHa0JhIKLdKQ3T5K5Ygg.; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Host-GMAIL_SCH_GML=1; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-OSID=yweurtXn4PzpgqKAMzJXU73P0H2CUkgROMlCvb9zeAQtCHZlOlpGsgHmBM9dErYDjiUKBA.; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Host-GMAIL_SCH_GMS=1; domain=mail.google.com; path=/",
						null);
				http.addCookie(
						"__Host-GMAIL_SCH_GMN=1; domain=mail.google.com; path=/",
						null);
			}
			http.post(
					130,
					"https://mail.google.com/sync/u/0/i/s",
					http.querystring(http.param("hl", "en"),
							http.param("c", "45")),
					http.postdata(http
							.param("#{\"3\":#{\"1\":1,\"2\":\"6797601\",\"5\":#{\"2\":0#},\"7\":1#},\"4\":#{\"2\":0,\"4\":0,\"5\":353#},\"5\":2#}")),
					http.headers(
							http.header("Origin", "https://mail.google.com",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "max-age=0",
									Header.HeaderAction.Modify),
							http.header("Content-Type", "application/json",
									Header.HeaderAction.Modify),
							http.header(
									"X-Framework-Xsrf-Token",
									"AKwhgQqIHsD4DCu3nZFQnDZ8LQzXn4BQzQ:1595503435093",
									Header.HeaderAction.Modify),
							http.header(
									"X-Gmail-BTAI",
									"{\"3\":{\"6\":0,\"10\":1,\"13\":1,\"15\":0,\"16\":1,\"17\":1,\"18\":0,\"19\":1,\"22\":1,\"23\":1,\"24\":1,\"25\":1,\"26\":1,\"27\":1,\"28\":1,\"29\":0,\"30\":1,\"31\":1,\"32\":1,\"33\":1,\"34\":1,\"35\":0,\"36\":1,\"37\":\"en\",\"38\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18363\",\"39\":1,\"40\":0,\"41\":25,\"42\":0,\"43\":0,\"44\":1,\"45\":0,\"46\":1,\"47\":1,\"48\":1,\"49\":1,\"50\":1,\"51\":0,\"52\":1,\"53\":1,\"54\":0,\"55\":1,\"56\":1,\"57\":0,\"58\":0},\"5\":\"daf0f29045\",\"7\":25,\"8\":\"gmail_fe_200716.08_p3\",\"9\":1,\"10\":5,\"11\":\"\",\"12\":19800000,\"13\":\"+05:30\",\"14\":1,\"16\":322097573,\"17\":\"\",\"18\":\"\",\"19\":\"1595510436089\",\"21\":\"6797606\"}",
									Header.HeaderAction.Modify), http.header(
									"X-Google-BTD", "1",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
		}
		endStep();
		beginStep("[24] No Title", 403);
		{
			http.post(
					134,
					"https://mail.google.com/sync/u/0/i/fd",
					http.querystring(http.param("hl", "en"),
							http.param("c", "46")),
					http.postdata(http
							.param("#{\"1\":[#{\"1\":\"thread-f:1673013636473466906\",\"3\":[\"msg-f:1673013636473466906\"]#}],\"2\":3#}")),
					http.headers(
							http.header("Origin", "https://mail.google.com",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "max-age=0",
									Header.HeaderAction.Modify),
							http.header("Content-Type", "application/json",
									Header.HeaderAction.Modify),
							http.header(
									"X-Framework-Xsrf-Token",
									"AKwhgQqIHsD4DCu3nZFQnDZ8LQzXn4BQzQ:1595503435093",
									Header.HeaderAction.Modify),
							http.header(
									"X-Gmail-BTAI",
									"{\"3\":{\"6\":0,\"10\":1,\"13\":1,\"15\":0,\"16\":1,\"17\":1,\"18\":0,\"19\":1,\"22\":1,\"23\":1,\"24\":1,\"25\":1,\"26\":1,\"27\":1,\"28\":1,\"29\":0,\"30\":1,\"31\":1,\"32\":1,\"33\":1,\"34\":1,\"35\":0,\"36\":1,\"37\":\"en\",\"38\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18363\",\"39\":1,\"40\":0,\"41\":25,\"42\":0,\"43\":0,\"44\":1,\"45\":0,\"46\":1,\"47\":1,\"48\":1,\"49\":1,\"50\":1,\"51\":0,\"52\":1,\"53\":1,\"54\":0,\"55\":1,\"56\":1,\"57\":0,\"58\":0},\"5\":\"daf0f29045\",\"7\":25,\"8\":\"gmail_fe_200716.08_p3\",\"9\":1,\"10\":5,\"11\":\"\",\"12\":19800000,\"13\":\"+05:30\",\"14\":1,\"16\":322097573,\"17\":\"\",\"18\":\"\",\"19\":\"1595510442217\",\"21\":\"6797647\"}",
									Header.HeaderAction.Modify), http.header(
									"X-Google-BTD", "1",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
		}
		endStep();
		beginStep("[25] No Title", -373);
		{
			http.xmlPost(
					138,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"YoOB6Z6KPVDCxxZdNDr00g=="), http.param(
							"MSURS-MAC", "XtEiT5HuUps=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU/X2Fmckxvb3A9NDIxNjc0Njg5NzE1NTQ4NyZfYWZyV2luZG93TW9kZT0wJl9hZnJXaW5kb3dJZD1udWxsJl9hZGYuY3RybC1zdGF0ZT1kc2h5NzFmNXhfMSZfYWZyRlM9MTYmX2Fmck1UPXNjcmVlbiZfYWZyTUZXPTE5MjAmX2Fmck1GSD04NzgmX2Fmck1GRFc9MTkyMCZfYWZyTUZESD0xMDgwJl9hZnJNRkM9OCZfYWZyTUZDST0wJl9hZnJNRk09MCZfYWZyTUZSPTk2Jl9hZnJNRkc9MCZfYWZyTUZTPTAmX2Fmck1GTz0w</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvYWZyL2JsYW5rLmh0bWw=</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>1909</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[26] No Title", -715);
		{
			http.xmlPost(
					142,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"ff5Nz54A6fg0mmR8nRk9bg=="), http.param(
							"MSURS-MAC", "2dOrWIdohTE=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU=</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU/X2Fmckxvb3A9NDIxNjc0Njg5NzE1NTQ4NyZfYWZyV2luZG93TW9kZT0wJl9hZnJXaW5kb3dJZD1udWxsJl9hZGYuY3RybC1zdGF0ZT1kc2h5NzFmNXhfMSZfYWZyRlM9MTYmX2Fmck1UPXNjcmVlbiZfYWZyTUZXPTE5MjAmX2Fmck1GSD04NzgmX2Fmck1GRFc9MTkyMCZfYWZyTUZESD0xMDgwJl9hZnJNRkM9OCZfYWZyTUZDST0wJl9hZnJNRk09MCZfYWZyTUZSPTk2Jl9hZnJNRkc9MCZfYWZyTUZTPTAmX2Fmck1GTz0w</URL><O>POST</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvYWZyL2JsYW5rLmh0bWw=</URL><O>POST</O><T>FRAME</T><HIP>0.0.0.0</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtdWkvZmFjZXMvZnVzZXdlbGNvbWU/X2FkZi5jdHJsLXN0YXRlPWRzaHk3MWY1eF81</URL><O>POST</O><T>ACTION</T><HIP>0.0.0.0</HIP></Rq></R><WA/><PRT>1909</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
			beginStep("[1] No Title", -668);
			{
				http.xmlPost(
						150,
						"https://urs.microsoft.com/urs.asmx",
						http.querystring(
								http.param("MSURS-Client-Key=5H%2bNE/GGe4ovOc5QfkJFsg%3d%3d"),
								http.param("MSURS-MAC", "XASP3boigw0=")),
						"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU/X2Fmckxvb3A9NDIxNjc0Njg5NzE1NTQ4NyZfYWZyV2luZG93TW9kZT0wJl9hZnJXaW5kb3dJZD1udWxsJl9hZGYuY3RybC1zdGF0ZT1kc2h5NzFmNXhfMSZfYWZyRlM9MTYmX2Fmck1UPXNjcmVlbiZfYWZyTUZXPTE5MjAmX2Fmck1GSD04NzgmX2Fmck1GRFc9MTkyMCZfYWZyTUZESD0xMDgwJl9hZnJNRkM9OCZfYWZyTUZDST0wJl9hZnJNRk09MCZfYWZyTUZSPTk2Jl9hZnJNRkc9MCZfYWZyTUZTPTAmX2Fmck1GTz0w</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU/X2Fmckxvb3A9NDIxNjc0Njg5NzE1NTQ4NyZfYWZyV2luZG93TW9kZT0wJl9hZnJXaW5kb3dJZD1udWxsJl9hZGYuY3RybC1zdGF0ZT1kc2h5NzFmNXhfMSZfYWZyRlM9MTYmX2Fmck1UPXNjcmVlbiZfYWZyTUZXPTE5MjAmX2Fmck1GSD04NzgmX2Fmck1GRFc9MTkyMCZfYWZyTUZESD0xMDgwJl9hZnJNRkM9OCZfYWZyTUZDST0wJl9hZnJNRk09MCZfYWZyTUZSPTk2Jl9hZnJNRkc9MCZfYWZyTUZTPTAmX2Fmck1GTz0w</URL><O>POST</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtdWkvZmFjZXMvZnVzZXdlbGNvbWU/X2FkZi5jdHJsLXN0YXRlPWRzaHk3MWY1eF81</URL><O>POST</O><T>ACTION</T><HIP>0.0.0.0</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvYWZyL2JsYW5rLmh0bWw=</URL><O>POST</O><T>FRAME</T><HIP>0.0.0.0</HIP></Rq></R><WA/><PRT>986</PRT></RepLookup>",
						http.headers(http.header("Content-Type",
								"text/xml; charset=utf-8",
								Header.HeaderAction.Modify), http.header(
								"Cache-Control", "no-cache",
								Header.HeaderAction.Modify)), true, "UTF8",
						"UTF8");
			}
			endStep();
		}
		endStep();
		beginStep("[27] No Title", 204);
		{
			http.post(
					146,
					"{{web.formaction.f1,https://ejop-test.fa.em2.oraclecloud.com/fscmUI/faces/FuseWelcome?_adf.ctrl-state=dshy71f5x_5}}",
					null,
					http.postdata(
							http.param(
									"org.apache.myfaces.trinidad.faces.FORM",
									"{{web.input.orgapachemyfacestrinidadfa,f1}}"),
							http.param("javax.faces.ViewState={{web.input.javaxfacesViewState,!128sqchlal}}"),
							http.param(
									"oracle.adf.view.rich.monitoring.UserActivityInfo",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_92,http:}}//oracle.com/richClient/comm\"><k v=\"pr0\"><m><k v=\"cid\"><s>{{web.jscript.httpsejoptestfaem2_587,005elisgAxy8Xrg_lDc9yZ0003gD0001RZ}}</s></k><k v=\"cst\"><s>1595510443402</s></k><k v=\"cet\"><s>1595510443402</s></k></m></k><k v=\"prm\"><m><k v=\"cst\"><s>1595510443550</s></k><k v=\"eif\"><m><k v=\"ety\"><s>poll</s></k><k v=\"cld\"><s>{{web.jscript.httpsejoptestfaem2_373,pt1:atkfr1:0:grid:0:annreg:0:p1}}</s></k><k v=\"cty\"><s>oracle.adf.RichPoll</s></k><k v=\"rvd\"><s>{{web.jscript.httpsejoptestfaem2_671,/AtkFuseHomeOsnDeckTF/AtkBBBFuseFeedsFrontPage}}</s></k></m></k></m></k></m>"),
							http.param("event",
									"{{web.jscript.httpsejoptestfaem2_373,pt1:atkfr1:0:grid:0:annreg:0:p1}}"),
							http.param(
									"event.pt1:atkfr1:0:grid:0:annreg:0:p1",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_92,http:}}//oracle.com/richClient/comm\"><k v=\"suppressMessageClear\"><s>true</s></k><k v=\"type\"><s>poll</s></k></m>"),
							http.param("oracle.adf.view.rich.PROCESS",
									"{{web.jscript.httpsejoptestfaem2_373,pt1:atkfr1:0:grid:0:annreg:0:p1}}")),
					http.headers(
							http.header(
									"Content-Type",
									"application/x-www-form-urlencoded; charset=UTF-8",
									Header.HeaderAction.Modify),
							http.header("Adf-Rich-Message", "true",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://ejop-test.fa.em2.oraclecloud.com{{referer.httpsejoptestfaem2oraclecl,/fscmUI/faces/FuseWelcome?_afrLoop=4216746897155487&_afrWindowMode=0&_afrWindowId=null&_adf.ctrl-state=dshy71f5x_1&_afrFS=16&_afrMT=screen&_afrMFW=1920&_afrMFH=878&_afrMFDW=1920&_afrMFDH=1080&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0}}",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[28] No Title", 5607);
		{
			http.post(
					154,
					"{{web.formaction.f1,https://ejop-test.fa.em2.oraclecloud.com/fscmUI/faces/FuseWelcome?_adf.ctrl-state=dshy71f5x_5}}",
					null,
					http.postdata(
							http.param("pt1:atkfr1:0:grid:0:annreg:0:it5", ""),
							http.param("pt1:atkfr1:0:grid:0:annreg:0:it2", ""),
							http.param("pt1:atkfr1:0:grid:0:annreg:0:it3", ""),
							http.param(
									"org.apache.myfaces.trinidad.faces.FORM",
									"{{web.input.orgapachemyfacestrinidadfa,f1}}"),
							http.param("javax.faces.ViewState={{web.input.javaxfacesViewState,!128sqchlal}}"),
							http.param(
									"oracle.adf.view.rich.monitoring.UserActivityInfo",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_92,http:}}//oracle.com/richClient/comm\"><k v=\"pr0\"><m><k v=\"cid\"><s>005elitI9pm8Xrg_lDc9yZ0003gD0001Re</s></k><k v=\"cst\"><s>1595510443550</s></k><k v=\"cet\"><s>1595510444589</s></k><k v=\"rrt\"><s>1595510443566</s></k></m></k><k v=\"prm\"><m><k v=\"cst\"><s>1595510449989</s></k><k v=\"eif\"><m><k v=\"ety\"><s>iconClicked</s></k><k v=\"cld\"><s>{{web.jscript.httpsejoptestfaem2_780,pt1:hidden}}</s></k><k v=\"cty\"><s>oracle.adf.RichCommandButton</s></k><k v=\"cdn\"><s>{{web.jscript.httpsejoptestfaem2_388,Add Item}}</s></k></m></k></m></k></m>"),
							http.param("event",
									"{{web.jscript.httpsejoptestfaem2_780,pt1:hidden}}"),
							http.param(
									"event.pt1:hidden",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_92,http:}}//oracle.com/richClient/comm\"><k v=\"_custom\"><b>1</b></k><k v=\"itemNodeId\"><s>itemNode_workforce_management_workforce_structures</s></k><k v=\"type\"><s>iconClicked</s></k></m>"),
							http.param("oracle.adf.view.rich.PROCESS",
									"{{web.jscript.httpsejoptestfaem2_780,pt1:hidden}}")),
					http.headers(
							http.header(
									"Content-Type",
									"application/x-www-form-urlencoded; charset=UTF-8",
									Header.HeaderAction.Modify),
							http.header("Adf-Ads-Page-Id", "1",
									Header.HeaderAction.Modify),
							http.header("Adf-Rich-Message", "true",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://ejop-test.fa.em2.oraclecloud.com{{referer.httpsejoptestfaem2oraclecl,/fscmUI/faces/FuseWelcome?_afrLoop=4216746897155487&_afrWindowMode=0&_afrWindowId=null&_adf.ctrl-state=dshy71f5x_1&_afrFS=16&_afrMT=screen&_afrMFW=1920&_afrMFH=878&_afrMFDW=1920&_afrMFDH=1080&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0}}",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[29] No Title", 83);
		{
			{
				http.addCookie(
						"JSESSIONID=jz571URGP2SHmhsbOHvsG_rWm3Z34QH2is4WguI1qBqVz4CIy-lK!228388531!96449808; domain=ejop-test.fa.em2.oraclecloud.com; path=/",
						null);
				http.addCookie(
						"_WL_AUTHCOOKIE_JSESSIONID=XCDrrNk36Crr--A2SFKu; domain=ejop-test.fa.em2.oraclecloud.com; path=/",
						null);
			}
			http.window(158, "window[@index='{{xml.S,0}}']")
					.get("https://ejop-test.fa.em2.oraclecloud.com/hcmUI/faces/FndOverview",
							http.querystring(
									http.param("fnd", ";;;;false;256;;;"),
									http.param("fndGlobalItemNodeId",
											"itemNode_workforce_management_workforce_structures")),
							null, true, "UTF8", "UTF8");
			{
				http.solveGroupJavaScript(
						"/window[@index='0']",
						new String[] {
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_819",
										1, 0, 148, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_806",
										1, 0, 38, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_840",
										1, 0, 50, 0) });
			}
		}
		endStep();
		beginStep(
				"[30] Workforce Structures - Workforce Structures - Oracle Applications",
				170);
		{
			http.window(164, "window[@index='{{xml.S,0}}']")
					.get("https://ejop-test.fa.em2.oraclecloud.com/hcmUI/faces/FndOverview", http.querystring(
									http.param("fnd", ";;;;false;256;;;"),
									http.param("fndGlobalItemNodeId",
											"itemNode_workforce_management_workforce_structures"),
									http.param("_afrLoop",
											"{{web.jscript.httpsejoptestfaem2_819,4216765009040924}}"),
									http.param("_afrWindowMode", "{{xml.S,0}}"),
									http.param("_afrWindowId",
											"{{web.jscript.httpsejoptestfaem2_357,1dv3u512r}}"),
									http.param("_adf.ctrl-state",
											"{{web.jscript.httpsejoptestfaem2_806,187uis1134_1}}"),
									http.param("_afrFS", "16"),
									http.param("_afrMT",
											"{{web.jscript.httpsejoptestfaem2_840,screen}}"),
									http.param("_afrMFW", "1920"), http.param(
											"_afrMFH", "878"), http.param(
											"_afrMFDW", "1920"), http.param(
											"_afrMFDH", "1080"), http.param(
											"_afrMFC", "8"), http.param(
											"_afrMFCI", "{{xml.S,0}}"), http
											.param("_afrMFM", "{{xml.S,0}}"),
									http.param("_afrMFR", "96"), http.param(
											"_afrMFG", "{{xml.S,0}}"), http
											.param("_afrMFS", "{{xml.S,0}}"),
									http.param("_afrMFO", "{{xml.S,0}}")), null, true, "UTF8", "UTF8");
			{
				http.solveXPath(
						"web.formaction.FOf1_xmldecode",
						"/window[@index='0']",
						".//form[@name='_FOf1']/@action",
						"https://ejop-test.fa.em2.oraclecloud.com/hcmUI/faces/FndOverview?_adf.ctrl-state=187uis1134_5&fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures",
						0, EncodeOptions.XMLDecode);
				http.solveXPath(
						"web.input.orgapachemyfacestrinidadfa_1",
						"/window[@index='0']",
						".//input[@name='org.apache.myfaces.trinidad.faces.FORM']/@value",
						"_FOf1", 0, EncodeOptions.None);
				http.solveXPath("web.input.javaxfacesViewState_1",
						"/window[@index='0']",
						".//input[@name='javax.faces.ViewState']/@value",
						"!-14apr7uxg2", 0, EncodeOptions.None);
				http.solveGroupJavaScript(
						"/window[@index='0']",
						new String[] {
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_2584",
										1, 125, 636, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_1075",
										1, 125, 886, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_3123",
										1, 125, 895, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_2585",
										1, 125, 951, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_1835",
										1, 125, 633, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_3027",
										1, 125, 1, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_2468",
										1, 125, 931, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_895",
										1, 125, 369, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_2590",
										1, 12, 10, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_1040",
										1, 125, 912, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_1097",
										1, 125, 875, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_1411",
										1, 125, 456, 0),
								http.javaScriptPath(
										"web.jscript.httpsejoptestfaem2_943",
										1, 125, 432, 0) });
				http.solveRefererHeader(
						"referer.httpsejoptestfaem2oraclecl_7",
						"/window[@index='0']",
						"/hcmUI/faces/FndOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures&_afrLoop=4216765009040924&_afrWindowMode=0&_afrWindowId=1dv3u512r&_adf.ctrl-state=187uis1134_1&_afrFS=16&_afrMT=screen&_afrMFW=1920&_afrMFH=878&_afrMFDW=1920&_afrMFDH=1080&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");
			}
		}
		endStep();
		beginStep("[31] No Title", -617);
		{
			http.xmlPost(
					168,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(
							http.param("MSURS-Client-Key=OUOJcaNwwD3/H41QMD1LqQ%3d%3d"),
							http.param("MSURS-MAC", "hpp4ITEOlkg=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9mc2NtVUkvZmFjZXMvRnVzZVdlbGNvbWU/X2Fmckxvb3A9NDIxNjc0Njg5NzE1NTQ4NyZfYWZyV2luZG93TW9kZT0wJl9hZnJXaW5kb3dJZD1udWxsJl9hZGYuY3RybC1zdGF0ZT1kc2h5NzFmNXhfMSZfYWZyRlM9MTYmX2Fmck1UPXNjcmVlbiZfYWZyTUZXPTE5MjAmX2Fmck1GSD04NzgmX2Fmck1GRFc9MTkyMCZfYWZyTUZESD0xMDgwJl9hZnJNRkM9OCZfYWZyTUZDST0wJl9hZnJNRk09MCZfYWZyTUZSPTk2Jl9hZnJNRkc9MCZfYWZyTUZTPTAmX2Fmck1GTz0w</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcw==</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>1024</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[32] No Title", -1338);
		{
			http.xmlPost(
					172,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(
							http.param("MSURS-Client-Key=EGYxtIIBrOIwQK7/o8Dxpw%3d%3d"),
							http.param("MSURS-MAC", "6cOrVm15twQ=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcw==</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcyZfYWZyTG9vcD00MjE2NzY1MDA5MDQwOTI0Jl9hZnJXaW5kb3dNb2RlPTAmX2FmcldpbmRvd0lkPTFkdjN1NTEyciZfYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF8xJl9hZnJGUz0xNiZfYWZyTVQ9c2NyZWVuJl9hZnJNRlc9MTkyMCZfYWZyTUZIPTg3OCZfYWZyTUZEVz0xOTIwJl9hZnJNRkRIPTEwODAmX2Fmck1GQz04Jl9hZnJNRkNJPTAmX2Fmck1GTT0wJl9hZnJNRlI9OTYmX2Fmck1GRz0wJl9hZnJNRlM9MCZfYWZyTUZPPTA=</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>1024</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[33] No Title", 363);
		{
			http.xmlPost(
					185,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(
							http.param("MSURS-Client-Key=PPenzC4kOI7TOd2rmG/z9g%3d%3d"),
							http.param("MSURS-MAC=I5Up5/mdJLE%3d")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcyZfYWZyTG9vcD00MjE2NzY1MDA5MDQwOTI0Jl9hZnJXaW5kb3dNb2RlPTAmX2FmcldpbmRvd0lkPTFkdjN1NTEyciZfYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF8xJl9hZnJGUz0xNiZfYWZyTVQ9c2NyZWVuJl9hZnJNRlc9MTkyMCZfYWZyTUZIPTg3OCZfYWZyTUZEVz0xOTIwJl9hZnJNRkRIPTEwODAmX2Fmck1GQz04Jl9hZnJNRkNJPTAmX2Fmck1GTT0wJl9hZnJNRlI9OTYmX2Fmck1GRz0wJl9hZnJNRlM9MCZfYWZyTUZPPTA=</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9hZnIvYmxhbmsuaHRtbA==</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>3549</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[34] No Title", -459);
		{
			http.xmlPost(
					189,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"QsX4Whsjh4srbZ+b7X8iDg=="), http.param(
							"MSURS-MAC", "JW7XI1Sz5T8=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcyZfYWZyTG9vcD00MjE2NzY1MDA5MDQwOTI0Jl9hZnJXaW5kb3dNb2RlPTAmX2FmcldpbmRvd0lkPTFkdjN1NTEyciZfYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF8xJl9hZnJGUz0xNiZfYWZyTVQ9c2NyZWVuJl9hZnJNRlc9MTkyMCZfYWZyTUZIPTg3OCZfYWZyTUZEVz0xOTIwJl9hZnJNRkRIPTEwODAmX2Fmck1GQz04Jl9hZnJNRkNJPTAmX2Fmck1GTT0wJl9hZnJNRlI9OTYmX2Fmck1GRz0wJl9hZnJNRlM9MCZfYWZyTUZPPTA=</RU><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcyZfYWZyTG9vcD00MjE2NzY1MDA5MDQwOTI0Jl9hZnJXaW5kb3dNb2RlPTAmX2FmcldpbmRvd0lkPTFkdjN1NTEyciZfYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF8xJl9hZnJGUz0xNiZfYWZyTVQ9c2NyZWVuJl9hZnJNRlc9MTkyMCZfYWZyTUZIPTg3OCZfYWZyTUZEVz0xOTIwJl9hZnJNRkRIPTEwODAmX2Fmck1GQz04Jl9hZnJNRkNJPTAmX2Fmck1GTT0wJl9hZnJNRlI9OTYmX2Fmck1GRz0wJl9hZnJNRlM9MCZfYWZyTUZPPTA=</URL><O>POST</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY211aS9mYWNlcy9mbmRvdmVydmlldz9fYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF81JmZuZD07Ozs7ZmFsc2U7MjU2Ozs7JmZuZGdsb2JhbGl0ZW1ub2RlaWQ9aXRlbW5vZGVfd29ya2ZvcmNlX21hbmFnZW1lbnRfd29ya2ZvcmNlX3N0cnVjdHVyZXM=</URL><O>POST</O><T>ACTION</T><HIP>0.0.0.0</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9hZnIvYmxhbmsuaHRtbA==</URL><O>POST</O><T>FRAME</T><HIP>0.0.0.0</HIP></Rq></R><WA/><PRT>3549</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[35] No Title", 6297);
		{
			http.options(
					193,
					"https://signaler-pa.clients6.google.com/v1/acknowledgments",
					http.querystring(http.param("key",
							"AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc")),
					null,
					http.headers(
							http.header("Origin",
									"https://hangouts.google.com",
									Header.HeaderAction.Modify),
							http.header(
									"Access-Control-Request-Headers",
									"authorization,content-type,x-goog-authuser",
									Header.HeaderAction.Modify),
							http.header("Access-Control-Request-Method",
									"POST", Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://hangouts.google.com/webchat/u/0/load?client=sm&prop=gmail&nav=true&fid=gtn-roster-iframe-id&os=Win32&stime=1595503457329&xpc=%7B%22cn%22%3A%22uu4u3s%22%2C%22tp%22%3A1%2C%22ifrid%22%3A%22gtn-roster-iframe-id%22%2C%22pu%22%3A%22https%3A%2F%2Fhangouts.google.com%2Fwebchat%2Fu%2F0%2F%22%7D&ec=%5B%22ci%3Aec%22%2Ctrue%2Ctrue%2Cfalse%5D&pvt=AMP3uWbnWpq2Si6urYvDkj7w2etfvj7MmWaLoYGlwpgZvbJ_QcTUunrShlmYVicHLGtGzaT25sW8yJONWXqT9tstvyfYddpr1g%3D%3D&href=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%3Frel%3D1&pos=l&uiv=2&hl=en&hpc=true&hsm=true&hrc=true&pal=1&uqp=false&gooa=false&gltsi=true&gusm=true&sl=false&hs=%5B%22h_hs%22%2Cnull%2Cnull%2C%5B2%2C0%5D%5D&moleh=380&mmoleh=36&two=https%3A%2F%2Fmail.google.com&host=1&zx=png7qrpd2bka",
									Header.HeaderAction.Modify)), true, null,
					"ASCII");
		}
		endStep();
		beginStep("[36] No Title", -830);
		{
			http.options(
					197,
					"https://signaler-pa.clients6.google.com/v1/acknowledgments",
					http.querystring(http.param("key",
							"AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc")),
					null,
					http.headers(
							http.header("Origin",
									"https://hangouts.google.com",
									Header.HeaderAction.Modify),
							http.header(
									"Access-Control-Request-Headers",
									"authorization,content-type,x-goog-authuser",
									Header.HeaderAction.Modify),
							http.header("Access-Control-Request-Method",
									"POST", Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://hangouts.google.com/webchat/u/0/load?client=sm&prop=gmail&nav=true&fid=gtn-roster-iframe-id&os=Win32&stime=1595503457329&xpc=%7B%22cn%22%3A%22uu4u3s%22%2C%22tp%22%3A1%2C%22ifrid%22%3A%22gtn-roster-iframe-id%22%2C%22pu%22%3A%22https%3A%2F%2Fhangouts.google.com%2Fwebchat%2Fu%2F0%2F%22%7D&ec=%5B%22ci%3Aec%22%2Ctrue%2Ctrue%2Cfalse%5D&pvt=AMP3uWbnWpq2Si6urYvDkj7w2etfvj7MmWaLoYGlwpgZvbJ_QcTUunrShlmYVicHLGtGzaT25sW8yJONWXqT9tstvyfYddpr1g%3D%3D&href=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%3Frel%3D1&pos=l&uiv=2&hl=en&hpc=true&hsm=true&hrc=true&pal=1&uqp=false&gooa=false&gltsi=true&gusm=true&sl=false&hs=%5B%22h_hs%22%2Cnull%2Cnull%2C%5B2%2C0%5D%5D&moleh=380&mmoleh=36&two=https%3A%2F%2Fmail.google.com&host=1&zx=png7qrpd2bka",
									Header.HeaderAction.Modify)), true, null,
					"ASCII");
		}
		endStep();
		beginStep("[37] No Title", 22);
		{
			{
				http.addCookie(
						"S=billing-ui-v3=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW:billing-ui-v3-efe=m0TtoPL73e8o5FeVAF5GPu-9jd9PBaXW; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"OGPC=19009731-4:19011552-8:19015316-1:19015254-1:19015744-2:19008539-4:19010605-1:19008544-1:19016466-1:19008535-1:19010599-2:; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-HSID=AvXz8BPZp3TMgDUKp; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"SSID=AoFm8iqvtvLQUPOFO; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"SAPISID=3nU3YhwoU6SW_hns/AkZBaTVY6qYHSpbW_; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"1P_JAR=2020-07-23-11; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"SID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZOkm5Suqxq6jE2B8AmpvHy8w.; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"OGP=-19009731:-19010599:-19008539:; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-SSID=AoFm8iqvtvLQUPOFO; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"SEARCH_SAMESITE=CgQIoZAB; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"HSID=AvXz8BPZp3TMgDUKp; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"CONSENT=YES+IN.en+202006; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"ANID=AHWqTUmEqbt5XWuoonrL-yYEasRo_wCGp6JmlfBwAtVKmu-ohEWJFXBVTyTG5Frp; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-3PSID=zQeuriYYFC65rCRJUk-h-aNl-FCPpvZzzASzlLwyeLRgyvZO-gnCuRSoMCqCpIko33HsOg.; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"NID=204=r3nsDRFBWLdi2uKoANZwNr8e3qNt8YFUJ07A9aJGshTsReczfOMTylu3N03wo_xhnfoCqldzVJsFvaBRpY8sMPtttYD8APm1WyQsy19nz9mr_vkPZLkLcqajEJS97ut0laWWy6cGWAKd0lh2H9POq83izlast-lSlXOVBlnNp8vUYXwPvtouSRm_iDQhApwPP8loEohWfEqANAvO5f2RA6xv1S3S8Q-wCfbAlZgdKk53c65eRX3bFPr4l7plkWstukYF2B8jtcJY0z0bOQ; domain=signaler-pa.clients6.google.com; path=/",
						null);
				http.addCookie(
						"__Secure-APISID=xxiteFlH897db1xv/AjTKzdkIgSYpHOhuy; domain=signaler-pa.clients6.google.com; path=/",
						null);
			}
			http.post(
					201,
					"https://signaler-pa.clients6.google.com/v1/acknowledgments",
					http.querystring(http.param("key",
							"AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc")),
					http.postdata(http
							.param("[{{web.input.buttonAction,null}},[[\"CpEBMIiarpvWidbDbzoLODg4MTM2NzYyODdKeAoWKhTfDrCaxtcaEAWxByNi7N2q6w2nawoWKhSX5e4W4GrrqKKJVdbpLytang0DzQoWKhSd4aC5On3U9Ws+NjZTNkXOVqrfRwoCWAEKCQirhJPRu+PqAgoSKhBhYWYyMjI5MTg3OWJmNjA1CgsIo6Tn08Hm0L2yARF+TaMY2hJJOxgL\",1595510463059000]]]")),
					http.headers(http.header("Origin",
							"https://hangouts.google.com",
							Header.HeaderAction.Modify), http.header(
							"Content-type", "application/json+protobuf",
							Header.HeaderAction.Modify),
							http.header("X-Goog-AuthUser", "0",
									Header.HeaderAction.Modify), http.header(
									"Cache-Control", "no-cache",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
		}
		endStep();
		beginStep("[38] No Title", -998);
		{
			http.addCookie(
					"SIDCC=AJi4QfFEMIRqa2Z5vFb2aEGgpYiBKTePPPhIeMAj9uUmkboZ-O0B-UK3nMOjDpL1txstpQWs7BA8; domain=signaler-pa.clients6.google.com; path=/",
					null);
			http.post(
					205,
					"https://signaler-pa.clients6.google.com/v1/acknowledgments",
					http.querystring(http.param("key",
							"AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc")),
					http.postdata(http
							.param("[{{web.input.buttonAction,null}},[[\"CpEBMIiarpvWidbDbzoLODg4MTM2NzYyODdKeAoWKhTfDrCaxtcaEAWxByNi7N2q6w2nawoWKhSX5e4W4GrrqKKJVdbpLytang0DzQoWKhSd4aC5On3U9Ws+NjZTNkXOVqrfRwoCWAEKCQirhJPRu+PqAgoSKhBhYWYyMjI5MTg3OWJmNjA1CgsIo6Tn08Hm0L2yARF+TaMY2hJJOxgL\",1595510459049000]]]")),
					http.headers(http.header("Origin",
							"https://hangouts.google.com",
							Header.HeaderAction.Modify), http.header(
							"Content-type", "application/json+protobuf",
							Header.HeaderAction.Modify),
							http.header("X-Goog-AuthUser", "0",
									Header.HeaderAction.Modify), http.header(
									"Cache-Control", "no-cache",
									Header.HeaderAction.Modify)), true,
					"UTF-8", "UTF8");
		}
		endStep();
		beginStep("[39] No Title", -628);
		{
			http.post(
					209,
					"{{web.formaction.FOf1_xmldecode,https://ejop-test.fa.em2.oraclecloud.com/hcmUI/faces/FndOverview?_adf.ctrl-state=187uis1134_5&fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures}}",
					null,
					http.postdata(
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:s1:ll01Inp",
									""),
							http.param(
									"org.apache.myfaces.trinidad.faces.FORM",
									"{{web.input.orgapachemyfacestrinidadfa_1,_FOf1}}"),
							http.param("javax.faces.ViewState={{web.input.javaxfacesViewState_1,!-14apr7uxg2}}"),
							http.param(
									"oracle.adf.view.rich.RENDER",
									"{{web.jscript.httpsejoptestfaem2_2584,_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1}}"),
							http.param(
									"oracle.adf.view.rich.DELTAS",
									"#{{{web.jscript.httpsejoptestfaem2_1075,_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:0:ll02Pce:ll01Lv}}=#{{{web.jscript.httpsejoptestfaem2_3123,selectedRowKeys}}=0#}#}"),
							http.param(
									"oracle.adf.view.rich.monitoring.UserActivityInfo",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_2590,http:}}//oracle.com/richClient/comm\"><k v=\"pr0\"><m><k v=\"cid\"><s>{{web.jscript.httpsejoptestfaem2_3027,005elitlU8p8Xrg_lDc9yZ0003gD0001Ri}}</s></k><k v=\"cst\"><s>1595510450818</s></k><k v=\"cet\"><s>1595510459538</s></k><k v=\"rrt\"><s>1595510459622</s></k></m></k><k v=\"pr1\"><m><k v=\"cid\"><s>005elitfQ5X8Xrg_lDc9yZ0003gD0001Rg</s></k><k v=\"cst\"><s>1595510449989</s></k><k v=\"cet\"><s>1595510450818</s></k><k v=\"rrt\"><s>1595510450816</s></k></m></k><k v=\"prm\"><m><k v=\"cst\"><s>1595510467768</s></k><k v=\"eif\"><m><k v=\"ety\"><s>{{web.jscript.httpsejoptestfaem2_895,action}}</s></k><k v=\"cld\"><s>{{web.jscript.httpsejoptestfaem2_2585,_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:0:ll02Pce:ll01Lv:0:ll01Pse:ll01Cl}}</s></k><k v=\"cty\"><s>oracle.adf.RichCommandLink</s></k><k v=\"cdn\"><s>{{web.jscript.httpsejoptestfaem2_2468,Manage Positions}}</s></k><k v=\"rvd\"><s>{{web.jscript.httpsejoptestfaem2_1835,/HcmCommonTaskFlow/HcmCommonLandingListPage}}</s></k></m></k><k v=\"ppr\"><s>{{web.jscript.httpsejoptestfaem2_2584,_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1}}</s></k></m></k></m>"),
							http.param(
									"event",
									"{{web.jscript.httpsejoptestfaem2_2585,_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:0:ll02Pce:ll01Lv:0:ll01Pse:ll01Cl}}"),
							http.param(
									"event._FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:0:ll02Pce:ll01Lv:0:ll01Pse:ll01Cl",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_2590,http:}}//oracle.com/richClient/comm\"><k v=\"type\"><s>{{web.jscript.httpsejoptestfaem2_895,action}}</s></k></m>"),
							http.param(
									"oracle.adf.view.rich.PROCESS",
									"{{web.jscript.httpsejoptestfaem2_1040,_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsr1:0:ll01Upl:UPsp1:ll01Pce:ll01Itr:0:ll02Pce:ll01Lv:0:ll01Pse:PSEdeck2}}")),
					http.headers(
							http.header(
									"Content-Type",
									"application/x-www-form-urlencoded; charset=UTF-8",
									Header.HeaderAction.Modify),
							http.header("Adf-Rich-Message", "true",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://ejop-test.fa.em2.oraclecloud.com{{referer.httpsejoptestfaem2oraclecl_7,/hcmUI/faces/FndOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures&_afrLoop=4216765009040924&_afrWindowMode=0&_afrWindowId=1dv3u512r&_adf.ctrl-state=187uis1134_1&_afrFS=16&_afrMT=screen&_afrMFW=1920&_afrMFH=878&_afrMFDW=1920&_afrMFDH=1080&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0}}",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[40] No Title", 7509);
		{
			http.post(
					213,
					"{{web.formaction.FOf1_xmldecode,https://ejop-test.fa.em2.oraclecloud.com/hcmUI/faces/FndOverview?_adf.ctrl-state=187uis1134_5&fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures}}",
					null,
					http.postdata(
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1::saveSearch",
									"Active {{web.jscript.httpsejoptestfaem2_1097,Positions}}"),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value00",
									""),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value10",
									""),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value20",
									"1"),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value30",
									""),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value40",
									""),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value50",
									""),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value50::lcId",
									""),
							http.param(
									"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value60",
									""),
							http.param(
									"org.apache.myfaces.trinidad.faces.FORM",
									"{{web.input.orgapachemyfacestrinidadfa_1,_FOf1}}"),
							http.param("javax.faces.ViewState={{web.input.javaxfacesViewState_1,!-14apr7uxg2}}"),
							http.param(
									"oracle.adf.view.rich.monitoring.UserActivityInfo",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_2590,http:}}//oracle.com/richClient/comm\"><k v=\"pr0\"><m><k v=\"cid\"><s>005eliuiWmr8Xrg_lDc9yZ0003gD0001Ry</s></k><k v=\"cst\"><s>1595510467768</s></k><k v=\"cet\"><s>1595510470621</s></k><k v=\"rrt\"><s>1595510469116</s></k></m></k><k v=\"prm\"><m><k v=\"cst\"><s>1595510476569</s></k><k v=\"eif\"><m><k v=\"ety\"><s>fetch</s></k><k v=\"cld\"><s>{{web.jscript.httpsejoptestfaem2_1411,_FOpt1:_UISp9}}</s></k><k v=\"cty\"><s>oracle.adf.RichPopup</s></k></m></k></m></k></m>"),
							http.param("event",
									"{{web.jscript.httpsejoptestfaem2_1411,_FOpt1:_UISp9}}"),
							http.param(
									"event._FOpt1:_UISp9",
									"<m xmlns=\"{{web.jscript.httpsejoptestfaem2_2590,http:}}//oracle.com/richClient/comm\"><k v=\"launchId\"><s>{{web.jscript.httpsejoptestfaem2_943,_FOpt1:_UIScmil1u}}</s></k><k v=\"suppressMessageClear\"><s>true</s></k><k v=\"type\"><s>fetch</s></k></m>"),
							http.param("oracle.adf.view.rich.PROCESS",
									"{{web.jscript.httpsejoptestfaem2_1411,_FOpt1:_UISp9}}")),
					http.headers(
							http.header(
									"Content-Type",
									"application/x-www-form-urlencoded; charset=UTF-8",
									Header.HeaderAction.Modify),
							http.header("Adf-Ads-Page-Id", "1",
									Header.HeaderAction.Modify),
							http.header("Adf-Rich-Message", "true",
									Header.HeaderAction.Modify),
							http.header("Cache-Control", "no-cache",
									Header.HeaderAction.Modify),
							http.header(
									"Referer",
									"https://ejop-test.fa.em2.oraclecloud.com{{referer.httpsejoptestfaem2oraclecl_7,/hcmUI/faces/FndOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures&_afrLoop=4216765009040924&_afrWindowMode=0&_afrWindowId=1dv3u512r&_adf.ctrl-state=187uis1134_1&_afrFS=16&_afrMT=screen&_afrMFW=1920&_afrMFH=878&_afrMFDW=1920&_afrMFDH=1080&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0}}",
									Header.HeaderAction.Modify)), true, "UTF8",
					"UTF8");
		}
		endStep();
		beginStep("[41] No Title", 681);
		{
			http.xmlPost(
					217,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(
							http.param("MSURS-Client-Key=nZvntuMtk9m/ZIvUvx4WPA%3d%3d"),
							http.param("MSURS-MAC=U/RO3bkADPc%3d")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU/><RI>9.81.217.53</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY211aS9mYWNlcy9mbmRvdmVydmlldz9fYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF81JmZuZD07Ozs7ZmFsc2U7MjU2Ozs7JmZuZGdsb2JhbGl0ZW1ub2RlaWQ9aXRlbW5vZGVfd29ya2ZvcmNlX21hbmFnZW1lbnRfd29ya2ZvcmNlX3N0cnVjdHVyZXM=</URL><O>POST</O><T>ACTION</T><HIP>0.0.0.0</HIP></Rq></R><WA/><PRT>1248</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[42] Single Sign-Off consent", 247);
		{
			http.form(
					221,
					"window[@index='{{xml.S,0}}']//form[((@id='_FOf1' and @name='_FOf1') or @action='https://ejop-test.fa.em2.oraclecloud.com/hcmUI/faces/FndOverview?_adf.ctrl-state=187uis1134_5&fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_workforce_management_workforce_structures') and @index='{{xml.S,0}}']")
					.multipartSubmit(
							null,
							http.postdata(
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1::saveSearch",
											"Active Positions"),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value00",
											""),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value10",
											""),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value20",
											"1"),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value30",
											""),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value40",
											""),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value50",
											""),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value50::lcId",
											""),
									http.param(
											"_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAnt2:1:AP2:q1:value60",
											""),
									http.param("oracle.adf.view.rich.DELTAS",
											"#{_FOpt1:_UISp9=#{_shown=_FOpt1:_UISp9#}#}"),
									http.param(
											"oracle.adf.view.rich.monitoring.UserActivityInfo",
											"<m xmlns=\"http://oracle.com/richClient/comm\"><k v=\"pr0\"><m><k v=\"cid\"><s>005elivG7Ld8Xrg_lDc9yZ0003gD0000q7</s></k><k v=\"cst\"><s>1595510476569</s></k><k v=\"cet\"><s>1595510477148</s></k><k v=\"rrt\"><s>1595510477059</s></k></m></k><k v=\"prm\"><m><k v=\"cst\"><s>1595510479494</s></k><k v=\"eif\"><m><k v=\"ety\"><s>action</s></k><k v=\"cld\"><s>_FOpt1:_FOr1</s></k><k v=\"cty\"><s>oracle.adf.RichRegion</s></k><k v=\"rvd\"><s>/FndOverviewTF/FndFuseOverviewStripPF</s></k></m></k></m></k></m>"),
									http.param("event",
											"_FOpt1:_FOr1,_FOpt1:_UISlg1"),
									http.param(
											"event._FOpt1:_FOr1",
											"<m xmlns=\"http://oracle.com/richClient/comm\"><k v=\"type\"><s>action</s></k></m>"),
									http.param(
											"event._FOpt1:_UISlg1",
											"<m xmlns=\"http://oracle.com/richClient/comm\"><k v=\"type\"><s>action</s></k></m>")),
							http.headers(http.header("Cache-Control",
									"no-cache", Header.HeaderAction.Modify)),
							null, null, null, null,
							"---------------------------7e41fe13a1b30");
			http.window(236, "window[@index='0']").close();
		}
		endStep();
		beginStep("[43] No Title", 406);
		{
			http.xmlPost(
					237,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(
							http.param("MSURS-Client-Key=Y812/5wBxPq9H158JeBUMg%3d%3d"),
							http.param("MSURS-MAC", "4hxrp5smmFA=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcyZfYWZyTG9vcD00MjE2NzY1MDA5MDQwOTI0Jl9hZnJXaW5kb3dNb2RlPTAmX2FmcldpbmRvd0lkPTFkdjN1NTEyciZfYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF8xJl9hZnJGUz0xNiZfYWZyTVQ9c2NyZWVuJl9hZnJNRlc9MTkyMCZfYWZyTUZIPTg3OCZfYWZyTUZEVz0xOTIwJl9hZnJNRkRIPTEwODAmX2Fmck1GQz04Jl9hZnJNRkNJPTAmX2Fmck1GTT0wJl9hZnJNRlI9OTYmX2Fmck1GRz0wJl9hZnJNRlM9MCZfYWZyTUZPPTA=</RU><RI>0.0.0.0</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9mdXNpb25fYXBwcy9wYWdlcy9sb2dvdXRDb25zZW50LmpzcD9sb2dvdXRfZG9uZV91cmw9aHR0cHMlM0ElMkYlMkZlam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbSUzQTQ0MyUyRmZzY21VSSUyRmFkZkF1dGhlbnRpY2F0aW9uJTNGX2FkZi5hdXRoZW50aWNhdGUlM0R0cnVlJmxvZ291dElkPUU0NEUwMTU1NzBBNzZGOUQ0MkJCOTY5NTVBQkRCRDIzMUMzMjcwRjVGMkFDQUE0RDA2QjU3MzE1MzNBRDgyOUY=</URL><O>PRE</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq></R><WA/><PRT>1976</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		beginStep("[44] No Title", 486);
		{
			http.xmlPost(
					241,
					"https://urs.microsoft.com/urs.asmx",
					http.querystring(http.param("MSURS-Client-Key",
							"BCUFF92SGT+4k+W6QF03vg=="), http.param(
							"MSURS-MAC", "kYf+AxV6IlY=")),
					"<RepLookup v=\"6\"><G>4A72F430-B40C-4D36-A068-CE33ADA5ADF9</G><O>{{xml.T,40F68CA2-397C-E375-FE4B-C28AF13340EC}}</O><DID>i0YpD7LV6v6as/4uEwBOSXpFMp4RPPNKNEJFSojgyr4=:1</DID><UID>w:3A1939F9-27E9-57F5-A337-B40F14A5A9E4</UID><D>10.0.8110.6</D><C>11.0.0.0</C><OS>10.0.18363.0.0</OS><I>9.11.18362.0</I><L>en-US</L><RU>aHR0cHM6Ly9lam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbS9oY21VSS9mYWNlcy9GbmRPdmVydmlldz9mbmQ9JTNCJTNCJTNCJTNCZmFsc2UlM0IyNTYlM0IlM0IlM0ImZm5kR2xvYmFsSXRlbU5vZGVJZD1pdGVtTm9kZV93b3JrZm9yY2VfbWFuYWdlbWVudF93b3JrZm9yY2Vfc3RydWN0dXJlcyZfYWZyTG9vcD00MjE2NzY1MDA5MDQwOTI0Jl9hZnJXaW5kb3dNb2RlPTAmX2FmcldpbmRvd0lkPTFkdjN1NTEyciZfYWRmLmN0cmwtc3RhdGU9MTg3dWlzMTEzNF8xJl9hZnJGUz0xNiZfYWZyTVQ9c2NyZWVuJl9hZnJNRlc9MTkyMCZfYWZyTUZIPTg3OCZfYWZyTUZEVz0xOTIwJl9hZnJNRkRIPTEwODAmX2Fmck1GQz04Jl9hZnJNRkNJPTAmX2Fmck1GTT0wJl9hZnJNRlI9OTYmX2Fmck1GRz0wJl9hZnJNRlM9MCZfYWZyTUZPPTA=</RU><RI>0.0.0.0</RI><R><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9mdXNpb25fYXBwcy9wYWdlcy9sb2dvdXRDb25zZW50LmpzcD9sb2dvdXRfZG9uZV91cmw9aHR0cHMlM0ElMkYlMkZlam9wLXRlc3QuZmEuZW0yLm9yYWNsZWNsb3VkLmNvbSUzQTQ0MyUyRmZzY21VSSUyRmFkZkF1dGhlbnRpY2F0aW9uJTNGX2FkZi5hdXRoZW50aWNhdGUlM0R0cnVlJmxvZ291dElkPUU0NEUwMTU1NzBBNzZGOUQ0MkJCOTY5NTVBQkRCRDIzMUMzMjcwRjVGMkFDQUE0RDA2QjU3MzE1MzNBRDgyOUY=</URL><O>POST</O><T>TOP</T><HIP>9.81.217.53</HIP></Rq><Rq><URL>aHR0cHM6Ly9lam9wLXRlc3QubG9naW4uZW0yLm9yYWNsZWNsb3VkLmNvbS9vYW0vc2VydmVyL2xvZ291dA==</URL><O>POST</O><T>ACTION</T><HIP>0.0.0.0</HIP></Rq></R><WA/><PRT>826</PRT></RepLookup>",
					http.headers(http.header("Content-Type",
							"text/xml; charset=utf-8",
							Header.HeaderAction.Modify), http.header(
							"Cache-Control", "no-cache",
							Header.HeaderAction.Modify)), true, "UTF8", "UTF8");
		}
		endStep();
		
	}
	
	public void finish() throws Exception {
	}
}
