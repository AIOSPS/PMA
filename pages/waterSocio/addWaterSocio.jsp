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
        $("#watNetwork").attr("placeholder", "Network");
        $("#watNetwork").prop('required', true);
        $("#watUseWatTanker").attr("placeholder", "Use Water Tanker");
        $("#watUseWatTanker").prop('required', true);
        $("#watRainWaterWell").attr("placeholder", "Rain Water Well");
        $("#watRainWaterWell").prop('required', true);
        $("#watNoSprings").attr("placeholder", "No Springs");
        $("#watNoSprings").prop('required', true);
        $("#watPriceWater").attr("placeholder", "Price Water");
        $("#watPriceWater").prop('required', true);
        $("#watFillingPoint").attr("placeholder", "Filling Point");
        $("#watFillingPoint").prop('required', true);
        $("#watQuantity").attr("placeholder", "Quantity");
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
                <h1>Create a New Water Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addWaterSocio">
                <h2 class="titleSep"><span>Water Socio Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watId" class="col-sm-3 col-form-label">Water Id:</label>
                        <div class="col-sm-9">
                            <html:text property="watId" styleClass="form-control" styleId="watId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comId" class="col-sm-3 col-form-label">Community:</label>
                        <div class="col-sm-9">
                            <html:select property="comId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="communityList">
                                    <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watIsconnected" class="col-sm-3 col-form-label">Is connected:</label>
                        <div class="col-sm-9">
                            <html:text property="watIsconnected" styleClass="form-control" styleId="watIsconnected"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watNetwork" class="col-sm-3 col-form-label">Network:</label>
                        <div class="col-sm-9">
                            <html:text property="watNetwork" styleClass="form-control" styleId="watNetwork"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watUseWatTanker" class="col-sm-3 col-form-label">Use Water Tanker:</label>
                        <div class="col-sm-9">
                            <html:text property="watUseWatTanker" styleClass="form-control" styleId="watUseWatTanker"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watRainWaterWell" class="col-sm-3 col-form-label">Rain Water Well:</label>
                        <div class="col-sm-9">
                            <html:text property="watRainWaterWell" styleClass="form-control" styleId="watRainWaterWell"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watNoSprings" class="col-sm-3 col-form-label">No Springs:</label>
                        <div class="col-sm-9">
                            <html:text property="watNoSprings" styleClass="form-control" styleId="watNoSprings"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watPriceWater" class="col-sm-3 col-form-label">Price Water:</label>
                        <div class="col-sm-9">
                            <html:text property="watPriceWater" styleClass="form-control" styleId="watPriceWater"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="watFillingPoint" class="col-sm-3 col-form-label">Filling Point:</label>
                        <div class="col-sm-9">
                            <html:text property="watFillingPoint" styleClass="form-control" styleId="watFillingPoint"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="watQuantity" class="col-sm-3 col-form-label">Quantity:</label>
                        <div class="col-sm-9">
                            <html:text property="watQuantity" styleClass="form-control" styleId="watQuantity"/>
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
                        <label for="watSurveyDate" class="col-sm-3 col-form-label">Survey Date:</label>

                        <div class='input-group date col-sm-9' id='wSurveyDate'>
                            <html:text property="watSurveyDate" styleClass="form-control" styleId="watSurveyDate"/>
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
