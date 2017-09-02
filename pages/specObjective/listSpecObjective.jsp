<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#intrNo").attr("placeholder", "Programme Number");
        $("#sobjNo").attr("placeholder", "Specific Objective Number");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Specific Objectives </a><span
                class=""> > </span><span> List Objectives</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Objectives</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddSpecObjective.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Objective
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
            <html:form action="/searchSpecObjective.do" method="POST" focus="sobjNo">
                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend>Search Objective</legend>
                            <div class="form-group row">

                                <div class="col-md-4">
                                    <label for="sobjNo" class="col-sm-12 col-form-label">Specific Objective Number:</label>
                                    <div class="col-sm-12">
                                        <html:text property="sobjNo" styleClass="form-control" styleId="sobjNo"/>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <label for="intrNo" class="col-sm-12 col-form-label">Programme Number:</label>
                                    <div class="col-sm-12">
                                        <html:select property="intrNo"
                                                     styleClass="selectpicker form-control">
                                            <logic:present name="programmeList">
                                                <html:options collection="programmeList" property="intrNo" labelProperty="intrTitle"/>
                                            </logic:present>
                                        </html:select>
                                        <script>
                                            $(function () {
                                                $('[name="intrNo"]').eq(0).attr("data-live-search", "true");
                                            });
                                        </script>
                                    </div>
                                        <%--<div class="col-sm-12">--%>
                                        <%--<html:select property="resStatus"--%>
                                        <%--styleClass="selectpicker form-control">--%>
                                        <%--<html:option value="1">Achived</html:option>--%>
                                        <%--<html:option value="2">Not Achived</html:option>--%>
                                        <%--</html:select>--%>
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
            <table id="listResultsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Related Documents</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Adaptation Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Related Documents</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Adaptation Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmaSpecObjectiveList">
                    <logic:iterate id="pmaSpecObjectiveList" name="pmaSpecObjectiveList" type="btc.pma.programme.database.PmaSpecificObjective">
                        <tr>
                            <td width="25%" ><bean:write name="pmaSpecObjectiveList" property="sobjDescription"/></td>
                            <td width="40%" ><bean:write name="pmaSpecObjectiveList" property="sobjRelatedDocuments"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmaSpecObjectiveList" property="sobjDefineDate" format="dd/MM/yyyy"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmaSpecObjectiveList" property="sobjAdaptationDate" format="dd/MM/yyyy"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewSpecObjective.do?sobjNo=<bean:write name="pmaSpecObjectiveList" property="sobjNo"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditSpecObjective.do?sobjNo=<bean:write name="pmaSpecObjectiveList" property="sobjNo"/>'">
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
                //                    $('#listResultsTbl').DataTable(  {
                //                        dom: 'lBfrtip',
                //                        buttons: [
                //                            'excelHtml5',
                //                            'pdfHtml5'
                //                        ]
                //                    }  );
                //                });
                $(document).ready(function() {
                    var table = $('#listResultsTbl').DataTable( {
                        lengthChange: false,
//        dom: 'Bftrip',
                        buttons: ['excel', 'pdf']
                    } );

                    table.buttons().container()
                        .appendTo( '#listResultsTbl_wrapper .col-sm-6:eq(0)' );
                } );
            </script>
        </div>


    </div>
    </div>
</article>



