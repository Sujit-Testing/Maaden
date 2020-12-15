//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.myCompany.myTeam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;

public class HCM_NameCorrection_0138 extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	public void run() throws AbstractScriptException {
		checkInit();
		callFunction("run");
	}

	public void SearchEmployee(String firstName, String familyName,
			String national_ID) throws AbstractScriptException {
		checkInit();
		callFunction("SearchEmployee", firstName, familyName, national_ID);
	}

	public void actions() throws AbstractScriptException {
		checkInit();
		callFunction("actions");
	}

	public void edit(String correctFirstName, String correctFamilyName)
			throws AbstractScriptException {
		checkInit();
		callFunction("edit", correctFirstName, correctFamilyName);
	}

	public void validation(String firstName, String familyName,
			String national_ID) throws AbstractScriptException {
		checkInit();
		callFunction("validation", firstName, familyName, national_ID);
	}

	public void finish() throws AbstractScriptException {
		checkInit();
		callFunction("finish");
	}

}

