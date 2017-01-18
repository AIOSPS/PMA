<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#indicatorTitle").attr("placeholder", "Indicator Title");
        $("#indicatorLongDesc").attr("placeholder", "Long Description");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Indicator Tracking </a><span
                class=""> > </span><span> List Indicator</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Indicators</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddIndicator.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Indicator
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchIndicator.do" method="POST" focus="indicatorTitle">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search indicator</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="indicatorTitle" class="col-sm-12 col-form-label">Indicator Title:</label>
                                <div class="col-sm-12">
                                    <html:text property="indicatorTitle" styleClass="form-control" styleId="indicatorTitle"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <%--<label for="indicatorLongDesc" class="col-sm-12 col-form-label">Long Description:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                    <%--<html:text property="indicatorLongDesc" styleClass="form-control" styleId="indicatorLongDesc"/>--%>
                                <%--</div>--%>
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
            <table id="listIndicatorsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Indicator Title</th>
                    <th class="text-center">Long Description</th>
                    <th class="text-center">Indicator Date</th>
                    <th class="text-center">Base Line</th>
                    <th class="text-center">Frequency</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Indicator Title</th>
                    <th class="text-center">Long Description</th>
                    <th class="text-center">Indicator Date</th>
                    <th class="text-center">Base Line</th>
                    <th class="text-center">Frequency</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsIndicatorList">
                    <logic:iterate id="pmsIndicatorList" name="pmsIndicatorList" type="eu.pms.project.database.PmsIndicator">
                        <tr>
                            <td width="25%" ><bean:write name="pmsIndicatorList" property="indTitle"/></td>
                            <td width="40%" ><bean:write name="pmsIndicatorList" property="indLongDesc"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsIndicatorList" property="indDate" format="dd/MM/yyyy"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsIndicatorList" property="indBaseline"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsIndicatorList" property="indFrequencyDesc"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsIndicator.do?indId=<bean:write name="pmsIndicatorList" property="compId.indId"/>&resId=<bean:write name="pmsIndicatorList" property="compId.resId"/>&objId=<bean:write name="pmsIndicatorList" property="compId.objId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditIndicator.do?indId=<bean:write name="pmsIndicatorList" property="compId.indId"/>&resId=<bean:write name="pmsIndicatorList" property="compId.resId"/>&objId=<bean:write name="pmsIndicatorList" property="compId.objId"/>'">
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
                    $('#listIndicatorsTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


