<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#rsltNo").attr("placeholder", "Result No");
        $("#rsltNo").prop('required', true);
        $("#rsltTitle").attr("placeholder", "Result title");
        $("#rsltTitle").prop('required', true);
        $("#rsltDefineDate").attr("placeholder", "Result Define Date");
        $("#rsltDefineDate").prop('required', true);
        $("#rsltCloseDate").attr("placeholder", "Result Closed Date");
        $("#rsltCloseDate").prop('required', true);
        $("#rsltStatus").attr("placeholder", "Result Status");
        $("#rsltStatus").prop('required', true);
        $("#rsltLongDescription").attr("placeholder", "Result Long Description");
        $("#rsltLongDescription").prop('required', true);
        $("#sobjNo").attr("placeholder", "Specific Objective");
        $("#sobjNo").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-desktop "></span> Programme Management
        </a><span class=""> > </span><span>Edit Result</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container pd0">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Result</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addPmaResult">
                <h2 class="titleSep"><span>Result Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <html:hidden property="rsltNo"/>
                        <%--<label for="rsltNo" class="col-sm-3 col-form-label">Result No:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="rsltNo" styleClass="form-control" styleId="rsltNo"/>--%>
                        <%--</div>--%>
                    </div>
                    <div class="col-md-6">
                        <label for="rsltTitle" class="col-sm-3 col-form-label">Result Title:</label>
                        <div class="col-sm-9">
                            <html:text property="rsltTitle" styleClass="form-control" styleId="rsltTitle"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="rsltDefineDate" class="col-sm-3 col-form-label">Result Define Date:</label>

                        <div class='input-group date col-sm-9' id='rsltDefineDate'>
                            <html:text property="rsltDefineDate" styleClass="form-control" styleId="rsltDefineDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="rsltCloseDate" class="col-sm-3 col-form-label">Result Close Date:</label>

                        <div class='input-group date col-sm-9' id='rsltCloseDate'>
                            <html:text property="rsltCloseDate" styleClass="form-control" styleId="rsltCloseDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#rsltDefineDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#rsltCloseDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="rsltStatus" class="col-sm-3 col-form-label">Result Status:</label>
                        <div class="col-sm-9">
                                <%--<html:text property="rsltStatus" styleClass="form-control" styleId="rsltStatus"/>--%>
                            <html:select property="rsltStatus"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Active</html:option>
                                <html:option value="2">Not Active </html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="sobjNo" class="col-sm-3 col-form-label">Specific Objective:</label>
                        <div class="col-sm-9">
                            <html:select property="sobjNo"
                                         styleClass="selectpicker form-control">
                                <logic:present name="resultList">
                                    <html:options collection="resultList" property="sobjNo" labelProperty="sobjDescription"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="sobjNo"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="rsltLongDescription" class="col-sm-3 col-form-label">Long Description:</label>
                        <div class="col-sm-9">
                            <html:text property="rsltLongDescription" styleClass="form-control" styleId="rsltLongDescription"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="col-sm-9">

                        </div>
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
    InvalidInputHelper(document.getElementsByName("rsltNo")[0], {
        defaultText: "Please Enter The Result No ",
        emptyText: "Please Enter The Result No ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("rsltTitle")[0], {
        defaultText: "Please Enter The Result Title ",
        emptyText: "Please Enter The Result Title ",
    });
    InvalidInputHelper(document.getElementsByName("rsltDefineDate")[0], {
        defaultText: "Please Enter The Define Date ",
        emptyText: "Please Enter The Define Date ",
    });
    InvalidInputHelper(document.getElementsByName("rsltCloseDate")[0], {
        defaultText: "Please Enter The Closed Date ",
        emptyText: "Please Enter The Closed Date ",
    });
    InvalidInputHelper(document.getElementsByName("rsltStatus")[0], {
        defaultText: "Please Enter The Status ",
        emptyText: "Please Enter The Staus ",
    });
    InvalidInputHelper(document.getElementsByName("rsltLongDescription")[0], {
        defaultText: "Please Enter The Long Description ",
        emptyText: "Please Enter The Long Description ",
    });
    InvalidInputHelper(document.getElementsByName("sobjNo")[0], {
        defaultText: "Please Enter The Specific Objective",
        emptyText: "Please Enter The Specific Objective",
    });
</script>