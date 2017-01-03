<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#masId").attr("placeholder", "Master Plan Id");
        $("#masId").prop('required', true);
        $("#impId").attr("placeholder", "Implementer");
        $("#impId").prop('required', true);
        $("#masMpNo").attr("placeholder", "Master Plan No");
        $("#masMpNo").prop('required', true);
        $("#masMpName").attr("placeholder", "Master Plan Name");
        $("#masMpName").prop('required', true);
        $("#masStatus").attr("placeholder", "Status");
        $("#masStatus").prop('required', true);
        $("#masStatusIca").attr("placeholder", "Status Ica");
        $("#masStatusIca").prop('required', true);
        $("#masFirstSubmitDateToIca").attr("placeholder", "First Submit Date To Ica");
        $("#masFirstSubmitDateToIca").prop('required', true);
        $("#masLastSubmitDateToIca").attr("placeholder", "Last Submit Date To Ica");
        $("#masLastSubmitDateToIca").prop('required', true);
        $("#masNoSessionWithIca").attr("placeholder", "No Session With Ica");
        $("#masNoSessionWithIca").prop('required', true);
        $("#masSubmitToMod").attr("placeholder", "Submit To Mod");
        $("#masSubmitToMod").prop('required', true);
        $("#masApprovalDate").attr("placeholder", "Approval Date");
        $("#masApprovalDate").prop('required', true);
        $("#masPublicationDate").attr("placeholder", "Publication Date");
        $("#masPublicationDate").prop('required', true);
        $("#masLastDateForObjection").attr("placeholder", "Last Date For Objection");
        $("#masLastDateForObjection").prop('required', true);
        $("#masDateOfFinalPublication").attr("placeholder", "Date Of Final Publication");
        $("#masDateOfFinalPublication").prop('required', true);
        $("#masApprovedPlanedArea").attr("placeholder", "Approved Planed Area");
        $("#masApprovedPlanedArea").prop('required', true);
        $("#masVillageAdminBoarder").attr("placeholder", "Village Admin Boarder");
        $("#masVillageAdminBoarder").prop('required', true);
        $("#masNote").attr("placeholder", "Note");
        $("#masNote").prop('required', true);
    });
</script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Master Plan Information
        </a><span class=""> > </span><span>Master plan</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Master plan</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditMasterPlan">
                <h2 class="titleSep"><span>Master Plan Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masId" class="col-sm-3 col-form-label">Master Plan Id:</label>
                        <div class="col-sm-9">
                            <html:text property="masId" styleClass="form-control" styleId="masId" disabled="true"/>
                            <html:hidden property="masId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="impId" class="col-sm-3 col-form-label">Implementer:</label>
                        <div class="col-sm-9">
                            <html:select property="impId"
                                         styleClass="selectpicker form-control" disabled="true">
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
                        <label for="masMpNo" class="col-sm-3 col-form-label">Master Plan No:</label>
                        <div class="col-sm-9">
                            <html:text property="masMpNo" styleClass="form-control" styleId="masMpNo" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masMpName" class="col-sm-3 col-form-label">Master Plan Name:</label>
                        <div class="col-sm-9">
                            <html:text property="masMpName" styleClass="form-control" styleId="masMpName" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masStatus" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:text property="masStatus" styleClass="form-control" styleId="masStatus" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masStatusIca" class="col-sm-3 col-form-label">Status Ica:</label>
                        <div class="col-sm-9">
                            <html:text property="masStatusIca" styleClass="form-control" styleId="masStatusIca" disabled="true"/>
                                <%--<html:select property="proStatus" styleClass="selectpicker form-control">--%>
                                <%--<html:option value="1">New</html:option>--%>
                                <%--<html:option value="2">Stopped</html:option>--%>
                                <%--<html:option value="3">Completed</html:option>--%>
                                <%--</html:select>--%>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masFirstSubmitDateToIca" class="col-sm-3 col-form-label">First Submit Date To Ica:</label>

                        <div class='input-group date col-sm-9' id='mFirstSubmitDateToIca'>
                            <html:text property="masFirstSubmitDateToIca" styleClass="form-control" styleId="masFirstSubmitDateToIca" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masLastSubmitDateToIca" class="col-sm-3 col-form-label">Last Submit Date To Ica:</label>

                        <div class='input-group date col-sm-9' id='mLastSubmitDateToIca'>
                            <html:text property="masLastSubmitDateToIca" styleClass="form-control" styleId="masLastSubmitDateToIca" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#mFirstSubmitDateToIca').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#mLastSubmitDateToIca').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masNoSessionWithIca" class="col-sm-3 col-form-label">No Session With Ica:</label>
                        <div class="col-sm-9">
                            <html:text property="masNoSessionWithIca" styleClass="form-control" styleId="masNoSessionWithIca" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masSubmitToMod" class="col-sm-3 col-form-label">Submit To Mod:</label>
                        <div class="col-sm-9">
                            <html:text property="masSubmitToMod" styleClass="form-control" styleId="masSubmitToMod" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masApprovalDate" class="col-sm-3 col-form-label">Approval Date:</label>

                        <div class='input-group date col-sm-9' id='mApprovalDate'>
                            <html:text property="masApprovalDate" styleClass="form-control" styleId="masApprovalDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masPublicationDate" class="col-sm-3 col-form-label">Publication Date:</label>

                        <div class='input-group date col-sm-9' id='mPublicationDate'>
                            <html:text property="masPublicationDate" styleClass="form-control" styleId="masPublicationDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#mApprovalDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#mPublicationDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masLastDateForObjection" class="col-sm-3 col-form-label">Last Date For Objection:</label>

                        <div class='input-group date col-sm-9' id='mLastDateForObjection'>
                            <html:text property="masLastDateForObjection" styleClass="form-control" styleId="masLastDateForObjection" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masDateOfFinalPublication" class="col-sm-3 col-form-label">Date Of Final Publication:</label>

                        <div class='input-group date col-sm-9' id='mDateOfFinalPublication'>
                            <html:text property="masDateOfFinalPublication" styleClass="form-control" styleId="masDateOfFinalPublication" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#mLastDateForObjection').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#mDateOfFinalPublication').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masApprovedPlanedArea" class="col-sm-3 col-form-label">Approved Planed Area:</label>
                        <div class="col-sm-9">
                            <html:text property="masApprovedPlanedArea" styleClass="form-control" styleId="masApprovedPlanedArea" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masVillageAdminBoarder" class="col-sm-3 col-form-label">Village Admin Boarder:</label>
                        <div class="col-sm-9">
                            <html:text property="masVillageAdminBoarder" styleClass="form-control" styleId="masVillageAdminBoarder" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="masNote" class="col-sm-3 col-form-label">Note:</label>
                        <div class="col-sm-9">
                            <html:textarea property="masNote" styleClass="form-control" rows="6" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label  class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                        </div>
                    </div>
                </div>


                <h2 class="titleSep"><span></span></h2>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="donorMasterPlanList" class="col-sm-3 col-form-label">Donor:</label>
                        <div class="col-sm-9">

                            <html:select property="donorMasterPlanList" multiple="true"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="dononrList">
                                    <html:options collection="dononrList" property="donId" labelProperty="donName"/>
                                </logic:present>
                            </html:select>

                        </div>

                    </div>

                    <div class="col-md-6">

                        <label for="communityMasterPlanList" class="col-sm-3 col-form-label"> Community:</label>
                        <div class="col-sm-9">

                            <html:select property="communityMasterPlanList" multiple="true"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="communityList">
                                    <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>

                        </div>

                    </div>
                </div>

                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditMasterPlan.do?masId=<%=request.getParameter("masId")%>'"
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

    InvalidInputHelper(document.getElementsByName("masId")[0], {
        defaultText: "Please Enter The Master Plan Id ",
        emptyText: "Please Enter The Master Plan Id ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("impId")[0], {
        defaultText: "Please Enter The Implementer ",
        emptyText: "Please Enter The Implementer ",
    });
    InvalidInputHelper(document.getElementsByName("masMpNo")[0], {
        defaultText: "Please Enter The Master Plan No ",
        emptyText: "Please Enter The Master Plan No ",
    });
    InvalidInputHelper(document.getElementsByName("masMpName")[0], {
        defaultText: "Please Enter The Master Plan Name ",
        emptyText: "Please Enter The Master Plan Name ",
    });
    InvalidInputHelper(document.getElementsByName("masStatus")[0], {
        defaultText: "Please Enter The mStatus ",
        emptyText: "Please Enter The Status ",
    });
    InvalidInputHelper(document.getElementsByName("masStatusIca")[0], {
        defaultText: "Please Enter The Status Ica ",
        emptyText: "Please Enter The Status Ica ",
    });
    InvalidInputHelper(document.getElementsByName("masFirstSubmitDateToIca")[0], {
        defaultText: "Please Enter The First Submit Date To Ica ",
        emptyText: "Please Enter The First Submit Date To Ica ",
    });
    InvalidInputHelper(document.getElementsByName("masLastSubmitDateToIca")[0], {
        defaultText: "Please Enter The Last Submit Date To Ica ",
        emptyText: "Please Enter The Last Submit Date To Ica ",
    });
    InvalidInputHelper(document.getElementsByName("masNoSessionWithIca")[0], {
        defaultText: "Please Enter The No Session With Ica ",
        emptyText: "Please Enter The No Session With Ica ",
    });
    InvalidInputHelper(document.getElementsByName("masSubmitToMod")[0], {
        defaultText: "Please Enter The Submit To Mod ",
        emptyText: "Please Enter The Submit To Mod ",
    });
    InvalidInputHelper(document.getElementsByName("masApprovalDate")[0], {
        defaultText: "Please Enter The Approval Date ",
        emptyText: "Please Enter The Approval Date ",
    });
    InvalidInputHelper(document.getElementsByName("masPublicationDate")[0], {
        defaultText: "Please Enter The Publication Date ",
        emptyText: "Please Enter The Publication Date ",
    });
    InvalidInputHelper(document.getElementsByName("masLastDateForObjection")[0], {
        defaultText: "Please Enter The Last Date For Objection ",
        emptyText: "Please Enter The Last Date For Objection ",
    });
    InvalidInputHelper(document.getElementsByName("masDateOfFinalPublication")[0], {
        defaultText: "Please Enter The Date Of Final Publication ",
        emptyText: "Please Enter The Date Of Final Publication ",
    });
    InvalidInputHelper(document.getElementsByName("masApprovedPlanedArea")[0], {
        defaultText: "Please Enter The Approved Planed Area ",
        emptyText: "Please Enter The Approved Planed Area ",
    });
    InvalidInputHelper(document.getElementsByName("masVillageAdminBoarder")[0], {
        defaultText: "Please Enter The Village Admin Boarder ",
        emptyText: "Please Enter The Village Admin Boarder ",
    });
    InvalidInputHelper(document.getElementsByName("masNote")[0], {
        defaultText: "Please Enter The Note ",
        emptyText: "Please Enter The Note ",
    });
</script>