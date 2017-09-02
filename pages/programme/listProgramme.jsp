<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Programme Information </a><span
                class=""> > </span><span> List Programme</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Programme</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddProgramme.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Programme
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchProgramme.do" method="POST" focus="intrNo">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search Programme</legend>
                        <div class="form-group row">

                            <div class="col-md-10">
                                <label  class="col-sm-2 col-form-label">Programme No:</label>
                                <div class="col-sm-10">
                                    <html:text property="intrNo" styleClass="form-control" styleId="permitTitle"/>
                                    <%--<html:select property="intrNo"--%>
                                                 <%--styleClass="selectpicker form-control">--%>
                                        <%--<html:options collection="projectList" property="intrNo" labelProperty="Programme No."/>--%>
                                    <%--</html:select>--%>
                                    <%--<script>--%>
                                        <%--$(function () {--%>
                                            <%--$('[name="intrNo"]').eq(0).attr("data-live-search", "true");--%>
                                        <%--});--%>
                                    <%--</script>--%>
                                </div>
                            </div>
                            <div class="col-md-2">
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
                    <th class="text-center">Programme No.</th>
                    <th class="text-center">Title</th>
                    <%--<th class="text-center"></th>--%>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Programme No.</th>
                    <th class="text-center">Title</th>
                    <%--<th class="text-center"></th>--%>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmaProgrammeList">
                    <logic:iterate id="pmaProgrammeList" name="pmaProgrammeList" type="btc.pma.programme.database.PmaProgrammeInfo">
                        <tr>
                            <td width="45%">
                                <bean:write name="pmaProgrammeList" property="intrNo"/>
                            </td>
                            <td width="50%" class="text-center"><bean:write name="pmaProgrammeList" property="intrTitle"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmaProgramme.do?intrNo=<bean:write name="pmaProgrammeList" property="intrNo"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditProgramme.do?intrNo=<bean:write name="pmaProgrammeList" property="intrNo"/>'">
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


