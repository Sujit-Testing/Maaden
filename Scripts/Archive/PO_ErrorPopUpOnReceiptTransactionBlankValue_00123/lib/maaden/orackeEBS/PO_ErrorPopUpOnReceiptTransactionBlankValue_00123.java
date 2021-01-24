//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.maaden.orackeEBS;

import java.util.concurrent.TimeUnit;
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

public class PO_ErrorPopUpOnReceiptTransactionBlankValue_00123 extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * Scenario-  Receipt Shipment Mode Value needs to be required if Po returned to supplier "1) Open the Browser 2) Login with correct user 3) Click on MWSPC_PURCHASING_SUPERUSE-> Receiving->Returns 4) Provide the PO number and Click on Find->Select the first row-> Provide the quantity and Supplier->Click  Save  5) Error encountered, saying Receipt Transaction  6) LogOut and Close the browser"
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

