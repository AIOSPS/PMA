<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#intrNo").attr("placeholder", "Programme Number");
        $("#intrNo").prop('required', true);
        $("#intrTitle").attr("placeholder", "Programme Title");
        $("#intrTitle").prop('required', true);
        $("#intrDuration").attr("placeholder", "Programme Duration");
        $("#intrDuration").prop('required', true);
        $("#intrDescription").attr("placeholder", "Programme Descrpition");
        $("#intrDescription").prop('required', true);
        $("#btcNavisionCode").attr("placeholder", "BTC Navision Code");
        $("#btcNavisionCode").prop('required', true);
        $("#partInstitution").attr("placeholder", "Partner Institution");
        $("#partInstitution").prop('required', true);
        $("#agrmDuration").attr("placeholder", "Agreement Duration");
        $("#agrmDuration").prop('required', true);
        $("#estmStartDate").attr("placeholder", "Estimate Start Date");
        $("#estmStartDate").prop('required', true);
        $("#contPartnerCountry").attr("placeholder", "Partner Contribution");
        $("#contPartnerCountry").prop('required', true);
        $("#belgContribution").attr("placeholder", "Belgian Contribution");
        $("#belgContribution").prop('required', true);
        $("#secCode").attr("placeholder", "Sector");
        $("#secCode").prop('required', true);
        $("#oallObjective").attr("placeholder", "Overall Objective");
        $("#oallObjective").prop('required', true);
        $("#agrmSignDate").attr("placeholder", "Agreement Sign Date");
        $("#agrmSignDate").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Programme Information
        </a><span class=""> > </span><span>Programmes</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Programme</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditProgramme">
                <h2 class="titleSep"><span>Programme Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intrNo" class="col-sm-3 col-form-label">Programme Number:</label>
                        <div class="col-sm-9">
                            <html:text property="intrNo" styleClass="form-control" styleId="intrNo" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intrTitle" class="col-sm-3 col-form-label">Programme Title:</label>
                        <div class="col-sm-9">
                            <html:text property="intrTitle" styleClass="form-control" styleId="intrTitle" disabled="true"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intrDuration" class="col-sm-3 col-form-label">Programme Duration:</label>
                        <div class="col-sm-9">
                            <html:text property="intrDuration" styleClass="form-control" styleId="intrDuration" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intrDescription" class="col-sm-3 col-form-label">Programme Description:</label>
                        <div class="col-sm-9">
                            <html:text property="intrDescription" styleClass="form-control" styleId="intrDescription" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="btcNavisionCode" class="col-sm-3 col-form-label">BTC Navision Code:</label>

                        <div class='col-sm-9'>
                            <html:text property="btcNavisionCode" styleClass="form-control" styleId="btcNavisionCode" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="partInstitution" class="col-sm-3 col-form-label">Partner Institution:</label>

                        <div class='col-sm-9'>
                            <html:text property="partInstitution" styleClass="form-control" styleId="partInstitution" disabled="true"/>
                        </div>
                    </div>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="agrmDuration" class="col-sm-3 col-form-label">Agreement Duration:</label>
                        <div class="col-sm-9">
                            <html:text property="agrmDuration" styleClass="form-control" styleId="agrmDuration" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="estmStartDate" class="col-sm-3 col-form-label">Estimation start Date:</label>
                        <div class="input-group date col-sm-9" id='pestmStartDate'>
                            <html:text property="estmStartDate" styleClass="form-control" styleId="estmStartDate" disabled="true"/>
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
                            <html:text property="contPartnerCountry" styleClass="form-control" styleId="contPartnerCountry" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="belgContribution" class="col-sm-3 col-form-label">Belgian Contribution:</label>
                        <div class="col-sm-9">
                            <html:text property="belgContribution" styleClass="form-control" styleId="belgContribution" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secCode" class="col-sm-3 col-form-label">Sector:</label>
                        <div class="col-sm-9">
                            <%--<html:text property="secCode" styleClass="form-control" styleId="secCode" disabled="true"/>--%>
                                <html:select property="secCode" styleClass="selectpicker form-control" disabled="true">
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
                            <html:text property="oallObjective" styleClass="form-control" styleId="oallObjective" disabled="true"/>
                        </div>
                    </div>

                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="agrmSignDate" class="col-sm-3 col-form-label">Agreement Sign Date:</label>

                        <div class="input-group date col-sm-9" id='pagrmSignDate'>
                            <html:text property="agrmSignDate" styleClass="form-control" styleId="agrmSignDate" disabled="true"/>
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

                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditProgramme.do?intrNo=<%=request.getParameter("intrNo")%>'"
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