/*
 * Created on Jan 14, 2004
 *
 */
package eu.pms.common.utils;

import org.apache.struts.tiles.ComponentContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Tareq Doufish
 *
 */
public class BaseAction {

	public Object getParentAttribute(
		String strAttribute,
		HttpServletRequest request) {

		//get the ComponentContext
		ComponentContext ctx =
			(ComponentContext) request.getAttribute("ParentContext");
		//get the attribute value
		Object obj = ctx.getAttribute(strAttribute);
		return obj;

	}

	public void setParentAttribute(
		String strAttribute,
		Object objValue,
		HttpServletRequest request) {

		ComponentContext ctx =
			(ComponentContext) request.getAttribute("ParentContext");
		if (ctx == null) {
			//if the componentContext already has the ParentContext , then add the new attribute to the
			//old context itself... hence reatining the perviously set attributes
			ComponentContext ctxNew = new ComponentContext();
			ctxNew.putAttribute(strAttribute, objValue);

			//set the ComponentContext on the request scope

			request.setAttribute("ParentContext", ctxNew);
		} else {

			ctx.putAttribute(strAttribute, objValue);
			request.setAttribute("ParentContext", ctx);

		}

	}
	public void removeParentAttributes(HttpServletRequest request) {

		request.removeAttribute("ParentContext");

	}
}
