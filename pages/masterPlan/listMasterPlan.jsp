<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#communityId").attr("placeholder", "Community");
        $("#status").attr("placeholder", "Status");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Master Plan Tracking </a><span
                class=""> > </span><span> List Master plans</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Master Plans</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddMasterPlan.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Master Plan
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchMasterPlan.do" method="POST" focus="masterPlanNo">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search master plan</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="communityId" class="col-sm-12 col-form-label">Community:</label>
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
                                <label for="status" class="col-sm-12 col-form-label">Status ICA:</label>
                                <div class="col-sm-12">
                                    <html:select property="status" styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="1">Progressing</html:option>
                                        <html:option value="2">Stuck</html:option>
                                        <html:option value="3">Rejected</html:option>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="status"]').eq(0).attr("data-live-search", "true");
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
            <table id="listMasterPlanTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Master Plan No</th>
                    <th class="text-center">Master Plan Name</th>
                    <th class="text-center">Status ICA</th>
                    <th class="text-center">No Session With ICA</th>
                    <th class="text-center">Approved Planed Area</th>
                    <th class="text-center">Submission to Ministry of Defense</th>
                    <th class="text-center">First Submission Date to ICA</th>
                    <th class="text-center">Last Submission Date To ICA</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Master Plan No</th>
                    <th class="text-center">Master Plan Name</th>
                    <th class="text-center">Status ICA</th>
                    <th class="text-center">No Session With ICA</th>
                    <th class="text-center">Approved Planed Area</th>
                    <th class="text-center">Submission to Ministry of Defense</th>
                    <th class="text-center">First Submission Date to ICA</th>
                    <th class="text-center">Last Submission Date To ICA</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsMasterPlanList">
                    <logic:iterate id="pmsMasterPlanList" name="pmsMasterPlanList" type="eu.pms.project.database.PmsMasterPlanVw">
                        <tr>
                            <td width="10%"><bean:write name="pmsMasterPlanList" property="masMpNo"/></td>
                            <td width="20%"><bean:write name="pmsMasterPlanList" property="masMpName"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsMasterPlanList" property="masStatusIcaDesc"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsMasterPlanList" property="masNoSessionWithIca"/></td>
                            <td width="10%" class="text-center">
                                <logic:notEqual name="pmsMasterPlanList" property="masApprovedPlanedArea" value="0">
                                    <bean:write name="pmsMasterPlanList" property="masApprovedPlanedArea"/>
                                </logic:notEqual>
                                <logic:equal name="pmsMasterPlanList" property="masApprovedPlanedArea" value="0">
                                    NA
                                </logic:equal>
                            </td>
                            <td width="10%" class="text-center"><bean:write name="pmsMasterPlanList" property="masSubmitToModDesc"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsMasterPlanList" property="masFirstSubmitDateToIcaStr"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsMasterPlanList" property="masLastSubmitDateToIcaStr"/></td>
                            <td width="10%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsMasterPlan.do?masId=<bean:write name="pmsMasterPlanList" property="masId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditMasterPlan.do?masId=<bean:write name="pmsMasterPlanList" property="masId"/>'">
                                    <span class="glyphicon glyphicon-edit"></span>
                                </a>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
//                $(document).ready(function () {
//                    $('#listMasterPlanTbl').DataTable(  {
//                        dom: 'lBfrtip',
//                        buttons: [
//                            'excelHtml5',
//                            'pdfHtml5'
//                        ]
//                    }  );
//                });
$(document).ready(function() {
    var table = $('#listMasterPlanTbl').DataTable( {
        lengthChange: false,
//        dom: 'Bftrip',
        buttons: ['excel', 'pdf']
    } );

    table.buttons().container()
            .appendTo( '#listMasterPlanTbl_wrapper .col-sm-6:eq(0)' );
} );
            </script>
        </div>


    </div>
    </div>
</article>


