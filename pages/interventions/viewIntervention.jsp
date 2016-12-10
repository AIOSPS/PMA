<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script type="text/javascript">
    $(function () {
        $("#intId").attr("placeholder", "Intervention ID");
        $("#intId").prop('required', true);
        $("#intDesc").attr("placeholder", "Description");
        $("#intDesc").prop('required', true);
        $("#intEstimatedBudget").attr("placeholder", "Estimated Budget");
        $("#intEstimatedBudget").prop('required', true);
        $("#intSource").attr("placeholder", "Source");
        $("#intSource").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Intervention Information
        </a><span class=""> > </span><span>Interventions</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Intervention</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditIntervention">
                    <h2 class="titleSep"><span>Intervention Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intId" class="col-sm-3 col-form-label">Intervention ID:</label>
                        <div class="col-sm-9">
                            <html:text property="intId" styleClass="form-control" styleId="intId" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masId" class="col-sm-3 col-form-label">Master Plan:</label>
                        <div class="col-sm-9">
                            <html:select property="masId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:options collection="masterPlanList" property="masId" labelProperty="masMpName"/>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label">Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="secId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:options collection="sectorsList" property="secId" labelProperty="secName"/>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="subId" class="col-sm-3 col-form-label">Sub Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="subId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:options collection="subSectorsList" property="compId.subId" labelProperty="subName"/>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intDesc" class="col-sm-3 col-form-label">Description:</label>
                        <div class="col-sm-9">
                            <html:text property="intDesc" styleClass="form-control" styleId="intDesc" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intEstimatedBudget" class="col-sm-3 col-form-label">Estimated Budget:</label>
                        <div class="col-sm-9">
                            <html:text property="intEstimatedBudget" styleClass="form-control" styleId="intEstimatedBudget" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intSource" class="col-sm-3 col-form-label">Source:</label>
                        <div class="col-sm-9">
                            <html:text property="intSource" styleClass="form-control" styleId="intSource" disabled="true"/>
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
                        <button type="button" onclick="javaScript:parent.location = '/viewEditIntervention.do'"
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


    InvalidInputHelper(document.getElementsByName("intId")[0], {
        defaultText: "Please Enter The Intervention ID ",
        emptyText: "Please Enter The Intervention ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("intDesc")[0], {
        defaultText: "Please Enter The Description ",
        emptyText: "Please Enter The Description ",
    });
    InvalidInputHelper(document.getElementsByName("intEstimatedBudget")[0], {
        defaultText: "Please Enter The Estimated Budget ",
        emptyText: "Please Enter The Estimated Budget ",
    });
    InvalidInputHelper(document.getElementsByName("intSource")[0], {
        defaultText: "Please Enter The Source ",
        emptyText: "Please Enter The Source ",
    });
</script>