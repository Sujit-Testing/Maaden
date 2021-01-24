//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.maaden.orackeEBS;

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
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;

public class PO_Internal_Requisition_00128 extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * Scenario - Internal_Requisition Steps- 1)Login the application  2)Opening the iProcurement_Home_Page 3)Click the Copy image 4)Click CheckOut Button 5)Click Next Button - >Get the No Approval Text 6)Click Next Button-> Click Submit Button 7)Capture the Requisition Number 8)Click Continue Shopping Button 9)Capture the approval status 10)LogOut the application
	 */
	public void run() throws AbstractScriptException {
		checkInit();
		callFunction("run");
	}

	public void finish() throws AbstractScriptException {
		checkInit();
		callFunction("finish");
	}

}

