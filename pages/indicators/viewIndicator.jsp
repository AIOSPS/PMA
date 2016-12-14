<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#indId").attr("placeholder", "Indicator ID");
        $("#indId").prop('required', true);
        $("#indTitle").attr("placeholder", "Indicator Title");
        $("#indTitle").prop('required', true);
        $("#indDate").attr("placeholder", "Indicator Date");
        $("#indDate").prop('required', true);
        $("#indLongDesc").attr("placeholder", "Long Description");
        $("#indLongDesc").prop('required', true);
        $("#indBaseline").attr("placeholder", "Base line");
        $("#indBaseline").prop('required', true);
        $("#indFrequency").attr("placeholder", "Frequency");
        $("#indFrequency").prop('required', true);
        $("#indCollectionMethod").attr("placeholder", "Collection Method");
        $("#indCollectionMethod").prop('required', true);
        $("#indStatisticalMethod").attr("placeholder", "Statistical Method");
        $("#indStatisticalMethod").prop('required', true);
        $("#indTarget").attr("placeholder", "Target");
        $("#indTarget").prop('required', true);
        $("#indValue").attr("placeholder", "Value");
        $("#indValue").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Indicator Information
        </a><span class=""> > </span><span>Indicators</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Indicator</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditIndicator">
                <h2 class="titleSep"><span>Indicator Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indId" class="col-sm-3 col-form-label">Indicator ID:</label>
                        <div class="col-sm-9">
                            <html:text property="indId" styleClass="form-control" styleId="indId" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="resId" class="col-sm-3 col-form-label">Result:</label>
                        <div class="col-sm-9">
                            <html:select property="resId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:options collection="resultList" property="resId" labelProperty="resDesc"/>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indTitle" class="col-sm-3 col-form-label">Indicator Title:</label>
                        <div class="col-sm-9">
                            <html:text property="indTitle" styleClass="form-control" styleId="indTitle" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indDate" class="col-sm-3 col-form-label">Indicator Date:</label>
                        <div class='input-group date col-sm-9' id='iDate'>
                            <html:text property="indDate" styleClass="form-control" styleId="indDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#iDate').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indLongDesc" class="col-sm-3 col-form-label">Long Description:</label>
                        <div class="col-sm-9">
                            <html:text property="indLongDesc" styleClass="form-control" styleId="indLongDesc" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indBaseline" class="col-sm-3 col-form-label">Base line:</label>
                        <div class="col-sm-9">
                            <html:text property="indBaseline" styleClass="form-control" styleId="indBaseline" disabled="true"/>
                        </div>
                    </div>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indFrequency" class="col-sm-3 col-form-label">Frequency:</label>
                        <div class="col-sm-9">
                            <html:text property="indFrequency" styleClass="form-control" styleId="indFrequency" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indCollectionMethod" class="col-sm-3 col-form-label">Collection Method:</label>
                        <div class="col-sm-9">
                            <html:text property="indCollectionMethod" styleClass="form-control" styleId="indCollectionMethod" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indStatisticalMethod" class="col-sm-3 col-form-label">Statistical Method:</label>
                        <div class="col-sm-9">
                            <html:text property="indStatisticalMethod" styleClass="form-control" styleId="indStatisticalMethod" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indTarget" class="col-sm-3 col-form-label">Target:</label>
                        <div class="col-sm-9">
                            <html:text property="indTarget" styleClass="form-control" styleId="indTarget" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indValue" class="col-sm-3 col-form-label">Value:</label>
                        <div class="col-sm-9">
                            <html:text property="indValue" styleClass="form-control" styleId="indValue" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditIndicator.do'"
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
    InvalidInputHelper(document.getElementsByName("indId")[0], {
        defaultText: "Please Enter The Indicator ID ",
        emptyText: "Please Enter The Indicator ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("indTitle")[0], {
        defaultText: "Please Enter The Indicator Title ",
        emptyText: "Please Enter The Indicator Title ",
    });
    InvalidInputHelper(document.getElementsByName("indDate")[0], {
        defaultText: "Please Enter The Indicator Date ",
        emptyText: "Please Enter The Indicator Date ",
    });
    InvalidInputHelper(document.getElementsByName("indLongDesc")[0], {
        defaultText: "Please Enter The Long Description ",
        emptyText: "Please Enter The Long Description ",
    });
    InvalidInputHelper(document.getElementsByName("indBaseline")[0], {
        defaultText: "Please Enter The Base line ",
        emptyText: "Please Enter The Base line ",
    });
    InvalidInputHelper(document.getElementsByName("indFrequency")[0], {
        defaultText: "Please Enter The Frequency ",
        emptyText: "Please Enter The Frequency ",
    });
    InvalidInputHelper(document.getElementsByName("indCollectionMethod")[0], {
        defaultText: "Please Enter The Collection Method ",
        emptyText: "Please Enter The Collection Method ",
    });
    InvalidInputHelper(document.getElementsByName("indStatisticalMethod")[0], {
        defaultText: "Please Enter The Statistical Method ",
        emptyText: "Please Enter The Statistical Method ",
    });
    InvalidInputHelper(document.getElementsByName("indTarget")[0], {
        defaultText: "Please Enter The Target ",
        emptyText: "Please Enter The Target ",
    });
    InvalidInputHelper(document.getElementsByName("indValue")[0], {
        defaultText: "Please Enter The Value ",
        emptyText: "Please Enter The Value ",
    });
</script>