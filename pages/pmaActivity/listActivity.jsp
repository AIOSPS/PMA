<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#intrNo").attr("placeholder", "Programme");
        $("#rsltNo").attr("placeholder", "Result");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-puzzle-piece"></span>   Program Implementation  </a><span
                class=""> > </span><span> List of Activities</span></nav>
    </div>
</div>



<article class="form">


    <div class="fluid-container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Activities</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" onclick="javaScript:parent.location = '/viewAddPmaIndicator.do'"--%>
                        <%--class="btn btn-primary fa fa-plus pull-right">Add Indicator--%>
                <%--</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
            <html:form action="/pmaSearchActivity.do" method="POST" focus="intrNo">
                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend>Activities</legend>
                            <div class="form-group row">

                                <div class="col-md-4">
                                    <label for="rsltTitle" class="col-sm-12 col-form-label">Programme No:</label>
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
                                </div>
                                <div class="col-md-4">
                                    <label for="rsltNo" class="col-sm-12 col-form-label">Result Number:</label>
                                    <div class="col-sm-12">
                                        <html:select property="rsltNo"
                                                     styleClass="selectpicker form-control">
                                            <logic:present name="resultList">
                                                <html:options collection="resultList" property="rsltNo" labelProperty="rsltTitle"/>
                                            </logic:present>
                                        </html:select>
                                        <script>
                                            $(function () {
                                                $('[name="rsltNo"]').eq(0).attr("data-live-search", "true");
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
                    <th class="text-center">Level</th>
                    <th class="text-center">Implementing Partner</th>
                    <th class="text-center">Title</th>
                    <th class="text-center">Summary Description</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Level</th>
                    <th class="text-center">Implementing Partner</th>
                    <th class="text-center">Title</th>
                    <th class="text-center">Summary Description</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmaActivityList">
                    <logic:iterate id="pmaActivityList" name="pmaActivityList" type="btc.pma.programme.database.PmaActivityInfo">
                        <tr>
                            <td width="25%" ><bean:write name="pmaActivityList" property="actvLevel"/></td>
                            <td width="40%" ><bean:write name="pmaActivityList" property="actvImplementingPartner"/></td>
                            <td width="15%" ><bean:write name="pmaActivityList" property="actvTitle"/></td>
                            <td width="15%" ><bean:write name="pmaActivityList" property="actvSummaryDescription"/></td>
                            <td width="5%" class="text-center">
                                <%--<a href="javaScript:parent.location = '/viewPmaIndicator.do?indrNo=<bean:write name="pmaIndicatorList" property="indrNo"/>'">--%>
                                    <%--<span class="glyphicon glyphicon-list-alt"></span>--%>
                                <%--</a>--%>
                                <%--&nbsp;--%>
                                <%--<a href="javaScript:parent.location = '/viewEditPmaIndicator.do?indrNo=<bean:write name="pmaIndicatorList" property="indrNo"/>'">--%>
                                    <%--<span class="glyphicon glyphicon-edit"></span>--%>
                                <%--</a>--%>
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



