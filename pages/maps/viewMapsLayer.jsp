<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<link rel="stylesheet" type="text/css" href="https://extjs.cachefly.net/ext/gpl/5.1.0/packages/ext-theme-classic/build/resources/ext-theme-classic-all-debug.css"/>

<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css">
<link rel="stylesheet" type="text/css" href="/pages/resources/css/LayerControl.css"/>
<%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">--%>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>

<script src="https://cdn.polyfill.io/v2/polyfill.min.js?features=requestAnimationFrame,Element.prototype.classList,URL"></script>
<script type="text/javascript" src="http://cdn.sencha.com/ext/gpl/5.1.0/build/ext-all-debug.js" ></script>

<script type="text/javascript" src="/pages/resources/src/LayerControl.js" ></script>
<script type="text/javascript" src="/pages/resources/src/LayerControlLang.js" ></script>
<script src="https://cdn.polyfill.io/v2/polyfill.min.js?features=requestAnimationFrame,Element.prototype.classList,URL"></script>

<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>--%>

<script type="text/javascript" src="/pages/resources/js/btcMap.js" ></script>

<script type="text/javascript">
    Ext.onReady(function() {

        <%
            if(request.getParameter("comId") != null && !request.getParameter("comId").equals(""))
            {
        %>

                 drawBtcMap(<%=request.getParameter("comId")%>);

        <%
            }else
                {
        %>
                drawBtcMap(5000);
        <%    }
            if(request.getParameter("long") != null && !request.getParameter("long").equals(""))
            {
        %>
                // 35.15624062000000, 31.50144083000000
                doCenter(<%=request.getParameter("long")%>, <%=request.getParameter("lat")%>);
        <%
            }
        %>
    });
</script>
<title></title>


<div id="map" style="width:100%;height:97%"></div>
<%--<div id="marker" title="Marker"></div>--%>

