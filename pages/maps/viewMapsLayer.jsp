<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<link rel="stylesheet" href="/pages/resources/css/ol.css" type="text/css">

<script src="/pages/resources/js/loader.js" type="text/javascript"></script>

<link rel="stylesheet" href="https://openlayers.org/en/v3.20.0/css/ol.css" type="text/css">
<!-- The line below is only needed for old environments like Internet Explorer and Android 4.x -->
<script src="https://cdn.polyfill.io/v2/polyfill.min.js?features=requestAnimationFrame,Element.prototype.classList,URL"></script>
<script src="https://openlayers.org/en/v3.20.0/build/ol.js"></script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Maps
        </a><span class=""> > </span><span>View Maps Layer</span></nav>
    </div>
</div>



<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="form-group row">
                <div class="col-md-12">
                    <h1>View Maps Layers</h1>
                </div>
                <div class="col-md-12 ">
                    <div id="map" class="map"></div>
                    <div id="info">&nbsp;</div>
                    <script>
                        var style = new ol.style.Style({
                            fill: new ol.style.Fill({
                                color: 'rgba(255, 255, 255, 0.6)'
                            }),
                            stroke: new ol.style.Stroke({
                                color: '#319FD3',
                                width: 1
                            }),
                            text: new ol.style.Text({
                                font: '12px Calibri,sans-serif',
                                fill: new ol.style.Fill({
                                    color: '#000'
                                }),
                                stroke: new ol.style.Stroke({
                                    color: '#fff',
                                    width: 3
                                })
                            })
                        });
//
//                        var vectorLayer = new ol.layer.Vector({
//                            source: new ol.source.Vector({
//                                url: 'https://openlayers.org/en/v3.20.0/examples/data/geojson/countries.geojson',
//                                format: new ol.format.GeoJSON()
//                            }),
//                            style: function(feature, resolution) {
//                                style.getText().setText(resolution < 5000 ? feature.get('name') : '');
//                                return style;
//                            }
//                        });
//--------------------------------------------
                     //   http://localhost:8080/geoserver/crs_4281/ows?service=WFS&version=1.0.0&
                            // request=GetFeature&typeName=crs_4281:Area_ABC_09_4281&maxFeatures=50&
                        // outputFormat=text%2Fjavascript
                        var map;

                        var map = new ol.Map({
                            target: 'map',
                            renderer: ol.RendererHint.CANVAS,
                            view: new ol.View2D({
                                center: ol.proj.transform([16.37, 48.21], 'EPSG:4326', 'EPSG:3857'),
                                zoom: 11
                            }),
                            layers: [
                                new ol.layer.Tile({
                                    source: new ol.source.MapQuestOpenAerial()
                                }),
                                new ol.layer.Vector({
                                    source: new ol.source.Vector({
                                        url: 'http://ginyu.at:8080/geoserver/wienbike/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=wienbike%3Ainput2&maxfeatures=50&outputformat=json',
                                        parser: new ol.parser.GeoJSON()
                                    })
                                })
                            ]
                        });
//--------------------------------------------

                        var map = new ol.Map({
                            layers: [
                                new ol.layer.Tile({
                                    source: new ol.source.OSM()
                                }),
                                vectorLayer
                            ],
                            target: 'map',
                            view: new ol.View({
                                center: [0, 0],
                                zoom: 1
                            })
                        });

                        var highlightStyleCache = {};

                        var featureOverlay = new ol.layer.Vector({
                            source: new ol.source.Vector(),
                            map: map,
                            style: function(feature, resolution) {
                                var text = resolution < 5000 ? feature.get('name') : '';
                                if (!highlightStyleCache[text]) {
                                    highlightStyleCache[text] = new ol.style.Style({
                                        stroke: new ol.style.Stroke({
                                            color: '#f00',
                                            width: 1
                                        }),
                                        fill: new ol.style.Fill({
                                            color: 'rgba(255,0,0,0.1)'
                                        }),
                                        text: new ol.style.Text({
                                            font: '12px Calibri,sans-serif',
                                            text: text,
                                            fill: new ol.style.Fill({
                                                color: '#000'
                                            }),
                                            stroke: new ol.style.Stroke({
                                                color: '#f00',
                                                width: 3
                                            })
                                        })
                                    });
                                }
                                return highlightStyleCache[text];
                            }
                        });

                        var highlight;
                        var displayFeatureInfo = function(pixel) {

                            var feature = map.forEachFeatureAtPixel(pixel, function(feature) {
                                return feature;
                            });

                            var info = document.getElementById('info');
                            if (feature) {
                                info.innerHTML = feature.getId() + ': ' + feature.get('name');
                            } else {
                                info.innerHTML = '&nbsp;';
                            }

                            if (feature !== highlight) {
                                if (highlight) {
                                    featureOverlay.getSource().removeFeature(highlight);
                                }
                                if (feature) {
                                    featureOverlay.getSource().addFeature(feature);
                                }
                                highlight = feature;
                            }

                        };

                        map.on('pointermove', function(evt) {
                            if (evt.dragging) {
                                return;
                            }
                            var pixel = map.getEventPixel(evt.originalEvent);
                            displayFeatureInfo(pixel);
                        });

                        map.on('click', function(evt) {
                            displayFeatureInfo(evt.pixel);
                        });
                    </script>
                </div>
            </div>
        </div>

    </div>
</article>

