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

public class HCM_CreateaPendingWorker_Existing_NID_0135 extends FuncLibraryWrapper
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

	public void basicDetails(String proposedStartDate)
			throws AbstractScriptException {
		checkInit();
		callFunction("basicDetails", proposedStartDate);
	}

	public void personalDetails(String firstName, String familyName,
			String dateOfBirth) throws AbstractScriptException {
		checkInit();
		callFunction("personalDetails", firstName, familyName, dateOfBirth);
	}

	public void NID(String national_ID) throws AbstractScriptException {
		checkInit();
		callFunction("NID", national_ID);
	}

	public void next() throws AbstractScriptException {
		checkInit();
		callFunction("next");
	}

	public void continueClick() throws AbstractScriptException {
		checkInit();
		callFunction("continueClick");
	}

	public void address(String countryName, String addressLine_1,
			String addressLine_2, String pOBox, String city, String postalCode)
			throws AbstractScriptException {
		checkInit();
		callFunction("address", countryName, addressLine_1, addressLine_2,
				pOBox, city, postalCode);
	}

	public void contractDetails(String employmentStatus)
			throws AbstractScriptException {
		checkInit();
		callFunction("contractDetails", employmentStatus);
	}

	public void assignmentDetails(String businessUnit_Input,
			String projectedEndDate) throws AbstractScriptException {
		checkInit();
		callFunction("assignmentDetails", businessUnit_Input, projectedEndDate);
	}

	public void job(String peopleGroup) throws AbstractScriptException {
		checkInit();
		callFunction("job", peopleGroup);
	}

	public void Probation_Notice_Period(String probationPeriod,
			String noticePeriod) throws AbstractScriptException {
		checkInit();
		callFunction("Probation_Notice_Period", probationPeriod, noticePeriod);
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

