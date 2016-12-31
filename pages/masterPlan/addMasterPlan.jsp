<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#masId").attr("placeholder", "masId");
        $("#masId").prop('required', true);
        $("#impId").attr("placeholder", "impId");
        $("#impId").prop('required', true);
        $("#masMpNo").attr("placeholder", "masMpNo");
        $("#masMpNo").prop('required', true);
        $("#masMpName").attr("placeholder", "masMpName");
        $("#masMpName").prop('required', true);
        $("#masStatus").attr("placeholder", "masStatus");
        $("#masStatus").prop('required', true);
        $("#masStatusIca").attr("placeholder", "masStatusIca");
        $("#masStatusIca").prop('required', true);
        $("#masFirstSubmitDateToIca").attr("placeholder", "masFirstSubmitDateToIca");
        $("#masFirstSubmitDateToIca").prop('required', true);
        $("#masLastSubmitDateToIca").attr("placeholder", "masLastSubmitDateToIca");
        $("#masLastSubmitDateToIca").prop('required', true);
        $("#masNoSessionWithIca").attr("placeholder", "masNoSessionWithIca");
        $("#masNoSessionWithIca").prop('required', true);
        $("#masSubmitToMod").attr("placeholder", "masSubmitToMod");
        $("#masSubmitToMod").prop('required', true);
        $("#masApprovalDate").attr("placeholder", "masApprovalDate");
        $("#masApprovalDate").prop('required', true);
        $("#masPublicationDate").attr("placeholder", "masPublicationDate");
        $("#masPublicationDate").prop('required', true);
        $("#masLastDateForObjection").attr("placeholder", "masLastDateForObjection");
        $("#masLastDateForObjection").prop('required', true);
        $("#masDateOfFinalPublication").attr("placeholder", "masDateOfFinalPublication");
        $("#masDateOfFinalPublication").prop('required', true);
        $("#masApprovedPlanedArea").attr("placeholder", "masApprovedPlanedArea");
        $("#masApprovedPlanedArea").prop('required', true);
        $("#masVillageAdminBoarder").attr("placeholder", "masVillageAdminBoarder");
        $("#masVillageAdminBoarder").prop('required', true);
        $("#masNote").attr("placeholder", "masNote");
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
                <h1>Create a New Master Plan</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addMasterPlan">
                <h2 class="titleSep"><span>Master Plan Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masId" class="col-sm-3 col-form-label">masId:</label>
                        <div class="col-sm-9">
                            <html:text property="masId" styleClass="form-control" styleId="masId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="impId" class="col-sm-3 col-form-label">impId:</label>
                        <div class="col-sm-9">
                            <html:select property="impId"
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
                        <label for="masMpNo" class="col-sm-3 col-form-label">masMpNo:</label>
                        <div class="col-sm-9">
                            <html:text property="masMpNo" styleClass="form-control" styleId="masMpNo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masMpName" class="col-sm-3 col-form-label">masMpName:</label>
                        <div class="col-sm-9">
                            <html:text property="masMpName" styleClass="form-control" styleId="masMpName"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masStatus" class="col-sm-3 col-form-label">masStatus:</label>
                        <div class="col-sm-9">
                            <html:text property="masStatus" styleClass="form-control" styleId="masStatus"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masStatusIca" class="col-sm-3 col-form-label">masStatusIca:</label>
                        <div class="col-sm-9">
                            <html:text property="masStatusIca" styleClass="form-control" styleId="masStatusIca"/>
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
                        <label for="masFirstSubmitDateToIca" class="col-sm-3 col-form-label">masFirstSubmitDateToIca:</label>

                        <div class='input-group date col-sm-9' id='mFirstSubmitDateToIca'>
                            <html:text property="masFirstSubmitDateToIca" styleClass="form-control" styleId="masFirstSubmitDateToIca"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masLastSubmitDateToIca" class="col-sm-3 col-form-label">masLastSubmitDateToIca:</label>

                        <div class='input-group date col-sm-9' id='mLastSubmitDateToIca'>
                            <html:text property="masLastSubmitDateToIca" styleClass="form-control" styleId="masLastSubmitDateToIca"/>
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
                        <label for="masNoSessionWithIca" class="col-sm-3 col-form-label">masNoSessionWithIca:</label>
                        <div class="col-sm-9">
                            <html:text property="masNoSessionWithIca" styleClass="form-control" styleId="masNoSessionWithIca"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masSubmitToMod" class="col-sm-3 col-form-label">masSubmitToMod:</label>
                        <div class="col-sm-9">
                            <html:text property="masSubmitToMod" styleClass="form-control" styleId="masSubmitToMod"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="masApprovalDate" class="col-sm-3 col-form-label">masApprovalDate:</label>

                        <div class='input-group date col-sm-9' id='mApprovalDate'>
                            <html:text property="masApprovalDate" styleClass="form-control" styleId="masApprovalDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masPublicationDate" class="col-sm-3 col-form-label">masPublicationDate:</label>

                        <div class='input-group date col-sm-9' id='mPublicationDate'>
                            <html:text property="masPublicationDate" styleClass="form-control" styleId="masPublicationDate"/>
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
                        <label for="masLastDateForObjection" class="col-sm-3 col-form-label">masLastDateForObjection:</label>

                        <div class='input-group date col-sm-9' id='mLastDateForObjection'>
                            <html:text property="masLastDateForObjection" styleClass="form-control" styleId="masLastDateForObjection"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masDateOfFinalPublication" class="col-sm-3 col-form-label">masDateOfFinalPublication:</label>

                        <div class='input-group date col-sm-9' id='mDateOfFinalPublication'>
                            <html:text property="masDateOfFinalPublication" styleClass="form-control" styleId="masDateOfFinalPublication"/>
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
                        <label for="masApprovedPlanedArea" class="col-sm-3 col-form-label">masApprovedPlanedArea:</label>
                        <div class="col-sm-9">
                            <html:text property="masApprovedPlanedArea" styleClass="form-control" styleId="masApprovedPlanedArea"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masVillageAdminBoarder" class="col-sm-3 col-form-label">masVillageAdminBoarder:</label>
                        <div class="col-sm-9">
                            <html:text property="masVillageAdminBoarder" styleClass="form-control" styleId="masVillageAdminBoarder"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="masNote" class="col-sm-3 col-form-label">masNote:</label>
                        <div class="col-sm-9">
                            <html:textarea property="masNote" styleClass="form-control" rows="6"/>
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
                                         styleClass="selectpicker form-control">
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
                                         styleClass="selectpicker form-control">
                                <logic:present name="communityList">
                                    <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>

                        </div>

                    </div>
                </div>



                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <html:submit value="Submit" styleClass="btn btn-primary"/>
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
        defaultText: "Please Enter The masId ",
        emptyText: "Please Enter The masId ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("impId")[0], {
        defaultText: "Please Enter The impId ",
        emptyText: "Please Enter The impId ",
    });
    InvalidInputHelper(document.getElementsByName("masMpNo")[0], {
        defaultText: "Please Enter The masMpNo ",
        emptyText: "Please Enter The masMpNo ",
    });
    InvalidInputHelper(document.getElementsByName("masMpName")[0], {
        defaultText: "Please Enter The masMpName ",
        emptyText: "Please Enter The masMpName ",
    });
    InvalidInputHelper(document.getElementsByName("masStatus")[0], {
        defaultText: "Please Enter The masStatus ",
        emptyText: "Please Enter The masStatus ",
    });
    InvalidInputHelper(document.getElementsByName("masStatusIca")[0], {
        defaultText: "Please Enter The masStatusIca ",
        emptyText: "Please Enter The masStatusIca ",
    });
    InvalidInputHelper(document.getElementsByName("masFirstSubmitDateToIca")[0], {
        defaultText: "Please Enter The masFirstSubmitDateToIca ",
        emptyText: "Please Enter The masFirstSubmitDateToIca ",
    });
    InvalidInputHelper(document.getElementsByName("masLastSubmitDateToIca")[0], {
        defaultText: "Please Enter The masLastSubmitDateToIca ",
        emptyText: "Please Enter The masLastSubmitDateToIca ",
    });
    InvalidInputHelper(document.getElementsByName("masNoSessionWithIca")[0], {
        defaultText: "Please Enter The masNoSessionWithIca ",
        emptyText: "Please Enter The masNoSessionWithIca ",
    });
    InvalidInputHelper(document.getElementsByName("masSubmitToMod")[0], {
        defaultText: "Please Enter The masSubmitToMod ",
        emptyText: "Please Enter The masSubmitToMod ",
    });
    InvalidInputHelper(document.getElementsByName("masApprovalDate")[0], {
        defaultText: "Please Enter The masApprovalDate ",
        emptyText: "Please Enter The masApprovalDate ",
    });
    InvalidInputHelper(document.getElementsByName("masPublicationDate")[0], {
        defaultText: "Please Enter The masPublicationDate ",
        emptyText: "Please Enter The masPublicationDate ",
    });
    InvalidInputHelper(document.getElementsByName("masLastDateForObjection")[0], {
        defaultText: "Please Enter The masLastDateForObjection ",
        emptyText: "Please Enter The masLastDateForObjection ",
    });
    InvalidInputHelper(document.getElementsByName("masDateOfFinalPublication")[0], {
        defaultText: "Please Enter The masDateOfFinalPublication ",
        emptyText: "Please Enter The masDateOfFinalPublication ",
    });
    InvalidInputHelper(document.getElementsByName("masApprovedPlanedArea")[0], {
        defaultText: "Please Enter The masApprovedPlanedArea ",
        emptyText: "Please Enter The masApprovedPlanedArea ",
    });
    InvalidInputHelper(document.getElementsByName("masVillageAdminBoarder")[0], {
        defaultText: "Please Enter The masVillageAdminBoarder ",
        emptyText: "Please Enter The masVillageAdminBoarder ",
    });
    InvalidInputHelper(document.getElementsByName("masNote")[0], {
        defaultText: "Please Enter The masNote ",
        emptyText: "Please Enter The masNote ",
    });

</script>
