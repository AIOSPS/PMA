<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#resultDesc").attr("placeholder", "Result Description");
        $("#resultLongDesc").attr("placeholder", "Long Description");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Result Tracking </a><span
                class=""> > </span><span> List Result</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Results</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddResult.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Permit
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchResult.do" method="POST" focus="resultDesc">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search result</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="resultDesc" class="col-sm-12 col-form-label">Result Description:</label>
                                <div class="col-sm-12">
                                    <html:text property="resultDesc" styleClass="form-control" styleId="resultDesc"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="resultLongDesc" class="col-sm-12 col-form-label">Long Description:</label>
                                <div class="col-sm-12">
                                    <html:text property="resultLongDesc" styleClass="form-control" styleId="resultLongDesc"/>
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
                    <th class="text-center">Description</th>
                    <th class="text-center">Long Description</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Close Date</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Long Description</th>
                    <th class="text-center">Define Date</th>
                    <th class="text-center">Close Date</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsResultList">
                    <logic:iterate id="pmsResultList" name="pmsResultList" type="eu.pms.project.database.PmsResult">
                        <tr>
                            <td width="25%" ><bean:write name="pmsResultList" property="resDesc"/></td>
                            <td width="40%" ><bean:write name="pmsResultList" property="resLongDesc"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmsResultList" property="resDefineDate" format="dd/MM/yyyy"/></td>
                            <td width="15%" class="text-center"><bean:write name="pmsResultList" property="resCloseDate" format="dd/MM/yyyy"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsResult.do?resId=<bean:write name="pmsResultList" property="compId.resId"/>&objId=<bean:write name="pmsResultList" property="compId.objId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditResult.do?resId=<bean:write name="pmsResultList" property="compId.resId"/>&objId=<bean:write name="pmsResultList" property="compId.objId"/>'">
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
                    $('#listResultsTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


