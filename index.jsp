<%@ page import="eu.pms.common.constant.SystemConstant" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%
    response.setHeader("pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Expires", "0");

 %>
<jsp:forward page="loginPage.do"/>
