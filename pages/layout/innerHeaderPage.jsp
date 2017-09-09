<%@ page import="eu.pms.login.database.SecUser" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/lib/struts-tiles.tld" prefix="tiles" %>

        <header>
            <div class="row no-padding">
                <div class="container branding  pdL0">
                    <div class="col-md-4 logo pdL0">
                        <a href="#" title="European Union">
                            <img class="pull-left" alt="European logo" src="/pages/resources/images/logo-btc-lgn.jpg">
                            <p class="pull-left">Belgain <br>Development Agency</p>
                        </a>
                    </div>
                    <div class="slogan col-md-8  text-center">
                        <p class="s2">Programmes Monitoring Application</p>
                    </div>
                </div>
            </div>
        </header>

        <nav class="navbar navbar-default dashboardMnu container">
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
                    <ul class="nav navbar-nav container" style="
    /* width: 100%; */
">
                        <li class="active"><a href="/home.do"><span class="glyphicon glyphicon-home"></span> Home <span class="sr-only">(current)</span></a></li>

                        <li class=""><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-desktop"></span>   Programme Management  <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/pmaProgrammeList.do">Programme Information</a></li>
                                <li><a href="/pmaSpecObjectiveList.do">Specific Objective</a></li>
                                <li><a href="/pmaResultList.do">Output/Results</a></li>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-star  "></span>   Program Implementation <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/pmaActivityList.do">programme Activities</a></li>
                            </ul>
                        </li>
                        <li class=""><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="fa fa-puzzle-piece"></span>   M&amp;E  <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/pmaIndicatorList.do">Programme Indicators</a></li>
                                <li><a href="#">Programme Reports</a></li>
                            </ul>
                        </li>
                        <li class="dropdown pull-right">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-user"></i> Welcome <%=((SecUser)request.getSession().getAttribute("userInfo")).getUsrName()%> <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="/logout.do"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->

            </div>
        </nav>





