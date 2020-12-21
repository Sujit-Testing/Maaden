import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import lib.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	@FunctionLibrary("DriverLibrary") lib.myCompany.myTeam.DriverLibrary driverLibrary;
	public void initialize() throws Exception {
			}
 
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {

		String g_strEnvXMLPath=null;
		try{
			//Read environment file location from console.
			g_strEnvXMLPath=driverLibrary.scm_fn_loadEnvFile();
			
			//Set environment file location as global variable.
			getVariables().set("g_strEnvXMLPath", g_strEnvXMLPath, Variables.Scope.GLOBAL);
			
			getVariables().set("sampleName", "saurabh thawali is good trainer", Variables.Scope.GLOBAL);
			
                String repositoryName=getScriptPackage().getRepositoryName();
			info("Printing repository name " +repositoryName);
                
			String reUsableScriptLocation = driverLibrary.scm_fn_xmlReader(g_strEnvXMLPath,"REUSABLE_SCRIPTS_LOCATION");
			info("reUsableScriptLocation Name BEFORE concinate " +reUsableScriptLocation);
			
			if (reUsableScriptLocation==null || (reUsableScriptLocation.trim()).isEmpty()){
				fail("REUSABLE_SCRIPTS_LOCATION is not entered in the environment file.");
			}
			
			//Get the name of the script to be executed, which should be same as name of current script. 
			String scriptName = getScriptPackage().getScriptName();
			info("Script Name is " +scriptName);
			
			reUsableScriptLocation = reUsableScriptLocation + scriptName;
			info("reUsableScriptLocation Name is after concinate " +reUsableScriptLocation);
			
			runScript(repositoryName, reUsableScriptLocation, 1);
			
						
		}catch(Exception e){
			fail("Exception occurred in driver file:" + e.getMessage());
			e.printStackTrace();
		}
	}

	public void finish() throws Exception {
	}
}
