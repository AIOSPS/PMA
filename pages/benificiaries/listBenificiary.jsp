<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#benificiaryDesc").attr("placeholder", "Benificiary Description");
        $("#benificiaryTotal").attr("placeholder", "Benificiary Total");
    });
</script>
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
                <button type="button" onclick="javaScript:parent.location = '/viewAddBenificiary.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Benificiary
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchBenificiary.do" method="POST" focus="benificiaryDesc">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search benificiary</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="proId" class="col-sm-12 col-form-label">Project:</label>
                                <div class="col-sm-12">
                                    <html:select property="projectList"
                                                 styleClass="selectpicker form-control">
                                        <html:options collection="projectList" property="proId" labelProperty="proTitle"/>
                                    </html:select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <%--<label for="benificiaryTotal" class="col-sm-12 col-form-label">Benificiary Total:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                    <%--<html:text property="benificiaryTotal" styleClass="form-control" styleId="benificiaryTotal"/>--%>
                                <%--</div>--%>
                            </div>
                            <div class="col-md-4">
                                <%--<label for="benificiaryType" class="col-sm-12 col-form-label">Benificiary Type:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                    <%--<html:select property="benificiaryType"--%>
                                                 <%--styleClass="selectpicker form-control">--%>
                                        <%--<html:options collection="benificiaryTypeList" property="lookupId" labelProperty="lookupDesc"/>--%>
                                    <%--</html:select>--%>
                                <%--</div>--%>
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
            <table id="listbenificiariesTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">Total</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Description</th>
                    <th class="text-center">total</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsBenificiaryList">
                    <logic:iterate id="pmsBenificiaryList" name="pmsBenificiaryList" type="eu.pms.project.database.PmsProjectsBenificiary">
                        <tr>
                            <td width="50%">
                                <bean:write name="pmsBenificiaryList" property="compId.btpId"/>
                            </td>
                            <td width="20%" class="text-center"><bean:write name="pmsBenificiaryList" property="benTotal"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsBenificiary.do?actId=<bean:write name="pmsBenificiaryList" property="compId.proId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditBenificiary.do?actId=<bean:write name="pmsBenificiaryList" property="compId.proId"/>'">
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
                    $('#listbenificiariesTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


