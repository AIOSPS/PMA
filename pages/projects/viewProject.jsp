<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="eu.pms.lookup.database.PmsBenificiaryTyp" %>
<%@ page import="eu.pms.project.database.*" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script type="text/javascript">
    $(function () {
        $("#proId").attr("placeholder", "Project Number");
        $("#proId").prop('required', true);
        $("#proTitle").attr("placeholder", "Project Title");
        $("#proTitle").prop('required', true);
        $("#proDescription").attr("placeholder", "Project Description");
        $("#proDescription").prop('required', true);
        $("#proStartDate").attr("placeholder", "Start Date");
        $("#proStartDate").prop('required', true);
        $("#proEndDate").attr("placeholder", "End Date");
        $("#proEndDate").prop('required', true);
        $("#proBudget").attr("placeholder", "Project Budget");
        $("#proBudget").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2  hidden-print">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Project Information
        </a><span class=""> > </span><span>View Project</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <%--<h1>View Project</h1>--%>
            </div>
            <div class="col-md-4 pd15 create hidden-print">
                <a class="btn btn-primary pull-right" href="javascript:window.print()">Print</a>
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditProject">
                <div class="text-center"><u><B>Project Title: <bean:write name="pmsProjectForm" property="proTitle" /></B></u></div><br/>
                <div class="panel panel-default">
                    <div class="panel-heading"><B>Administration</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td width="12%"><B>Donor</B></td>
                                <td width="33%"><%=request.getAttribute("donorName")%></td>
                                <td width="12%"><B>Development Agency</B></td>
                                <td width="33%"><%=request.getAttribute("devDesc")%></td>
                            </tr>
                            <tr>
                                <td width="12%"><B>Implementer</B></td>
                                <td width="33%"><%=request.getAttribute("impName")%></td>
                                <td width="12%"><B>Programme</B></td>
                                <td width="33%"><%=request.getAttribute("prgDesc")%></td>
                            </tr>
                            </tbody>
                            </table>
                    </div>
                    <div class="panel-heading"><B>Project Information</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td width="12%"><B>Project Number</B></td>
                                <td width="33%"><bean:write name="pmsProjectForm" property="proId" /></td>
                                <td width="12%"><B>Project Type</B></td>
                                <td width="33%"><bean:write name="pmsProjectForm" property="secType" /></td>
                            </tr>
                            <tr>
                                <td><B>Sector</B></td>
                                <td><%=request.getAttribute("secName")%></td>
                                <td><B>Status</B></td>
                                <td><bean:write name="pmsProjectForm" property="proStatusDesc" /></td>
                            </tr>
                            <tr>
                                <td><B>Budget</B></td>
                                <td><bean:write name="pmsProjectForm" property="proBudgetTxt" />&nbsp;€</td>
                                <td><B>Project Area</B></td>
                                <td><bean:write name="pmsProjectForm" property="proArea" /></td>
                            </tr>
                            <tr>
                                <td><B>Project Description</B></td>
                                <td colspan="3"><bean:write name="pmsProjectForm" property="proDescription" /></td>
                            </tr>

                            <tr>
                                <td><B>Start Date</B></td>
                                <td><bean:write name="pmsProjectForm" property="proStartDate" /></td>
                                <td><B>End Date</B></td>
                                <td><bean:write name="pmsProjectForm" property="proEndDate" /></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="panel-heading"><B>Location</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td colspan="2" class="text-center"><B>Latitude</B></td>
                                <td colspan="2" class="text-center"><B>Longitude</B></td>
                            </tr>
                            <logic:present name="projectLocationList">
                                <% List projectLocationList = (List) request.getAttribute("projectLocationList");
                                    Iterator itr = projectLocationList.iterator();
                                    PmsProjectsLocation pmsProjectsLocation = null;
                                    while (itr.hasNext()){
                                        pmsProjectsLocation = (PmsProjectsLocation) itr.next();
                                %>
                                <tr>
                                    <td colspan="2"><%=pmsProjectsLocation.getCompId().getComLatitude()%></td>
                                    <td colspan="2"><%=pmsProjectsLocation.getCompId().getComLongitude()%></td>
                                </tr>
                                <%
                                    }
                                %>
                            </logic:present>
                            <logic:notPresent name="projectLocationList">
                                <tr>
                                    <td colspan="4">No Location Found</td>
                                </tr>
                            </logic:notPresent>
                            <tr>
                                <td width="12%"><B>Cluster Project</B></td>
                                <td width="33%"><bean:write name="pmsProjectForm" property="proHasClusterDesc" /></td>
                                <td width="12%"><B>Community</B></td>
                                <td width="33%"><%=request.getAttribute("comName")%></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="panel-heading"><B>Permit</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td width="12%"><B>Permit Need</B></td>
                                <td width="33%"><bean:write name="pmsProjectForm" property="proNeedPermitDesc" /></td>
                                <td width="12%"><B>Permit Number</B></td>
                                <td width="33%"><%=request.getAttribute("perTitle")%></td>
                            </tr>
                            <tr >
                                <td colspan="2" class="text-center"><B>Beneficiary</B></td>
                                <td colspan="2" class="text-center"><B>Beneficiary Total</B></td>
                            </tr>
                            <logic:present name="projectBenificiryList">
                                <% List projectBenificiryList = (List) request.getAttribute("projectBenificiryList");
                                    Iterator itr = projectBenificiryList.iterator();
                                    PmsProjectsBenificiary pmsProjectsBenificiary = null;
                                    while (itr.hasNext()){
                                        pmsProjectsBenificiary = (PmsProjectsBenificiary) itr.next();
                                %>
                                <tr>
                                    <td><%
                                        List benificiryTypeList = (List)request.getAttribute("benificiryTypeList");

                                        if(benificiryTypeList!=null&&benificiryTypeList.size()>0) {
                                            for (int i = 0; i < benificiryTypeList.size(); i++) {
                                                PmsBenificiaryTyp obj = (PmsBenificiaryTyp) benificiryTypeList.get(i);
                                                if(obj.getLookupId().equals(pmsProjectsBenificiary.getCompId().getBtpId())){
                                                    request.setAttribute("benificiaryTyp",obj.getLookupDesc());
                                                }
                                            }
                                        }
                                    %>
                                        <%=request.getAttribute("benificiaryTyp")%>
                                    </td>
                                    <td><%=pmsProjectsBenificiary.getBenTotal()%></td>
                                </tr>
                                <%}%>
                            </logic:present>
                            <logic:notPresent name="projectBenificiryList">
                                <tr>
                                    <td colspan="4">No Beneficiary Found</td>
                                </tr>
                            </logic:notPresent>
                            </tbody>
                        </table>
                    </div>
                    <div class="panel-heading"><B>Link to Indicator</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td width="12%"><B>Indicator</B></td>
                                <td width="88%"><%=request.getAttribute("indTitle")%></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="panel-heading"><B>Related Incidents</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td width="12%" class="text-center"><B>Incident Number</B></td>
                                <td width="33%" class="text-center"><B>Description</B></td>
                                <td width="12%" class="text-center"><B>Incident Date</B></td>
                                <td width="33%" class="text-center"><B>Source Link</B></td>
                            </tr>
                            <logic:present name="incidentList">
                                <logic:iterate id="incidentList" name="incidentList" type="eu.pms.project.database.PmsIncident">
                                    <tr>
                                        <td ><bean:write name="incidentList" property="incId"/></td>
                                        <td ><bean:write name="incidentList" property="incDescription"/></td>
                                        <td ><bean:write name="incidentList" property="incTimeStampStr"/></td>
                                        <td ><a target="_blank" href="<bean:write name="incidentList" property="incSourceLink"/>"><bean:write name="incidentList" property="incSourceLink"/></a></td>
                                    </tr>
                                </logic:iterate>
                            </logic:present>
                            </tbody>
                        </table>
                    </div>
                    <div class="panel-heading"><B>Project Pictures</B></div>
                    <div class="panel-body" style="padding: 0px!important;">
                        <table class="table table-condensed">
                            <tbody>
                            <tr>
                                <td width="100%" class="text-center">
                                        <%--************* start album *************--%>
                                    <link rel="stylesheet" href="/pages/resources/album//blueimp-gallery.min.css">
                                    <div id="links">
                                        <logic:present name="pmsProjectAlbumList">
                                            <logic:iterate id="pmsProjectAlbumList" name="pmsProjectAlbumList" type="eu.pms.project.database.PmsProjectAlbum">
                                                <div class="col-md-6 col-xs-6">
                                                    <a data-gallery="" title="" href="/downloadImgAlbum.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>">
                                                        <img class="thumbnail img-responsive center-block"  src="/downloadImgAlbum.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>">
                                                    </a>
                                                </div>
                                            </logic:iterate>
                                        </logic:present>
                                    </div>
                                    <!-- The Bootstrap Image Gallery lightbox, should be a child element of the document body -->
                                    <div id="blueimp-gallery" class="blueimp-gallery">
                                        <!-- The container for the modal slides -->
                                        <div class="slides"></div>
                                        <!-- Controls for the borderless lightbox -->
                                        <h3 class="title"></h3>
                                        <a class="prev">‹</a>
                                        <a class="next">›</a>
                                        <a class="close">×</a>
                                        <a class="play-pause"></a>
                                        <ol class="indicator"></ol>
                                        <!-- The modal dialog, which will be used to wrap the lightbox content -->
                                        <div class="modal fade">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" aria-hidden="true">×</button>
                                                        <h4 class="modal-title"></h4>
                                                    </div>
                                                    <div class="modal-body next"></div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-default pull-left prev">
                                                            <i class="glyphicon glyphicon-chevron-left"></i>
                                                            Previous
                                                        </button>
                                                        <button type="button" class="btn btn-primary next">
                                                            Next
                                                            <i class="glyphicon glyphicon-chevron-right"></i>
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <script src="/pages/resources/album/jquery.blueimp-gallery.min.js"></script>
                                        <%--************* end album *************--%>
                                    </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>

<%--*****************************************************--%>

                <div class="form-group row hidden-print">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditProject.do?proId=<%=request.getParameter("proId")%>'"
                                class="btn btn-primary">Edit
                        </button>
                        <button type="button" onclick="javaScript:window.history.back();"
                                class="btn btn-primary">Back
                        </button>
                    </div>
                </div>
            </html:form>


        </div>


    </div>
    </div>
</article>


<%--********************************* validate script*****************************--%>
<script>
    document.getElementsByName("proBudgetTxt")[0].value = parseFloat(document.getElementsByName("proBudgetTxt")[0].value.replace(/,/g, ""))
            .toFixed(2)
            .toString()
            .replace(/\B(?=(\d{3})+(?!\d))/g, ",");

        document.getElementsByName("proBudget")[0].value = document.getElementsByName("proBudgetTxt")[0].value.replace(/,/g, "")
</script>