<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/lib/struts-tiles.tld" prefix="tiles" %>

<header >
<div class="row no-padding">
    <div class="col-md-8 branding">
        <div class="logo text-center" >
            <a href="#" title="European Union">
                <img alt="European logo"  src="/pages/resources/images/logo-sm.jpg">
                <br><span>europa.eu</span>
            </a>
        </div>
        <div class="slogan">
            <p class="s1">European Union</p>
            <p class="s2">Area C - Project Monitoring System</p>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true"><i class="fa fa-user"></i> Welcome Jason <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="index.html"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
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

                <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-desktop"></span>   Community Information<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/pmsCommunityList.do">Community</a></li>
                        <li><a href="#">socio- economic data</a></li>
                        <li class="dropdown-submenu ">
                            <a   >Master Plan </a>
                            <ul class="dropdown-menu">
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
                        <li><a href="incidents.html">Incidents </a></li>
                        <li><a href="/pmsPermitList.do">Permit</a></li>
                    </ul>
                </li>
                <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-puzzle-piece"></span>   Incident  <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Incident</a></li>
                        <li><a href="#">Link to project</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-qrcode "></span>  Indicators  <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Indicators</a></li>
                        <li><a href="#">Objectives</a></li>
                        <li><a href="#">Results</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-anchor  "></span>   Reports <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="QReport.html" target="_blank">Quartaliy Report</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" ><span class="glyphicon glyphicon-map-marker"></span>   Maps</a>
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

