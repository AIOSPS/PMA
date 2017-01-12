<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
//        $("#agrId").attr("placeholder", "Agriculture Id");
//        $("#agrId").prop('required', true);
        $("#comId").attr("placeholder", "Community");
        $("#comId").prop('required', true);
        $("#agrArea").attr("placeholder", "Agriculture Area");
        $("#agrArea").prop('required', true);
        $("#agrNoCowYear").attr("placeholder", "No of Cow");
        $("#agrNoCowYear").prop('required', true);
        $("#agrNoSheepYear").attr("placeholder", "No of Sheep");
        $("#agrNoSheepYear").prop('required', true);
        $("#agrCostWaterTank").attr("placeholder", "Cost Water Tank");
        $("#agrCostWaterTank").prop('required', true);
        $("#agrHerdingArea").attr("placeholder", "Herding Area");
        $("#agrHerdingArea").prop('required', true);
        $("#agrMilitaryArea").attr("placeholder", "Military Area");
        $("#agrMilitaryArea").prop('required', true);
        $("#agrBypassRoadArea").attr("placeholder", "Bypass Road Area");
        $("#agrBypassRoadArea").prop('required', true);
        $("#agrSurveyDate").attr("placeholder", "Survey Date");
        $("#agrSurveyDate").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Agriculture Socio Information
        </a><span class=""> > </span><span>Agriculture Socio</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Create a New Agriculture Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addAgricultureSocio">
                <h2 class="titleSep"><span>Agriculture Socio Information</span></h2>

                <div class="form-group row">
                    <%--<div class="col-md-6">--%>
                        <%--<label for="agrId" class="col-sm-3 col-form-label">Agriculture Id:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="agrId" styleClass="form-control" styleId="agrId"/>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="col-md-6">
                        <label for="comId" class="col-sm-3 col-form-label">Community:</label>
                        <div class="col-sm-9">
                            <html:select property="comId"
                                         styleClass="selectpicker form-control">
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
                        <label for="agrArea" class="col-sm-3 col-form-label">Agriculture Area:</label>
                        <div class="col-sm-9">
                            <html:text property="agrArea" styleClass="form-control" styleId="agrArea"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="agrNoCowYear" class="col-sm-3 col-form-label">No of Cow:</label>
                        <div class="col-sm-9">
                            <html:text property="agrNoCowYear" styleClass="form-control" styleId="agrNoCowYear"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="agrNoSheepYear" class="col-sm-3 col-form-label">No of Sheep:</label>
                        <div class="col-sm-9">
                            <html:text property="agrNoSheepYear" styleClass="form-control" styleId="agrNoSheepYear"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="agrCostWaterTank" class="col-sm-3 col-form-label">Cost of Water Tank:</label>
                        <div class="col-sm-9">
                            <html:text property="agrCostWaterTank" styleClass="form-control" styleId="agrCostWaterTank"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="agrHerdingArea" class="col-sm-3 col-form-label">Herding Area:</label>
                        <div class="col-sm-9">
                            <html:text property="agrHerdingArea" styleClass="form-control" styleId="agrHerdingArea"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="agrMilitaryArea" class="col-sm-3 col-form-label">Military Area:</label>
                        <div class="col-sm-9">
                            <html:text property="agrMilitaryArea" styleClass="form-control" styleId="agrMilitaryArea"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="agrBypassRoadArea" class="col-sm-3 col-form-label">Bypass Road Area:</label>
                        <div class="col-sm-9">
                            <html:text property="agrBypassRoadArea" styleClass="form-control" styleId="agrBypassRoadArea"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="agrSurveyDate" class="col-sm-3 col-form-label">Survey Date:</label>

                        <div class='input-group date col-sm-9' id='aSurveyDate'>
                            <html:text property="agrSurveyDate" styleClass="form-control" styleId="agrSurveyDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#aSurveyDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                    <div class="col-md-6">

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


//    InvalidInputHelper(document.getElementsByName("agrId")[0], {
//        defaultText: "Please Enter The Agriculture Id ",
//        emptyText: "Please Enter The Agriculture Id ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
//    });
    InvalidInputHelper(document.getElementsByName("comId")[0], {
        defaultText: "Please Enter The Community ",
        emptyText: "Please Enter The Community ",
    });
    InvalidInputHelper(document.getElementsByName("agrArea")[0], {
        defaultText: "Please Enter The Agriculture Area ",
        emptyText: "Please Enter The Agriculture Area ",
    });
    InvalidInputHelper(document.getElementsByName("agrNoCowYear")[0], {
        defaultText: "Please Enter The No Cow ",
        emptyText: "Please Enter The No Cow ",
    });
    InvalidInputHelper(document.getElementsByName("agrNoSheepYear")[0], {
        defaultText: "Please Enter The No Sheep ",
        emptyText: "Please Enter The No Sheep ",
    });
    InvalidInputHelper(document.getElementsByName("agrCostWaterTank")[0], {
        defaultText: "Please Enter The Cost Water Tank ",
        emptyText: "Please Enter The Cost Water Tank ",
    });
    InvalidInputHelper(document.getElementsByName("agrHerdingArea")[0], {
        defaultText: "Please Enter The Herding Area ",
        emptyText: "Please Enter The Herding Area ",
    });
    InvalidInputHelper(document.getElementsByName("agrMilitaryArea")[0], {
        defaultText: "Please Enter The Military Area ",
        emptyText: "Please Enter The Military Area ",
    });
    InvalidInputHelper(document.getElementsByName("agrBypassRoadArea")[0], {
        defaultText: "Please Enter The BypassRoad Area ",
        emptyText: "Please Enter The BypassRoad Area ",
    });
    InvalidInputHelper(document.getElementsByName("agrSurveyDate")[0], {
        defaultText: "Please Enter The Survey Date ",
        emptyText: "Please Enter The Survey Date ",
    });


</script>
