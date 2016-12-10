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
        font-size: 11px;
    }

    .amcharts-pie-slice {
        transform: scale(1);
        transform-origin: 50% 50%;
        transition-duration: 0.3s;
        transition: all .3s ease-out;
        -webkit-transition: all .3s ease-out;
        -moz-transition: all .3s ease-out;
        -o-transition: all .3s ease-out;
        cursor: pointer;
        box-shadow: 0 0 30px 0 #000;
    }

    .amcharts-pie-slice:hover {
        transform: scale(1.1);
        filter: url(#shadow);
    }
</style>
    <script>
        var chart = AmCharts.makeChart("chartdiv", {
            "type": "pie",
            "startDuration": 0,
            "theme": "light",
            "addClassNames": true,
            "legend":{
                "position":"right",
                "marginRight":100,
                "autoMargins":false
            },
            "innerRadius": "30%",
            "defs": {
                "filter": [{
                    "id": "shadow",
                    "width": "200%",
                    "height": "200%",
                    "feOffset": {
                        "result": "offOut",
                        "in": "SourceAlpha",
                        "dx": 0,
                        "dy": 0
                    },
                    "feGaussianBlur": {
                        "result": "blurOut",
                        "in": "offOut",
                        "stdDeviation": 5
                    },
                    "feBlend": {
                        "in": "SourceGraphic",
                        "in2": "blurOut",
                        "mode": "normal"
                    }
                }]
            },
            "dataProvider": [{
                "country": "Women",
                "litres": 438
            }, {
                "country": "Youth",
                "litres": 789
            }, {
                "country": "Kids",
                "litres": 264
            }, {
                "country": "Disabilities",
                "litres": 123
            }],
            "valueField": "litres",
            "titleField": "country",
            "export": {
                "enabled": true
            }
        });

        chart.addListener("init", handleInit);

        chart.addListener("rollOverSlice", function(e) {
            handleRollOver(e);
        });

        function handleInit(){
            chart.legend.addListener("rollOverItem", handleRollOver);
        }

        function handleRollOver(e){
            var wedge = e.dataItem.wedge.node;
            wedge.parentNode.appendChild(wedge);
        }
    </script>
</head>
<body>
<br/>
<div class="row">
    <div class="col-md-2 col-sm-2">&nbsp;</div>
    <div class="col-md-8 col-sm-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                Beneficiaries from EU/EUMS Investments on Area C
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