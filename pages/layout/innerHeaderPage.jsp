<%@ page import="eu.pms.login.database.SecUser" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/lib/struts-tiles.tld" prefix="tiles" %>

<header >
<div class="row no-padding">
    <div class="col-md-8 branding">
        <div class="logo text-center" >
            <a href="#" title="European Union">
                <img alt="European logo"  src="/pages/resources/images/logo-sm.jpg">
                <%--<br><span>europa.eu</span>--%>
            </a>
        </div>
        <div class="slogan">
            <p class="s1">European Union</p>
            <p class="s2">Area C - Monitoring System</p>
        </div>
    </div>
    <div class="col-md-4 text-right">
    </div>
</div>

</header>
<div class="content-wrapper">
    <nav class="navbar notifications-bar " role="navigation">
        <div class="container clearfix">
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true"><i class="fa fa-user"></i> Welcome <%=((SecUser)request.getSession().getAttribute("userInfo")).getUsrName()%> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="/viewLookupsAction.do"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="/logout.do"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>


        </div>
</nav>
</div>
<nav class="navbar navbar-default dashboardMnu">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-main-menu" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbar-main-menu">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/home.do"><span class="glyphicon glyphicon-home"></span> Home <span class="sr-only">(current)</span></a></li>

                <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-desktop"></span>   Community Information  <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/pmsCommunityList.do">Community</a></li>
                        <li class="dropdown-submenu ">
                            <a>Socio-economic Data</a>
                            <ul class="dropdown-menu">
                                <li><a href="/pmsEconomicSocioList.do">Basic socio</a></li>
                                <li><a href="/pmsAgricultureSocioList.do">Agriculture</a></li>
                                <li><a href="/pmsWaterSocioList.do">Water</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu ">
                            <a>Master Plan Data </a>
                            <ul class="dropdown-menu">
                                <li><a href="/pmsMasterPlanList.do">Master Plan Info</a></li>
                                <li><a href="/pmsInterventionList.do">Interventions</a></li>
                                <li><a href="/pmsActivityList.do">Activities</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-star  "></span>   Project Information <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/pmsProjectList.do">Projects</a></li>
                        <li><a href="/pmsBenificiaryList.do">Benificaries</a></li>
                        <li><a href="/pmsIncidentByProjectList.do">Incidents </a></li>
                        <li><a href="/pmsPermitList.do">Permit</a></li>
                    </ul>
                </li>
                <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-puzzle-piece"></span>   Threat  <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/pmsWarningList.do">Warning</a></li>
                        <li><a href="/pmsIncidentList.do">Incident</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-qrcode "></span>  Indicators  <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <%--<li><a href="/pmsObjectiveList.do">Objectives</a></li>--%>
                        <%--<li><a href="/pmsResultList.do">Results</a></li>--%>
                        <li><a href="/pmsIndicatorList.do">Indicators</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-anchor"></span>   Reports   <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/viewDynamicReport.do">Ad-Hoc Report</a></li>
                        <li class="dropdown-submenu ">
                            <a>Pre-defined Reports </a>
                            <ul class="dropdown-menu">
                                <li><a href="/pages/resources/docs/REPORT1.pdf" target="_blank">Report1</a></li>
                                <li><a href="/pages/resources/docs/REPORT2.pdf" target="_blank">Report2</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-anchor  "></span> Maps <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <%--<li><a href="/viewMaps.do"> Maps </a></li>--%>
                        <li><a href="/viewMapsLayer.do"> Map</a></li>
                    </ul>
                </li>

            </ul>
            <!--	 <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-cog  "></span>  <span class="caret"></span></a>
                      <ul class="dropdown-menu">
                        <li><a href="#">Link 1</a></li>
                        <li><a href="#">Link 2</a></li>
                        <li><a href="#">Link 3</a></li>
                      </ul>
                    </li>
                    </ul>
                --!>


            </div><!-- /.navbar-collapse -->
        <%--</div><!-- /.container-fluid -->--%>
</nav>
<%--<nav class="navbar navbar-default dashboardMnu">--%>
    <%--<div class="container">--%>
        <%--<!-- Brand and toggle get grouped for better mobile display -->--%>
        <%--<div class="navbar-header">--%>
            <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-main-menu" aria-expanded="false">--%>
                <%--<span class="sr-only">Toggle navigation</span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
            <%--</button>--%>
        <%--</div>--%>

        <%--<!-- Collect the nav links, forms, and other content for toggling -->--%>
        <%--<div class="collapse navbar-collapse" id="navbar-main-menu">--%>
            <%--<ul class="nav navbar-nav">--%>
                <%--<li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Home <span class="sr-only">(current)</span></a></li>--%>
                <%--<li><a href="#"><span class="glyphicon glyphicon-dashboard"></span>   Dashboard <span class="sr-only"></span></a> </li>--%>
                <%--<li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-puzzle-piece"></span>   Planning <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Link 1</a></li>--%>
                        <%--<li><a href="#">Link 2</a></li>--%>
                        <%--<li><a href="#">Link 3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-star  "></span>   Project Information <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="form.html">Create a New Project</a></li>--%>
                        <%--<li><a href="#">Link 2</a></li>--%>
                        <%--<li><a href="#">Link 3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-qrcode "></span>  Community Profile <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Link 1</a></li>--%>
                        <%--<li><a href="#">Link 2</a></li>--%>
                        <%--<li><a href="#">Link 3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-anchor  "></span>   Reporting<span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Link 1</a></li>--%>
                        <%--<li><a href="#">Link 2</a></li>--%>
                        <%--<li><a href="#">Link 3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-map-marker"></span>   Maps<span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Link 1</a></li>--%>
                        <%--<li><a href="#">Link 2</a></li>--%>
                        <%--<li><a href="#">Link 3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>

            <%--</ul>--%>
            <%--<ul class="nav navbar-nav navbar-right">--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-cog  "></span>  <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Link 1</a></li>--%>
                        <%--<li><a href="#">Link 2</a></li>--%>
                        <%--<li><a href="#">Link 3</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
            <%--</ul>--%>



        <%--</div><!-- /.navbar-collapse -->--%>
    <%--</div><!-- /.container-fluid -->--%>
<%--</nav>--%>

