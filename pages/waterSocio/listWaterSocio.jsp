<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#waterUseWatTanker").attr("placeholder", "Use Water Tanker");
        $("#waterRainWaterWell").attr("placeholder", "Rain Water Well");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Water Socio Tracking </a><span
                class=""> > </span><span> List Water socio</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Water Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddWaterSocio.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Water Socio
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchWaterSocio.do" method="POST" focus="waterUseWatTanker">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search water socio</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="waterUseWatTanker" class="col-sm-12 col-form-label">Use Water Tanker:</label>
                                <div class="col-sm-12">
                                    <html:text property="waterUseWatTanker" styleClass="form-control" styleId="waterUseWatTanker"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="waterRainWaterWell" class="col-sm-12 col-form-label">Rain Water Well:</label>
                                <div class="col-sm-12">
                                    <html:text property="waterRainWaterWell" styleClass="form-control" styleId="waterRainWaterWell"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label  class="col-sm-5 col-form-label">&nbsp;</label>
                                <div class="col-sm-12">
                                    <button type="submit" class="btn btn-primary">Search</button>
                                </div>
                            </div>
                        </div>



                    </fieldset>
                </div>
            </div>
    </html:form>
            <table id="listWaterSocioTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Is connected</th>
                    <th class="text-center">Network</th>
                    <th class="text-center">Use Water Tanker</th>
                    <th class="text-center">Rain Water Well</th>
                    <th class="text-center">Survey Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Is connected</th>
                    <th class="text-center">Network</th>
                    <th class="text-center">Use Water Tanker</th>
                    <th class="text-center">Rain Water Well</th>
                    <th class="text-center">Survey Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsWaterSocioList">
                    <logic:iterate id="pmsWaterSocioList" name="pmsWaterSocioList" type="eu.pms.project.database.PmsWaterSocio">
                        <tr>
                            <td width="20%" class="text-center"><bean:write name="pmsWaterSocioList" property="watIsconnected"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWaterSocioList" property="watNetwork"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWaterSocioList" property="watUseWatTanker"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWaterSocioList" property="watRainWaterWell"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmsWaterSocioList" property="watSurveyDateStr"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsWaterSocio.do?watId=<bean:write name="pmsWaterSocioList" property="watId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditWaterSocio.do?watId=<bean:write name="pmsWaterSocioList" property="watId"/>'">
                                    <span class="glyphicon glyphicon-edit"></span>
                                </a>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
                $(document).ready(function () {
                    $('#listWaterSocioTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


