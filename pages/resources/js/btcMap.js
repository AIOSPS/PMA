/**
 * Created by orayyan on 2/23/2017.
 */
var view =new ol.View({
    center: ol.proj.transform([35, 32], 'EPSG:4326', 'EPSG:3857'),
    zoom: 9,
    'transparent': 'true',
    rotation: 0
});
var map;
function drawBtcMap(p_com_var) {
    var variable = 5000;
    // var p_com_var = 5000;

     map = new ol.Map({
        controls: ol.control.defaults({
            attributionOptions: /** @type {olx.control.AttributionOptions} */ ({
                collapsible: true
            })
        }).extend([
            new ol.control.LayerControl({
                title: "Layers on map",
                draggable: true,
                width: 250,
                mapdivid: 'map',
                mapconstrained: true


            })
        ]),
        layers: [
            new ol.layer.Tile({
                title: "OSM Layer",
                source: new ol.source.OSM(),
                lyrControlOpt: {
                    legendGroup: 'Tile Layers',
                    legendnodeid: 'osmid',
                    legendTitle: "Open Street Map",
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
                    url: 'http://btcweb.ddns.net:8080/geoserver/BTC_GIS/wms',
                    params: {LAYERS: 'BTC_GIS:Area_ABC', 'transparent': 'true', VERSION: '1.1.0'},
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms1',
                    legendTitle: "Area ABC",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),
            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/BTC_GIS/wms',
                    params: {
                        LAYERS: 'BTC_GIS:Areas_Closed_ByTheWall_Once_Completed',
                        'transparent': 'true',
                        VERSION: '1.1.0'
                    },
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms2',
                    legendTitle: "Areas Closed By TheWall Once Completed",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),
            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/BTC_GIS/wms',
                    params: {LAYERS: 'BTC_GIS:Areas_ClosedbyTheWall', 'transparent': 'true', VERSION: '1.1.0'},
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms3',
                    legendTitle: "Areas Closed by The Wall",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),

            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/BTC_GIS/wms',
                    params: {LAYERS: 'BTC_GIS:Annexation_Wall', 'transparent': 'true', VERSION: '1.1.0'},
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms4',
                    legendTitle: "Annexation Wall",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),
            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/BTC_GIS/wms',
                    params: {LAYERS: 'BTC_GIS:Isreali_Outposts', 'transparent': 'true', VERSION: '1.1.0'},
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms5',
                    legendTitle: "Isreali Outposts",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),
            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/BTC_GIS/wms',
                    params: {LAYERS: 'BTC_GIS:Israeli_Colonies_Boundaries', 'transparent': 'true', VERSION: '1.1.0'},
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms6',
                    legendTitle: "Israeli Colonies Boundaries",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),

            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/crs_4281/wms',
                    params: {
                        LAYERS: 'crs_4281:pms_projects_gis_view',
                        'transparent': 'true',
                        VERSION: '1.1.0',
                        viewparams: 'p_sec:' + variable
                    },
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms8',
                    legendTitle: "Projects Locations",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),

            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/crs_4281/wms',
                    params: {
                        LAYERS: 'crs_4281:pms_communities_loc_vw',
                        'transparent': 'true',
                        VERSION: '1.1.0',
                        viewparams: 'p_com:' + p_com_var
                    },
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms9',
                    legendTitle: "Communities",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            }),

            new ol.layer.Tile({
                title: 'Global Imagery',
                source: new ol.source.TileWMS({
                    projection: 'EPSG:4281',
                    url: 'http://btcweb.ddns.net:8080/geoserver/crs_4281/wms',
                    params: {LAYERS: 'crs_4281:pms_incidents_gis_view', 'transparent': 'true', VERSION: '1.1.0'},
                    serverType: 'geoserver'
                }),
                lyrControlOpt: {
                    legendGroup: 'Wms Layers',
                    legendnodeid: 'wms10',
                    legendTitle: "Incidents",
                    legendImgUrl: "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
                }
            })

//                    ,
//
//                    new ol.layer.Tile({
//                        title: 'Global Imagery',
//                        source: new ol.source.TileWMS({
//                            projection: 'EPSG:4281',
//                            url: 'http://localhost:8080/geoserver/BTC/wms',
//                            params: {LAYERS: 'crs_4281:area_abc_new', 'transparent':'true', VERSION: '1.1.0'},
//                            serverType: 'geoserver'
//                        }),
//                        lyrControlOpt : {
//                            legendGroup  : 'Wms Layers',
//                            legendnodeid : 'wms9',
//                            legendTitle  : "BTC:area_abc_new",
//                            legendImgUrl : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQuc6e1CN-FTgOjxnG0YLjQ-vxQ4T9jHXdhimbTHn1NmbXxzDJa"
//                        }
//                    })
        ],
        target: 'map',
        view: view
    });
};
function doCenter(long, lat) {
//35.15624062000000, 31.50144083000000
    var pos = ol.proj.fromLonLat([long, lat]);
    view.animate({
        center: pos,

        zoom: 15
    });


    // community marker
    // var marker = new ol.Overlay({
    //     position: pos,
    //     positioning: 'center-center',
    //     element: document.getElementById('marker'),
    //     stopEvent: false
    // });
    // map.addOverlay(marker);
};