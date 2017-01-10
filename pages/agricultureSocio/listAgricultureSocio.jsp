<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#agricultureArea").attr("placeholder", "Agriculture Area");
        $("#agricultureNoCowYear").attr("placeholder", "No Cow Year");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Agriculture Socio Tracking </a><span
                class=""> > </span><span> List Agriculture socio</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Agriculture Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddAgricultureSocio.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Agriculture Socio
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchAgricultureSocio.do" method="POST" focus="agricultureArea">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search agriculture socio</legend>
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
            <table id="listAgricultureSocioTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Community</th>
                    <th class="text-center">Agriculture Area</th>
                    <th class="text-center">No of Cow Per Year</th>
                    <th class="text-center">No of Sheep Per Year</th>
                    <th class="text-center">Cost of Water Tank</th>
                    <th class="text-center">Herding Area</th>
                    <th class="text-center">Military Area</th>
                    <th class="text-center">Bypass Road Area</th>
                    <th class="text-center">Survey Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Community</th>
                    <th class="text-center">Agriculture Area</th>
                    <th class="text-center">No of Cow Per Year</th>
                    <th class="text-center">No of Sheep Per Year</th>
                    <th class="text-center">Cost of Water Tank</th>
                    <th class="text-center">Herding Area</th>
                    <th class="text-center">Military Area</th>
                    <th class="text-center">Bypass Road Area</th>
                    <th class="text-center">Survey Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsAgricultureSocioList">
                    <logic:iterate id="pmsAgricultureSocioList" name="pmsAgricultureSocioList" type="eu.pms.project.database.PmsAgricultureSocioVw">
                        <tr>
                            <td width="15%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="comName"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrArea"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrNoCowYear"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrNoSheepYear"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrCostWaterTank"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrHerdingArea"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrMilitaryArea"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrBypassRoadArea"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsAgricultureSocioList" property="agrSurveyDateStr"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsAgricultureSocio.do?agrId=<bean:write name="pmsAgricultureSocioList" property="agrId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditAgricultureSocio.do?agrId=<bean:write name="pmsAgricultureSocioList" property="agrId"/>'">
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
                    $('#listAgricultureSocioTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


