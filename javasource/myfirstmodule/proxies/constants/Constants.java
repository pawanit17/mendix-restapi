// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the MyFirstModule module

	/**
	* Key for Open Movie Database REST API
	*/
	public static java.lang.String getAPIKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MyFirstModule.APIKey");
	}
}