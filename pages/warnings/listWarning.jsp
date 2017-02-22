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
                                <label for="warningNo" class="col-sm-12 col-form-label">Warning type:</label>
                                <div class="col-sm-12">
                                    <html:select property="warType"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="1">Stop working</html:option>
                                        <html:option value="2">Demolition Order</html:option>
                                        <html:option value="3">Confiscation order</html:option>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="warningName" class="col-sm-12 col-form-label">Structure type:</label>
                                <div class="col-sm-12">
                                    <html:select property="warStructType"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="1">Residential</html:option>
                                        <html:option value="2">In ProcessLivestock barn</html:option>
                                        <html:option value="3">Commercial</html:option>
                                        <html:option value="4">Industrial</html:option>
                                        <html:option value="5">Agricultural</html:option>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="warnedId" class="col-sm-12 col-form-label">Warning status:</label>
                                <div class="col-sm-12">
                                    <html:select property="warStatus"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="">Select</html:option>
                                        <html:option value="1">Executed</html:option>
                                        <html:option value="2">In Process</html:option>
                                        <html:option value="3">On hold - Legal action</html:option>
                                        <html:option value="4">Closed/Cancelled</html:option>
                                        <html:option value="5">Ready for Execution</html:option>
                                    </html:select>
                                </div>
                            </div>
                        </div>
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
            <table id="listWarningsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Warning Number</th>
                    <th class="text-center">Warning type</th>
                    <th class="text-center">Structure type</th>
                    <th class="text-center">Status</th>
                    <th class="text-center">Community</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Warning Number</th>
                    <th class="text-center">Warning type</th>
                    <th class="text-center">Structure type</th>
                    <th class="text-center">Status</th>
                    <th class="text-center">Community</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsWarningList">
                    <logic:iterate id="pmsWarningList" name="pmsWarningList" type="eu.pms.project.database.PmsWarningsVw">
                        <tr>
                            <td width="15%"><bean:write name="pmsWarningList" property="warNo"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWarningList" property="warType"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWarningList" property="warStructType"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWarningList" property="warStatus"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsWarningList" property="comName"/></td>
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


