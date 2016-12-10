<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#actId").attr("placeholder", "Activity ID");
        $("#actId").prop('required', true);
        $("#actDesc").attr("placeholder", "Description");
        $("#actDesc").prop('required', true);
        $("#actUnit").attr("placeholder", "Unit");
        $("#actUnit").prop('required', true);
        $("#actUnitQty").attr("placeholder", "Unit Qty");
        $("#actUnitQty").prop('required', true);
        $("#actEstimatedBudget").attr("placeholder", "Estimated Budget");
        $("#actEstimatedBudget").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Activity Information
        </a><span class=""> > </span><span>Activities</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Create a New Activity</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addActivity">
                <h2 class="titleSep"><span>Activity Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actId" class="col-sm-3 col-form-label">Activity ID:</label>
                        <div class="col-sm-9">
                            <html:text property="actId" styleClass="form-control" styleId="actId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actDesc" class="col-sm-3 col-form-label">Description:</label>
                        <div class="col-sm-9">
                            <html:text property="actDesc" styleClass="form-control" styleId="actDesc"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intId" class="col-sm-3 col-form-label">Intervention:</label>
                        <div class="col-sm-9">
                            <html:select property="intId"
                                         styleClass="selectpicker form-control">
                                <html:options collection="inertventionList" property="compId.intId" labelProperty="intDesc"/>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label">Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="secId"
                                         styleClass="selectpicker form-control">
                                <html:options collection="sectorsList" property="secId" labelProperty="secName"/>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actUnit" class="col-sm-3 col-form-label">Unit:</label>
                        <div class="col-sm-9">
                            <html:text property="actUnit" styleClass="form-control" styleId="actUnit"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actUnitQty" class="col-sm-3 col-form-label">Unit Qty:</label>
                        <div class="col-sm-9">
                            <html:text property="actUnitQty" styleClass="form-control" styleId="actUnitQty"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actEstimatedBudget" class="col-sm-3 col-form-label">Estimated Budget:</label>
                        <div class="col-sm-9">
                            <html:text property="actEstimatedBudget" styleClass="form-control" styleId="actEstimatedBudget"/>
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


    InvalidInputHelper(document.getElementsByName("actId")[0], {
        defaultText: "Please Enter The Activity ID ",
        emptyText: "Please Enter The Activity ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("actDesc")[0], {
        defaultText: "Please Enter The Description ",
        emptyText: "Please Enter The Description ",
    });
    InvalidInputHelper(document.getElementsByName("actUnit")[0], {
        defaultText: "Please Enter The Unit ",
        emptyText: "Please Enter The Unit ",
    });
    InvalidInputHelper(document.getElementsByName("actUnitQty")[0], {
        defaultText: "Please Enter The Unit Qty ",
        emptyText: "Please Enter The Unit Qty ",
    });
    InvalidInputHelper(document.getElementsByName("actEstimatedBudget")[0], {
        defaultText: "Please Enter The Estimated Budget ",
        emptyText: "Please Enter The Estimated Budget ",
    });
</script>