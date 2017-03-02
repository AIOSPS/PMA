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

<%-- ---------Map Style---------- --%>
<link rel="stylesheet" href="/pages/resources/map/js/jquery-ui/jquery-ui.css">
<link rel="stylesheet" href="/pages/resources/map/css/style.css">
<script src="/pages/resources/map/js/jquery-ui/external/jquery/jquery.js"></script>
<script src="/pages/resources/map/js/jquery-ui/jquery-ui.js"></script>

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
<meta name="viewport" content="initial-scale=1.0">
<meta charset="utf-8">
<%--<style>--%>
    <%--/* Always set the map height explicitly to define the size of the div--%>
     <%--* element that contains the map. */--%>
    <%--#map {--%>
        <%--height: 100%;--%>
    <%--}--%>
    <%--/* Optional: Makes the sample page fill the window. */--%>
    <%--html, body {--%>
        <%--height: 100%;--%>
        <%--margin: 0;--%>
        <%--padding: 0;--%>
    <%--}--%>
<%--</style>--%>


<div id="map" style="width:100%;height:97%"></div>
<%--<div id="marker" title="Marker"></div>--%>
<div id="accordion">
    <h3  >EU-MS Map & Database</h3>
    <div >
        <br/>
        <p>
            Number of Development projects implemented since 2012 is 1,200 projects
        </p>
        <p>
            Number of Humanitarian projects implemented since 2012 is 1,850 projects
        </p>
        <p>
            Number of projects with warning is 376
        </p>
    </div>
    <h3>Donor:</h3>
    <div>
        <p>
            Belgium, Bulgaria, Czech Republic,
        </p>
        <p>
            Denmark, Germany, Estonia,
        </p>
        <p>
            Ireland, Greece, Spain,
        </p>
        <p>
            France, Croatia, Italy,
        </p>
        <p>
            Cyprus, Latvia, Lithuania,
        </p>
        <p>
            Luxembourg,Hungary, Malta,
        </p>
        <p>
            Austria, Portugal,Romania,
        </p>
        <p>Slovenia, Slovakia, Finland,</p>
        <p>Sweden, United Kingdom</p>

    </div>
    <h3>Governorates:</h3>
    <div>

            Hebron<br/>Bethlehem<br/>Jerusalem<br/> Ramallah & Al Bireh<br/> Jericho<br/> Nablus<br/> Tulkarem<br/>
            Jenin<br/> Qalqelya<br/> Tubas<br/> Salfeet

    </div>
    <h3>Sectors </h3>
    <div>
        <h4>Development</h4>
        <ul>
            <li>Governance Reform, Fiscal Consolidation and Policy Reform  +Rule of Law, Justice, Citizen Safety and Human Rights</li>
            <li>Sustainable Service Delivery</li>
            <li>Self-Sufficient Water and Energy Services</li>
            <li>Sustainable Economic Development</li>
            <li>Cross cutting</li>
        </ul>
        <h4>Humanitarian</h4>
        <ul>
            <li>Education, Health, Access to Land, WASH, Protection, Settler Violence, Shelter, Agriculture</li>
        </ul>
    </div>
</div>


<script>
    $( function() {
        var icons = {
            header: "ui-icon-circle-arrow-e",
            activeHeader: "ui-icon-circle-arrow-s"
        };
        $( "#accordion" ).accordion({
            active: false,
            collapsible: true,
            icons: icons
        });
        $( "#toggle" ).button().on( "click", function() {
            if ( $( "#accordion" ).accordion( "option", "icons" ) ) {
                $( "#accordion" ).accordion( "option", "icons", null );
            } else {
                $( "#accordion" ).accordion( "option", "icons", icons );
            }
        });
    } );
</script>