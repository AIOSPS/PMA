<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Incident Tracking </a><span
                class=""> > </span><span> List Incident</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Incidents</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddIncident.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Incident
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchIncident.do" method="POST" focus="incidentType">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search incident</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label  class="col-sm-12 col-form-label">Incident Type:</label>
                                <div class="col-sm-12">
                                    <html:select property="incidentType"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="1">Sealing</html:option>
                                        <html:option value="2">Demolition</html:option>
                                        <html:option value="3">Confiscation</html:option>
                                        <html:option value="4">Demolition and Confiscation</html:option>
                                        <html:option value="5">Demoltion (partial)</html:option>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label  class="col-sm-12 col-form-label">Community:</label>
                                <div class="col-sm-12">
                                    <html:select property="communityId"
                                                 styleClass="selectpicker form-control">
                                        <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="communityId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label  class="col-sm-12 col-form-label">&nbsp;</label>
                                <div class="col-sm-12">
                                    <button type="submit" class="btn btn-primary">Search</button>
                                </div>
                            </div>
                        </div>


                    </fieldset>
                </div>
            </div>
    </html:form>
            <table id="listIncidentsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Ocha ID</th>
                    <th class="text-center">Description</th>
                    <th class="text-center">Incident Date</th>
                    <th class="text-center">Source Link</th>
                    <th class="text-center">Affected Women</th>
                    <th class="text-center">Affected Men</th>
                    <th class="text-center">Affected Adults</th>
                    <th class="text-center">Affected Children</th>
                    <th class="text-center">Displaced Women</th>
                    <th class="text-center">Displaced Men</th>
                    <th class="text-center">Displaced Adults</th>
                    <th class="text-center">Displaced Children</th>
                    <th class="text-center">Dimolished Structure</th>
                    <th class="text-center">Location Lattitude</th>
                    <th class="text-center">Location Longitude</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Ocha ID</th>
                    <th class="text-center">Description</th>
                    <th class="text-center">Incident Date</th>
                    <th class="text-center">Source Link</th>
                    <th class="text-center">Affected Women</th>
                    <th class="text-center">Affected Men</th>
                    <th class="text-center">Affected Adults</th>
                    <th class="text-center">Affected Children</th>
                    <th class="text-center">Displaced Women</th>
                    <th class="text-center">Displaced Men</th>
                    <th class="text-center">Displaced Adults</th>
                    <th class="text-center">Displaced Children</th>
                    <th class="text-center">Dimolished Structure</th>
                    <th class="text-center">Location Lattitude</th>
                    <th class="text-center">Location Longitude</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsIncidentList">
                    <logic:iterate id="pmsIncidentList" name="pmsIncidentList" type="eu.pms.project.database.PmsIncident">
                        <tr>
                            <td ><bean:write name="pmsIncidentList" property="incOchaId"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incDescription"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incTimeStampStr"/></td>
                            <td ><a target="_blank" href="<bean:write name="pmsIncidentList" property="incSourceLink"/>"><bean:write name="pmsIncidentList" property="incSourceLink"/></a></td>
                            <td ><bean:write name="pmsIncidentList" property="incAffectedWomen"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incAffectedMen"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incAffectedAdaults"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incAffectedChildren"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incDisplacedWomen"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incDisplacedMen"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incDisplacedAdult"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incDisplacedChildren"/></td>
                            <td ><bean:write name="pmsIncidentList" property="incDemolishedStructure"/></td>
                            <td ><bean:write name="pmsIncidentList" property="locLatitude"/></td>
                            <td ><bean:write name="pmsIncidentList" property="locLongitude"/></td>
                            <td class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsIncident.do?incId=<bean:write name="pmsIncidentList" property="incId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditIncident.do?incId=<bean:write name="pmsIncidentList" property="incId"/>'">
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
//                    $('#listIncidentsTbl').DataTable(  {
//                        dom: 'lBfrtip',
//                        buttons: [
//                            'excelHtml5',
//                            'pdfHtml5'
//                        ]
//                    }  );
//                });
$(document).ready(function() {
    var table = $('#listIncidentsTbl').DataTable( {
        lengthChange: false,
//        dom: 'Bftrip',
        buttons: ['excel', 'pdf']
    } );

    table.buttons().container()
            .appendTo( '#listIncidentsTbl_wrapper .col-sm-6:eq(0)' );
} );
            </script>
        </div>


    </div>
    </div>
</article>


