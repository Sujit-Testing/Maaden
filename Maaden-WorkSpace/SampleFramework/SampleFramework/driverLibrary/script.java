import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
import oracle.oats.scripting.modules.basic.api.exceptions.StopScriptRuntimeException;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.browser.api.utilities.exceptions.BrowserException;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.webdom.api.elements.DOMElement;
import oracle.oats.scripting.modules.webdom.api.elements.DOMImage;
public class script extends IteratingVUserScript {

//	ADFUtils adfUtil ;
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
//	@FunctionLibrary("Oracle_fusionlib") lib.fusion.automation.Oracle_fusionlib oracle_fusionlib;
	private enum keyword {TS4CSF,TS2CSF,DV3CSF,TS4CSF_XXCTS_DM,TS4CSF_SRVC_OTH,TS2CG1_SRVC_OTH,TS2CTS_SRVC_OTH,TS2CSF_SRVC_OTH,TS3CSF_SRVC_OTH,TS3CSF_SRVC_OTH1,LT1CSF_SRVC_OTH
		,CSFSTG7,CFNPRD,TS1CSF_SRVC_OTH,TS1CSF_SRVC_OTH1,TS1CSF_SRVC_OTH2,TS3CSF_SRVC_OTH5,CSFSTG_SRVC_OTH}; 
	int scmrel = 10; 
	int scmmlr = 0; 
	String scmfuseenabled; 
	String scmshell; 
	String scmfuseinvocation; 
	boolean hiddenVariablesSet = false; 
	
	public void initialize() throws Exception {
		//browser.launch();
//		String g_strEnvXMLPath=scm_fn_loadEnvFile();
//        getVariables().set("g_strEnvXMLPath", g_strEnvXMLPath, Variables.Scope.GLOBAL);
//       
//        VUserSettings vus = getSettings();
//        scm_fn_updatePlaybackSettings(web,vus);
		
		
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		//String xmlVariableValue = scm_fn_xmlReader("C:\\Users\\sthawali\\Desktop\\SAMPLE_env_reading.xml","SCM");
		//info("Printing value " +xmlVariableValue);
	} 
	
	public void finish() throws Exception {
	}

	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:		scm_fn_updatePlaybackSettings 
	 * 
	 * @purpose:	To set the OATS tool playback settings while executing the script
	 *
	 * @param : 	
	 *		
	 * @return:			
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	25-SEP-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	
	public void scm_fn_updatePlaybackSettings (WebDomService inputWeb, VUserSettings inputVUS)throws Exception{
	
		
		//Reading env file path
		String strEnvXMLPath=getVariables().get("g_strEnvXMLPath");
		
		if(scm_fn_isNullString(strEnvXMLPath)){
			fail("Empty Environment File Path inside scm_fn_updatePlaybackSettings() function ");
		}else{
			info("Environment File Path inside scm_fn_updatePlaybackSettings() function--"+strEnvXMLPath);
		}
		
		//String strObjTimeOut=scm_fn_xmlReader(strEnvXMLPath,"SCM_OBJ_TIME_OUT");
		int intObjTimeOut=Integer.parseInt(scm_fn_xmlReader(strEnvXMLPath,"OBJ_TIME_OUT"));
		info("Object Time Out Value inside scm_fn_updatePlaybackSettings()--"+intObjTimeOut);
		
		web = inputWeb;
		
		//inputVUS.set("web.clear_cache", true);
		//inputVUS.set("web.capture_frame", true);
		//inputVUS.set("web.capture_html", true);
		//inputVUS.set("web.capture_screenshot", true);
		//inputVUS.set("web.capture_browser_only", false);
		//inputVUS.set("web.capture_entire_screen", true);
		//inputVUS.set("web.capture_url", true);
		//inputVUS.set("web.clear_cache_before", true);
		//inputVUS.set("web.clear_persistent_cookies", true);
		//inputVUS.set("web.clear_persistent_cookies_before", true);
		//inputVUS.set("web.clear_session_cookies", true);
		//inputVUS.set("web.clear_session_cookies_before", true);
		//inputVUS.set("web.event_time_out", intObjTimeOut);
		//inputVUS.set("capture_screenshot_interval", 300);
		//inputVUS.set("capture_entire_screen_on_fail", true);		
		
		//Close all existing browsers and launch a new browser
		//scm_fn_launchBrowser();
	}
	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_loadEnvFile
	 * 
	 * @purpose:Load environment file selected while running the script from OTM or prompt user to enter Env file location through Console
	 *
	 * @param : 	
	 *		
	 * @return:			
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	25-Sep-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	
	 public String scm_fn_loadEnvFile() throws Exception	{
		String strEnvXMLPath=null;
		try{
			info("inside scm_fn_loadEnvFile() function");
			String envfile = getSettings().get("env_file");
			if (envfile==null)
			{
				System.out.print("Enter the Environment File Location: ");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				strEnvXMLPath = input.readLine();
				info("Environment File Location entered through Console : "+strEnvXMLPath);
			}
			else
			{
				strEnvXMLPath = envfile;
				info("Environment File Location passed through OTM while loading the file : "+strEnvXMLPath);
			}
			
						
		}catch(Exception e)
		{
			warn("Exception occurred in 'scm_fn_loadEnvFile' function:" + e.getMessage());
			e.printStackTrace();
		}
		info("Environment File Location inside scm_fn_loadEnvFile function before returning: "+strEnvXMLPath);
		return strEnvXMLPath;
	}

	 
	 public String scm_fn_loadEnvFile_HardCodedEnvCode(String strEnvXMLPath) throws Exception	{
			//String strEnvXMLPath=null;
			try{
				info("inside scm_fn_loadEnvFile() function");
				//String envfile = getSettings().get("env_file");
				if (strEnvXMLPath==null || scm_fn_isNullString(strEnvXMLPath))
				{
					System.out.print("Enter the Environment File Location: ");
					BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
					strEnvXMLPath = input.readLine();
					info("Environment File Location entered through Console : "+strEnvXMLPath);
				}
				else
				{
					//strEnvXMLPath = envfile;
					info("Environment File Location passed through OTM while loading the file : "+strEnvXMLPath);
				}
				
							
			}catch(Exception e)
			{
				warn("Exception occurred in 'scm_fn_loadEnvFile' function:" + e.getMessage());
				e.printStackTrace();
			}
			info("Environment File Location inside scm_fn_loadEnvFile function before returning: "+strEnvXMLPath);
			return strEnvXMLPath;
		}

	/**@FUNCTION_HEADER*****************************************************************************
	* 
	* @name:	scm_launchBrowser
	* 
	* @purpose:	Closes all existing browsers and launch a new browser in Private mode
	*		
	*	
	* 
	* @param : 	
	*
	* 
	* @return:	
	*		
	*			
	* 				
	* 
	* @modification_history
	* ----------------------------------------------------------------------------------------------
	* 	@date					@name					@modification
	*	1-JUN-2015				Saurabh Thawali			Created the new function
	* ----------------------------------------------------------------------------------------------
	* 					
	* **********************************************************************************************
	*/
	public void scm_fn_launchBrowser() throws Exception{
	
	try{
		//Close all existing browsers
		
		browser.addListener(new IBrowserEventListener() {
	        
		public void onBeforeLaunch(BrowserService browserService) throws BrowserException
	        	{
	        		//browser.getSettings().addExtraParams("-private");
	        	}

	    public void onAfterLaunch(BrowserService browserService) throws BrowserException {}
	        
		public void onClose(BrowserService browserService) throws BrowserException  {} });
		
		browser.closeAllBrowsers();
		//info("Launching browser in private mode");
		browser.launch();
		this.delay(10000);// NOPMD by vishmoha on 1/13/14 5:00 AM
		
		IBrowser objBrowser = browser.getBrowser();
		if (objBrowser!=null){
			info("Browser is launched successfully");
			scm_fn_capturePage();
			web.window("/web:window[@index='0']").maximize();
//			oracle_fusionlib.oracle_cookie_injection();  ///Calling Cookie injection function
		}
		else{
			warn("Browser is not launched");
			
		}
		
		}
	catch(Exception e){
	info( "Caught Exception in scm_launchBrowser() "+ e);
	e.printStackTrace();
	} 
	}
	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_xmlReader
	 * 
	 * @purpose:	To read environment file and return the value of the enviroment variable being passed
	 *		
	 *	
	 * 
	 * @param : 	
	 *		1. strEnvXMLPath		:	Full path of the Environment XML file
	 *		2. strEnvvar			:	Environment variable
	 *
	 *		
	 *		SAMPLE_INPUT			:	F:\SETUP\ENV_FILE\FS_ENV_INFO.XML, SCM_APP_URL
	 *
	 *
	 * 
	 * @return:	
	 *		(String)	: Value of Environment variable begin passed to the function
	 *			
	 * 				
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------	------------------
	 * 	@date					@name					@modification
	 *	1-JUN-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	*/

	public String scm_fn_xmlReader(String strEnvXMLPath,String strEnvVar) throws Exception {
	//
	

        	String strNodeValue = null;
        	String strNodeName = "";

        	NodeList variable; 
        	Element var;
        	Element temp;
        try{
            // Creation of doc object for Parsing XML
            DocumentBuilderFactory DocBuildFac = DocumentBuilderFactory.newInstance();
            DocumentBuilder DocBuilder = DocBuildFac.newDocumentBuilder();
            Document Doc = DocBuilder.parse(new File(strEnvXMLPath));

            //Creating Root Element Object to Parse doc
            //Element elRoot = Doc.getDocumentElement();

            NodeList SearchNode = Doc.getElementsByTagName("Variable");

            for (int i = 0; i < SearchNode.getLength(); i++)
	    {

		var = (Element)SearchNode.item(i);
		variable = var.getElementsByTagName("Name");

                if (variable != null && variable.getLength() > 0)
		{
                    temp = (Element)variable.item(0);
                    strNodeName = temp.getFirstChild().getNodeValue();

                    if (strNodeName.equals(strEnvVar)) 
			{
                        	variable = var.getElementsByTagName("Value");
	                        temp = (Element)variable.item(0);
        	                strNodeValue = temp.getFirstChild().getNodeValue();
        	                
        	                if(strNodeValue.equals("DEFAULT") && strEnvVar.equals("SCM_PRODUCT_FUNCTION_LIBRARY") ){
        	                	info("The value of the SCM_PRODUCT_FUNCTION_LIBRARY passed from the env file is null, so defaulting it to REL9_RTF_UGH compatible product library");
        	                	strNodeValue="SCRIPTS/00/75/64/16/SetupProductLibrary"; 
        	                }
        	                
        	                if(strNodeValue.equals("DEFAULT") && strEnvVar.equals("SCM_DATA_FILE_LOCATION") ){
        	                	info("The value of the SCM_DATA_FILE_LOCATION passed from the env file is null, so defaulting it to REL9_RTF_UGH compatible data  folder");
        	                	strNodeValue="F:\\SETUP\\PRODUCTION_SCRIPTS\\REL9_RTF_UGH\\SCRIPT_ASSETS\\DATA\\";
        	                }
			}
                }
            }

        } catch (ParserConfigurationException pce) {
        	warn("Exception occurred while parsing environment file:" + pce.getMessage());
            pce.printStackTrace();
        } catch (NullPointerException npe) {
        	warn("Exception occurred while parsing environment file:" + npe.getMessage());
            npe.printStackTrace();
        }
        return strNodeValue;
    	}
		

	/** @FUNCTION_HEADER ************************************/
		public boolean scm_fn_isNullString(String strSourceString)  throws AbstractScriptException
		{
			if (strSourceString==null || (strSourceString.trim()).isEmpty())
			{
			//info("null");
			
			return true;
			}
			return false;
		}
		
		
		/**@FUNCTION_HEADER*****************************************************************************
		 * 
		 * @name:	scm_fn_getDataFilePath
		 * 
		 * @purpose:	Returns the data sheet path of the current Script
		 *		
		 *	
		 * 
		 * @param : 	
		 *			strScriptName	: Pass the name of the Script for which you want to find the corresponding data file. 
		 *							  Note: Ensure that data file name is same as the Script Name
		 * 
		 * @return:	
		 *			(String) 
		 *			
		 * 				
		 * 
		 * @modification_history
		 * ----------------------------------------------------------------------------------------------
		 * 	@date					@name					@modification
		 *	7-OCT-2015				Saurabh Thawali			Created the new function
		 * ----------------------------------------------------------------------------------------------
		 * 					
		 * **********************************************************************************************
		 **/
		
		public String scm_fn_getDataFilePath(String strScriptName) throws Exception{
		  
		
			try{
				info("inside scm_fn_getDataFilePath()");
				
				if (scm_fn_isNullString(strScriptName)){
					fail("scm_fn_getDataFilePath(): Script Name is not passed from the Driver file");
				}
				String strEnvXMLPath=getVariables().get("g_strEnvXMLPath");
				info("Environment file locationinside scm_fn_getDataSheetPath function --"+strEnvXMLPath);
				String strDataFolderPath=scm_fn_xmlReader(strEnvXMLPath,"SCM_DATA_FILE_LOCATION");
				info("Data Folder Path from environment file --"+strDataFolderPath);			
				String strDataFile=strDataFolderPath+strScriptName+".xlsx";
				info("Returning Data file--"+strDataFile+"-- to driver script");	
				
				return strDataFile;			
				
			}catch(Exception e){
				info( "Caught Exception in scm_fn_getDataSheetPath() "+ e);
				e.printStackTrace();
				throw e;
			}
		}		
		
		/**@FUNCTION_HEADER*****************************************************************************
		 * 
		 * @name:	scm_fn_login()
		 * 
		 * @purpose:	Reads environment informaiton from the environment file and based on the Environment Type value, calls the 
		 * 				appropriate login function
		 *		
		 *	
		 * 
		 * @param : 	
		 *		
		 *
		 * 
		 * @return:	
		 *		(boolean) : returns true if the login is successful
		 *					returns false if the Environment type passed from the environment file or the login was not successful
		 * 				
		 * 
		 * @modification_history
		 * ----------------------------------------------------------------------------------------------
		 * 	@date					@name					@modification
		 *	11-OCT-2015				Saurabh Thawali			Created the new function
		 * ----------------------------------------------------------------------------------------------
		 * 					
		 * **********************************************************************************************
		 */
	
		public boolean scm_fn_login() throws Exception
	
		{	
			String strEnvXMLPath,strAppURL,strUserName,strPassword;
			try{	
				
				
				info("SCM Driver Library: Inside scm_fn_login() function");
	
				//Fail and Exit Test if Environment file Path is not passed
				strEnvXMLPath=getVariables().get("g_strEnvXMLPath");
				if(scm_fn_isNullString(strEnvXMLPath)){
					fail("Empty Environment File Path");
				}
									
				//Read environment variables
				strAppURL = scm_fn_xmlReader(strEnvXMLPath,"URL");
				strUserName = scm_fn_xmlReader(strEnvXMLPath,"USER_ID");
				strPassword = scm_fn_xmlReader(strEnvXMLPath,"PASSWORD");
				int intObjTimeOutSec = Integer.parseInt(scm_fn_xmlReader(strEnvXMLPath,"OBJ_TIME_OUT"));
					

				//Login to the Application.	
				web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0}}").navigate(strAppURL);
				web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_2}}").waitForPage(intObjTimeOutSec,true);
				scm_fn_capturePage();
				
				if(web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userid_2}}").exists(intObjTimeOutSec, TimeUnit.SECONDS) && 
				   web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_password_2}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
					info("Entering USER_ID");
					web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userid_2}}").setText(strUserName);	
					web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userid_2}}").pressTab();
					info("Entering PASSWORD");
					//Here we are entering encrypted password [strPassword] 
					web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_password_2}}").setPassword(deobfuscate(strPassword));
					info("Entered login credentials");
					info("Entered login credentials and clicked on the Sign In button");
					scm_fn_capturePage();
					web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_password_2}}").pressEnter();
				}else{
					scm_fn_capturePage();
					warn("Application URL has not been launched, Please refer screenshot for more details");
					return false;
				}
				
//				if(!((web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_span_E_Business_Suite}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)) ||
//						(web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_h1_Oracle_Applications_Home_}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)) || 
//						(web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_h2_Navigator}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)))){
//					scm_fn_capturePage();
//					warn("Fail to successfully login to the application");
//					return false;
//					
//				}
				
				scm_fn_capturePage();
				info("Login is Successful");
				info("Oracle E-Business Suite: Application Home Page displayed on logging into the application");

				return true;
				
			}catch (Exception e){
				warn( "Caught Exception in scm_fn_login() "+ e);
				e.printStackTrace();	
				return false;
			}
		}
			

		
					
		
		
		
				
				

	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_signout
	 * 
	 * @purpose:	Sign out of the application
	 *		
	 *	
	 * 
	 * @param : 	
	 *
	 * 
	 * @return:	
	 *		
	 *			
	 * 				
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	10-OCT-2015				Saurabh Thawali			Created the new function
	 *----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	
	public void scm_fn_signout() throws AbstractScriptException
	{
	try{
		
		info("Inside scm_fn_signout() function ");
		info("Logging out from Oracle Apps");
		
			
			if(!web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_h1_Oracle_Applications_Home_}}").exists()){
				scm_fn_capturePage();
				info("Unable to find Oracle_Applications_Home page, Please check the screenshots for more details ");
			} 
			web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_h1_Oracle_Applications_Home_}}").click();
			
			{
				think(1.519);
			}
//			web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_h2_Navigator}}").click();
//			{
//				think(9.579);
//			}
//			
//			if(!web.link("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Logout}}").exists()){
//				scm_fn_capturePage();
//				info("Unable to find Logout link on Oracle_Applications_Home page, Please check the screenshots for more details ");
//			} 			
			web.link("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Logout}}").click();
			scm_fn_capturePage();
			info("Clicked on the Logout link ");
	

	}catch (Exception e){
		e.printStackTrace();	
		warn( "Caught Exception in scm_fn_signout() "+ e.getMessage());		
		}	 
	}	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	 scm_fn_getTimeStamp
	 * 
	 * @purpose: Returns date and timestamp with some random number appened at end
	 *		
	 *	
	 * 
	 * @param : 	
	 *
	 * 
	 * @return:	
	 *		(String)	: Returns date and timestamp. Ex: 1312015_74745
	 *			
	 * 				
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	1-JUN-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************/
	 
	 public String scm_fn_getTimeStamp()throws Exception{
	

        Calendar objCal = Calendar.getInstance();

        int intMonth = objCal.get(Calendar.MONTH)+1;

        String timestamp = ""+ intMonth + objCal.get(Calendar.DAY_OF_MONTH) + objCal.get(Calendar.YEAR) +"_"+objCal.get(Calendar.HOUR_OF_DAY)+objCal.get(Calendar.MINUTE)+objCal.get(Calendar.SECOND)+objCal.get(Calendar.MILLISECOND)+"_"+(int)(Math.random()*100);


        return timestamp;       

    }
	
	 /**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_capturePage
	 * 
	 * @purpose:	Creates snapshot of the current web window and appends it to results doc. 
	 *		
	 *	
	 * 
	 * @param :		 	
	 *
	 * 
	 * @return:	
	 *		
	 *			
	 * 				
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	6-OCT-2015				Saurabh Thawali
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	
	public void scm_fn_capturePage()  throws Exception{
		//if(!scm_fn_isNullString(pageHeader) && pageHeader.startsWith("Getting Started"))
			//pageHeader = "Getting Started"; 
		//String webWindowXpath = "/web:window[@index='0' or @title='"+ pageHeader + " - Setup and Maintenance - Oracle Applications']";
		
		String webWindowXpath="/web:window[@index='0']";
		web.window(webWindowXpath).capturePage();
	}
		


	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_capturePageOfIndex
	 * 
	 * @purpose:	Creates snapshot of the desired web window and appends it to results doc. 
	 *		
	 *	
	 * 
	 * @param :		 	int index:	pass the index of the window desired to get snapshoted. 
	 *
	 * 
	 * @return:	
	 *		
	 *			
	 * 				
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	22-AUG-2015				Saurabh Thawali
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	
	public void scm_fn_capturePageOfIndex(int index)  throws Exception{
	
		//if(!scm_fn_isNullString(pageHeader) && pageHeader.startsWith("Getting Started"))
			//pageHeader = "Getting Started"; 
		//String webWindowXpath = "/web:window[@index='0' or @title='"+ pageHeader + " - Setup and Maintenance - Oracle Applications']";
		try{
			String webWindowXpath="/web:window[@index='"+index+"']";
			web.window(webWindowXpath).capturePage();
		}catch(Exception e){
			warn("Exception occurred while taking snapshot :" + e.getMessage());
		}
	}
	
	public int scm_fn_getObjectTimeout() throws Exception {
	//
		//Extracting obj time out from env file.
		//info("In common library scm_fn_getObjectTimeout.");
		String g_strEnvXMLPath = getSettings().get("env_file");
		info("env file from Get Settings is :" + g_strEnvXMLPath);
		if (scm_fn_isNullString(g_strEnvXMLPath)){
			g_strEnvXMLPath = getVariables().get("g_strEnvXMLPath", Variables.Scope.GLOBAL);
		}

		int objWaitTimeInt = 180;
		String objWaitTime= scm_fn_xmlReader(g_strEnvXMLPath,"SCM_OBJ_TIME_OUT");
		if(!scm_fn_isNullString(objWaitTime)){
			objWaitTime = objWaitTime.trim();
			try{
				objWaitTimeInt = (Integer.parseInt(objWaitTime));
			}catch(Exception e){
				//In case SCM_OBJ_TIME_OUT entered in environment file is not a proper number, defaulting to 180. 
				warn("SCM_OBJ_TIME_OUT was incorrectly entered in the environment file, so defaulting it to 180 secs.");
				objWaitTimeInt = 180;
			}
		}else{
			//In case taskFlowWaitTime entered in environment file is null, defaulting to 180.
			warn("SCM_OBJ_TIME_OUT was not entered in the environment file, so defaulting it to 180 secs.");
		}
		return objWaitTimeInt; 
	}
	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	 scm_bypassJavaWarning()
	 * 
	 * @purpose: Bypasses JAVA Warnings/Popups 
	 * @param : 	
	 * @return:	
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	18-Nov-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public void scm_bypassJavaWarning() throws Exception

	{
		info("Inside scm_bypassJavaWarning ()");
		try {
            
            Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);;
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);;
            robot.delay(500);
            info("Bypassing 1st JAVA warning/Popup");
            scm_fn_capturePage();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);;

            //Handling 2nd JAVA warning 
//            robot.delay(5000);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);;
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_SPACE);
//            robot.keyRelease(KeyEvent.VK_SPACE);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);;
//            robot.delay(500);
//            info("Bypassing 2nd JAVA warning/Popup");
//            scm_fn_capturePage();
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);;
   
        } catch (AWTException e) {
            e.printStackTrace();
        }
		
	}
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	 scm_bypassJavaWarning()
	 * 
	 * @purpose: Bypasses JAVA Warnings/Popups 
	 * @param : 	
	 * @return:	
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	18-Nov-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public void scm_bypassJavaWarningAPPMigr1() throws Exception

	{
		info("Inside scm_bypassJavaWarningAPPMigr1 ()");
		try {
            
			Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(500);
           // robot.keyPress(KeyEvent.VK_TAB);
           // robot.keyRelease(KeyEvent.VK_TAB);;
           // robot.delay(500);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);;
            robot.delay(500);
            info("Bypassing 1st JAVA warning/Popup");
            scm_fn_capturePage();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            //Handling 2nd JAVA warning 
//            robot.delay(5000);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);;
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_SPACE);
//            robot.keyRelease(KeyEvent.VK_SPACE);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);;
//            robot.delay(500);
//            info("Bypassing 2nd JAVA warning/Popup");
//            scm_fn_capturePage();
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);;
   
        } catch (AWTException e) {
            e.printStackTrace();
        }
		
	}
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_getEnvAliasValue()
	 * 
	 * @purpose:	--- To be updated ---
	 *		
	 *	
	 * 
	 * @param : 	--- To be updated ---
	 *		
	 *
	 * 
	 * @return:		--- To be updated --
	 * 				
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	30-JAN-20156			Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public String scm_getEnvAliasValue(String envCode) throws Exception

	{	
		String returnValue = null;
	
		try{
			switch (keyword.valueOf(envCode.toUpperCase())) {       
			   
				case TS4CSF:
					 {
						 info("Given Environment is TS4CSF, Returning alias value = aliasE");
						 returnValue = "aliasE";
						break; 
				     }
	         
				case TS2CSF:
					{
						info("Given Environment is TS2CSF, Returning alias value = aliasG");
						 returnValue = "aliasG";
						break; 
				     }
				case DV3CSF:
					{
						 info("Given Environment is DV3CSF, Returning alias value = aliasC");
						 returnValue = "aliasC"; 
						break;  
				     }
				case TS4CSF_XXCTS_DM:
				{
					 info("Given Environment is TS4CSF_XXCTS_DM, Returning alias value = aliasF");
					 returnValue = "aliasF"; 
					break;  
			     }
				case TS4CSF_SRVC_OTH:
				{
					 info("Given Environment is TS4CSF_SRVC_OTH, Returning alias value = aliasH");
					 returnValue = "aliasH"; 
					break;  
			     }
				case TS2CG1_SRVC_OTH:
				{
					 info("Given Environment is TS2CG1_SRVC_OTH, Returning alias value = aliasL");
					 returnValue = "aliasL"; 
					break;  
			     }
				case TS2CTS_SRVC_OTH:
                {
                      info("Given Environment is TS2CTS_SRVC_OTH, Returning alias value = aliasL");
                      returnValue = "aliasL"; 
                      break;  
               }    
				case TS2CSF_SRVC_OTH:
                {
                      info("Given Environment is TS2CSF_SRVC_OTH, Returning alias value = aliasM");
                      returnValue = "aliasM"; 
                      break;  
               } 
				case TS3CSF_SRVC_OTH:
                {
                      info("Given Environment is TS3CSF_SRVC_OTH, Returning alias value = aliasN");
                      returnValue = "aliasN"; 
                      break;  
               } 
				case TS3CSF_SRVC_OTH1:
                {
                      info("Given Environment is TS3CSF_SRVC_OTH, Returning alias value = aliasP");
                      returnValue = "aliasP"; 
                      break;  
               }                
				case LT1CSF_SRVC_OTH:
                {
                      info("Given Environment is LT1CSF_SRVC_OTH, Returning alias value = aliasQ");
                      returnValue = "aliasQ"; 
                      break;  
               }
				 case CSFSTG7:
				 {
              	   info("Given Environment is CSFSTG7, Returning alias value = aliasO");
                     returnValue = "aliasO"; 
                     break;  
                 }
				 case CFNPRD:
				 {
	              	   info("Given Environment is CFNPRD, Returning alias value = aliasR");
	                     returnValue = "aliasR"; 
	                     break;  
	             }
				 case TS1CSF_SRVC_OTH1:
				 {
	              	   info("Given Environment is TS1CSF, Returning alias value = aliasS");
	                     returnValue = "aliasS"; 
	                     break;  
	             }
				 case TS1CSF_SRVC_OTH2:
				 {
	              	   info("Given Environment is TS1CSF, Returning alias value = aliasU");
	                     returnValue = "aliasU"; 
	                     break;  
	             }
				 
				 case TS1CSF_SRVC_OTH:
				 {
	              	   info("Given Environment is TS1CSF, Returning alias value = aliasT");
	                     returnValue = "aliasT"; 
	                     break;  
	             }		
				 case TS3CSF_SRVC_OTH5:
	                {
	                      info("Given Environment is TS3CSF_SRVC_OTH, Returning alias value = aliasV");
	                      returnValue = "aliasV"; 
	                      break;  
	               } 
	                
				 case CSFSTG_SRVC_OTH:
	                {
	                      info("Given Environment is CSFSTG_SRVC_OTH, Returning alias value = aliasW");
	                      returnValue = "aliasW"; 
	                      break;  
	                      
	               } 
				 
			}
			return returnValue;
		}catch (Exception e){
			warn( "Caught Exception in scm_getEnvAliasValue() "+ e);
			e.printStackTrace();	
			return returnValue;
		}
	}
	
	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	 scm_bypassSingleJavaWarning()	
	 * @purpose: Bypasses single JAVA Warnings/Popups 
	 * @param : null	
	 * @return:	void
	 * @modification_history : 1-Feb-2016
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	28-Jan-2016				Saurabh Thawali		Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	public void scm_bypassSingleJavaWarning() throws Exception
	{
		info("Inside scm_bypassJavaWarning() ");
		try {
			            
            Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);            
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);            
            robot.delay(500);
            info("Bypassing 1st JAVA warning/Popup");
            scm_fn_capturePage();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);          
   
        } catch (AWTException e) {
            e.printStackTrace();
        }
		
	}
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_MMAT_login()
	 * 
	 * @purpose:	Login To PS
	 * 
	 * @param : URL,UN,PASS,TimeOutSeconds
	 * @return:	
	 *		(boolean) : returns true if the login is successful
	 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	11-FEB-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public boolean scm_fn_MMAT_login(String strAppURL,String strUserName,String strPassword,int intObjTimeOutSec) throws Exception	
	{				
		try{					
			info("SCM Driver Library: Inside scm_fn_MMAT_login() function");			
			//Login to the Application.	
			if(web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0}}").navigate(strAppURL);
			}else{
				reportFailure("Browser Not opened, Please see the screen shot for more information.");
				return false;
			}
			//info("Print 1");
			//Handling Security warning message Before login				
//			if(web.confirmDialog("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//				info("Print 1.1");
////					web.confirmDialog(64,
////					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
////					.clickCancel();
//				try{
//					Robot rb = new Robot();
//					delay(200);
//					rb.keyPress(KeyEvent.VK_TAB);
//					rb.keyRelease(KeyEvent.VK_TAB);
//					delay(100);
//					rb.keyPress(KeyEvent.VK_ENTER);
//					rb.keyRelease(KeyEvent.VK_ENTER);
//					delay(200);
//				}catch(Exception e){
//					warn("Robot Security Window Catch : "+e.getMessage());						
//				}
//			}
//			else{
//				reportFailure("Login failed due to Object Time out..!!!");
//				return false;
//			}
			//info("Print 2");
			think(5); 
			//System.out.println("Print 2");
			web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_2}}").waitForPage(intObjTimeOutSec,true);
			scm_fn_capturePage();
			
			if(web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userInput}}").exists(intObjTimeOutSec, TimeUnit.SECONDS) && 
			   web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_passwordInput}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				info("Entering USER_ID");
				web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userInput}}").setText(strUserName);	
				web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userInput}}").pressTab();
				info("Entering PASSWORD");
				//Here we are entering encrypted password [strPassword] 
				if(web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_passwordInput}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
					web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_passwordInput}}").setPassword(deobfuscate(strPassword));
				}
				//info("Entered login credentials");
				info("Entered login credentials and clicked on the Sign In button");
				scm_fn_capturePage();
				web.button(311,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_submit_login_button}}").click();
			}else{
				scm_fn_capturePage();
				warn("Application URL has not been launched, Please refer screenshot for more details");
				return false;
			}
			
			info("Print 2.1");
			//Handling Security warning message after login
			think(3);
			if(web.confirmDialog(
					64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(15, TimeUnit.SECONDS)){
//					web.confirmDialog(64,
//					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
//					.clickCancel();
				try{
					Robot rb = new Robot();
					//delay(100);
					rb.keyPress(KeyEvent.VK_TAB);
					rb.keyRelease(KeyEvent.VK_TAB);
					delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
					delay(200);
				}catch(Exception e){
					warn("Robot Security Window Catch : "+e.getMessage());						
				}
			}
			info("Print 3");
			if(!(web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_9}}").exists(intObjTimeOutSec, TimeUnit.SECONDS))){
				scm_fn_capturePage();
				warn("Fail to successfully login to the application");
				return false;					
			}			
			scm_fn_capturePage();
			
			
		}catch (Exception e){
			warn( "Caught Exception in scm_fn_MMAT_login() :  "+ e.getMessage());
			//e.printStackTrace();	
			return false;
		}
		return true;
	}
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_PS_login()
	 * 
	 * @purpose:	Login To PS
	 * 
	 * @param : URL,UN,PASS,TimeOutSeconds
	 * @return:	
	 *		(boolean) : returns true if the login is successful
	 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	11-FEB-2015				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public boolean scm_fn_PS_login(String strAppURL,String strUserName,String strPassword,int intObjTimeOutSec) throws Exception	
	{				
		try{					
			info("SCM Driver Library: Inside scm_fn_PS_login() function");			
			//Login to the Application.	
			if(web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0}}").navigate(strAppURL);
			}else{
				reportFailure("Browser Not opened, Please see the screen shot for more information.");
				return false;
			}
			info("Print 1");
			//Handling Security warning message Before login				
			if(web.confirmDialog(
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(5, TimeUnit.SECONDS)){
				info("Print 1.1");
				
				info("Closing security window start");
				try{
					Robot rb = new Robot();
					delay(200);
					rb.keyPress(KeyEvent.VK_TAB);
					rb.keyRelease(KeyEvent.VK_TAB);
					delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
					delay(200);
					info("Closing security window End");
				}catch(Exception e){
					warn("Robot Security Window Catch : "+e.getMessage());						
				}
			}
//			else{
//				reportFailure("Login failed due to Object Time out..!!!");
//				return false;
//			}
			info("Print 2");
			//think(10);
			System.out.println("Print 2");
			web.window("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_2}}").waitForPage(intObjTimeOutSec,true);
			scm_fn_capturePage();
			
			if(web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userInput}}").exists(intObjTimeOutSec, TimeUnit.SECONDS) && 
			   web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_passwordInput}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				info("Entering USER_ID");
				web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userInput}}").setText(strUserName);	
				web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_userInput}}").pressTab();
				info("Entering PASSWORD");
				//Here we are entering encrypted password [strPassword] 
				web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_password_passwordInput}}").setPassword(deobfuscate(strPassword));
				info("Entered login credentials");
				info("Entered login credentials and clicked on the Sign In button");
				scm_fn_capturePage();
				web.button(311,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_submit_login_button}}").click();
			}else{
				scm_fn_capturePage();
				warn("Application URL has not been launched, Please refer screenshot for more details");
				return false;
			}
			
			info("Print 2.1");
			//Handling Security warning message after login
			if(web.confirmDialog(
					64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists()){//.exists(5, TimeUnit.SECONDS)){
//					web.confirmDialog(64,
//					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
//					.clickCancel();
				try{
					info("Closing security window start");
					Robot rb = new Robot();
					//delay(100);
					rb.keyPress(KeyEvent.VK_TAB);
					rb.keyRelease(KeyEvent.VK_TAB);
					delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
					delay(200);
					info("Closing security window End");
				}catch(Exception e){
					warn("Robot Security Window Catch : "+e.getMessage());						
				}
			}
			info("Print 3");
			if(!(web.element("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_9}}").exists(60, TimeUnit.SECONDS))){
				scm_fn_capturePage();
				warn("Fail to successfully login to the application");
				return false;					
			}			
			scm_fn_capturePage();				
			
		}catch (Exception e){
			warn( "Caught Exception in scm_fn_PS_login() :  "+ e.getMessage());
			//e.printStackTrace();	
			return false;
		}
		return true;
	}
	
	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:	scm_fn_MMAT_login()
	 * 
	 * @purpose:	To Logout From MMAT/PS application
	 * 
	 * @param : 
	 * @return:	(boolean) : returns true if the LOGOUT is successful
	 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	06-APR-2017				Saurabh Thawali			Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public boolean scm_fn_MMAT_PS_logout() throws Exception	
	{				
		try{
				if(! web.link("/web:window[@index='0']/web:document[@index='0']/web:a[@text='Logout' or @href='javascript:logOut();' or @index='8']").exists(30, TimeUnit.SECONDS)){
						info("Unable to locate Logout link on the application");
						info("Returning from scm_fn_MMAT_PS_logout() ");
						return false;
					}
			
				info("Clicking on Logout link on the application ");
				web.link("/web:window[@index='0']/web:document[@index='0']/web:a[@text='Logout' or @href='javascript:logOut();' or @index='8']").click();
				think(5);
				
			if (web.confirmDialog("/web:dialog_confirm[@text='You have unsaved changes. Do you wish to lose them?' and @index='0']").exists()){
				web.confirmDialog("/web:dialog_confirm[@text='You have unsaved changes. Do you wish to lose them?' and @index='0']").clickOk();
			}
			
			
		}catch (Exception e){
			warn( "Caught Exception in scm_fn_MMAT_PS_logout() :  "+ e.getMessage());
			//e.printStackTrace();	
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    /**@FUNCTION_HEADER*****************************************************************************
 	 * 
 	 * @name:		uf_Vik_parseChars 
 	 * 
 	 * @purpose:	used to parse the string (path of the file) Passed to this method
 	 *
 	 * @param : 	letter- path of the file
 	 *		
 	 * @return:		void
     * @throws AbstractScriptException 
 	 * 
 	 * @modification_history
 	 * ----------------------------------------------------------------------------------------------
 	 * 	@date					@name					@modification
 	 *	5-JAN-2016				Saurabh Thawali		Created the new function
 	 * ----------------------------------------------------------------------------------------------
 	 * 					
 	 * **********************************************************************************************
 	 */
 	public void uf_Vik_parseChars(String letter, Robot robot) throws AbstractScriptException {
 		for (int i = 0; i < letter.length(); i++) {
 			//info("inside uf_Vik_parseChars method ");
 			char chary = letter.charAt(i);
 			//info("Current character = "+letter.charAt(i));
 			uf_Vik_typeCharacter(Character.toString(chary), robot);
 		}
 	}
 	
 	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:		uf_Vik_typeCharacter 
	 * 
	 * @purpose:	Used to typecast the characters to string
	 *
	 * @param : 	Letter,Robot
	 *		
	 * @return:		void
 	 * @throws AbstractScriptException 
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	5-JAN-2016				Saurabh Thawali		Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	public void uf_Vik_typeCharacter(String letter, Robot robot) throws AbstractScriptException {
	//	info("Pressed event ");
		if (Character.isLetterOrDigit(letter.charAt(0))) {
			try {
				boolean upperCase = Character.isUpperCase(letter.charAt(0));
				String variableName = "VK_" + letter.toUpperCase();
				KeyEvent ke = new KeyEvent(new JTextField(), 0, 0, 0, 0, ' ');
				@SuppressWarnings("rawtypes")
				Class clazz = ke.getClass();
				Field field = clazz.getField(variableName);
				int keyCode = field.getInt(ke);
				robot.delay(80);
				if (upperCase)
					robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				if (upperCase)
					robot.keyRelease(KeyEvent.VK_SHIFT);
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			if (letter.equals("!")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_1);
				robot.keyRelease(KeyEvent.VK_1);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("@")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_SHIFT); 
			} else if (letter.equals("#")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("#")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("$")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_4);
				robot.keyRelease(KeyEvent.VK_4);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("%")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_5);
				robot.keyRelease(KeyEvent.VK_5);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("^")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_6);
				robot.keyRelease(KeyEvent.VK_6);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("&")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_7);
				robot.keyRelease(KeyEvent.VK_7);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("*")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_8);
				robot.keyRelease(KeyEvent.VK_8);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("=")) {
				robot.keyPress(KeyEvent.VK_EQUALS);
				robot.keyRelease(KeyEvent.VK_EQUALS);
			} else if (letter.equals(" ")) {
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
			} else if (letter.equals("/")) {
				robot.keyPress(KeyEvent.VK_BACK_SLASH);
				robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			} else if (letter.equals("\\")) {
				robot.keyPress(KeyEvent.VK_BACK_SLASH);
				robot.keyRelease(KeyEvent.VK_BACK_SLASH);
			} else if (letter.equals("_")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals(":")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_SEMICOLON);
				robot.keyRelease(KeyEvent.VK_SEMICOLON);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals(";")) {
				robot.keyPress(KeyEvent.VK_SEMICOLON);
				robot.keyRelease(KeyEvent.VK_SEMICOLON);
			} else if (letter.equals(",")) {
				robot.keyPress(KeyEvent.VK_COMMA);
				robot.keyRelease(KeyEvent.VK_COMMA);
			} else if (letter.equals("-")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals("?")) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else if (letter.equals(" ")) {
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
			} else if (letter.equals(".")) {
				robot.keyPress(KeyEvent.VK_PERIOD);
				robot.keyRelease(KeyEvent.VK_PERIOD);
			}

		}
	}
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:		setPreferances 
	 * 
	 * @purpose:	To set required Preferances as per User
	 *
	 * @param : 	TemplateType,Preferances,URL,user_id,password,ObjTimeOutSec
	 *		
	 * @return:		Boolean status
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	8-MAR-2016				Saurabh Thawali		Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	public boolean setPreferances(String strTemplateType,String strPreferances, String URL, String user_id, String password,int intObjTimeOutSec){
		try{
			info("++++++++++++++++++++++ Inside setPreferances Method ++++++++++++++++++++++++++++++++++");
			scm_fn_capturePage();
			// Add code here to handle the Security window
			
			if(web.confirmDialog(
				64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(10, TimeUnit.SECONDS)){
//						web.confirmDialog(64,
//						"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
//						.clickCancel();
				info("Security window close start");
						try{
							Robot rb = new Robot();
							delay(200);
							rb.keyPress(KeyEvent.VK_TAB);
							rb.keyRelease(KeyEvent.VK_TAB);
							delay(100);
							rb.keyPress(KeyEvent.VK_ENTER);
							rb.keyRelease(KeyEvent.VK_ENTER);
							delay(200);
						}catch(Exception e){
							warn("Robot Security Window Catch : "+e.getMessage());						
						}
						info("Security window close End");
			}
		
			scm_fn_capturePage();
			if(web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Preferences}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				info("All Home page component is loaded.");
			}else{				
				reportFailure("All Home page components are not loaded.Please see the log file for more details");
				return false;
			}
			String getElementsByname =  null;
			getElementsByname = web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_selectTemplate}}").getDisplayText();			
			info("Template Dropdown Content List :"+ getElementsByname);
			
			// Verifing MMAT preferences set not
			info("Verifing required Preferances present in template dropdown or not.");
			if(getElementsByname.contains(strTemplateType)){   // Pass this variable strTemplateType
				System.out.println(strTemplateType+" template is available, no need to set preferances");
				return true;
			}else{		
				beginStep("[4] Test Service Contract Center (/mcmindex.do)", 0);
				{
					web.window(312, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_9}}")
							.waitForPage(null);
					
					info("Before Closing Warning msg");
					//Closing Privacy warning MsgBox
					if(web.link("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Preferences}}").exists(intObjTimeOutSec,TimeUnit.SECONDS)){					
						web.link(314,
								"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Preferences}}")
								.click();
						
					}else{
						reportFailure("Preferance page not load.Page Time out issue");
						return false;
					}
					info("Checking Proceed Button available on page.");
					scm_fn_capturePage();
					// Validating Proceede Link active or not
					if(web.link(315, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_proceed}}").exists(intObjTimeOutSec,TimeUnit.SECONDS)){					
						web.link(315, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_proceed}}")
						.click();						
					}
//					else{
//						reportFailure("Proceed Link not loaded.Page Time out issue");
//						return false;
//					}
					scm_fn_capturePage();
				}
				endStep();
				beginStep("[5] User Preferences (/usersPreferences.do)", 0);
				{
//					web.window(316, "{{obj.Ebs_R12_CsmItsDeveloper_Obj.web_window_2_1}}")
//							.waitForPage(null);
					//info();
					if(web.window(317, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_1}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
						info("web_window_1_1 window display");
						web.window(317, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_1}}")
							.close();					
					}
					scm_fn_capturePage();
					//Validating whether Dropdown loaded with values
					info("Setting Preferances.");
					if(web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_amPrimaryRole}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
						web.selectBox(318,
						"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_amPrimaryRole}}")
						.selectOptionByText(strPreferances);   // Set the Required Values
							{
								think(1.042);
							}
					}else{
						reportFailure("Preferances dropdown not loaded. Page time out issue.");
						return false;
					}
					scm_fn_capturePage();
						web.button(319,
							"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_savePreferences}}")
							.click();
				}
				endStep();
				think(5);
				beginStep("[6] User Preferences (/userPreferences.do)", 0);
				{
					web.window(320, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_2}}")
							.waitForPage(null);
					// To handle the Confirm msg box for saving preferances
					think(10);  // put this hard coded think time
					info("Handling Preferance Save MsgBox");
					Robot rb = new Robot();
					rb.delay(500);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);	
					rb.delay(100);
					info("Preferance Save MsgBox Closed");
					
					// Need to un comment if working fine
					// Commented this code due to cuases error
//					if(web.window(321, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_2}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//						web.window(321, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_2}}")
//							.close();
//					}else{
//						reportFailure("Home page not loade after set praferance, Please sse the screen shot for more information.");
//						return false;
//					}
				}
				endStep();
				}
			// Closing browser and again login
			info("Closing all browser and again login for refelecting changes of saved preferances.");
			IBrowser objBrowser = browser.getBrowser();	
			
	        if (objBrowser!=null) {
	        	scm_fn_capturePage();
		        browser.closeAllBrowsers();
	        }
	        info("Lauching new Browser");
	        browser.launch();
	        think(3);
			web.window("/web:window[@index='0']").maximize();
			info("Calling Login methode");
	        if(scm_fn_PS_login(URL, user_id, password, intObjTimeOutSec))			
	        return true;
	        else{
	        	reportFailure("Re-Login atttempt is failed, Please see the screen shot for more details");
	        	return false;
	        }
	        
		}catch(Exception e){
			System.out.println("setPreferances Method Exception => "+ e.getMessage());
			return false;
		}
		//return true;
	}
	
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:		setPSPreferances 
	 * 
	 * @purpose:	To set required Preferances as per User
	 *
	 * @param : 	TemplateType,Preferances,URL,user_id,password,ObjTimeOutSec
	 *		
	 * @return:		Boolean status
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	17-MAR-2016				Saurabh Thawali		Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	public boolean setPSPreferances(String strTemplateType,String strPreferances, String URL, String user_id, String password,int intObjTimeOutSec){
		try{
			info("++++++++++++++++++++++ Inside setPSPreferances Method ++++++++++++++++++++++++++++++++++");
			scm_fn_capturePage();
			// Add code here to handle the Security window
			
			if(web.confirmDialog(
				64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists()){
					try{
						info("Security window close start");
						Robot rb = new Robot();
						delay(200);
						rb.keyPress(KeyEvent.VK_TAB);
						rb.keyRelease(KeyEvent.VK_TAB);
						delay(100);
						rb.keyPress(KeyEvent.VK_ENTER);
						rb.keyRelease(KeyEvent.VK_ENTER);
						delay(200);
					}catch(Exception e){
						warn("Robot Security Window Catch : "+e.getMessage());						
					}
					info("Security window close End");
			}
		
			scm_fn_capturePage();
			if(web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Preferences}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				info("All Home page components are loaded.");
			}else{				
				reportFailure("All Home page components are not loaded.Please see the log file for more details");
				return false;
			}
			info("Reading Upload Template Dropdown values");
			String getElementsByname =  null;
			getElementsByname = web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_selectTemplate}}").getDisplayText();			
			info("Template Dropdown Content List :"+ getElementsByname);
			
			// Verifing MMAT preferences set not
			info("Verifing required Preferances present in template dropdown or not.");
			if(getElementsByname.contains(strTemplateType)){   // Pass this variable strTemplateType
				System.out.println(strTemplateType+" template is available, no need to set preferances");
				return true;
			}else{		
				beginStep("[4] Test Service Contract Center (/mcmindex.do)", 0);
				{
					web.window(312, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_9}}")
							.waitForPage(null);
					
					info("Before Closing Warning msg");
					//Closing Privacy warning MsgBox
					if(web.link("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Preferences}}").exists(intObjTimeOutSec,TimeUnit.SECONDS)){					
						web.link(314,
								"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_Preferences}}")
								.click();
						
					}else{
						reportFailure("Preferance page not load.Page Time out issue");
						return false;
					}
					info("Checking Proceed Button available on page.");
					scm_fn_capturePage();
					// Validating Proceede Link active or not
					if(web.link(315, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_proceed}}").exists(intObjTimeOutSec,TimeUnit.SECONDS)){					
						web.link(315, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_proceed}}")
						.click();						
					}
//					else{
//						reportFailure("Proceed Link not loaded.Page Time out issue");
//						return false;
//					}
					scm_fn_capturePage();
				}
				endStep();
				beginStep("[5] User Preferences (/userPreferences.do)", 0);
				{
					web.window(316, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_2_1}}")
							.waitForPage(null);
					if(web.window(317, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_1}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
						web.window(317, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_1}}")
							.close();					
					}
					scm_fn_capturePage();
					//Validating whether Dropdown loaded with values
					if(web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_amPrimaryRole}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
						web.selectBox(318,
						"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_amPrimaryRole}}")
						.selectOptionByText(strPreferances);   // Set the Required Values
							{
								think(1.042);
							}
					}else{
						reportFailure("Preferances dropdown not loaded. Page time out issue.");
						return false;
					}
					scm_fn_capturePage();
						web.button(319,
							"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_savePreferences}}")
							.click();
				}
				endStep();
				think(5);
				beginStep("[6] User Preferences (/userPreferences.do)", 0);
				{
					web.window(320, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_1_2}}")
							.waitForPage(null);
					// To handle the Confirm msg box for saving preferances
					think(10);  // put this hard coded think time
					info("Handling Preferance Save MsgBox");
					Robot rb = new Robot();
					rb.delay(500);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);	
					rb.delay(100);
					info("Preferance Save MsgBox Closed");
				}
				endStep();
				}
			// Closing browser and again login
			info("Closing all browser and again login for refelecting changes of saved preferances.");
			IBrowser objBrowser = browser.getBrowser();	
			
	        if (objBrowser!=null) {
	        	scm_fn_capturePage();
		        browser.closeAllBrowsers();
	        }
	        info("Re-Lauching Browser");
	        browser.launch();
	        think(3);
			web.window("/web:window[@index='0']").maximize();
			info("Calling Login methode");
	        if(scm_fn_PS_login(URL, user_id, password, intObjTimeOutSec))			
	        return true;
	        else{
	        	reportFailure("Re-Login atttempt is failed, Please see the screen shot for more details");
	        	return false;
	        }
	        
		}catch(Exception e){
			System.out.println("setPreferances Method Exception => "+ e.getMessage());
			return false;
		}
		//return true;
	}
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:		uploadMMATTemplate 
	 * 
	 * @purpose:	To uploading MMAT Template
	 *
	 * @param : 	RequestType,RequestName,Notes,EmailAddress,FilePath,ObjTimeOutSec
	 *		
	 * @return:		Boolean status
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	8-MAR-2016				Saurabh Thawali		Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */

	public boolean downloadTemplate(String strTemplateType,int intObjTimeOutSec){
		try{
			
			info("++++++++++++++++++++++ Inside downloadTemplate Method ++++++++++++++++++++++++++++++++++");
			scm_fn_capturePage();
			info("Inside Download template Method....!!!");
			if(web.selectBox(322,
			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_selectTemplate}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
			web.selectBox(322,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_selectTemplate}}")
					.selectOptionByText(strTemplateType);
			}else{
				reportFailure("Download Template Not active, Please see the screen shot for information.");
				return false;
			}
			web.button(323,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_DownloadTemplate}}")
					.click();
			{
				think(4.747);
			}
			scm_fn_capturePage();
			web.dialog(324,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_unknown_Internet_Explorer}}")
					.clickButton(1);
		}catch(Exception e){
			System.out.println("downloadTemplate Exception => "+ e.getMessage());
			return false;
		}
		return true;
	}
	
	/**@FUNCTION_HEADER*****************************************************************************
	 * 
	 * @name:		uploadMMATTemplate 
	 * 
	 * @purpose:	To uploading MMAT Template
	 *
	 * @param : 	RequestType,RequestName,Notes,EmailAddress,FilePath,ObjTimeOutSec
	 *		
	 * @return:		Boolean status
	 * 
	 * @modification_history
	 * ----------------------------------------------------------------------------------------------
	 * 	@date					@name					@modification
	 *	8-MAR-2016				Saurabh Thawali		Created the new function
	 * ----------------------------------------------------------------------------------------------
	 * 					
	 * **********************************************************************************************
	 */
	
public boolean uploadMMATTemplate(String strRequestType ,String strRequestName,String strNotes, String strEmailAddress,String strOverride_Validations_Flag,String strRequestor_Initiator,String strApprover_Name,String strCustomer_Partner_Name,String strReason_Code,String strFilePath,int intObjTimeOutSec){
		try{
			info("++++++++++++++++++++++ Inside uploadMMATTemplate Method ++++++++++++++++++++++++++++++++++");
			Robot rb = new Robot();
			// Add code here to handle the Security window
			
			if(web.confirmDialog(
				64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(5, TimeUnit.SECONDS)){
//						web.confirmDialog(64,
//						"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
//						.clickCancel();
				info("Handle Security Windo start");
						try{							
							delay(200);
							rb.keyPress(KeyEvent.VK_TAB);
							rb.keyRelease(KeyEvent.VK_TAB);
							delay(100);
							rb.keyPress(KeyEvent.VK_ENTER);
							rb.keyRelease(KeyEvent.VK_ENTER);
							delay(200);
						}catch(Exception e){
							warn("Robot Security Window Catch : "+e.getMessage());						
						}
						info("Handle Security Windo End");
			}
			
			//think(30.287);
			//Validating the page is loade with all fields
			info("Selecting Request_Type => "+ strRequestType);
			
			String getElementsByname =  null;
			getElementsByname = web.selectBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_requestType}}").getDisplayText();			
			info("Request Dropdown Content List :"+ getElementsByname);
			
			// Verifing MMAT preferences set not
			info("Verifing required Preferances present in template dropdown or not.");
			if(getElementsByname.contains(strRequestType)){   // Pass this variable strTemplateType
				System.out.println(strRequestType+"  is available in dropdown.");			
				scm_fn_capturePage();				
				
			if(web.selectBox(325,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_requestType}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				web.selectBox(325,
						"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_requestType}}")
						.selectOptionByText(strRequestType);				
			}else{	
				reportFailure(strRequestType+" is not available in Requet_Type dropdown hence, Please check the preferance set or not.");
				return false;
			}
				
			}else{
				reportFailure("RequestType field not found on Page. Page time out issue.");
				return false;
			}
			scm_fn_capturePage();
			web.textBox(326,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_mat_request_name}}")
					.click();
			
			if(web.alertDialog(327,
			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_alert_There_was_a_problem_with_}}").exists()){
				web.alertDialog(327,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_alert_There_was_a_problem_with_}}")
					.clickOk();				
			}			
			
			info("Entering Request_Name => "+ strRequestName);
			web.textBox(328,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_mat_request_name}}")
				.setText(strRequestName);			
			
			web.textBox(329,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_notes}}")
					.click();
			
			info("Entering Notes => "+ strNotes);
			web.textBox(330,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_notes}}")
					.setText(strNotes);
			
			if(web.confirmDialog(
				64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists()){
						try{
							info("Handle Security Windo start");
							delay(200);
							rb.keyPress(KeyEvent.VK_TAB);
							rb.keyRelease(KeyEvent.VK_TAB);							
							delay(100);
							rb.keyPress(KeyEvent.VK_ENTER);
							rb.keyRelease(KeyEvent.VK_ENTER);
							delay(200);
						}catch(Exception e){
							warn("Robot Security Window Catch : "+e.getMessage());						
						}
						info("Handle Security Windo End");
			}		
			
			scm_fn_capturePage();
		
			web.textBox(331,"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_file_filename}}").click();
			{
				think(3.033);
			}
			scm_fn_capturePage();
			info("Template File Path => "+strFilePath);
			if(scm_fn_isNullString(strFilePath)){
				reportFailure("Upload template Fielathh Is NUL, please check the Template file in correct Location.");
				return false;
			}
			//String strfilePath = "C:\\Users\\vshivank\\Downloads\\PORTABLE_SOLUTIONS"; 
		//   To handle upload popup by windows
			info("Entering filepath method start");
			try
			{
			   Robot robot = new Robot();
			   robot.delay(200);
			   uf_Vik_parseChars(strFilePath, robot);
			   //scmDriverLibrary.u(strfilePath,robot); 
			   scm_fn_capturePage();
			   robot.delay(200);
			   robot.keyPress(KeyEvent.VK_ENTER);
			   robot.keyRelease(KeyEvent.VK_ENTER); 
			}
			catch (AWTException e) {
			    e.printStackTrace();
			}	
			if(web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_email}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
				info("Email Field Loaded...!!!");
			}
			else{
				reportFailure("Filepath not set");
				return false;			
			}
			web.textBox(337,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_email}}")
					.click();
			{
				think(0.848);
			}
			info("Entering Email-Id => "+ strEmailAddress);
			web.textBox(338,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_email}}")
					.setText(strEmailAddress);
			
			
			
			// Code to Override Validations    * APPROVAL REQUIRED *  Window
			if("Y".equalsIgnoreCase(strOverride_Validations_Flag)){
				info("********** Override_Validations_Flag is Yes hence filling Override validation information *************");
				
				info("Checking Transact Specified Line Items Only Checkbox");
				if(web.checkBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_checkbox[@id='transactLine' or @index='0']").exists(5,TimeUnit.SECONDS)){
					info("Transact Specified Line Items Only Checkbox Exist");
					web.checkBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_checkbox[@id='transactLine' or @index='0']").click();
				}else{
					info("Transact Specified Line Items Only Checkbox not Exist");
				}
				
				info("Checking Requestor/Initiator TextField");
				if(web.textBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_text[@id='mat_vo_initiator' or @name='mat_vo_initiator' or @index='4']").exists(5,TimeUnit.SECONDS)){
					info(" Requestor/Initiator TextField Exist");
					web.textBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_text[@id='mat_vo_initiator' or @name='mat_vo_initiator' or @index='4']").setText(strRequestor_Initiator);
				}else{
					info(" Requestor/Initiator TextField not Exist");
				}
				
				info("Checking Approver Name TextField");
				if(web.textBox(" /web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_text[@id='mat_vo_approvername' or @name='mat_vo_approvername' or @index='5']").exists(5,TimeUnit.SECONDS)){
					info(" Approver Name TextField Exist");
					web.textBox(" /web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_text[@id='mat_vo_approvername' or @name='mat_vo_approvername' or @index='5']").setText(strApprover_Name);
				}else{
					info(" Approver Name TextField not Exist");
				}
				
				info("Checking Customer/Partner Name TextField");
				if(web.textBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_text[@id='mat_vo_customername' or @name='mat_vo_customername' or @index='6']").exists(5,TimeUnit.SECONDS)){
					info(" Customer/Partner Name TextField Exist");
					web.textBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_text[@id='mat_vo_customername' or @name='mat_vo_customername' or @index='6']").setText(strCustomer_Partner_Name);
				}else{
					info("Customer/Partner Name Text Field not Exist");
				}
				
				info("Checking Reason Code TextField");
				if(web.selectBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:select[(@id='mat_vo_reasoncode' or @name='mat_vo_reasoncode' or @index='3') and multiple mod 'False']").exists(5,TimeUnit.SECONDS)){
					info("Reason Code TextField Exist");
					web.selectBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:select[(@id='mat_vo_reasoncode' or @name='mat_vo_reasoncode' or @index='3') and multiple mod 'False']").selectOptionByText(strReason_Code);
				}else{
					info("Reason Code Text Field not Exist");
				}
				
				info("Checking Overrides Checkbox");
				if(web.checkBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_checkbox[@id='MAT_VO_TYPE_CHK_DURATION_COVE' or @name='MAT_VO_TYPE_CHK_DURATION_COVE' or @index='1']").exists(5,TimeUnit.SECONDS)){
					info("Overrides Checkbox Exist");
					web.checkBox("/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_checkbox[@id='MAT_VO_TYPE_CHK_DURATION_COVE' or @name='MAT_VO_TYPE_CHK_DURATION_COVE' or @index='1']").click();
				}else{
					info("Overrides Checkbox not Exist");
				}
				//think(10);
			
				//Robot rb = null;
				info("Checking Confirm Warning Msg");
				if(web.alertDialog("/web:dialog_alert[@text='If Coverage Duration override is checked, then Deal ID or Proof of Purchase information must be provided in the Notes field' and @winClass='##32770' and @index='0']/web:accPushButton[@index='0' or @name='OK']").exists(5,TimeUnit.SECONDS)){
					info("Confirm Warning Msg Exist");
					//rb = new Robot();
					rb.delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.delay(100);	
					//think(5);
				}else{
					info("Confirm Warning Msg not Exist");
				}				
				info("************* Override_Validations Done ************************");
				
			}else{
				info("strOverride_Validations_Flag is N hence skiping Override Validations ");
			}			
			// Override Validation Code End		
			
			// Delete this Think Time
			//think(1000);
			
			info("Print 1");
			if(web.button("/web:window[@index='0']/web:document[@index='0']/web:form[@id='McmUploadForm' and @name='McmUploadForm' and @index='2']/web:input_button[@id='uploadButton' and @name='uploadButton' and @value='Submit']").exists(30, TimeUnit.SECONDS)){
				info("======Submit button detected ========, Clicking it ");
				web.button("/web:window[@index='0']/web:document[@index='0']/web:form[@id='McmUploadForm' and @name='McmUploadForm' and @index='2']/web:input_button[@id='uploadButton' and @name='uploadButton' and @value='Submit']").dblClick();
				
			}
			else{
				
//				web.button("/web:window[@index='0']/web:document[@index='0']/web:form[@index='2']/web:input_button[@id='uploadButton' and @name='uploadButton' and @value='Submit']")
//					.dblClick();
				info("Unable to identify Submit Button, please check the log for more information");
				//web.button("/web:window[@index='0']").mouseClick(1545693, 5953);
				
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				
				//For TS1 we do not need below events (there are only 13 Tab Press required for TS1, Hence commenting below)
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				delay(100);
				
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				
				
			}
			
			
			info("Print 2");
			
			// Server issue , button not identify hence commented this code if the issue get solve, Uncomment it.
			
//			scm_fn_capturePage();
//			if(web.button(339,
//				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_uploadButton}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//					web.button(339,
//						"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_uploadButton}}")
//						.click();
//			}else{
//				reportFailure("Save Button Not active, Please see the screen shot for more informatiom.");
//				return false;
//			}
			// Need to uncomment this code if script failing
//			beginStep("[7] Test Service Contract Center (/ServiceSalesUpload)", 0);
//			{
//				web.window(340, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_window_0_9}}")
//						.waitForPage(null);
//			}
//			endStep();
			think(2);
			scm_fn_capturePage();
			
			//This code check if Validation popup Display or not
			if("Y".equalsIgnoreCase(strOverride_Validations_Flag)){
				if(web.confirmDialog("/web:dialog_confirm[@text='Do you want to continue with the validation override selection(s)?' and @winClass='##32770' and @index='0']" +
						"/web:accPushButton[@index='0' or @name='OK']").exists(5,TimeUnit.SECONDS)){
					info("Dialoge Confirm Box displayed..!!!");
					//rb = new Robot();
					rb.delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.delay(100);	
					think(5);
				}
			}
			think(2);
			
			//This code check if Validation popup Display or not
			if("CONTRACT TERMINATIONS".equalsIgnoreCase(strRequestType)){
				if(web.confirmDialog("/web:dialog_confirm[@text='This operation will terminate all the contracts in your spreadsheet at the header level " +
						"(including all products underneath).This is a non revertible operation. Are you sure you should like to proceed?' and @winClass='##32770' " +
						"and @index='0']/web:accPushButton[@index='0' or @name='OK']").exists(5,TimeUnit.SECONDS)){
					info("Contract termaination Dialoge_ Confirm Box displayed..!!!");					
					//rb = new Robot();
					rb.delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.delay(100);	
					//think(5);
				}
			}
			think(2);
			
			// Add code here to handle the Security window			
			if(web.confirmDialog(
				64,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(10, TimeUnit.SECONDS)){
						try{
							info("Handle Security Windo start");
							//Robot rb = new Robot();
							delay(200);
							rb.keyPress(KeyEvent.VK_TAB);
							rb.keyRelease(KeyEvent.VK_TAB);
							delay(100);
							rb.keyPress(KeyEvent.VK_ENTER);
							rb.keyRelease(KeyEvent.VK_ENTER);
							delay(200);
						}catch(Exception e){
							warn("Robot Security Window Catch : "+e.getMessage());						
						}
						info("Handle Security Windo End");
			}		
			
			info("Upload Template method End.");
		}catch(Exception e){
			System.out.println("uploadTemplate Method Exception => "+ e.getMessage());
			return false;	
		}
		return true;
	}



/**@FUNCTION_HEADER*****************************************************************************
 * 
 * @name:		uploadPSTemplate 
 * 
 * @purpose:	To uploading PS Template
 *
 * @param : 	RequestType,RequestName,Notes,EmailAddress,FilePath,ObjTimeOutSec
 *		
 * @return:		Boolean status
 * 
 * @modification_history
 * ----------------------------------------------------------------------------------------------
 * 	@date					@name					@modification
 *	17-MAR-2016				Saurabh Thawali		Created the new function
 * ----------------------------------------------------------------------------------------------
 * 					
 * **********************************************************************************************
 */


public boolean uploadPSTemplate(String strRequestType ,String strRequestName,String strNotes, String strEmailAddress,String strFilePath,int intObjTimeOutSec){
	try{
		info("++++++++++++++++++++++ Inside uploadPSTemplate Method ++++++++++++++++++++++++++++++++++");
		
		// Add code here to handle the Security window
		Robot rb = new Robot();
		if(web.confirmDialog(
			64,
			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists()){
			info("Handle Security Windo start");
				try{
					
					delay(200);
					rb.keyPress(KeyEvent.VK_TAB);
					rb.keyRelease(KeyEvent.VK_TAB);
					delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
					delay(200);
				}catch(Exception e){
					warn("Robot Security Window Catch : "+e.getMessage());						
				}
				info("Handle Security Windo End");
		}
		
		//think(30.287);
		//Validating the page is loade with all fields
		info("Selecting Request_Type => "+ strRequestType);
		if(web.selectBox(325,
		"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_requestType}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
			web.selectBox(325,
					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_select_requestType}}")
					.selectOptionByText(strRequestType);				
		}else{
			reportFailure("RequestType field not found on Page. Page time out issue.");
			return false;
		}
		scm_fn_capturePage();
		web.textBox(326,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_mat_request_name}}")
				.click();
		
		if(web.alertDialog(327,
		"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_alert_There_was_a_problem_with_}}").exists()){
			web.alertDialog(327,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_alert_There_was_a_problem_with_}}")
				.clickOk();				
		}
		scm_fn_capturePage();
		info("Entering Request_Name => "+ strRequestName);
		web.textBox(328,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_mat_request_name}}")
				.setText(strRequestName);
		
		web.textBox(329,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_notes}}")
				.click();
		
		info("Entering Notes => "+ strNotes);
		web.textBox(330,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_notes}}")
				.setText(strNotes);
		
		scm_fn_capturePage();
	
		web.textBox(331,"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_file_filename}}").click();
		{
			think(3.033);
		}
		scm_fn_capturePage();
		info("Template File Path => "+strFilePath);
		//String strfilePath = "C:\\Users\\vshivank\\Downloads\\PORTABLE_SOLUTIONS"; 
	//   To handle upload popup by windows
		info("Entering filepath method start");
		try
		{
		   Robot robot = new Robot();
		   robot.delay(200);
		   uf_Vik_parseChars(strFilePath, robot);
		   //scmDriverLibrary.u(strfilePath,robot); 
		   scm_fn_capturePage();
		   robot.delay(200);
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER); 
		}
		catch (AWTException e) {
		    e.printStackTrace();
		}	
		if(web.textBox("{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_email}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
			info("Email Field Loaded...!!!");
		}
		else{
			reportFailure("Filepath not set");
			return false;			
		}
		web.textBox(337,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_email}}")
				.click();
		
		info("Entering Email-Id => "+ strEmailAddress);
		web.textBox(338,
				"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_text_email}}")
				.setText(strEmailAddress);
		
		scm_fn_capturePage();
//		if(web.button(339,
//			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_uploadButton}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//				web.button(339,
//					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_input_button_uploadButton}}")
//					.click();
//		}else{
//			reportFailure("Save Button Not active, Please see the screen shot for more informatiom.");
//			return false;
//		}
//		
//		info("Clicking on Submit Button");
//		if(web.button(
//		"/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_button[@id='uploadButton' or @name='uploadButton' or @value='Submit' or @index='1']").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//			web.button(
//				"/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:form[@id='McmUploadForm' or @name='McmUploadForm' or @index='2']/web:input_button[@id='uploadButton' or @name='uploadButton' or @value='Submit' or @index='1']")
//				.click();
//		}else{
//			reportFailure("Save Button Not active, Please see the screen shot for more informatiom.");
//			return false;
//		}
		
		// Submit Button Not working so using Robot class trying to click on Submit Button
		
		delay(200);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		delay(100);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		delay(200);
		
		// Add code here to handle the Security window
		
		if(web.confirmDialog(
			64,
			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists()){
//					web.confirmDialog(64,
//					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
//					.clickCancel();
			info("Handle Security Windo start");
					try{
						//Robot rb = new Robot();
						delay(200);
						rb.keyPress(KeyEvent.VK_TAB);
						rb.keyRelease(KeyEvent.VK_TAB);
						delay(100);
						rb.keyPress(KeyEvent.VK_ENTER);
						rb.keyRelease(KeyEvent.VK_ENTER);
						delay(200);
					}catch(Exception e){
						warn("Robot Security Window Catch : "+e.getMessage());						
					}
					info("Handle Security Windo End");
		}			
		
	info("Upload Template method End.");
	}catch(Exception e){
		System.out.println("uploadTemplate Method Exception => "+ e.getMessage());
		return false;	
	}
	return true;
}


/**@FUNCTION_HEADER*****************************************************************************
 * 
 * @name:		getRequestNumber 
 * 
 * @purpose:	To get the Request Number generated after uploading MMAT Template
 *
 * @param : 	Object Time Out time in Seconds
 *		
 * @return:		Request NUmber	
 * 
 * @modification_history
 * ----------------------------------------------------------------------------------------------
 * 	@date					@name					@modification
 *	8-MAR-2016				Saurabh Thawali		Created the new function
 * ----------------------------------------------------------------------------------------------
 * 					
 * ***********************************************************************************************/
 

public String getRequestNumber(int intObjTimeOutSec){		

	String strGenRequestNumber = null;
	try{
		info("++++++++++++++++++++++++++ Inside getRequestNumber method +++++++++++++++++++++++++++");
		info("Inside getRequestNumber function");			
		// Add code here to handle the Security window
		info("Handle Security Windo start");
		if(web.confirmDialog(
			64,
			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(5, TimeUnit.SECONDS)){
//					web.confirmDialog(64,
//					"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}")
//					.clickCancel();
					try{
						Robot rb = new Robot();
						delay(200);
						rb.keyPress(KeyEvent.VK_TAB);
						rb.keyRelease(KeyEvent.VK_TAB);
						delay(100);
						rb.keyPress(KeyEvent.VK_ENTER);
						rb.keyRelease(KeyEvent.VK_ENTER);
						delay(200);
					}catch(Exception e){
						warn("Robot Security Window Catch : "+e.getMessage());						
					}
					info("Handle Security Windo End");
		}
		
		String strXpath = "";
		
		scm_fn_capturePage();
		//if(web.link(342, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_89848039}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
			if(web.link(342,strXpath).exists(intObjTimeOutSec, TimeUnit.SECONDS)){
			strGenRequestNumber = web.link(342, strXpath).getDisplayText();
		}else{
			reportFailure("Request Number not generated, Please see the screen shot for more information.");
			return null;
		}
		//System.out.println("Request Number => "+ web.link(342, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_89848039}}").getDisplayText());
		System.out.println("Request Number => "+ strGenRequestNumber);
		
		scm_fn_capturePage();
		
		if(web.link(342, strXpath).exists(intObjTimeOutSec, TimeUnit.SECONDS)){
		//web.link(342, strXpath).click();
		}else{
			reportFailure("Request Number not generated, Please see the sceen shot for more information.");
			return null;
		}
		
					
		scm_fn_capturePage();
		
		info("Before clicking on Ref ID from grid");
	
		
		int int1;
		try {
			int1 = toInt(strGenRequestNumber);
		if(int1 > 1)
			info("Generated Request_Number is : "+ strGenRequestNumber);
		}
		catch(Exception e){
			try {
				reportFailure("Generated Request Number is Invalid, Rewquest Number => "+ strGenRequestNumber);
				warn("Error Message => "+ e.getMessage());
				return null;
			} catch (AbstractScriptException e1) {
				warn("Request number not fetched properly, Hence not able to print request Number.");
			}
		}
	
		
	}catch(Exception e){
		System.out.println("clickOnRequestNumber Method Exception => "+ e.getMessage());
		return null;
	}
	return strGenRequestNumber;
}

/**@FUNCTION_HEADER*****************************************************************************
 * 
 * @name:		getPSRequestNumber 
 * 
 * @purpose:	To get the Request Number generated after uploading MMAT Template 
 *
 * @param : 	Object Time Out time in Seconds
 *		
 * @return:		Request Number	
 * 
 * @modification_history : In Future this function will get change BCZ some functionality not working hence by passing the few validation
 * ----------------------------------------------------------------------------------------------
 * 	@date					@name					@modification
 *	8-MAR-2016				Saurabh Thawali		Created the new function
 * ----------------------------------------------------------------------------------------------
 * 					
 * ***********************************************************************************************/
 

public String getPSRequestNumber(int intObjTimeOutSec){		

	String strGenRequestNumber = null;
	try{
		info("++++++++++++++++++++++++++ Inside getPSRequestNumber method +++++++++++++++++++++++++++");
		info("Inside getRequestNumber function");
		// Add code here to handle the Security window
		
		if(web.confirmDialog(
			64,
			"{{obj.Ebs_R12_CsmItDeveloper_Obj.web_dialog_confirm_This_page_is_accessing_in}}").exists(5,TimeUnit.SECONDS)){
			info("Handle Security Windo start");
				try{
					Robot rb = new Robot();
					delay(200);
					rb.keyPress(KeyEvent.VK_TAB);
					rb.keyRelease(KeyEvent.VK_TAB);
					delay(100);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
					delay(200);
				}catch(Exception e){
					warn("Robot Security Window Catch : "+e.getMessage());						
				}
				info("Handle Security Windo End");
		}
		
		scm_fn_capturePage();
//		if(web.link(342, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_89848039}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//			strGenRequestNumber = web.link(342, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_89848039}}").getDisplayText();
//		}else{
//			reportFailure("Request Number not generated, Please see the screen shot for more information.");
//			return null;
//		}
		
		if(web.link(342, "/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:a[@text='121135' or @href='https://tools-stage.Test.com/YS1SMC/requestStatusDispatch.do?methodName=onRequestAction' or @index='19']").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
			strGenRequestNumber = web.link(342, "/web:window[@index='0' or @title='Test Service Contract Center']/web:document[@index='0']/web:a[@text='121135' or @href='https://tools-stage.Test.com/YS1SMC/requestStatusDispatch.do?methodName=onRequestAction' or @index='19']").getDisplayText();
		}else{
			reportFailure("Request Number not generated, Please see the screen shot for more information.");
			return null;
		}
		
		//System.out.println("Request Number => "+ web.link(342, "{{obj.Ebs_R12_CsmItDeveloper_Obj.web_a_89848039}}").getDisplayText());
		System.out.println("Generated Request Number => "+ strGenRequestNumber);			

		scm_fn_capturePage();			
				
//		beginStep(
//				"[6] https://tools-stage.Test.com/YS4SMC/logOut.do (/logOut.do)",
//				0);
//		{
//			//web.window(372, "{{obj.Temp_Obj_Vik.web_window_0_6}}").waitForPage(null);
//			
//			if(web.confirmDialog(379,
//				"{{obj.Temp_Obj_Vik.web_dialog_confirm_This_page_is_accessing_in}}").exists()){
//				info("Closing security window start");
//				try{
//					Robot rb = new Robot();
//					delay(200);
//					rb.keyPress(KeyEvent.VK_TAB);
//					rb.keyRelease(KeyEvent.VK_TAB);
//					delay(100);
//					rb.keyPress(KeyEvent.VK_ENTER);
//					rb.keyRelease(KeyEvent.VK_ENTER);
//					delay(200);
//				}catch(Exception e){
//					warn("Robot Security Window Catch : "+e.getMessage());						
//				}
//				info("Closing security window end");
//			}
//		}
//		endStep();
		
//		scm_fn_capturePage();
//		info("Before logout");
//		if(web.link(370, "{{obj.Temp_Obj_Vik.web_a_Logout}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//			web.link(370, "{{obj.Temp_Obj_Vik.web_a_Logout}}").click();
//		}else{
//			reportFailure("Logout Button not visible, Please see the screen shot for more infomation.");
//			return null;
//		}
//		if(web.confirmDialog(371,
//		"{{obj.Temp_Obj_Vik.web_dialog_confirm_You_have_unsaved_changes_}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//			web.confirmDialog(371,
//				"{{obj.Temp_Obj_Vik.web_dialog_confirm_You_have_unsaved_changes_}}")
//				.clickOk();
//		}	
//		beginStep("[7] Log In (/sclnup.html)", 0);
//		{
//			web.window(380, "{{obj.Temp_Obj_Vik.web_window_0_7}}").waitForPage(
//					null);
//			
//			
//			if(web.confirmDialog(379,
//				"{{obj.Temp_Obj_Vik.web_dialog_confirm_This_page_is_accessing_in}}").exists(20, TimeUnit.SECONDS)){
//				info("Closing security window start");
//				try{
//					Robot rb = new Robot();
//					delay(200);
//					rb.keyPress(KeyEvent.VK_TAB);
//					rb.keyRelease(KeyEvent.VK_TAB);
//					delay(100);
//					rb.keyPress(KeyEvent.VK_ENTER);
//					rb.keyRelease(KeyEvent.VK_ENTER);
//					delay(200);
//				}catch(Exception e){
//					warn("Robot Security Window Catch : "+e.getMessage());						
//				}
//				info("Closing security window end");
//			}
//			
//			if(web.window(541, "{{obj.Temp_Obj_Vik.web_window_0_7}}").exists(intObjTimeOutSec, TimeUnit.SECONDS)){
//				web.window(541, "{{obj.Temp_Obj_Vik.web_window_0_7}}").close();				
//			}
//			web.window(542, "{{obj.Temp_Obj_Vik.web_window_0}}").close();
//		}
//		endStep();	
		
		// TO check the whether return Request Number in Numeric format
		
		browser.close();
		
		int int1;
		try {
			int1 = toInt(strGenRequestNumber);
		if(int1 > 1)
			info("Generated Request_Number is : "+ strGenRequestNumber);
		}
		catch(Exception e){
			try {
				reportFailure("Generated Request Number is Invalid, Rewquest Number => "+ strGenRequestNumber);
				warn("Error Message => "+ e.getMessage());
				return null;
			} catch (AbstractScriptException e1) {
				e1.printStackTrace();
			}
		}
		
	}catch(Exception e){
		System.out.println("gerRequestNumber Method Exception => "+ e.getMessage());
		return null;
	}
	
	return strGenRequestNumber;
}

/**
 * @param strScriptName 
 * @FUNCTION_HEADER*****************************************************************************
 * 
 * @name:	scm_fn_getDataFilePathAsxls
 * 
 * @purpose:	Returns the data sheet path of the current Script
 *		
 *	
 * 
 * @return:	
 *			(String) 
 *			
 * 				
 * 
 * @modification_history
 * ----------------------------------------------------------------------------------------------
 * 	@date					@name					@modification
 *	7-OCT-2015				Saurabh Thawali			Created the new function
 * ----------------------------------------------------------------------------------------------
 * 					
 * **********************************************************************************************
 **/

public String scm_fn_getDataFilePathAsxls(@Arg("strScriptName")
String strScriptName) throws Exception{	  

	try{
		info("inside scm_fn_getDataFilePathAsxls()");
		
		if (scm_fn_isNullString(strScriptName)){
			fail("scm_fn_getDataFilePath(): Script Name is not passed from the Driver file");
		}
		String strEnvXMLPath=getVariables().get("g_strEnvXMLPath");
		info("Environment file locationinside scm_fn_getDataSheetPath function --"+strEnvXMLPath);
		String strDataFolderPath=scm_fn_xmlReader(strEnvXMLPath,"SCM_DATA_FILE_LOCATION");
		info("Data Folder Path from environment file --"+strDataFolderPath);			
		String strDataFile=strDataFolderPath+strScriptName+".xls";
		info("Returning Data file--"+strDataFile+"-- to driver script");	
		
		return strDataFile;			
		
	}catch(Exception e){
		info( "Caught Exception in scm_fn_getDataSheetPath() "+ e);
		e.printStackTrace();
		throw e;
	}
	
}	

	
	
/**@FUNCTION_HEADER*****************************************************************************
 * 
 * @name:	scm_fn_headerIDFromConsol
 * 
 * @purpose: This is specially designed to provide a provision to the user to chnage the test data <<HEADER_ID>>using consol input
 *
 * @param : 	
 *		
 * @return:			
 * 
 * @modification_history
 * ----------------------------------------------------------------------------------------------
 * 	@date					@name					@modification
 *	13-Apr-2016				Saurabh Thawali			Created the new function
 * ----------------------------------------------------------------------------------------------
 * 					
 * **********************************************************************************************
 */

 public String scm_fn_headerIDFromConsol() throws Exception	{
		String strTestData=null;
		try{
			info("inside scm_fn_headerIDFromConsol() function");
			getSettings().set("header_id", null);
			String headerID = getSettings().get("header_id");
			
			
			if (headerID==null)
			{
				System.out.print("<Optional>Enter the [HEADER_ID] if you want to override test data from test data sheet:");
				BufferedReader header_input = new BufferedReader(new InputStreamReader(System.in));
				strTestData = header_input.readLine();
				if(scm_fn_isNullString(strTestData)){
					info("Script will use Test Data provided in the DataSheet ");
				}else{
					info("[[HEADER_ID]] entered through Console : "+strTestData);
				}
				
			}else info("Script will use Test Data provided in the DataSheet ");
			
			
						
		}catch(Exception e)
		{
			warn("Exception occurred in 'scm_fn_headerIDFromConsol()' function:" + e.getMessage());
			e.printStackTrace();
		}
		info("Test Data inside scm_fn_headerIDFromConsol() function before returning: "+strTestData);
		return strTestData;
	}
 
 
 
 
 
 /**@FUNCTION_HEADER*****************************************************************************
  * 
  * @name:	scm_fn_lineIDFromConsol
  * 
  * @purpose: This is specially designed to provide a provision to the user to chnage the test data <<LINE_ID>>using consol input
  *
  * @param : 	
  *		
  * @return:			
  * 
  * @modification_history
  * ----------------------------------------------------------------------------------------------
  * 	@date					@name					@modification
  *	13-Apr-2016				Saurabh Thawali			Created the new function
  * ----------------------------------------------------------------------------------------------
  * 					
  * **********************************************************************************************
  */

  public String scm_fn_lineIDFromConsol() throws Exception	{
 		String strTestData=null;
 		try{
 			info("inside scm_fn_lineIDFromConsol() function");
 			getSettings().set("line_id", null);
 			String lineID = getSettings().get("line_id");
 			
 			
 			if (lineID==null)
 			{
 				System.out.print("<Optional>Enter the [LINE_ID] if you want to override test data from test data sheet:");
 				BufferedReader header_input = new BufferedReader(new InputStreamReader(System.in));
 				strTestData = header_input.readLine();
 				if(scm_fn_isNullString(strTestData)){
 					info("Script will use Test Data provided in the DataSheet ");
 				}else{
 					info("[[LINE_ID]] entered through Console : "+strTestData);
 				}
 				
 			}else info("Script will use Test Data provided in the DataSheet ");
 			
 			
 						
 		}catch(Exception e)
 		{
 			warn("Exception occurred in 'scm_fn_lineIDFromConsol()' function:" + e.getMessage());
 			e.printStackTrace();
 		}
 		info("Test Data inside scm_fn_lineIDFromConsol() function before returning: "+strTestData);
 		return strTestData;
 	}
 
 
 
 
 
 
 



	
	
	
}
