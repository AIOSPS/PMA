<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#communityName").attr("placeholder", "Community Name");
        $("#communityPcbsCode").attr("placeholder", "PCBS Code");
        $("#communityOchaCode").attr("placeholder", "OCHA Code");
        $("#communityTopology").attr("placeholder", "Topology");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Community Tracking </a><span
                class=""> > </span><span> List Community</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Communities</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddCommunity.do'"
                        class="btn btn-primary fa fa-plus pull-right">Create Community
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
<html:form action="/searchCommunity.do" method="POST" focus="communityName">
            <div class="form-group row">
                <div class="col-md-12">
                    <fieldset class="isClustr">
                        <legend>Search community</legend>
                        <div class="form-group row">

                            <div class="col-md-4">
                                <label for="communityName" class="col-sm-12 col-form-label">Community Name:</label>
                                <div class="col-sm-12">
                                    <html:text property="communityName" styleClass="form-control" styleId="communityName"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="communityPcbsCode" class="col-sm-12 col-form-label">PCBS Code:</label>
                                <div class="col-sm-12">
                                    <html:text property="communityPcbsCode" styleClass="form-control" styleId="communityPcbsCode"/>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <label for="communityGovId" class="col-sm-5 col-form-label">Governate:</label>
                                <div class="col-sm-12">
                                    <html:select property="communityGovId"
                                                 styleClass="selectpicker form-control">
                                        <html:options collection="governateList" property="lookupId" labelProperty="lookupDesc"/>
                                    </html:select>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-md-4">
                                <%--<label for="communityOchaCode" class="col-sm-12 col-form-label">OCHA Code:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                <%--<html:text property="communityOchaCode" styleClass="form-control" styleId="communityOchaCode"/>--%>
                                <%--</div>--%>
                            </div>
                            <div class="col-md-4">
                                <%--<label for="communityTopology" class="col-sm-12 col-form-label">Community Topology:</label>--%>
                                <%--<div class="col-sm-12">--%>
                                    <%--<html:text property="communityTopology" styleClass="form-control" styleId="communityTopology"/>--%>
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
            <table id="listCommunitiesTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Name</th>
                    <th class="text-center">ID</th>
                    <th class="text-center">OCHA</th>
                    <th class="text-center">Topology</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Name</th>
                    <th class="text-center">ID</th>
                    <th class="text-center">OCHA</th>
                    <th class="text-center">Topology</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsCommunityList">
                    <logic:iterate id="pmsCommunityList" name="pmsCommunityList" type="eu.pms.project.database.PmsCommunity">
                        <tr>
                            <td width="35%"><bean:write name="pmsCommunityList" property="comName"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsCommunityList" property="comId"/></td>
                            <td width="20%" class="text-center"><bean:write name="pmsCommunityList" property="comOchaCode"/></td>
                            <td width="20%"><bean:write name="pmsCommunityList" property="comTopology"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsCommunity.do?comId=<bean:write name="pmsCommunityList" property="comId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditCommunity.do?comId=<bean:write name="pmsCommunityList" property="comId"/>'">
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
                    $('#listCommunitiesTbl').DataTable();
                });
            </script>
        </div>


    </div>
    </div>
</article>


