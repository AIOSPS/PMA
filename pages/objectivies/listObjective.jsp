<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#objectiveDesc").attr("placeholder", "Objective Description");
        $("#objectiveLongDesc").attr("placeholder", "Long Description");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Objective Tracking </a><span
                class=""> > </span><span> List Objective</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Objectives</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddObjective.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Objective
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchObjective.do" method="POST" focus="objectiveDesc">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search objective</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="objectiveDesc" class="col-sm-12 col-form-label">Objective Description:</label>
                                <div class="col-sm-12">
                                    <html:text property="objectiveDesc" styleClass="form-control" styleId="objectiveDesc"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="objectiveLongDesc" class="col-sm-12 col-form-label">Long Description:</label>
                                <div class="col-sm-12">
                                    <html:text property="objectiveLongDesc" styleClass="form-control" styleId="objectiveLongDesc"/>
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
            <table id="listObjectivesTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Long Description</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Close Date</th>
                    <th class="text-center">User ID</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Long Description</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Close Date</th>
                    <th class="text-center">User ID</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsObjectiveList">
                    <logic:iterate id="pmsObjectiveList" name="pmsObjectiveList" type="eu.pms.project.database.PmsObjectiv">
                        <tr>
                            <td width="25%" ><bean:write name="pmsObjectiveList" property="objDesc"/></td>
                            <td width="40%" ><bean:write name="pmsObjectiveList" property="objLongDesc"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsObjectiveList" property="objDefineDate" format="dd/MM/yyyy"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsObjectiveList" property="objCloseDate" format="dd/MM/yyyy"/></td>
                            <td width="10%" ><bean:write name="pmsObjectiveList" property="ojbUserId"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsObjective.do?objId=<bean:write name="pmsObjectiveList" property="objId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditObjective.do?objId=<bean:write name="pmsObjectiveList" property="objId"/>'">
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
                    $('#listObjectivesTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


