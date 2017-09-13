<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#rsltTitle").attr("placeholder", "Result Title");
        $("#sobjNo").attr("placeholder", "Specific Objective Number");
    });
</script>
<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-desktop "></span> Programme Management </a><span
                class=""> > </span><span> List of Results</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont pd0">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Results</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddPmaResult.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Result
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
            <html:form action="/pmaSearchResult.do" method="POST" focus="sobjNo">
                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend>Results</legend>
                            <div class="form-group row">

                                <div class="col-md-4">
                                    <label for="rsltTitle" class="col-sm-12 col-form-label">Restult Title:</label>
                                    <div class="col-sm-12">
                                        <html:text property="rsltTitle" styleClass="form-control" styleId="rsltTitle"/>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <label for="sobjNo" class="col-sm-12 col-form-label">Specific Objective Number:</label>
                                    <div class="col-sm-12">
                                        <html:select property="sobjNo"
                                                     styleClass="selectpicker form-control">
                                            <logic:present name="specObjectiveList">
                                                <html:options collection="specObjectiveList" property="sobjNo" labelProperty="sobjDescription"/>
                                            </logic:present>
                                        </html:select>
                                        <script>
                                            $(function () {
                                                $('[name="sobjNo"]').eq(0).attr("data-live-search", "true");
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
            <table id="listResultsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Title</th>
                    <th class="text-center">Status</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Closed Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Title</th>
                    <th class="text-center">Status</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Closed Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmaResultList">
                    <logic:iterate id="pmaResultList" name="pmaResultList" type="btc.pma.programme.database.PmaResult">
                        <tr>
                            <td width="25%" ><bean:write name="pmaResultList" property="rsltTitle"/></td>
                            <td width="40%" ><bean:write name="pmaResultList" property="rsltStatus"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmaResultList" property="rsltDefineDate" format="dd/MM/yyyy"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmaResultList" property="rsltCloseDate" format="dd/MM/yyyy"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmaResult.do?rsltNo=<bean:write name="pmaResultList" property="rsltNo"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditPmaResult.do?rsltNo=<bean:write name="pmaResultList" property="rsltNo"/>'">
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



