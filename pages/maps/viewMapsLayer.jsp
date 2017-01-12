<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

    <link rel="stylesheet" type="text/css" href="https://extjs.cachefly.net/ext/gpl/5.1.0/packages/ext-theme-classic/build/resources/ext-theme-classic-all-debug.css"/>
    <link rel="stylesheet" type="text/css" href="http://openlayers.org/en/v3.11.2/css/ol.css"/>
    <link rel="stylesheet" type="text/css" href="/pages/resources/css/LayerControl.css"/>



    <script type="text/javascript" src="http://cdn.sencha.com/ext/gpl/5.1.0/build/ext-all-debug.js" ></script>
    <script type="text/javascript" src="http://openlayers.org/en/v3.11.2/build/ol-debug.js" ></script>
    <script type="text/javascript" src="/pages/resources/js/LayerControl.js" ></script>
    <script type="text/javascript" src="/pages/resources/js/LayerControlLang.js" ></script>

    <script type="text/javascript">
        Ext.onReady(function() {
            var variable = 5000;
            var map = new ol.Map({
                controls: ol.control.defaults({
                    attributionOptions: /** @type {olx.control.AttributionOptions} */ ({
                        collapsible: true
                    })
                }).extend([
                    new ol.control.LayerControl({
                        title          : "Layers on map",
                        draggable      : true,
                        width          : 250,
                        mapdivid       : 'map',
                        mapconstrained : true ,
                        lang           : 'en'
                    })
                ]),
                layers: [
                    new ol.layer.Tile({
                        title:"OSM Layer",
                        source: new ol.source.OSM(),
                        lyrControlOpt : {
                            legendGroup : 'Tile Layers',
                            legendnodeid: 'osmid',
                            legendTitle : "Open Street Map",
                            legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),
                    /*  new ol.layer.Tile({
                     source: new ol.source.BingMaps({
                     key: 'Ak-dzM4wZjSqTlzveKz5u0d4IQ4bRzVI309GxmkgSVr1ewS6iPSrOvOKhA-CJlm3',
                     imagerySet: 'Aerial'
                     }),
                     title:'Bing Layer',
                     lyrControlOpt : {
                     legendGroup : 'Tile Layers',
                     legendnodeid: 'bingid',
                     legendTitle : "Bing Layer",
                     legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                     }
                     }),
                     new ol.layer.Tile({
                     source: new ol.source.MapQuest({layer: 'osm'}),
                     lyrControlOpt : {
                     legendGroup  : 'Tile Layers',
                     legendnodeid : 'mqosmid',
                     legendTitle  : "MapQuest Open Street Map",
                     legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                     }
                     }),
                     new ol.layer.Image({
                     //  extent: [-13884991, 2870341, -7455066, 6338219],
                     source: new ol.source.ImageWMS({
                     url: 'http://suite.opengeo.org/geoserver/wms',
                     params: {'LAYERS': 'opengeo:countries'},
                     serverType: 'geoserver'
                     }),
                     lyrControlOpt : {
                     legendGroup  : 'Wms Layers',
                     legendnodeid : 'wms1',
                     legendTitle  : "opengeo:countries",
                     legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                     }
                     }),
                     new ol.layer.Tile({
                     extent: [-13884991, 2870341, -7455066, 6338219],
                     source: new ol.source.TileWMS({
                     url: 'http://suite.opengeo.org/geoserver/wms',
                     params: {'LAYERS': 'usa:states', 'TILED': true},
                     serverType: 'geoserver'
                     }),
                     lyrControlOpt : {
                     legendGroup  : 'Wms Layers',
                     legendnodeid : 'wms2',
                     legendTitle  : "usa:states",
                     legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                     }
                     }), */
                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC_GIS/wms',
                            params: {LAYERS: 'BTC_GIS:Area_ABC', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms1',
                            legendTitle  : "BTC_GIS:Area_ABC",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    })	,
                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC_GIS/wms',
                            params: {LAYERS: 'BTC_GIS:Areas_Closed_ByTheWall_Once_Completed', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms2',
                            legendTitle  : "BTC_GIS:Areas_Closed_ByTheWall_Once_Completed",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),
                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC_GIS/wms',
                            params: {LAYERS: 'BTC_GIS:Areas_ClosedbyTheWall', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms3',
                            legendTitle  : "BTC_GIS:Areas_ClosedbyTheWall",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),

                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC_GIS/wms',
                            params: {LAYERS: 'BTC_GIS:Annexation_Wall', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms4',
                            legendTitle  : "BTC_GIS:Annexation_Wall",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),
                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC_GIS/wms',
                            params: {LAYERS: 'BTC_GIS:Isreali_Outposts', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms5',
                            legendTitle  : "BTC_GIS:Isreali_Outposts",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),
                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC_GIS/wms',
                            params: {LAYERS: 'BTC_GIS:Israeli_Colonies_Boundaries', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms6',
                            legendTitle  : "Israeli Colonies Boundaries",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),

                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/crs_4281/wms',
                            params: {LAYERS: 'crs_4281:pms_projects_gis_view', 'transparent':'true', VERSION: '1.1.0', viewparams:'p_sec:' + variable},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms8',
                            legendTitle  : "Projects Locations",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    }),

                    new ol.layer.Tile({
                        title: 'Global Imagery',
                        source: new ol.source.TileWMS({
                            projection: 'EPSG:4281',
                            url: 'http://localhost:8080/geoserver/BTC/wms',
                            params: {LAYERS: 'crs_4281:area_abc_new', 'transparent':'true', VERSION: '1.1.0'},
                            serverType: 'geoserver'
                        }),
                        lyrControlOpt : {
                            legendGroup  : 'Wms Layers',
                            legendnodeid : 'wms9',
                            legendTitle  : "BTC:area_abc_new",
                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                        }
                    })
                ],
                target: 'map',
                view: new ol.View({
                    center: ol.proj.transform([35, 32], 'EPSG:4326', 'EPSG:3857'),
                    zoom: 8,
                    'transparent':'true',
                    rotation: 0
                })
            });
        });
    </script>
    <title></title>


<div id="map" style="width:100%;height:97%"></div>


