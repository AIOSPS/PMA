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
                <h1>List of Water Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddWaterSocio.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Water Socio
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
                                <label for="comId" class="col-sm-12 col-form-label">Community:</label>
                                <div class="col-sm-12">
                                    <html:select property="comId"
                                                 styleClass="selectpicker form-control">
                                        <logic:present name="communityList">
                                            <html:option value="">Select</html:option>
                                            <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                        </logic:present>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="comId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="govId" class="col-sm-12 col-form-label">Governorate:</label>
                                <div class="col-sm-12">
                                    <html:select property="govId"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:options collection="governateList" property="lookupId" labelProperty="lookupDesc"/>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="govId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
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
                    <th class="text-center">Community</th>
                    <th class="text-center">Is connected</th>
                    <th class="text-center">Local Network exist (Yes, No, Partially)</th>
                    <th class="text-center">Uses Water Tanker (Yes, No)</th>
                    <th class="text-center">Rain Water Well</th>
                    <th class="text-center">Number of Springs</th>
                    <th class="text-center">Price of M3 Water</th>
                    <th class="text-center">Distance to the Filling Point (Within 5KM, Beyond 5KM)</th>
                    <th class="text-center">Survey Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Community</th>
                    <th class="text-center">Is connected</th>
                    <th class="text-center">Local Network exist (Yes, No, Partially)</th>
                    <th class="text-center">Uses Water Tanker (Yes, No)</th>
                    <th class="text-center">Rain Water Well</th>
                    <th class="text-center">Number of Springs</th>
                    <th class="text-center">Price of M3 Water</th>
                    <th class="text-center">Distance to the Filling Point (Within 5KM, Beyond 5KM)</th>
                    <th class="text-center">Survey Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsWaterSocioList">
                    <logic:iterate id="pmsWaterSocioList" name="pmsWaterSocioList" type="eu.pms.project.database.PmsWaterSocioVw">
                        <tr>
                            <td width="15%" class="text-center"><bean:write name="pmsWaterSocioList" property="comName"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watIsconnected"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watNetwork"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watUseWatTanker"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watRainWaterWell"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watNoSprings"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watPriceWater"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watFillingPoint"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsWaterSocioList" property="watSurveyDateStr"/></td>
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


