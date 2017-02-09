<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script type="text/javascript">
    $(function () {
        $("#warNo").attr("placeholder", "Warning Number");
        $("#warWarnedName").attr("placeholder", "Warned Name");
        $("#warWarnedId").attr("placeholder", "Warned Id");
        $("#warLatitude").attr("placeholder", "Latitude");
        $("#warLongitude").attr("placeholder", "Longitude");
        $("#warType").attr("placeholder", "Warning Type");
        $("#warStructType").attr("placeholder", "Struct Type");
        $("#warIssueDate").attr("placeholder", "Issue Date");
        $("#warSubmitDate").attr("placeholder", "Submit Date");
        $("#warReceptionistId").attr("placeholder", "Receptionist Id");
        $("#warReceptionistName").attr("placeholder", "Receptionist Name");
        $("#warReceptionDate").attr("placeholder", "Reception Date");
        $("#warStatus").attr("placeholder", "Status");
        $("#warNotes").attr("placeholder", "Notes");
    });
</script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Warning Information
        </a><span class=""> > </span><span>Warnings</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Warning</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditWarning">
                    <h2 class="titleSep"><span>Warning Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warNo" class="col-sm-3 col-form-label">Warning Number:</label>
                        <div class="col-sm-9">
                            <html:hidden property="warId"/>
                            <html:text property="warNo" styleClass="form-control" styleId="warNo" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warWarnedId" class="col-sm-3 col-form-label">Warned Id:</label>
                        <div class="col-sm-9">
                             <html:text property="warWarnedId" styleClass="form-control" styleId="warWarnedId" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warWarnedName" class="col-sm-3 col-form-label">Warned Name:</label>
                        <div class="col-sm-9">
                            <html:text property="warWarnedName" styleClass="form-control" styleId="warWarnedName" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warType" class="col-sm-3 col-form-label">Warning Type:</label>
                        <div class="col-sm-9">
                            <html:select property="warType"
                                         styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Stop working</html:option>
                                <html:option value="2">Demolition Order</html:option>
                                <html:option value="3">Confiscation order</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comId" class="col-sm-3 col-form-label">Community:</label>
                        <div class="col-sm-9">
                            <html:select property="comId"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="communityList">
                                    <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="comId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="donId" class="col-sm-3 col-form-label">Donor:</label>
                        <div class="col-sm-9">
                            <html:select property="donId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="dononrList">
                                    <html:options collection="dononrList" property="donId" labelProperty="donName"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="donId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warLatitude" class="col-sm-3 col-form-label">Latitude:</label>
                        <div class="col-sm-9">
                            <html:text property="warLatitude" styleClass="form-control" styleId="warLatitude" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warLongitude" class="col-sm-3 col-form-label">Longitude:</label>
                        <div class="col-sm-9">
                            <html:text property="warLongitude" styleClass="form-control" styleId="warLongitude" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warStructType" class="col-sm-3 col-form-label">Struct Type:</label>
                        <div class="col-sm-9">
                            <html:select property="warStructType"
                                         styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Residential</html:option>
                                <html:option value="2">In ProcessLivestock barn</html:option>
                                <html:option value="3">Commercial</html:option>
                                <html:option value="4">Industrial</html:option>
                                <html:option value="5">Agricultural</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warIssueDate" class="col-sm-3 col-form-label">Issue Date:</label>
                        <div class='input-group date col-sm-9' id='wIssueDate'>
                            <html:text property="warIssueDate" styleClass="form-control" styleId="warIssueDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wIssueDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warSubmitDate" class="col-sm-3 col-form-label">Submit Date:</label>
                        <div class='input-group date col-sm-9' id='wSubmitDate'>
                            <html:text property="warSubmitDate" styleClass="form-control" styleId="warSubmitDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wSubmitDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                    <div class="col-md-6">
                        <label for="warReceptionistId" class="col-sm-3 col-form-label">Receptionist Id:</label>
                        <div class="col-sm-9">
                            <html:text property="warReceptionistId" styleClass="form-control" styleId="warReceptionistId" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warReceptionistName" class="col-sm-3 col-form-label">Receptionist Name:</label>
                        <div class="col-sm-9">
                            <html:text property="warReceptionistName" styleClass="form-control" styleId="warReceptionistName" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warReceptionDate" class="col-sm-3 col-form-label">Reception Date:</label>
                        <div class='input-group date col-sm-9' id='wReceptionDate'>
                            <html:text property="warReceptionDate" styleClass="form-control" styleId="warReceptionDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wReceptionDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warStatus" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="warStatus"
                                         styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Executed</html:option>
                                <html:option value="2">In Process</html:option>
                                <html:option value="3">On hold - Legal action</html:option>
                                <html:option value="4">Closed/Cancelled</html:option>
                                <html:option value="5">Ready for Execution</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warNotes" class="col-sm-3 col-form-label">Notes:</label>
                        <div class="col-sm-9">
                            <html:text property="warNotes" styleClass="form-control" styleId="warNotes" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditWarning.do?warId=<%=request.getParameter("warId")%>'"
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
