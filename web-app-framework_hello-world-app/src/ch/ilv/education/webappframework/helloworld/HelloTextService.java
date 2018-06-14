/**
 * This sample shows how to implement a model (Service) using Giniality´s WebApp-Framework.
 * 
 * @author Arif Chughtai (ACH), Giniality AG
 * @version 1.0, usable
 */

package ch.ilv.education.webappframework.helloworld;

import com.giniality.education.webappframework.service.Service;
import com.giniality.education.webappframework.service.ServiceRequest;

public class HelloTextService implements Service {

	/**
	 * @see com.giniality.education.webappframework.service.Service#process(HttpServletRequest)
	 */
	public Object process(ServiceRequest inRequest) {
		String helloText = inRequest.getParameter("HelloText");

		return helloText;
	}

	/**
	 * @see com.giniality.education.webappframework.service.Service#getAliasName()
	 */
	public String getAliasName() {
		return "HelloTextService";
	}
}
