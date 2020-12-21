//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.myCompany.myTeam;

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
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;

public class DriverLibrary extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws AbstractScriptException {
		checkInit();
		callFunction("run");
	}

	public void finish() throws AbstractScriptException {
		checkInit();
		callFunction("finish");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		scm_fn_updatePlaybackSettings 
	 * @purpose :	To set the OATS tool playback settings while executing the script
	 * @param  : 	
	 * @return :			
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 25-SEP-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_fn_updatePlaybackSettings(WebDomService inputWeb,
			VUserSettings inputVUS) throws AbstractScriptException {
		checkInit();
		callFunction("scm_fn_updatePlaybackSettings", inputWeb, inputVUS);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_loadEnvFile
	 * @purpose :Load environment file selected while running the script from OTM or prompt user to enter Env file location through Console
	 * @param  : 	
	 * @return :			
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 25-Sep-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_fn_loadEnvFile() throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_loadEnvFile");
	}

	public String scm_fn_loadEnvFile_HardCodedEnvCode(String strEnvXMLPath)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_loadEnvFile_HardCodedEnvCode",
				strEnvXMLPath);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_launchBrowser
	 * @purpose :	Closes all existing browsers and launch a new browser in Private mode
	 * @param  : 	
	 * @return :	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 1-JUN-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_fn_launchBrowser() throws AbstractScriptException {
		checkInit();
		callFunction("scm_fn_launchBrowser");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_xmlReader
	 * @purpose :	To read environment file and return the value of the enviroment variable being passed
	 * @param  : 	 1. strEnvXMLPath		:	Full path of the Environment XML file 2. strEnvvar			:	Environment variable SAMPLE_INPUT			:	F:\SETUP\ENV_FILE\FS_ENV_INFO.XML, SCM_APP_URL
	 * @return :	 (String)	: Value of Environment variable begin passed to the function
	 * @modification_history ----------------------------------------------------------------------------	------------------
	 * @date 					@name					@modification 1-JUN-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_fn_xmlReader(String strEnvXMLPath, String strEnvVar)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_xmlReader", strEnvXMLPath,
				strEnvVar);
	}

	/**
	 * @FUNCTION_HEADER  
	 */
	public boolean scm_fn_isNullString(String strSourceString)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("scm_fn_isNullString", strSourceString);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_getDataFilePath
	 * @purpose :	Returns the data sheet path of the current Script
	 * @param  : 	 strScriptName	: Pass the name of the Script for which you want to find the corresponding data file.  Note: Ensure that data file name is same as the Script Name
	 * @return :	 (String) 
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 7-OCT-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_fn_getDataFilePath(String strScriptName)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_getDataFilePath", strScriptName);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_login()
	 * @purpose :	Reads environment informaiton from the environment file and based on the Environment Type value, calls the  appropriate login function
	 * @param  : 	
	 * @return :	 (boolean) : returns true if the login is successful returns false if the Environment type passed from the environment file or the login was not successful
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 11-OCT-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean scm_fn_login() throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("scm_fn_login");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_signout
	 * @purpose :	Sign out of the application
	 * @param  : 	
	 * @return :	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 10-OCT-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_fn_signout() throws AbstractScriptException {
		checkInit();
		callFunction("scm_fn_signout");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	 scm_fn_getTimeStamp
	 * @purpose : Returns date and timestamp with some random number appened at end
	 * @param  : 	
	 * @return :	 (String)	: Returns date and timestamp. Ex: 1312015_74745
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 1-JUN-2015				Saurabh Thawali			Created the new function ----------------------------------------------------------------------------------------------
	 */
	public String scm_fn_getTimeStamp() throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_getTimeStamp");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_capturePage
	 * @purpose :	Creates snapshot of the current web window and appends it to results doc. 
	 * @param  :		 	
	 * @return :	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 6-OCT-2015				Saurabh Thawali ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_fn_capturePage() throws AbstractScriptException {
		checkInit();
		callFunction("scm_fn_capturePage");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_capturePageOfIndex
	 * @purpose :	Creates snapshot of the desired web window and appends it to results doc. 
	 * @param  :		 	int index:	pass the index of the window desired to get snapshoted. 
	 * @return :	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 22-AUG-2015				Saurabh Thawali ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_fn_capturePageOfIndex(int index)
			throws AbstractScriptException {
		checkInit();
		callFunction("scm_fn_capturePageOfIndex", index);
	}

	public int scm_fn_getObjectTimeout() throws AbstractScriptException {
		checkInit();
		return (Integer) callFunction("scm_fn_getObjectTimeout");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	 scm_bypassJavaWarning()
	 * @purpose : Bypasses JAVA Warnings/Popups 
	 * @param  : 	
	 * @return :	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 18-Nov-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_bypassJavaWarning() throws AbstractScriptException {
		checkInit();
		callFunction("scm_bypassJavaWarning");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	 scm_bypassJavaWarning()
	 * @purpose : Bypasses JAVA Warnings/Popups 
	 * @param  : 	
	 * @return :	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 18-Nov-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_bypassJavaWarningAPPMigr1() throws AbstractScriptException {
		checkInit();
		callFunction("scm_bypassJavaWarningAPPMigr1");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_getEnvAliasValue()
	 * @purpose :	--- To be updated ---
	 * @param  : 	--- To be updated ---
	 * @return :		--- To be updated --
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 30-JAN-20156			Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_getEnvAliasValue(String envCode)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_getEnvAliasValue", envCode);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	 scm_bypassSingleJavaWarning()	
	 * @purpose : Bypasses single JAVA Warnings/Popups 
	 * @param  : null	
	 * @return :	void
	 * @modification_history  : 1-Feb-2016 ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 28-Jan-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void scm_bypassSingleJavaWarning() throws AbstractScriptException {
		checkInit();
		callFunction("scm_bypassSingleJavaWarning");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_MMAT_login()
	 * @purpose :	Login To PS
	 * @param  : URL,UN,PASS,TimeOutSeconds
	 * @return :	 (boolean) : returns true if the login is successful
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 11-FEB-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean scm_fn_MMAT_login(String strAppURL, String strUserName,
			String strPassword, int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("scm_fn_MMAT_login", strAppURL,
				strUserName, strPassword, intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_PS_login()
	 * @purpose :	Login To PS
	 * @param  : URL,UN,PASS,TimeOutSeconds
	 * @return :	 (boolean) : returns true if the login is successful
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 11-FEB-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean scm_fn_PS_login(String strAppURL, String strUserName,
			String strPassword, int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("scm_fn_PS_login", strAppURL,
				strUserName, strPassword, intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_MMAT_login()
	 * @purpose :	To Logout From MMAT/PS application
	 * @param  : 
	 * @return :	(boolean) : returns true if the LOGOUT is successful
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 06-APR-2017				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean scm_fn_MMAT_PS_logout() throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("scm_fn_MMAT_PS_logout");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		uf_Vik_parseChars 
	 * @purpose :	used to parse the string (path of the file) Passed to this method
	 * @param  : 	letter- path of the file
	 * @return :		void
	 * @throws AbstractScriptException  
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 5-JAN-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void uf_Vik_parseChars(String letter, Robot robot)
			throws AbstractScriptException {
		checkInit();
		callFunction("uf_Vik_parseChars", letter, robot);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		uf_Vik_typeCharacter 
	 * @purpose :	Used to typecast the characters to string
	 * @param  : 	Letter,Robot
	 * @return :		void
	 * @throws AbstractScriptException  
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 5-JAN-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public void uf_Vik_typeCharacter(String letter, Robot robot)
			throws AbstractScriptException {
		checkInit();
		callFunction("uf_Vik_typeCharacter", letter, robot);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		setPreferances 
	 * @purpose :	To set required Preferances as per User
	 * @param  : 	TemplateType,Preferances,URL,user_id,password,ObjTimeOutSec
	 * @return :		Boolean status
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 8-MAR-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean setPreferances(String strTemplateType,
			String strPreferances, String URL, String user_id, String password,
			int intObjTimeOutSec) throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("setPreferances", strTemplateType,
				strPreferances, URL, user_id, password, intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		setPSPreferances 
	 * @purpose :	To set required Preferances as per User
	 * @param  : 	TemplateType,Preferances,URL,user_id,password,ObjTimeOutSec
	 * @return :		Boolean status
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 17-MAR-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean setPSPreferances(String strTemplateType,
			String strPreferances, String URL, String user_id, String password,
			int intObjTimeOutSec) throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("setPSPreferances", strTemplateType,
				strPreferances, URL, user_id, password, intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		uploadMMATTemplate 
	 * @purpose :	To uploading MMAT Template
	 * @param  : 	RequestType,RequestName,Notes,EmailAddress,FilePath,ObjTimeOutSec
	 * @return :		Boolean status
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 8-MAR-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean downloadTemplate(String strTemplateType, int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("downloadTemplate", strTemplateType,
				intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		uploadMMATTemplate 
	 * @purpose :	To uploading MMAT Template
	 * @param  : 	RequestType,RequestName,Notes,EmailAddress,FilePath,ObjTimeOutSec
	 * @return :		Boolean status
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 8-MAR-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean uploadMMATTemplate(String strRequestType,
			String strRequestName, String strNotes, String strEmailAddress,
			String strOverride_Validations_Flag, String strRequestor_Initiator,
			String strApprover_Name, String strCustomer_Partner_Name,
			String strReason_Code, String strFilePath, int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("uploadMMATTemplate", strRequestType,
				strRequestName, strNotes, strEmailAddress,
				strOverride_Validations_Flag, strRequestor_Initiator,
				strApprover_Name, strCustomer_Partner_Name, strReason_Code,
				strFilePath, intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		uploadPSTemplate 
	 * @purpose :	To uploading PS Template
	 * @param  : 	RequestType,RequestName,Notes,EmailAddress,FilePath,ObjTimeOutSec
	 * @return :		Boolean status
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 17-MAR-2016				Saurabh Thawali		Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public boolean uploadPSTemplate(String strRequestType,
			String strRequestName, String strNotes, String strEmailAddress,
			String strFilePath, int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (Boolean) callFunction("uploadPSTemplate", strRequestType,
				strRequestName, strNotes, strEmailAddress, strFilePath,
				intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		getRequestNumber 
	 * @purpose :	To get the Request Number generated after uploading MMAT Template
	 * @param  : 	Object Time Out time in Seconds
	 * @return :		Request NUmber	
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 8-MAR-2016				Saurabh Thawali		Created the new function ----------------------------------------------------------------------------------------------
	 */
	public String getRequestNumber(int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("getRequestNumber", intObjTimeOutSec);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :		getPSRequestNumber 
	 * @purpose :	To get the Request Number generated after uploading MMAT Template 
	 * @param  : 	Object Time Out time in Seconds
	 * @return :		Request Number	
	 * @modification_history  : In Future this function will get change BCZ some functionality not working hence by passing the few validation ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 8-MAR-2016				Saurabh Thawali		Created the new function ----------------------------------------------------------------------------------------------
	 */
	public String getPSRequestNumber(int intObjTimeOutSec)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("getPSRequestNumber", intObjTimeOutSec);
	}

	/**
	 * @param strScriptName  
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_getDataFilePathAsxls
	 * @purpose :	Returns the data sheet path of the current Script
	 * @return :	 (String) 
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 7-OCT-2015				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_fn_getDataFilePathAsxls(
			@Arg("strScriptName") String strScriptName)
			throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_getDataFilePathAsxls",
				strScriptName);
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_headerIDFromConsol
	 * @purpose : This is specially designed to provide a provision to the user to chnage the test data <<HEADER_ID>>using consol input
	 * @param  : 	
	 * @return :			
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 13-Apr-2016				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_fn_headerIDFromConsol() throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_headerIDFromConsol");
	}

	/**
	 * @FUNCTION_HEADER
	 * @name :	scm_fn_lineIDFromConsol
	 * @purpose : This is specially designed to provide a provision to the user to chnage the test data <<LINE_ID>>using consol input
	 * @param  : 	
	 * @return :			
	 * @modification_history ----------------------------------------------------------------------------------------------
	 * @date 					@name					@modification 13-Apr-2016				Saurabh Thawali			Created the new function ---------------------------------------------------------------------------------------------- *
	 */
	public String scm_fn_lineIDFromConsol() throws AbstractScriptException {
		checkInit();
		return (String) callFunction("scm_fn_lineIDFromConsol");
	}

}

