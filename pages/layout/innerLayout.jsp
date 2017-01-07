<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/WEB-INF/lib/struts-tiles.tld" prefix="tiles" %>
<%
    response.setHeader("pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Expires", "0");
%>

<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="European Union Tracking System">
    <meta name="keywords" content="European, Union, Tracking, System">
    <meta name="author" content="European Union">

    <title>Project Monitoring System</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="/pages/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/pages/resources/fonts/awesome/css/font-awesome.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/pages/resources/js/jquery.min.js"></script>

    <!-- Latest compiled and minified JavaScript -->
    <script src="/pages/resources/bootstrap/js/bootstrap.min.js"></script>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet"
          href="/pages/resources/bootstrap/select/bootstrap-select.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="/pages/resources/bootstrap/select/bootstrap-select.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/pages/resources/bootstrap/dataTable/datatables.min.css"/>

    <script type="text/javascript" src="/pages/resources/bootstrap/dataTable/datatables.min.js"></script>

    <!-- additional scripts -->
    <script src="/pages/resources/js/script.js"></script>

    <!-- additional css -->
    <link rel="stylesheet" href="/pages/resources/css/style.css">

    <script src="/pages/resources/js/moment.js" ></script>


    <script src="/pages/resources/bootstrap/dateTimePicker/bootstrap-datetimepicker.min.js" ></script>
    <link rel="stylesheet" href="/pages/resources/bootstrap/dateTimePicker/bootstrap-datetimepicker.min.css">

    <script src="/pages/resources/bootstrap/fileInput/fileinput.min.js" ></script>
    <link rel="stylesheet" href="/pages/resources/bootstrap/fileInput/fileinput.min.css">

    <style>
        .dropdown-menu.open  {
            position: relative;
            top:0px;
        }
    </style>

</head>

<BODY topmargin="0">
<script>
    $(document).ready(function () {

        $(function () {
            if ($('#ftr').hasScrollBar())
                $("#ftr").removeClass("navbar-fixed-bottom")
            else
                $("#ftr").addClass("navbar-fixed-bottom")
        });
        (function ($) {
            $.fn.hasScrollBar = function () {
                var db = document.body;
                var dde = document.documentElement;
                var docHeight = Math.max(db.scrollHeight, dde.scrollHeight, db.offsetHeight, dde.offsetHeight, db.clientHeight, dde.clientHeight)
                return (docHeight !== document.documentElement.clientHeight);
            }
        })(jQuery);

    });

</script>

<div id="main" class="container-fluid">
    <div class="row">
        <div class="col-sm-12 col-md-12 no-padding-right no-padding-left">
            <tiles:get name="header"/>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12 col-md-12 no-padding-right no-padding-left">
            <div class="text-right label-title" align="right">
                <tiles:getAsString name="subtitle"/>
            </div>
            <div>
                <tiles:get name="body"/>
            </div>
        </div>
    </div>
    <div id="ftr" class="row">
        <div class="col-sm-12 col-md-12">
            <tiles:get name="footer"/>
        </div>
    </div>
</div>

</BODY>
</HTML>
