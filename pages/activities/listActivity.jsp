<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#activityDesc").attr("placeholder", "Activity Description");
        $("#activityUnit").attr("placeholder", "Activity Unit");
        $("#estimateBudget").attr("placeholder", "Estimate budget");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Activity Tracking </a><span
                class=""> > </span><span> List Activity</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Activities</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddActivity.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Activity
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchActivity.do" method="POST" focus="activityDesc">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search activity</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="activityDesc" class="col-sm-12 col-form-label">Description:</label>
                                <div class="col-sm-12">
                                    <html:text property="activityDesc" styleClass="form-control" styleId="activityDesc"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="activityUnit" class="col-sm-12 col-form-label">Unit:</label>
                                <div class="col-sm-12">
                                    <html:text property="activityUnit" styleClass="form-control" styleId="activityUnit"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="estimateBudget" class="col-sm-12 col-form-label">Estimated Budget:</label>
                                <div class="col-sm-12">
                                    <html:text property="estimateBudget" styleClass="form-control" styleId="estimateBudget"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <%--<label for="prNotes" class="col-sm-5 col-form-label">Community Topology:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                    <%--<input type="number" class="form-control" id="prBdget" placeholder="Budget"/>--%>
                                <%--</div>--%>
                            </div>
                            <div class="col-md-4">
                                <%--<label for="prNotes" class="col-sm-5 col-form-label">Has Cluster:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                    <%--<input type="number" class="form-control" id="prBdget" placeholder="Budget"/>--%>
                                <%--</div>--%>
                            </div>
                            <div class="col-md-4">
                                <label for="prNotes" class="col-sm-5 col-form-label">&nbsp;</label>
                                <div class="col-sm-12">
                                    <button type="submit" class="btn btn-primary">Search</button>
                                </div>
                            </div>
                        </div>

                    </fieldset>
                </div>
            </div>
    </html:form>
            <table id="listActivitiesTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Unit</th>
                    <th class="text-center">Estimated Budget</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Unit</th>
                    <th class="text-center">Estimated Budget</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsActivityList">
                    <logic:iterate id="pmsActivityList" name="pmsActivityList" type="eu.pms.project.database.PmsActivity">
                        <tr>
                            <td width="50%"><bean:write name="pmsActivityList" property="actDesc"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsActivityList" property="actUnit"/></td>
                            <td width="25%" class="text-center"><bean:write name="pmsActivityList" property="actEstimatedBudget"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsActivity.do?actId=<bean:write name="pmsActivityList" property="compId.actId"/>&intId=<bean:write name="pmsActivityList" property="compId.intId"/>&subId=<bean:write name="pmsActivityList" property="compId.secId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditActivity.do?actId=<bean:write name="pmsActivityList" property="compId.actId"/>&intId=<bean:write name="pmsActivityList" property="compId.intId"/>&subId=<bean:write name="pmsActivityList" property="compId.secId"/>'">
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
                    $('#listActivitiesTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


