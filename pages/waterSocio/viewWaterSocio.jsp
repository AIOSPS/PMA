<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#watId").attr("placeholder", "watId");
        $("#watId").prop('required', true);
        $("#comId").attr("placeholder", "comId");
        $("#comId").prop('required', true);
        $("#watIsconnected").attr("placeholder", "watIsconnected");
        $("#watIsconnected").prop('required', true);
        $("#watNetwork").attr("placeholder", "watNetwork");
        $("#watNetwork").prop('required', true);
        $("#watUseWatTanker").attr("placeholder", "watUseWatTanker");
        $("#watUseWatTanker").prop('required', true);
        $("#watRainWaterWell").attr("placeholder", "watRainWaterWell");
        $("#watRainWaterWell").prop('required', true);
        $("#watNoSprings").attr("placeholder", "watNoSprings");
        $("#watNoSprings").prop('required', true);
        $("#watPriceWater").attr("placeholder", "watPriceWater");
        $("#watPriceWater").prop('required', true);
        $("#watFillingPoint").attr("placeholder", "watFillingPoint");
        $("#watFillingPoint").prop('required', true);
        $("#watQuantity").attr("placeholder", "watQuantity");
        $("#watQuantity").prop('required', true);
        $("#watSurveyDate").attr("placeholder", "watSurveyDate");
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
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditWaterSocio">
                <h2 class="titleSep"><span>Water Socio Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watId" class="col-sm-3 col-form-label">watId:</label>
                        <div class="col-sm-9">
                            <html:text property="watId" styleClass="form-control" styleId="watId" disabled="true"/>
                            <html:hidden property="watId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comId" class="col-sm-3 col-form-label">comId:</label>
                        <div class="col-sm-9">
                            <html:select property="comId"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="communityList">
                                    <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watIsconnected" class="col-sm-3 col-form-label">watIsconnected:</label>
                        <div class="col-sm-9">
                            <html:text property="watIsconnected" styleClass="form-control" styleId="watIsconnected" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watNetwork" class="col-sm-3 col-form-label">watNetwork:</label>
                        <div class="col-sm-9">
                            <html:text property="watNetwork" styleClass="form-control" styleId="watNetwork" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watUseWatTanker" class="col-sm-3 col-form-label">watUseWatTanker:</label>
                        <div class="col-sm-9">
                            <html:text property="watUseWatTanker" styleClass="form-control" styleId="watUseWatTanker" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watRainWaterWell" class="col-sm-3 col-form-label">watRainWaterWell:</label>
                        <div class="col-sm-9">
                            <html:text property="watRainWaterWell" styleClass="form-control" styleId="watRainWaterWell" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watNoSprings" class="col-sm-3 col-form-label">watNoSprings:</label>
                        <div class="col-sm-9">
                            <html:text property="watNoSprings" styleClass="form-control" styleId="watNoSprings" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watPriceWater" class="col-sm-3 col-form-label">watPriceWater:</label>
                        <div class="col-sm-9">
                            <html:text property="watPriceWater" styleClass="form-control" styleId="watPriceWater" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watFillingPoint" class="col-sm-3 col-form-label">watFillingPoint:</label>
                        <div class="col-sm-9">
                            <html:text property="watFillingPoint" styleClass="form-control" styleId="watFillingPoint" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watQuantity" class="col-sm-3 col-form-label">watQuantity:</label>
                        <div class="col-sm-9">
                            <html:text property="watQuantity" styleClass="form-control" styleId="watQuantity" disabled="true"/>
                        </div>
                    </div>
                </div>



                <div class="form-group row">
                    <div class="col-md-6">
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watSurveyDate" class="col-sm-3 col-form-label">watSurveyDate:</label>

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
        defaultText: "Please Enter The watId ",
        emptyText: "Please Enter The watId ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("comId")[0], {
        defaultText: "Please Enter The comId ",
        emptyText: "Please Enter The comId ",
    });
    InvalidInputHelper(document.getElementsByName("watIsconnected")[0], {
        defaultText: "Please Enter The watIsconnected ",
        emptyText: "Please Enter The watIsconnected ",
    });
    InvalidInputHelper(document.getElementsByName("watNetwork")[0], {
        defaultText: "Please Enter The watNetwork ",
        emptyText: "Please Enter The watNetwork ",
    });
    InvalidInputHelper(document.getElementsByName("watUseWatTanker")[0], {
        defaultText: "Please Enter The watUseWatTanker ",
        emptyText: "Please Enter The watUseWatTanker ",
    });
    InvalidInputHelper(document.getElementsByName("watRainWaterWell")[0], {
        defaultText: "Please Enter The watRainWaterWell ",
        emptyText: "Please Enter The watRainWaterWell ",
    });
    InvalidInputHelper(document.getElementsByName("watNoSprings")[0], {
        defaultText: "Please Enter The watNoSprings ",
        emptyText: "Please Enter The watNoSprings ",
    });
    InvalidInputHelper(document.getElementsByName("watPriceWater")[0], {
        defaultText: "Please Enter The watPriceWater ",
        emptyText: "Please Enter The watPriceWater ",
    });
    InvalidInputHelper(document.getElementsByName("watFillingPoint")[0], {
        defaultText: "Please Enter The watFillingPoint ",
        emptyText: "Please Enter The watFillingPoint ",
    });
    InvalidInputHelper(document.getElementsByName("watQuantity")[0], {
        defaultText: "Please Enter The watQuantity ",
        emptyText: "Please Enter The watQuantity ",
    });
    InvalidInputHelper(document.getElementsByName("watSurveyDate")[0], {
        defaultText: "Please Enter The watSurveyDate ",
        emptyText: "Please Enter The watSurveyDate ",
    });
</script>