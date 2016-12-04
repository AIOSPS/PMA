<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
<html>
<title>جامعة القدس المفتوحة</title>

<META NAME="Description" CONTENT=" Home : Al-Quds Open University : Palestine, is the first open & distance education
university in the Arab World. It is established to overcome the Israeli closure of Palestinian
territories by reading it is student at their places">

<META name="keywords" content="Al-Quds Open University, palestine, open university, arabian universities, eLearning, qou, qou Portal, open education, universities of palestine, precourse, ecourse, eactivities, etraining, elluminate, Open and Distance Learning, distance education, portal, academic portal, AdminPortal, alumni, horde, blended learning, openconf, survey, video library">

<HEAD>
    <META http-equiv=Content-Type content="text/html; charset=UTF-8">
    <META content="MSHTML 6.00.2600.0" name=GENERATOR>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=9" />
    <%-- bootstrap ---------------------------------------  --%>
    <link rel="stylesheet" type="text/css" href="/pages/resources/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/pages/resources/bootstrap/css/bootstrap-rtl.css"/>
    <%-- ajaxMethods file must before jQuery File--%>
    <script type="text/javascript" language="javascript" src="/pages/resources/js/ajaxMethods.js" ></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/jquery.1.11.1.min.js"></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/dataTables.bootstrap.js"></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/jquery.bootstrap.newsbox.min.js"></script>
    <%--datepicker ---------------------------------------  --%>
    <link rel="stylesheet" type="text/css" href="/pages/resources/bootstrap/css/bootstrap-datepicker.css">
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/bootstrap-datepicker.js"></script>
    <%-- qou  --------------------------------------------  --%>
    <link rel="stylesheet" type="text/css" href="/pages/resources/bootstrap/css/pmsNewStyle.css">
    <script type="text/javascript" language="javascript" src="/pages/resources/bootstrap/js/commonsQou.js"></script>
    <%-- menu --------------------------------------------  --%>
    <link rel="stylesheet" type="text/css" href="/pages/resources/menu/css/sidemenu.css">
    <script type="text/javascript" language="javascript" src="/pages/resources/menu/js/SideMenu.js" ></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/menu/js/tapclick.js" ></script>


</HEAD>

</head>

<body topMargin="0" >
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
        <div class="col-sm-12 col-md-12" >
            <jsp:include page="/pages/portalHeader.jsp" flush="true" />
        </div>
    </div>

    <div class="row">
        <br/>
        <div class="col-sm-1 col-md-1" ></div>
        <div class="col-sm-10 col-md-10" >
        <div class="panel-default  panelPadding">
            <div class="panel-body alert alert-danger">
                <br/><br/>
                <div class="row">
                    <div class="col-sm-1 col-md-1"></div>
                    <div class="col-sm-6 col-md-6 text-right">
                        <br/>
                            <p><h4><font color="red">نأسف,الصفحة المطلوبة غير موجودة.</font></h4>
                            <br>إذا كان لديك أي سؤال حول هذا الموضوع ، الرجاء الاتصال بمنسق النظام
                            <br>أو استخدام <a href=mailto:portal@qou.edu> portal@qou.edu </a> لإرسال بريد الإلكتروني.</p>

                        <br/><br/>  <br/><br/>
                    </div>
                    <div class="col-sm-4 col-md-4 text-center">
                        <img class="img-responsive center-block" src="/pages/resources/images/404Error.png">
                    </div>
                    <div class="col-sm-1 col-md-1"></div>
                </div>
            </div>
         </div>
        </div>

            <div class="col-sm-1 col-md-1" ></div>
     </div>
    <div id="ftr" class="row">
        <div class="col-sm-12 col-md-12">
                <jsp:include page="portalFooter.jsp" flush="true" />
        </div>
    </div>
</div>


</body>
</html>

