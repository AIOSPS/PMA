<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#intrNo").attr("placeholder", "Intervention Number");
        $("#intrNo").prop('required', true);
        $("#intrTitle").attr("placeholder", "Intervention Title");
        $("#intrTitle").prop('required', true);
        $("#intrDuration").attr("placeholder", "Intervention Duration");
        $("#intrDuration").prop('required', true);
        $("#intrDescription").attr("placeholder", "Intervention Brief Description");
        $("#intrDescription").prop('required', true);
        $("#btcNavisionCode").attr("placeholder", "BTC Navision Code");
        $("#btcNavisionCode").prop('required', true);
        $("#partInstitution").attr("placeholder", "Partner Institution");
        $("#partInstitution").prop('required', true);
        $("#agrmDuration").attr("placeholder", "Duration of Specific Agreement");
        $("#agrmDuration").prop('required', true);
        $("#estmStartDate").attr("placeholder", "Estimate Start-up Date");
        $("#estmStartDate").prop('required', true);
        $("#contPartnerCountry").attr("placeholder", "Partner Contribution");
        $("#contPartnerCountry").prop('required', true);
        $("#belgContribution").attr("placeholder", "Belgian Contribution");
        $("#belgContribution").prop('required', true);
        $("#secCode").attr("placeholder", "Sector (DAC Code)");
        $("#secCode").prop('required', true);
        $("#oallObjective").attr("placeholder", "Overall Objective");
        $("#oallObjective").prop('required', true);
        $("#agrmSignDate").attr("placeholder", "Agreement Sign Date");
        $("#agrmSignDate").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-desktop "></span> Programme Management
        </a><span class=""> > </span><span>Add Programme</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container pd0">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Add Programme</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addProgramme">
                <h2 class="titleSep"><span>Programme Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intrNo" class="col-sm-3 col-form-label">Intervention Number:</label>
                        <div class="col-sm-9">
                            <html:text property="intrNo" styleClass="form-control" styleId="intrNo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intrTitle" class="col-sm-3 col-form-label">Intervention Title:</label>
                        <div class="col-sm-9">
                            <html:text property="intrTitle" styleClass="form-control" styleId="intrTitle"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="btcNavisionCode" class="col-sm-3 col-form-label">BTC Navision Code:</label>

                        <div class='col-sm-9'>
                            <html:text property="btcNavisionCode" styleClass="form-control" styleId="btcNavisionCode"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="agrmDuration" class="col-sm-3 col-form-label">Specific Agreement Duration:</label>
                        <div class="col-sm-9">
                            <html:text property="agrmDuration" styleClass="form-control" styleId="agrmDuration"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intrDescription" class="col-sm-3 col-form-label">Intervention Brief Description:</label>
                        <div class="col-sm-9">
                            <html:text property="intrDescription" styleClass="form-control" styleId="intrDescription"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="partInstitution" class="col-sm-3 col-form-label">Partner Institution:</label>

                        <div class='col-sm-9'>
                            <html:text property="partInstitution" styleClass="form-control" styleId="partInstitution"/>
                        </div>
                    </div>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intrDuration" class="col-sm-3 col-form-label">Intervention Duration:</label>
                        <div class="col-sm-9">
                            <html:text property="intrDuration" styleClass="form-control" styleId="intrDuration"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="estmStartDate" class="col-sm-3 col-form-label">Estimation start Date:</label>
                        <div class="input-group date col-sm-9" id='pestmStartDate'>
                            <html:text property="estmStartDate" styleClass="form-control" styleId="estmStartDate"/>
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"></span>
                            </span>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="contPartnerCountry" class="col-sm-3 col-form-label">Partner Contribution:</label>
                        <div class="col-sm-9">
                            <html:text property="contPartnerCountry" styleClass="form-control" styleId="contPartnerCountry"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="belgContribution" class="col-sm-3 col-form-label">Belgian Contribution:</label>
                        <div class="col-sm-9">
                            <html:text property="belgContribution" styleClass="form-control" styleId="belgContribution"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secCode" class="col-sm-3 col-form-label">Sector:</label>
                        <div class="col-sm-9">
                            <%--<html:text property="secCode" styleClass="form-control" styleId="secCode"/>--%>
                                <html:select property="secCode" styleClass="selectpicker form-control">
                                    <logic:present name="sectorsList">
                                            <html:options collection="sectorsList" property="secId"
                                                          labelProperty="secName"/>
                                    </logic:present>
                                </html:select>
                                <script>
                                    $(function () {
                                        $('[name="secCode"]').eq(0).attr("data-live-search", "true");
                                    });
                                </script>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="oallObjective" class="col-sm-3 col-form-label">Overall Objective:</label>
                        <div class="col-sm-9">
                            <html:text property="oallObjective" styleClass="form-control" styleId="oallObjective"/>
                        </div>
                    </div>

                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="agrmSignDate" class="col-sm-3 col-form-label">Agreement Sign Date:</label>

                        <div class="input-group date col-sm-9" id='pagrmSignDate'>
                            <html:text property="agrmSignDate" styleClass="form-control" styleId="agrmSignDate"/>
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-calendar"></span>
                        </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#pestmStartDate').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                                $('#pagrmSignDate').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>

                    <div class="col-md-6">
                        <%--<label for="oallObjective" class="col-sm-3 col-form-label">Overall Objective:</label>--%>

                        <%--<div class='col-sm-9'>--%>
                            <%--<html:text property="oallObjective" styleClass="form-control" styleId="oallObjective"/>--%>
                        <%--</div>--%>
                    </div>

                </div>

                <div class="form-group row opBtn">
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

    InvalidInputHelper(document.getElementsByName("intrNo")[0], {
        defaultText: "Please Enter The Programme Number ",
        emptyText: "Please Enter The Programme Number ",
    });
    InvalidInputHelper(document.getElementsByName("intrTitle")[0], {
        defaultText: "Please Enter The Programme Title ",
        emptyText: "Please Enter The Programme Title ",
    });
    InvalidInputHelper(document.getElementsByName("intrDuration")[0], {
        defaultText: "Please Enter The Programme Duration ",
        emptyText: "Please Enter The Programme Duration ",
    });
    InvalidInputHelper(document.getElementsByName("intrDescription")[0], {
        defaultText: "Please Enter The Programme Description ",
        emptyText: "Please Enter The Programme Description ",
    });
    InvalidInputHelper(document.getElementsByName("btcNavisionCode")[0], {
        defaultText: "Please Enter The Issue BTC Navision Code ",
        emptyText: "Please Enter The Issue  BTC Navision Code ",
    });
</script>