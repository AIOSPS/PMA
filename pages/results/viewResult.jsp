<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#resId").attr("placeholder", "Result ID");
        $("#resId").prop('required', true);
        $("#objId").attr("placeholder", "Objective");
        $("#objId").prop('required', true);
        $("#resDesc").attr("placeholder", "Result Description");
        $("#resDesc").prop('required', true);
        $("#resLongDesc").attr("placeholder", "Long Description");
        $("#resLongDesc").prop('required', true);
        $("#resDefineDate").attr("placeholder", "Define Date");
        $("#resDefineDate").prop('required', true);
        $("#resCloseDate").attr("placeholder", "Close Date");
        $("#resCloseDate").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Result Information
        </a><span class=""> > </span><span>Results</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Result</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditResult">
                    <h2 class="titleSep"><span>Result Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="resId" class="col-sm-3 col-form-label">Result ID:</label>
                        <div class="col-sm-9">
                            <html:text property="resId" styleClass="form-control" styleId="resId" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="objId" class="col-sm-3 col-form-label">Objective:</label>
                        <div class="col-sm-9">
                            <html:select property="objId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="objectiveList">
                                    <html:options collection="objectiveList" property="objId" labelProperty="objDesc"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="resDesc" class="col-sm-3 col-form-label">Result Description:</label>
                        <div class="col-sm-9">
                            <html:text property="resDesc" styleClass="form-control" styleId="resDesc" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="resLongDesc" class="col-sm-3 col-form-label">Long Description:</label>
                        <div class="col-sm-9">
                            <html:text property="resLongDesc" styleClass="form-control" styleId="resLongDesc" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="resDefineDate" class="col-sm-3 col-form-label">Define Date:</label>

                        <div class='input-group date col-sm-9' id='rDefineDate'>
                            <html:text property="resDefineDate" styleClass="form-control" styleId="resDefineDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="resCloseDate" class="col-sm-3 col-form-label">Close Date:</label>

                        <div class='input-group date col-sm-9' id='rCloseDate'>
                            <html:text property="resCloseDate" styleClass="form-control" styleId="resCloseDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#rDefineDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#rCloseDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="resStatus" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="resStatus" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Achived</html:option>
                                <html:option value="2">Not Achived</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label  class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">

                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditResult.do'"
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
    InvalidInputHelper(document.getElementsByName("resId")[0], {
        defaultText: "Please Enter The Result ID ",
        emptyText: "Please Enter The Result ID ",
    });
    InvalidInputHelper(document.getElementsByName("objId")[0], {
        defaultText: "Please Enter The Objective ",
        emptyText: "Please Enter The Objective ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("resDesc")[0], {
        defaultText: "Please Enter The Result Description ",
        emptyText: "Please Enter The Result Description ",
    });
    InvalidInputHelper(document.getElementsByName("resLongDesc")[0], {
        defaultText: "Please Enter The Long Description ",
        emptyText: "Please Enter The Long Description ",
    });
    InvalidInputHelper(document.getElementsByName("resDefineDate")[0], {
        defaultText: "Please Enter The Define Date ",
        emptyText: "Please Enter The Define Date ",
    });
    InvalidInputHelper(document.getElementsByName("resCloseDate")[0], {
        defaultText: "Please Enter The Close Date ",
        emptyText: "Please Enter The Close Date ",
    });
</script>