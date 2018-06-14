/**
 * This sample shows how to implement a view using Giniality´s WebApp-Framework.
 * 
 * @author Arif Chughtai (ACH), Giniality AG
 * @version 1.0, usable
 */

package ch.ilv.education.webappframework.helloworld;

import com.giniality.education.webappframework.view.AbstractHtmlView;

public class HelloTextView extends AbstractHtmlView {
	/**
	 * @see com.giniality.education.webappframework.view.AbstractHtmlView#createPageContents()
	 */
	public String createPageContents() {
		return "<h1> Today`s greeting: " + (String)getDisplayObject() + "</h1>";
	}

	/**
	 * @see com.giniality.education.webappframework.view.AbstractHtmlView#getTitle()
	 */
	public String getTitle() {
		return "Giniality WebApp-Framework HelloWorld-App";
	}

	/**
	 * @see com.giniality.education.webappframework.view.AbstractHtmlView#getAliasName()
	 */
	public String getAliasName() {
		return "HelloTextView";
	}
}
