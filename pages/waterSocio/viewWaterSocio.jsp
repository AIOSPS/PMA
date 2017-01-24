<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#watId").attr("placeholder", "Water Id");
        $("#watId").prop('required', true);
        $("#comId").attr("placeholder", "Community");
        $("#comId").prop('required', true);
        $("#watIsconnected").attr("placeholder", "Is connected");
        $("#watIsconnected").prop('required', true);
        $("#watNetwork").attr("placeholder", "Local Network exist");
        $("#watNetwork").prop('required', true);
        $("#watUseWatTanker").attr("placeholder", "Uses Water Tanker");
        $("#watUseWatTanker").prop('required', true);
        $("#watRainWaterWell").attr("placeholder", "Rain Water Well");
        $("#watRainWaterWell").prop('required', true);
        $("#watNoSprings").attr("placeholder", "Number of Springs");
        $("#watNoSprings").prop('required', true);
        $("#watPriceWater").attr("placeholder", "Price of M3 Water");
        $("#watPriceWater").prop('required', true);
        $("#watFillingPoint").attr("placeholder", "Distance to the Filling Point");
        $("#watFillingPoint").prop('required', true);
        $("#watQuantity").attr("placeholder", "Concerns of  Quality of Water");
        $("#watQuantity").prop('required', true);
        $("#watSurveyDate").attr("placeholder", "Survey Date");
        $("#watSurveyDate").prop('required', true);
    });
</script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Water Socio Information
        </a><span class=""> > </span><span>Water Socio</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Water Socio</h1>
            </div>
            <div class="col-md-4 pd15 create hidden-print">
                <a class="btn btn-primary pull-right" href="javascript:window.print()">Print</a>
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditWaterSocio">
                <h2 class="titleSep"><span>Water Socio Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="comId" class="col-sm-3 col-form-label">Community:</label>
                        <div class="col-sm-9">
                            <html:select property="comId"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="communityList">
                                    <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                    <%--<div class="col-md-6">--%>
                        <%--<label for="watId" class="col-sm-3 col-form-label">Water Id:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="watId" styleClass="form-control" styleId="watId" disabled="true"/>--%>
                            <html:hidden property="watId"/>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watSurveyDate" class="col-sm-3 col-form-label">Survey Date:</label>

                        <div class='input-group date col-sm-9' id='wSurveyDate'>
                            <html:text property="watSurveyDate" styleClass="form-control" styleId="watSurveyDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wSurveyDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                </div>


                <div class="form-group row">
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watIsconnected" class="col-sm-3 col-form-label">Is connected:</label>
                        <div class="col-sm-9">
                            <fieldset class="col-sm-9" id="watIsconnected">
                                <div>

                                    <label class="radio-inline">
                                        <html:radio property="watIsconnected" value="1" disabled="true"/>
                                        Yes
                                    </label>


                                    <label class="radio-inline">
                                        <html:radio property="watIsconnected" value="0" disabled="true"/>
                                        No
                                    </label>
                                </div>
                            </fieldset>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watNetwork" class="col-sm-3 col-form-label">Local Network exist:</label>
                        <div class="col-sm-9">
                            <html:select property="watNetwork" styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Yes</html:option>
                                <html:option value="2">No</html:option>
                                <html:option value="3">Partially</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watUseWatTanker" class="col-sm-3 col-form-label">Uses Water Tanker:</label>
                        <div class="col-sm-9">
                        <fieldset class="col-sm-9" id="watUseWatTanker">
                            <div>

                                <label class="radio-inline">
                                    <html:radio property="watUseWatTanker" value="1" disabled="true"/>
                                    Yes
                                </label>


                                <label class="radio-inline">
                                    <html:radio property="watUseWatTanker" value="0" disabled="true"/>
                                    No
                                </label>
                            </div>
                        </div>
                        </fieldset>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watRainWaterWell" class="col-sm-3 col-form-label">Rain Water Well:</label>
                        <div class="col-sm-9">
                            <html:text property="watRainWaterWell" styleClass="form-control" styleId="watRainWaterWell" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watNoSprings" class="col-sm-3 col-form-label">Number of Springs:</label>
                        <div class="col-sm-9">
                            <html:text property="watNoSprings" styleClass="form-control" styleId="watNoSprings" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watPriceWater" class="col-sm-3 col-form-label">Price of M3 Water:</label>
                        <div class="input-group date  col-sm-9">
                            <html:text property="watPriceWater" styleClass="form-control" styleId="watPriceWater" disabled="true"/>
                            <span class="input-group-addon input-group-addon1">
                               NIS
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watFillingPoint" class="col-sm-3 col-form-label">Distance to the Filling Point:</label>
                        <div class="col-sm-9">
                            <fieldset class="col-sm-9" id="watFillingPoint">
                                <div>
                                    <label class="radio-inline">
                                        <html:radio property="watFillingPoint" value="1" disabled="true"/>
                                        Within 5KM
                                    </label>
                                    <label class="radio-inline">
                                        <html:radio property="watFillingPoint" value="0" disabled="true"/>
                                        Beyond 5KM
                                    </label>
                                </div>
                            </fieldset>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-6">
                        <label for="watQuantity" class="col-sm-3 col-form-label">Concerns of  Quality of Water:</label>
                        <div class="col-sm-9">
                            <html:select property="watQuantity" styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Good</html:option>
                                <html:option value="2">Bad</html:option>
                                <html:option value="3">Need treatment</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>



                <%--<div class="form-group row">--%>
                    <%--<div class="col-md-6">--%>
                        <%--<label class="col-sm-3 col-form-label">&nbsp;</label>--%>
                        <%--<div class="col-sm-9">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-6">--%>
                        <%--<label for="watSurveyDate" class="col-sm-3 col-form-label">Survey Date:</label>--%>

                        <%--<div class='input-group date col-sm-9' id='wSurveyDate'>--%>
                            <%--<html:text property="watSurveyDate" styleClass="form-control" styleId="watSurveyDate" disabled="true"/>--%>
                            <%--<span class="input-group-addon">--%>
                        <%--<span class="glyphicon glyphicon-calendar"></span>--%>
                    <%--</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<script type="text/javascript">--%>
                        <%--$(function () {--%>
                            <%--$('#wSurveyDate').datetimepicker({--%>
                                <%--format: 'DD/MM/YYYY'--%>
                            <%--});--%>
                        <%--});--%>
                    <%--</script>--%>

                <%--</div>--%>

                <div class="form-group row hidden-print">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditWaterSocio.do?watId=<%=request.getParameter("watId")%>'"
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

    InvalidInputHelper(document.getElementsByName("watId")[0], {
        defaultText: "Please Enter The Water Id ",
        emptyText: "Please Enter The Water Id ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("comId")[0], {
        defaultText: "Please Enter The Community ",
        emptyText: "Please Enter The Community ",
    });
    InvalidInputHelper(document.getElementsByName("watIsconnected")[0], {
        defaultText: "Please Enter The Is connected ",
        emptyText: "Please Enter The Is connected ",
    });
    InvalidInputHelper(document.getElementsByName("watNetwork")[0], {
        defaultText: "Please Enter The Network ",
        emptyText: "Please Enter The Network ",
    });
    InvalidInputHelper(document.getElementsByName("watUseWatTanker")[0], {
        defaultText: "Please Enter The Use Water Tanker ",
        emptyText: "Please Enter The Use Water Tanker ",
    });
    InvalidInputHelper(document.getElementsByName("watRainWaterWell")[0], {
        defaultText: "Please Enter The Rain Water Well ",
        emptyText: "Please Enter The Rain Water Well ",
    });
    InvalidInputHelper(document.getElementsByName("watNoSprings")[0], {
        defaultText: "Please Enter The No Springs ",
        emptyText: "Please Enter The No Springs ",
    });
    InvalidInputHelper(document.getElementsByName("watPriceWater")[0], {
        defaultText: "Please Enter The Price Water ",
        emptyText: "Please Enter The Price Water ",
    });
    InvalidInputHelper(document.getElementsByName("watFillingPoint")[0], {
        defaultText: "Please Enter The Filling Point ",
        emptyText: "Please Enter The Filling Point ",
    });
    InvalidInputHelper(document.getElementsByName("watQuantity")[0], {
        defaultText: "Please Enter The Quantity ",
        emptyText: "Please Enter The Quantity ",
    });
    InvalidInputHelper(document.getElementsByName("watSurveyDate")[0], {
        defaultText: "Please Enter The Survey Date ",
        emptyText: "Please Enter The Survey Date ",
    });
</script>