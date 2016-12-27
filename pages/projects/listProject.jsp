<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#projectTitle").attr("placeholder", "Project Title");
        $("#projectDescription").attr("placeholder", "Project Description");
        $("#projectStatus").attr("placeholder", "Project Status");
        $("#projectStartDate").attr("placeholder", "Start Date");
        $("#projectEndDate").attr("placeholder", "End Date");
        $("#projectNeedPermit").attr("placeholder", "Need Permit");
        $("#projectHasCluster").attr("placeholder", "Has Cluster");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Project Tracking </a><span
                class=""> > </span><span> List Project</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Projects</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddProject.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Project
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchProject.do" method="POST" focus="projectTitle">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search project</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="projectTitle" class="col-sm-12 col-form-label">Project Title:</label>
                                <div class="col-sm-12">
                                    <html:text property="projectTitle" styleClass="form-control" styleId="projectTitle"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="projectDescription" class="col-sm-12 col-form-label">Project Desc:</label>
                                <div class="col-sm-12">
                                    <html:text property="projectDescription" styleClass="form-control" styleId="projectDescription"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="projectStatus" class="col-sm-12 col-form-label">Project Status:</label>
                                <div class="col-sm-12">
                                    <html:select property="projectStatus" styleClass="selectpicker form-control">
                                        <html:option value="1">New</html:option>
                                        <html:option value="2">Stopped</html:option>
                                        <html:option value="3">Completed</html:option>
                                    </html:select>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="projectStartDate" class="col-sm-12 col-form-label">From Date:</label>
                                <div class='input-group date col-sm-12' id='pStartDate'>
                                    <html:text property="projectStartDate" styleClass="form-control" styleId="projectStartDate"/>
                                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="projectEndDate" class="col-sm-12 col-form-label">To Date:</label>
                                <div class='input-group date col-sm-12' id='pEndDate'>
                                    <html:text property="projectEndDate" styleClass="form-control" styleId="projectEndDate"/>
                                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                                </div>
                                <script type="text/javascript">
                                    $(function () {
                                        $('#pStartDate').datetimepicker({
                                            format: 'DD/MM/YYYY'
                                        });
                                        $('#pEndDate').datetimepicker({
                                            format: 'DD/MM/YYYY'
                                        });
                                    });
                                </script>
                            </div>
                            <div class="col-md-4">
                                <label class="col-sm-12 col-form-label">&nbsp;</label>
                                <div class="col-sm-12">
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="projectNeedPermit" class="col-sm-12 col-form-label">Need Permit:</label>
                                    <fieldset class="col-sm-12" id="PermitNeed">
                                        <div>
                                            <label class="radio-inline">
                                                <html:radio property="projectNeedPermit" value="1"/>
                                                Yes
                                            </label>
                                            <label class="radio-inline">
                                                <html:radio property="projectNeedPermit" value="0"/>
                                                No
                                            </label>
                                        </div>
                                    </fieldset>
                            </div>
                            <div class="col-md-4">
                                <label for="projectHasCluster" class="col-sm-5 col-form-label">Has Cluster:</label>
                                    <fieldset class="col-sm-12" id="isCluster">
                                        <div>
                                            <label class="radio-inline">
                                                <html:radio property="projectHasCluster" value="1"/>
                                                Yes
                                            </label>
                                            <label class="radio-inline">
                                                <html:radio property="projectHasCluster" value="0"/>
                                                No
                                            </label>
                                        </div>
                                    </fieldset>
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
            <table id="listProjectsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Title</th>
                    <th class="text-center">Description</th>
                    <th class="text-center">Status</th>
                    <th class="text-center">Start Date</th>
                    <th class="text-center">End Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Title</th>
                    <th class="text-center">Description</th>
                    <th class="text-center">Status</th>
                    <th class="text-center">Start Date</th>
                    <th class="text-center">End Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsProjectList">
                    <logic:iterate id="pmsProjectList" name="pmsProjectList" type="eu.pms.project.database.PmsProject">
                        <tr>
                            <td width="20%"><bean:write name="pmsProjectList" property="proTitle"/></td>
                            <td width="40%"><bean:write name="pmsProjectList" property="proDescription"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsProjectList" property="proStatusDesc"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsProjectList" property="proStartDateStr"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsProjectList" property="proEndDateStr"/></td>
                            <td width="10%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsProject.do?proId=<bean:write name="pmsProjectList" property="proId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditProject.do?proId=<bean:write name="pmsProjectList" property="proId"/>'">
                                    <span class="glyphicon glyphicon-edit"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewAddAlbumProject.do?proId=<bean:write name="pmsProjectList" property="proId"/>'">
                                    <span class="glyphicon glyphicon-picture"></span>
                                </a>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
                $(document).ready(function () {
                    $('#listProjectsTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


