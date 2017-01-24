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
                <h1>List of Projects</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddProject.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Project
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
                                <label class="col-sm-12 col-form-label">Donor:</label>
                                <div class="col-sm-12">
                                    <html:select property="donorId"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <logic:present name="dononrList">
                                            <html:options collection="dononrList" property="donId" labelProperty="donName"/>
                                        </logic:present>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="donorId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label class="col-sm-12 col-form-label">Sector:</label>
                                <div class="col-sm-12">
                                    <html:select property="sectorId"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <logic:present name="sectorsList">
                                            <html:options collection="sectorsList" property="secId" labelProperty="secName"/>
                                        </logic:present>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="sectorId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label  class="col-sm-5 col-form-label">Governorate:</label>
                                <div class="col-sm-12">
                                    <html:select property="governateId"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <logic:present name="governateList">
                                        <html:options collection="governateList" property="lookupId" labelProperty="lookupDesc"/>
                                        </logic:present>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="governateId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label class="col-sm-12 col-form-label">Community:</label>
                                <div class="col-sm-12">
                                    <html:select property="communityId"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <logic:present name="communityList">
                                            <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                        </logic:present>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="communityId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label class="col-sm-12 col-form-label">Status:</label>
                                <div class="col-sm-12">
                                    <html:select property="statusId" styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="1">Design / Approval</html:option>
                                        <html:option value="2">Ongoing</html:option>
                                        <html:option value="3">Delayed</html:option>
                                        <html:option value="4">Completed</html:option>
                                        <html:option value="5">On-Hold</html:option>
                                        <html:option value="6">Closed</html:option>
                                        <html:option value="7">Cancelled</html:option>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label class="col-sm-5 col-form-label">&nbsp;</label>
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
                    <logic:iterate id="pmsProjectList" name="pmsProjectList" type="eu.pms.project.database.PmsProjectVw">
                        <tr>
                            <td width="20%"><bean:write name="pmsProjectList" property="proTitle"/></td>
                            <td width="40%"><bean:write name="pmsProjectList" property="proDescription"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsProjectList" property="proStatusDesc"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsProjectList" property="proStartDate"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsProjectList" property="proEndDate"/></td>
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
                    $('#listProjectsTbl').DataTable(  {
                        dom: 'lBfrtip',
                        buttons: [
                            'excelHtml5',
                            'pdfHtml5'
                        ]
                    }  );
                });
            </script>
        </div>


    </div>
    </div>
</article>


