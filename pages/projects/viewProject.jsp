<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="eu.pms.project.database.PmsProjectsBenificiary" %>
<%@ page import="eu.pms.project.database.PmsProjectsLocation" %>
<%@ page import="eu.pms.lookup.database.PmsBenificiaryTyp" %>
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


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Project Information
        </a><span class=""> > </span><span>Projects</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Project</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditProject">
                <h2 class="titleSep"><span>Administration</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="donorProjectList" class="col-sm-3 col-form-label">Donor:</label>
                        <div class="col-sm-9">
                            <html:select property="donorProjectList" multiple="true" disabled="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="dononrList">
                                    <html:options collection="dononrList" property="donId" labelProperty="donName"/>
                                </logic:present>
                            </html:select>
                        </div>

                    </div>

                    <div class="col-md-6">

                        <label for="implementerProjectList" class="col-sm-3 col-form-label">Implementer:</label>
                        <div class="col-sm-9">
                            <html:select property="implementerProjectList" multiple="true" disabled="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="implementerList">
                                    <html:options collection="implementerList" property="impId"
                                                  labelProperty="impName"/>
                                </logic:present>
                            </html:select>
                        </div>

                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="devId" class="col-sm-3 col-form-label">Development Agency:</label>
                        <div class="col-sm-9">
                            <html:select property="devId" styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="developmentAgencyList">
                                    <html:options collection="developmentAgencyList" property="devId"
                                                  labelProperty="devAbbName"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <label for="prgId" class="col-sm-3 col-form-label">Programme:</label>
                        <div class="col-sm-9">
                            <html:select property="prgId" styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="programmList">
                                    <html:options collection="programmList" property="prgId" labelProperty="prgTitle"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                </div>


                <h2 class="titleSep"><span>Project Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proId" class="col-sm-3 col-form-label">Project Number:</label>
                        <div class="col-sm-9">
                            <html:text property="proId" styleClass="form-control" styleId="proId" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="secType" class="col-sm-3 col-form-label">Project Type:</label>
                        <div class="col-sm-9">
                            <html:select property="secType" styleClass="selectpicker form-control" disabled="true"
                                         onchange="setProjectTypeConfig(this.value)">
                                <html:option value="H">Humman</html:option>
                                <html:option value="D">Development</html:option>
                                <html:option value="Oth">Others</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label"> Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="secId" styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="clusterHList">
                                    <optgroup label="Humman" id="Humman">
                                        <html:options collection="clusterHList" property="secId"
                                                      labelProperty="secName"/>
                                    </optgroup>
                                </logic:present>
                                <logic:present name="clusterDList">
                                    <optgroup label="Development" id="Development">
                                        <html:options collection="clusterDList" property="secId"
                                                      labelProperty="secName"/>
                                    </optgroup>
                                </logic:present>
                                <logic:present name="clusterOthList">
                                    <optgroup label="Others" id="Others">
                                        <html:options collection="clusterOthList" property="secId"
                                                      labelProperty="secName"/>
                                    </optgroup>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="proTitle" class="col-sm-3 col-form-label">Project Title:</label>
                        <div class="col-sm-9">
                            <html:text property="proTitle" styleClass="form-control" styleId="proTitle" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proDescription" class="col-sm-3 col-form-label">Project Description:</label>
                        <div class="col-sm-9">
                            <html:text property="proDescription" styleClass="form-control" styleId="proDescription" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="statusPr" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="proStatus" styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Design / Approval</html:option>
                                <html:option value="2">Ongoing</html:option>
                                <html:option value="3">Delayed</html:option>
                                <html:option value="4">Completed</html:option>
                                <html:option value="5">On-Hold</html:option>
                                <html:option value="6">Closed</html:option>
                                <html:option value="7">Cancelled</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="prStDate" class="col-sm-3 col-form-label">Start Date:</label>

                        <div class='input-group date col-sm-9' id='pStartDate'>
                            <html:text property="proStartDate" styleClass="form-control" styleId="proStartDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="prEnDate" class="col-sm-3 col-form-label">End Date:</label>

                        <div class='input-group date col-sm-9' id='pEndDate'>
                            <html:text property="proEndDate" styleClass="form-control" styleId="proEndDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#pStartDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#pEndDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proBudget" class="col-sm-3 col-form-label">Budget:</label>
                        <div class="input-group date  col-sm-9">
                            <html:text property="proBudget" styleClass="form-control" styleId="proBudget" disabled="true"/>
                            <span class="input-group-addon input-group-addon1">
                               €
                            </span>
                        </div>
                    </div>
                    <div class="col-md-6">

                        <div class="col-sm-9">
                        </div>
                    </div>
                </div>


                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="prNotes" class="col-sm-3 col-form-label">Project Notes:</label>
                        <div class="col-sm-9">
                            <html:textarea property="proNotes" styleClass="form-control" rows="6" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="prNotes" class="col-sm-3 col-form-label">Project Images:</label>
                        <div class="col-sm-9">
                            <%--************* start album *************--%>
                                <link rel="stylesheet" href="/pages/resources/album//blueimp-gallery.min.css">
                                    <div id="links">
                                        <logic:present name="pmsProjectAlbumList">
                                                <logic:iterate id="pmsProjectAlbumList" name="pmsProjectAlbumList" type="eu.pms.project.database.PmsProjectAlbum">
                                                    <div class="col-md-3 col-xs-2">
                                                    <a data-gallery="" title="" href="/downloadImgAlbum.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>">
                                                        <img class="thumbnail img-responsive" width="80px" height="80px" src="/downloadImgAlbum.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>">
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
                        </div>
                    </div>
                </div>


                <h2 class="titleSep"><span>Location</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic">
                                        <thead>
                                        <tr >
                                            <th width="50%" class="text-center">Latitude</th>
                                            <th width="50%" class="text-center">Longitude</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="comLatitude">
                                                <input type="text" id="comLatitude0" name="comLatitude0"  placeholder='Latitude' class="form-control"/>
                                            </td>
                                            <td data-name="comLongitude">
                                                <input type="text" id="comLongitude0" name="comLongitude0" placeholder='Longitude' class="form-control"/>
                                            </td>
                                        </tr>
                                        <logic:present name="projectLocationList">
                                            <% List projectLocationList = (List) request.getAttribute("projectLocationList");
                                                int count = 1;
                                                Iterator itr = projectLocationList.iterator();
                                                PmsProjectsLocation pmsProjectsLocation = null;
                                                while (itr.hasNext()){
                                                    pmsProjectsLocation = (PmsProjectsLocation) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <td data-name="comLatitude">
                                                    <input type="text" disabled="true" id="comLatitude<%=count%>" name="comLatitude<%=count%>" value="<%=pmsProjectsLocation.getCompId().getComLatitude()%>"  placeholder='Latitude' class="form-control"/>
                                                </td>
                                                <td data-name="comLongitude">
                                                    <input type="text" disabled="true" id="comLongitude<%=count%>" name="comLongitude<%=count%>" value="<%=pmsProjectsLocation.getCompId().getComLongitude()%>" placeholder='Longitude' class="form-control"/>
                                                </td>
                                            </tr>
                                            <%
                                                    count++;
                                                }
                                            %>
                                        </logic:present>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proArea" class="col-sm-3 col-form-label">Project Area:</label>
                        <div class="col-sm-9">
                            <html:select property="proArea" styleClass="selectpicker form-control" disabled="true">
                                <html:option value="A">A</html:option>
                                <html:option value="B">B</html:option>
                                <html:option value="C">C</html:option>
                                <html:option value="EJ">EJ</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend> Cluster</legend>
                            <div class="col-md-6">
                                <label for="proHasCluster" class="col-sm-3 col-form-label">Is Cluster:</label>
                                <fieldset class="col-sm-9" id="isCluster">
                                    <div>

                                        <label class="radio-inline">
                                            <html:radio property="proHasCluster" onclick="setProjectTypeConfig(this.value)" value="1" disabled="true"/>
                                            Yes
                                        </label>


                                        <label class="radio-inline">
                                            <html:radio property="proHasCluster" onclick="setProjectTypeConfig(this.value)" value="0"  disabled="true"/>
                                            No
                                        </label>


                                    </div>
                                </fieldset>
                            </div>

                            <div class="col-md-6  ">
                                <label for="communityProjectList" class="col-sm-3 col-form-label"> Community:</label>
                                <div class="col-sm-9">

                                    <html:select property="communityProjectList" multiple="true" disabled="true"
                                                 styleClass="selectpicker form-control">
                                        <logic:present name="communityList">
                                            <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                        </logic:present>
                                    </html:select>

                                </div>
                            </div>

                        </fieldset>
                    </div>
                </div>


                <h2 class="titleSep"><span>Permit</span></h2>

                <div class="form-group row">
                    <div class="col-md-6  ">
                        <label for="proNeedPermit" class="col-sm-3 col-form-label">Permit Need:</label>
                        <fieldset class="col-sm-9" id="PermitNeed">
                            <div>

                                <label class="radio-inline">
                                    <html:radio property="proNeedPermit" value="1" disabled="true"/>
                                    Yes
                                </label>


                                <label class="radio-inline">
                                    <html:radio property="proNeedPermit" value="0" disabled="true"/>
                                    No
                                </label>


                            </div>
                        </fieldset>
                    </div>

                    <div class="col-md-6  ">
                        <label for="preId" class="col-sm-3 col-form-label">Permit Number:</label>
                        <div class="col-sm-9">
                            <html:select property="preId" styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="permitList">
                                    <html:options collection="permitList" property="perId" labelProperty="perTitle"/>
                                </logic:present>
                            </html:select>
                        </div>

                    </div>
                </div>
                <h2 class="titleSep"><span>Benificiaries</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic2">
                                        <thead>
                                        <tr >
                                            <th width="50%" class="text-center">Benificiary Type</th>
                                            <th width="50%" class="text-center">Benificiary Total</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="btpId">

                                                <select  class="form-control" id="btpId0" name="btpId0"  >
                                                    <logic:present name="benificiryTypeList">
                                                    <% List benificiryTypeList = (List) request.getAttribute("benificiryTypeList");%>
                                                        <%
                                                            for (int i = 0; i < benificiryTypeList.size(); i++) {
                                                                PmsBenificiaryTyp obj = (PmsBenificiaryTyp) benificiryTypeList.get(i);
                                                        %>
                                                        <option value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                                        <%}%>

                                                    </logic:present>
                                                </select>
                                            </td>
                                            <td data-name="benTotal">
                                                <input type="text" id="benTotal0" name="benTotal0" placeholder='Benificiary Total' class="form-control"/>
                                            </td>
                                        </tr>
                                        <logic:present name="projectBenificiryList">
                                            <% List projectBenificiryList = (List) request.getAttribute("projectBenificiryList");
                                                int count = 1;
                                                Iterator itr = projectBenificiryList.iterator();
                                                PmsProjectsBenificiary pmsProjectsBenificiary = null;
                                                while (itr.hasNext()){
                                                    pmsProjectsBenificiary = (PmsProjectsBenificiary) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <td data-name="btpId">
                                                    <select  class="form-control" disabled="'true" id="btpId<%=count%>" name="btpId<%=count%>" >
                                                        <logic:present name="benificiryTypeList">
                                                            <% List benificiryTypeList = (List) request.getAttribute("benificiryTypeList");%>
                                                            <%
                                                                for (int i = 0; i < benificiryTypeList.size(); i++) {
                                                                    PmsBenificiaryTyp obj = (PmsBenificiaryTyp) benificiryTypeList.get(i);
                                                                    if(pmsProjectsBenificiary.getCompId().getBtpId().equals(obj.getLookupId())){
                                                            %>
                                                            <option selected value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                                            <%}else{%>
                                                            <option value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                                            <% }}%>

                                                        </logic:present>
                                                    </select>
                                                  </td>
                                                <td data-name="benTotal">
                                                    <input type="text" disabled="'true" id="benTotal<%=count%>" name="benTotal<%=count%>" value="<%=pmsProjectsBenificiary.getBenTotal()%>" placeholder='Benificiary Total' class="form-control"/>
                                                </td>
                                            </tr>
                                            <%
                                                    count++;
                                                }
                                            %>
                                        </logic:present>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <h2 class="titleSep"><span>Link to Indicator</span></h2>
                <div class="form-group row">
                    <div class="col-md-6  ">
                        <label for="indicatorProjectList" class="col-sm-3 col-form-label">Indicators:</label>
                        <div class="col-sm-9">
                            <html:select property="indicatorProjectList" styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="indicatorList">
                                    <html:options collection="indicatorList" property="compId.compId"
                                                  labelProperty="indTitle"/>
                                </logic:present>
                            </html:select>
                        </div>

                    </div>
                    <div class="col-md-6  ">
                        <label  class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                        </div>

                    </div>
                </div>
                <h2 class="titleSep"><span>List fo Incidents</span></h2>
                <div class="form-group row">
                    <div class="col-md-12 table-responsive">
                        <table id="listIncidentsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th class="text-center">Ocha ID</th>
                                <th class="text-center">Description</th>
                                <th class="text-center">Incident Date</th>
                                <th class="text-center">Source Link</th>
                                <th class="text-center">Location Lattitude</th>
                                <th class="text-center">Location Longitude</th>
                            </tr>
                            </thead>
                            <tfoot>
                            <tr>
                                <th class="text-center">Ocha ID</th>
                                <th class="text-center">Description</th>
                                <th class="text-center">Incident Date</th>
                                <th class="text-center">Source Link</th>
                                <th class="text-center">Location Lattitude</th>
                                <th class="text-center">Location Longitude</th>

                            </tr>
                            </tfoot>
                            <tbody>
                            <logic:present name="incidentList">
                                <logic:iterate id="incidentList" name="incidentList" type="eu.pms.project.database.PmsIncident">
                                    <tr>
                                        <td ><bean:write name="incidentList" property="incOchaId"/></td>
                                        <td ><bean:write name="incidentList" property="incDescription"/></td>
                                        <td ><bean:write name="incidentList" property="incTimeStampStr"/></td>
                                        <td ><a target="_blank" href="<bean:write name="incidentList" property="incSourceLink"/>"><bean:write name="incidentList" property="incSourceLink"/></a></td>
                                        <td ><bean:write name="incidentList" property="locLatitude"/></td>
                                        <td ><bean:write name="incidentList" property="locLongitude"/></td>
                                    </tr>
                                </logic:iterate>
                            </logic:present>
                            </tbody>
                        </table>
                        <script>
                            $(document).ready(function () {
                                $('#listIncidentsTbl').DataTable();
                            });
                        </script>
                    </div>

                </div>
                <div class="form-group row">
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
    (function (exports) {
        function valOrFunction(val, ctx, args) {
            if (typeof val == "function") {
                return val.apply(ctx, args);
            } else {
                return val;
            }
        }

        function InvalidInputHelper(input, options) {
//            input.setCustomValidity(valOrFunction(options.defaultText, window, [input]));

            function changeOrInput() {
                if (input.value == "") {
                    input.setCustomValidity(valOrFunction(options.emptyText, window, [input]));
                } else {
                    input.setCustomValidity("");
                }
            }

            function invalid() {
                if (input.value == "") {
                    input.setCustomValidity(valOrFunction(options.emptyText, window, [input]));
                } else {
                    input.setCustomValidity(valOrFunction(options.invalidText, window, [input]));
                }
            }

            input.addEventListener("change", changeOrInput);
            input.addEventListener("input", changeOrInput);
//            input.addEventListener("invalid", invalid);
        }

        exports.InvalidInputHelper = InvalidInputHelper;
    })(window);


    InvalidInputHelper(document.getElementsByName("proId")[0], {
        defaultText: "Please Enter The Project ID ",
        emptyText: "Please Enter The Project ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("proTitle")[0], {
        defaultText: "Please Enter The Project Title ",
        emptyText: "Please Enter The Project Title ",
    });
    InvalidInputHelper(document.getElementsByName("proDescription")[0], {
        defaultText: "Please Enter The Project Description ",
        emptyText: "Please Enter The Project Description ",
    });
    InvalidInputHelper(document.getElementsByName("proStartDate")[0], {
        defaultText: "Please Enter The Start Date ",
        emptyText: "Please Enter The Start Date ",
    });
    InvalidInputHelper(document.getElementsByName("proEndDate")[0], {
        defaultText: "Please Enter The End Date ",
        emptyText: "Please Enter The End Date ",
    });
    InvalidInputHelper(document.getElementsByName("proBudget")[0], {
        defaultText: "Please Enter The Project Budjet ",
        emptyText: "Please Enter The Project Budjet ",
    });
</script>