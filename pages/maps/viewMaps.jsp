<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<link rel="stylesheet" href="/pages/resources/css/ol.css" type="text/css">

<style>
    #map {
        width: 100%;
        height: 100%;
        padding: 0;
        margin: 0;
    }

</style>
<%--<script src="http://openlayers.org/en/v3.16.0/build/ol.js"></script>--%>
<script src="/pages/resources/js/loader.js" type="text/javascript"></script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Maps
        </a><span class=""> > </span><span>View Maps</span></nav>
    </div>
</div>



<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="form-group row">
                <div class="col-md-12">
                    <h1>View Maps</h1>
                </div>
                    <div class="col-md-12 ">
                        <div id="map"></div>
                        <script type="text/javascript">
                            var map = new ol.Map({
                                target: 'map',
                                layers: [
                                    new ol.layer.Tile({
                                        title: 'Global Imagery',
                                        source: new ol.source.TileWMS({

                                            projection: 'EPSG:4281',
                                            url: 'http://localhost:8080/geoserver/crs_4281/wms',
                                            params: {LAYERS: 'crs_4281:Area_ABC_09_4281', VERSION: '1.1.0'}
                                        })
                                    })
                                ],
                                view: new ol.View({
                                    projection: 'EPSG:4326',
                                    center: [35, 32],
                                    zoom: 8,
                                    maxResolution: 0.703125


                                })
                            });
                        </script>
                    </div>
            </div>
        </div>

    </div>
</article>

