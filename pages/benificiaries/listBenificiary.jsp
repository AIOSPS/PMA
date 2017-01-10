<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Benificiary Tracking </a><span
                class=""> > </span><span> List Benificiary</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Benificiaries</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" onclick="javaScript:parent.location = '/viewAddBenificiary.do'"--%>
                        <%--class="btn btn-primary fa fa-plus pull-right">Create Benificiary--%>
                <%--</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchBenificiary.do" method="POST" focus="proId">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search benificiary</legend>
                        <div class="form-group row">

                            <div class="col-md-10">
                                <label  class="col-sm-1 col-form-label">Project:</label>
                                <div class="col-sm-11">
                                    <html:select property="proId"
                                                 styleClass="selectpicker form-control">
                                        <html:options collection="projectList" property="proId" labelProperty="proTitle"/>
                                    </html:select>
                                    <script>
                                        $(function () {
                                            $('[name="proId"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>
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
            <table id="listbenificiariesTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Total</th>
                    <%--<th class="text-center"></th>--%>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">total</th>
                    <%--<th class="text-center"></th>--%>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsBenificiaryList">
                    <logic:iterate id="pmsBenificiaryList" name="pmsBenificiaryList" type="eu.pms.project.database.PmsProjectsBenificiaryVw">
                        <tr>
                            <td width="50%">
                                <bean:write name="pmsBenificiaryList" property="btnDesc"/>
                            </td>
                            <td width="50%" class="text-center"><bean:write name="pmsBenificiaryList" property="benTotal"/></td>
                            <%--<td width="5%" class="text-center">--%>
                                <%--<a href="javaScript:parent.location = '/viewPmsBenificiary.do?actId=<bean:write name="pmsBenificiaryList" property="compId.proId"/>'">--%>
                                    <%--<span class="glyphicon glyphicon-list-alt"></span>--%>
                                <%--</a>--%>
                                <%--&nbsp;--%>
                                <%--<a href="javaScript:parent.location = '/viewEditBenificiary.do?actId=<bean:write name="pmsBenificiaryList" property="compId.proId"/>'">--%>
                                    <%--<span class="glyphicon glyphicon-edit"></span>--%>
                                <%--</a>--%>
                            <%--</td>--%>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
                $(document).ready(function () {
                    $('#listbenificiariesTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


