<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#objId").attr("placeholder", "Objective ID");
        $("#objId").prop('required', true);
        $("#objDesc").attr("placeholder", "Objective Description");
        $("#objDesc").prop('required', true);
        $("#objLongDesc").attr("placeholder", "Long Description");
        $("#objLongDesc").prop('required', true);
        $("#objDefineDate").attr("placeholder", "Define Date");
        $("#objDefineDate").prop('required', true);
        $("#objCloseDate").attr("placeholder", "Close Date");
        $("#objCloseDate").prop('required', true);
        $("#ojbUserId").attr("placeholder", "User ID");
        $("#ojbUserId").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Objective Information
        </a><span class=""> > </span><span>Objectives</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Objective</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addObjective">
                <h2 class="titleSep"><span>Objective Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="objDesc" class="col-sm-3 col-form-label">Objective Description:</label>
                        <div class="col-sm-9">
                            <html:text property="objDesc" styleClass="form-control" styleId="objDesc"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <%--<label for="objId" class="col-sm-3 col-form-label">Objective ID:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="objId" styleClass="form-control" styleId="objId" disabled="true"/>--%>
                            <html:hidden property="objId"/>
                        <%--</div>--%>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="objLongDesc" class="col-sm-3 col-form-label">Long Description:</label>
                        <div class="col-sm-9">
                            <html:text property="objLongDesc" styleClass="form-control" styleId="objLongDesc"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="strDocId" class="col-sm-3 col-form-label">Strategic Plan Doc:</label>
                        <div class="col-sm-9">
                            <html:select property="strDocId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="strategicPlanDocList">
                                    <html:options collection="strategicPlanDocList" property="strDocId" labelProperty="strPlanTitle"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="strDocId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="objDefineDate" class="col-sm-3 col-form-label">Define Date:</label>

                        <div class='input-group date col-sm-9' id='oDefineDate'>
                            <html:text property="objDefineDate" styleClass="form-control" styleId="objDefineDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="objCloseDate" class="col-sm-3 col-form-label">Close Date:</label>

                        <div class='input-group date col-sm-9' id='oCloseDate'>
                            <html:text property="objCloseDate" styleClass="form-control" styleId="objCloseDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#oDefineDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#oCloseDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="objStatus" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="objStatus"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Adapted</html:option>
                                <html:option value="2">Not adapted </html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="ojbUserId" class="col-sm-3 col-form-label">User ID:</label>
                        <div class="col-sm-9">
                            <html:text property="ojbUserId" styleClass="form-control" styleId="ojbUserId"/>
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

    InvalidInputHelper(document.getElementsByName("objId")[0], {
        defaultText: "Please Enter The Objective ID ",
        emptyText: "Please Enter The Objective ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("objDesc")[0], {
        defaultText: "Please Enter The Objective Description ",
        emptyText: "Please Enter The Objective Description ",
    });
    InvalidInputHelper(document.getElementsByName("objLongDesc")[0], {
        defaultText: "Please Enter The Long Description ",
        emptyText: "Please Enter The Long Description ",
    });
    InvalidInputHelper(document.getElementsByName("objDefineDate")[0], {
        defaultText: "Please Enter The Define Date ",
        emptyText: "Please Enter The Define Date ",
    });
    InvalidInputHelper(document.getElementsByName("objCloseDate")[0], {
        defaultText: "Please Enter The Close Date ",
        emptyText: "Please Enter The Close Date ",
    });
    InvalidInputHelper(document.getElementsByName("ojbUserId")[0], {
        defaultText: "Please Enter The User ID ",
        emptyText: "Please Enter The User ID ",
    });
</script>