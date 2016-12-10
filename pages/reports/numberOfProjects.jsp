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
    <script type="text/javascript" language="javascript" src="/pages/resources/jsReport/serial.js"></script>
<style>
    #chartdiv {
        width: 100%;
        height: 500px;
    }
</style>
    <script>
        var chart = AmCharts.makeChart("chartdiv", {
            "type": "serial",
            "theme": "light",
            "legend": {
                "useGraphSettings": true
            },
            "dataProvider": [{
                "year": 'Belguim',
                "italy": 2,
                "germany": 2.4,
                "uk": 4.3
            }, {
                "year": 'France',
                "italy": 2,
                "germany": 4.4,
                "uk": 2.5
            }, {
                "year": 'Sweeden',
                "italy": 3,
                "germany": 1.8,
                "uk": 3.5
            }, {
                "year": 'Spain',
                "italy": 5,
                "germany": 2.8,
                "uk": 4.5
            }],
            "valueAxes": [{
                "integersOnly": true,
                "maximum": 6,
                "minimum": 1,
                "reversed": true,
                "axisAlpha": 0,
                "dashLength": 5,
                "gridCount": 10,
                "position": "left",
                "title": "Place taken"
            }],
            "startDuration": 0.5,
            "graphs": [{
                "balloonText": "place taken by Italy in [[category]]: [[value]]",
                "bullet": "round",
//                "hidden": true,
                "title": "Italy",
                "valueField": "italy",
                "fillAlphas": 0
            }, {
                "balloonText": "place taken by Germany in [[category]]: [[value]]",
                "bullet": "round",
                "title": "Germany",
                "valueField": "germany",
                "fillAlphas": 0
            }, {
                "balloonText": "place taken by UK in [[category]]: [[value]]",
                "bullet": "round",
                "title": "United Kingdom",
                "valueField": "uk",
                "fillAlphas": 0
            }],
            "chartCursor": {
                "cursorAlpha": 0,
                "zoomable": false
            },
            "categoryField": "year",
            "categoryAxis": {
                "gridPosition": "start",
                "axisAlpha": 0,
                "fillAlpha": 0.05,
                "fillColor": "#000000",
                "gridAlpha": 0,
                "position": "top"
            },
            "export": {
                "enabled": true,
                "position": "bottom-right"
            }
        });

    </script>
</head>
<body>
<br/>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                Number of Projects Demolished/ EUMS
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
