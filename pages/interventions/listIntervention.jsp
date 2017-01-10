<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#interventionDesc").attr("placeholder", "Description");
        $("#interventionEstimatedBudget").attr("placeholder", "Estimte Budget");
        $("#interventionSource").attr("placeholder", "Source");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Intervention Tracking </a><span
                class=""> > </span><span> List Intervention</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Interventions</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddIntervention.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Intervention
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchIntervention.do" method="POST" focus="interventionDesc">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search intervention</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="secId" class="col-sm-12 col-form-label">Sector:</label>
                                <div class="col-sm-12">
                                    <html:select property="secId"
                                                 styleClass="selectpicker form-control">
                                        <logic:present name="sectorsList">
                                            <html:option value="">Select</html:option>
                                            <html:options collection="sectorsList" property="secId" labelProperty="secName"/>
                                        </logic:present>

                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="secId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="intPriority" class="col-sm-12 col-form-label">Priority:</label>
                                <div class="col-sm-12">
                                    <html:select property="intPriority" styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="O">Very Low</html:option>
                                        <html:option value="L">Low</html:option>
                                        <html:option value="H">High</html:option>
                                        <html:option value="V">Very High</html:option>
                                        <html:option value="U">Urgent</html:option>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="interventionSource" class="col-sm-12 col-form-label">Source:</label>
                                <div class="col-sm-12">
                                    <html:select property="interventionSource" styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="MASTER">Master Plan</html:option>
                                        <html:option value="ASSESS">Assessment</html:option>
                                        <html:option value="COMM">Comunity Representative</html:option>
                                    </html:select>
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
            <table id="listInterventionsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Estimated Budget</th>
                    <th class="text-center">Source</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Estimated Budget</th>
                    <th class="text-center">Source</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsInterventionList">
                    <logic:iterate id="pmsInterventionList" name="pmsInterventionList" type="eu.pms.project.database.PmsIntervention">
                        <tr>
                            <td width="50%"><bean:write name="pmsInterventionList" property="intDesc"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsInterventionList" property="intEstimatedBudget"/></td>
                            <td width="25%" class="text-center"><bean:write name="pmsInterventionList" property="intSourceDesc"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsIntervention.do?intId=<bean:write name="pmsInterventionList" property="compId.intId"/>&secId=<bean:write name="pmsInterventionList" property="compId.secId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditIntervention.do?intId=<bean:write name="pmsInterventionList" property="compId.intId"/>&secId=<bean:write name="pmsInterventionList" property="compId.secId"/>'">
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
                    $('#listInterventionsTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


