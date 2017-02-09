<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#warningNo").attr("placeholder", "Warning Number");
        $("#warningName").attr("placeholder", "Warning Name");
        $("#warnedId").attr("placeholder", "Warned Id");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Warning Tracking </a><span
                class=""> > </span><span> List Warning</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Warnings</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddWarning.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Warning
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchWarning.do" method="POST" focus="warningNo">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search warning</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="warningNo" class="col-sm-12 col-form-label">Warning Numner:</label>
                                <div class="col-sm-12">
                                    <html:text property="warningNo" styleClass="form-control" styleId="warningNo"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="warningName" class="col-sm-12 col-form-label">Warning Name:</label>
                                <div class="col-sm-12">
                                    <html:text property="warningName" styleClass="form-control" styleId="warningName"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="warnedId" class="col-sm-12 col-form-label">Warned Id:</label>
                                <div class="col-sm-12">
                                    <html:text property="warnedId" styleClass="form-control" styleId="warnedId"/>
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
            <table id="listWarningsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Warning Number</th>
                    <th class="text-center">Warning Name</th>
                    <th class="text-center">Warned Id</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Warning Number</th>
                    <th class="text-center">Warning Name</th>
                    <th class="text-center">Warned Id</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsWarningList">
                    <logic:iterate id="pmsWarningList" name="pmsWarningList" type="eu.pms.project.database.PmsWarnings">
                        <tr>
                            <td width="50%"><bean:write name="pmsWarningList" property="warNo"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWarningList" property="warWarnedName"/></td>
                            <td width="25%" class="text-center"><bean:write name="pmsWarningList" property="warWarnedId"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsWarning.do?warId=<bean:write name="pmsWarningList" property="warId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditWarning.do?warId=<bean:write name="pmsWarningList" property="warId"/>'">
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
//                    $('#listActivitiesTbl').DataTable(  {
//                        lengthChange: false,
//                        dom: 'Bftrip',
//                        buttons: [
//                            'excelHtml5',
//                            'pdfHtml5'
//                        ]
//                    }  );
//                });
$(document).ready(function() {
    var table = $('#listWarningsTbl').DataTable( {
        lengthChange: false,
//        dom: 'Bftrip',
        buttons: ['excel', 'pdf']
    } );

    table.buttons().container()
            .appendTo( '#listWarningsTbl_wrapper .col-sm-6:eq(0)' );
} );
            </script>
        </div>


    </div>
    </div>
</article>


