<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#permitTitle").attr("placeholder", "Permit Title");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Permit Tracking </a><span
                class=""> > </span><span> List Permit</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Permits</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddPermit.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Permit
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchPermit.do" method="POST" focus="permitTitle">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search permit</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="permitTitle" class="col-sm-12 col-form-label">Permit Title:</label>
                                <div class="col-sm-12">
                                    <html:text property="permitTitle" styleClass="form-control" styleId="permitTitle"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="permitType" class="col-sm-12 col-form-label">Permit Type:</label>
                                <div class="col-sm-12">
                                    <html:select property="permitType"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="1">ICA</html:option>
                                        <html:option value="2">MOLG</html:option>
                                        <html:option value="3">MOA</html:option>
                                        <html:option value="4">MOHE</html:option>
                                        <html:option value="5">MON</html:option>
                                        <html:option value="6">MOC</html:option>
                                        <html:option value="7">PWA</html:option>
                                        <html:option value="8">PENRA</html:option>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="permitStatus" class="col-sm-12 col-form-label">Permit Status:</label>
                                <div class="col-sm-12">
                                    <html:select property="permitStatus"
                                                 styleClass="selectpicker form-control">
                                        <html:option value="1">Approved</html:option>
                                        <html:option value="2">Rejected</html:option>
                                        <html:option value="3">Stuck</html:option>
                                        <html:option value="4">Stopped</html:option>
                                    </html:select>
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
            <table id="listPermitsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Title</th>
                    <th class="text-center">Submit Date</th>
                    <th class="text-center">Issue Date</th>
                    <th class="text-center">Permit Period</th>
                    <th class="text-center">Issuing Agency</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Title</th>
                    <th class="text-center">Submit Date</th>
                    <th class="text-center">Issue Date</th>
                    <th class="text-center">Permit Period</th>
                    <th class="text-center">Issuing Agency</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsPermitList">
                    <logic:iterate id="pmsPermitList" name="pmsPermitList" type="eu.pms.project.database.PmsPermit">
                        <tr>
                            <td width="35%" ><bean:write name="pmsPermitList" property="perTitle"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmsPermitList" property="perSubmitDate" format="dd/MM/yyyy"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmsPermitList" property="perIssueDate" format="dd/MM/yyyy"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsPermitList" property="perPeriod"/></td>
                            <td width="20%" ><bean:write name="pmsPermitList" property="perIssuingAgency"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsPermit.do?perId=<bean:write name="pmsPermitList" property="perId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditPermit.do?perId=<bean:write name="pmsPermitList" property="perId"/>'">
                                    <span class="glyphicon glyphicon-edit"></span>
                                </a>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
                $(document).ready(function () {
                    $('#listPermitsTbl').DataTable(  {
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


