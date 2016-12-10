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
    <%--<script type="text/javascript" language="javascript" src="/pages/resources/js/export.min.js"></script>--%>
    <%--<link rel="stylesheet" type="text/css" href="/pages/resources/css/export.css"/>--%>
<style>
    #chartdiv {
        width		: 80%;
        height		: 200px;
        font-size	: 11px;
    }
    #chartdiv1 {
        width		: 80%;
        height		: 200px;
        font-size	: 11px;
    }
</style>
    <script>
        var chart = AmCharts.makeChart( "chartdiv", {
            "type": "serial",
            "theme": "light",
            "dataProvider": [ {
                "country": "2013 (monthly av)",
                "visits": 55
            }, {
                "country": "2014(monthly av)",
                "visits": 51
            }, {
                "country": "2015 (monthly av)",
                "visits": 46
            }, {
                "country": "2016 (monthly av)",
                "visits": 99
            }, {
                "country": "Oct-16",
                "visits": 96
            } ],
            "valueAxes": [ {
                "gridColor": "#000",
                "gridAlpha": 0.2,
                "dashLength": 0
            } ],
            "gridAboveGraphs": true,
            "startDuration": 2,
            "graphs": [ {
                "balloonText": "[[category]]: <b>[[value]]</b>",
                "fillAlphas": 0.8,
                "lineAlpha": 0.2,
                "type": "column",
                "valueField": "visits"
            } ],
            "chartCursor": {
                "categoryBalloonEnabled": false,
                "cursorAlpha": 0,
                "zoomable": false
            },
            "categoryField": "country",
            "categoryAxis": {
                "gridPosition": "start",
                "gridAlpha": 0,
                "tickPosition": "start",
                "tickLength": 20
            },
            "export": {
                "enabled": true
            }

        } );
        var chart1 = AmCharts.makeChart( "chartdiv1", {
            "type": "serial",
            "theme": "light",
            "dataProvider": [ {
                "country": "2013 (monthly av)",
                "visits": 92
            }, {
                "country": "2014(monthly av)",
                "visits": 103
            }, {
                "country": "2015 (monthly av)",
                "visits": 66
            }, {
                "country": "2016 (monthly av)",
                "visits": 149
            }, {
                "country": "Oct-16",
                "visits": 156
            } ],
            "valueAxes": [ {
                "gridColor": "#000",
                "gridAlpha": 0.2,
                "dashLength": 0
            } ],
            "gridAboveGraphs": true,
            "startDuration": 2,
            "graphs": [ {
                "balloonText": "[[category]]: <b>[[value]]</b>",
                "fillAlphas": 0.8,
                "lineAlpha": 0.2,
                "type": "column",
                "valueField": "visits"
            } ],
            "chartCursor": {
                "categoryBalloonEnabled": false,
                "cursorAlpha": 0,
                "zoomable": false
            },
            "categoryField": "country",
            "categoryAxis": {
                "gridPosition": "start",
                "gridAlpha": 0,
                "tickPosition": "start",
                "tickLength": 20
            },
            "export": {
                "enabled": true
            }

        } );
    </script>
</head>
<body>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div style="width: 100%; height: 20px; border-bottom: 1px solid black; text-align: right">
  <span style="font-size: 16px; padding: 0 0px;">
    WEST BANK DEMOLITIONS AND DISPLACED
  </span>
        </div>
    </div>
    <div class="col-md-2 col-sm-2">&nbsp;</div>
</div>
<br/><br/>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">
ANNEX : WEST BANK DEMOLITIONS/CONFISCATIONS - October 2016
            </div>

            <div class="panel-body" align="center">
                <table class="table table-responsive">
                    <thead>
                    <tr>
                        <td style="border: 0;"></td>
                        <td class="text-center"style="border: 0;">Structures</td>
                        <td class="text-center" colspan="2">People displaced*</td>
                        <td class="text-center" colspan="2">People affected**</td>
                    </tr>
                    <tr>
                        <td style="border: 0;"></td>
                        <td class="text-center"style="border: 0;">targeted</td>
                        <td class="text-center">All</td>
                        <td class="text-center">Children</td>
                        <td class="text-center">All</td>
                        <td class="text-center">Children</td>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>East Jerusalem</td>
                        <td class="text-center">5</td>
                        <td class="text-center">44</td>
                        <td class="text-center">26</td>
                        <td class="text-center">2</td>
                        <td class="text-center">--</td>
                    </tr>
                    <tr>
                        <td>Area B</td>
                        <td class="text-center">3</td>
                        <td class="text-center">8</td>
                        <td class="text-center">5</td>
                        <td class="text-center">14</td>
                        <td class="text-center">7</td>
                    </tr>
                    <tr>
                        <td>Area C</td>
                        <td class="text-center">88</td>
                        <td class="text-center">104</td>
                        <td class="text-center">45</td>
                        <td class="text-center">146</td>
                        <td class="text-center">80</td>
                    </tr>
                    <tr>
                        <td>Total</td>
                        <td class="text-center">96</td>
                        <td class="text-center">156</td>
                        <td class="text-center">76</td>
                        <td class="text-center">162</td>
                        <td class="text-center">87</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="col-md-2 col-sm-2">&nbsp;</div>
</div>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                Structures demolished in the West Bank (Monthly average)
            </div>

            <div class="panel-body" align="center">
                <div id="chartdiv"></div>
            </div>
        </div>
    </div>
    <div class="col-md-2 col-sm-2">&nbsp;</div>
</div>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                People displaced in the West Bank (Monthly average)
            </div>

            <div class="panel-body" align="center">
                <div id="chartdiv1"></div>
            </div>
        </div>
    </div>
    <div class="col-md-2 col-sm-2">&nbsp;</div>
</div>


</body>
</html>
