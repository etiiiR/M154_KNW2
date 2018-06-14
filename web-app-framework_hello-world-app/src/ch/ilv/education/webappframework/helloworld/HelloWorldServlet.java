/**
 * This sample shows how to implement a controller (Servlet) using Giniality´s WebApp-Framework.
 * 
 * @author Arif Chughtai (ACH), Giniality AG
 * @version 1.0, usable
 */

package ch.ilv.education.webappframework.helloworld;

import com.giniality.education.webappframework.registry.ServiceRegistry;
import com.giniality.education.webappframework.registry.ViewRegistry;
import com.giniality.education.webappframework.servlet.AbstractServiceBrokerServlet;

public class HelloWorldServlet extends AbstractServiceBrokerServlet {

	/**
	 * Constant defining the serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see com.giniality.education.webappframework.view.AbstractServiceBrokerServlet#initRegistry()
	 */
	protected void initRegistry() {
		// Register Views
		ViewRegistry.getInstance().registerView(new HelloTextView());

		// Register Services
		ServiceRegistry.getInstance().registerService(new HelloTextService());
	}
}