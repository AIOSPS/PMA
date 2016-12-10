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
        width		: 100%;
        height		: 500px;
        font-size	: 11px;
    }
</style>
    <script>
        var chart = AmCharts.makeChart("chartdiv", {
            "type": "serial",
            "theme": "light",
            "categoryField": "year",
            "rotate": true,
            "startDuration": 1,
            "categoryAxis": {
                "gridPosition": "start",
                "position": "left"
            },
            "trendLines": [],
            "graphs": [
                {
                    "balloonText": "Income:[[value]]",
                    "fillAlphas": 0.8,
                    "id": "AmGraph-1",
                    "lineAlpha": 0.2,
                    "title": "Income",
                    "type": "column",
                    "valueField": "income"
                }
            ],
            "guides": [],
            "valueAxes": [
                {
                    "id": "ValueAxis-1",
                    "position": "top",
                    "axisAlpha": 0
                }
            ],
            "allLabels": [],
            "balloon": {},
            "titles": [],
            "dataProvider": [
                {
                    "year": 'Energy',
                    "income": 8
                },
                {
                    "year": 'Environment',
                    "income": 3
                },
                {
                    "year": 'Infrastructure',
                    "income": 14.6
                },
                {
                    "year": 'Human Development',
                    "income": 4.5
                },
                {
                    "year": 'Economic Growth',
                    "income": 6.4
                },
                {
                    "year": 'Food and Agriculture',
                    "income": 7.9
                },
                {
                    "year": 'Human rights and Governance',
                    "income": 4.3
                }
            ],
            "export": {
                "enabled": true
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
                EU- investment / Development Sector
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

3D Donut Chart