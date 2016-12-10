<%--
  Created by IntelliJ IDEA.
  User: alisa_000
  Date: 11/24/2016
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<head>
    <title>Report</title>
    <link rel="stylesheet" type="text/css" href="/pages/resources/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" language="javascript" src="/pages/resources/jsReport/amcharts.js"></script>
    <script type="text/javascript" language="javascript" src="/pages/resources/jsReport/pie.js"></script>
<style>
    #chartdiv {
        width: 100%;
        height: 500px;
    }
</style>
    <script>
        var chart = AmCharts.makeChart( "chartdiv", {
            "type": "pie",
            "theme": "light",
            "titles": [ {
                "text": "Visitors countries",
                "size": 16
            } ],
            "dataProvider": [ {
                "country": "Human rights and Governance",
                "visits": 2.3
            }, {
                "country": "Food and Agriculture",
                "visits": 4.1
            }, {
                "country": "Economic Growth",
                "visits": 1.2
            }, {
                "country": "Human Development",
                "visits": 1.4
            }, {
                "country": "Infrastructure",
                "visits": 3
            }, {
                "country": "Environment",
                "visits": .6
            }, {
                "country": "Energy",
                "visits": 1.7
            } ],
            "valueField": "visits",
            "titleField": "country",
            "startEffect": "elastic",
            "startDuration": 2,
            "labelRadius": 15,
            "innerRadius": "50%",
            "depth3D": 10,
            "balloonText": "[[title]]<br><span style='font-size:14px'><b>[[value]]</b> ([[percents]]%)</span>",
            "angle": 15,
            "export": {
                "enabled": true
            }
        } );
    </script>
</head>
<body>
<br/>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                Number of Development projects / Development Sectors
            </div>

            <div class="panel-body" align="center">
                <div id="chartdiv"></div>
            </div>
        </div>
    </div>
    <div class="col-md-2 col-sm-2">&nbsp;</div>
</div>


</body>
</html>
