<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script type="text/javascript">
    $(function () {
        $("#warNo").attr("placeholder", "Warning Number");
        $("#warNo").prop('required', true);
        $("#warWarnedName").attr("placeholder", "Warned Name");
        $("#warWarnedName").prop('required', true);
        $("#warWarnedId").attr("placeholder", "Warned Id");
        $("#warWarnedId").prop('required', true);
        $("#warLatitude").attr("placeholder", "Latitude");
//        $("#warLatitude").prop('required', true);
        $("#warLongitude").attr("placeholder", "Longitude");
//        $("#warLongitude").prop('required', true);
        $("#warType").attr("placeholder", "Warning Type");
        $("#warType").prop('required', true);
        $("#warStructType").attr("placeholder", "Struct Type");
        $("#warStructType").prop('required', true);
        $("#warIssueDate").attr("placeholder", "Issue Date");
//        $("#warIssueDate").prop('required', true);
        $("#warSubmitDate").attr("placeholder", "Submit Date");
        $("#warSubmitDate").prop('required', true);
        $("#warReceptionistId").attr("placeholder", "Receptionist Id");
//        $("#warReceptionistId").prop('required', true);
        $("#warReceptionistName").attr("placeholder", "Receptionist Name");
//        $("#warReceptionistName").prop('required', true);
        $("#warReceptionDate").attr("placeholder", "Reception Date");
//        $("#warReceptionDate").prop('required', true);
        $("#warStatus").attr("placeholder", "Status");
        $("#warStatus").prop('required', true);
        $("#warNotes").attr("placeholder", "Notes");
//        $("#warNotes").prop('required', true);
    });
</script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Warning Information
        </a><span class=""> > </span><span>Warnings</span></nav>
    </div>
</div>



<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Warning</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addWarning">
                <h2 class="titleSep"><span>Warning Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warNo" class="col-sm-3 col-form-label">Warning Number:</label>
                        <div class="col-sm-9">
                            <html:hidden property="warId"/>
                            <html:text property="warNo" styleClass="form-control" styleId="warNo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warWarnedId" class="col-sm-3 col-form-label">Warned Id:</label>
                        <div class="col-sm-9">
                            <html:text property="warWarnedId" styleClass="form-control" styleId="warWarnedId"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warWarnedName" class="col-sm-3 col-form-label">Warned Name:</label>
                        <div class="col-sm-9">
                            <html:text property="warWarnedName" styleClass="form-control" styleId="warWarnedName"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warType" class="col-sm-3 col-form-label">Warning Type:</label>
                        <div class="col-sm-9">
                            <html:select property="warType"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Stop working</html:option>
                                <html:option value="2">Demolition Order</html:option>
                                <html:option value="3">Confiscation order</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
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
                        <label for="donId" class="col-sm-3 col-form-label">Donor:</label>
                        <div class="col-sm-9">
                            <html:select property="donId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="dononrList">
                                    <html:options collection="dononrList" property="donId" labelProperty="donName"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="donId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warLatitude" class="col-sm-3 col-form-label">Latitude:</label>
                        <div class="col-sm-9">
                            <html:text property="warLatitude" styleClass="form-control" styleId="warLatitude"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warLongitude" class="col-sm-3 col-form-label">Longitude:</label>
                        <div class="col-sm-9">
                            <html:text property="warLongitude" styleClass="form-control" styleId="warLongitude"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warStructType" class="col-sm-3 col-form-label">Struct Type:</label>
                        <div class="col-sm-9">
                            <html:select property="warStructType"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Residential</html:option>
                                <html:option value="2">In ProcessLivestock barn</html:option>
                                <html:option value="3">Commercial</html:option>
                                <html:option value="4">Industrial</html:option>
                                <html:option value="5">Agricultural</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warIssueDate" class="col-sm-3 col-form-label">Issue Date:</label>
                        <div class='input-group date col-sm-9' id='wIssueDate'>
                            <html:text property="warIssueDate" styleClass="form-control" styleId="warIssueDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wIssueDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warSubmitDate" class="col-sm-3 col-form-label">Submit Date:</label>
                        <div class='input-group date col-sm-9' id='wSubmitDate'>
                            <html:text property="warSubmitDate" styleClass="form-control" styleId="warSubmitDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wSubmitDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                    <div class="col-md-6">
                        <label for="warReceptionistId" class="col-sm-3 col-form-label">Receptionist Id:</label>
                        <div class="col-sm-9">
                            <html:text property="warReceptionistId" styleClass="form-control" styleId="warReceptionistId"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warReceptionistName" class="col-sm-3 col-form-label">Receptionist Name:</label>
                        <div class="col-sm-9">
                            <html:text property="warReceptionistName" styleClass="form-control" styleId="warReceptionistName"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warReceptionDate" class="col-sm-3 col-form-label">Reception Date:</label>
                        <div class='input-group date col-sm-9' id='wReceptionDate'>
                            <html:text property="warReceptionDate" styleClass="form-control" styleId="warReceptionDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#wReceptionDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="warStatus" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="warStatus"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Executed</html:option>
                                <html:option value="2">In Process</html:option>
                                <html:option value="3">On hold - Legal action</html:option>
                                <html:option value="4">Closed/Cancelled</html:option>
                                <html:option value="5">Ready for Execution</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="warNotes" class="col-sm-3 col-form-label">Notes:</label>
                        <div class="col-sm-9">
                            <html:text property="warNotes" styleClass="form-control" styleId="warNotes"/>
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

    InvalidInputHelper(document.getElementsByName("warNo")[0], {
        defaultText: "Please Enter The  Warning Number ",
        emptyText: "Please Enter The Warning Number ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("warWarnedName")[0], {
        defaultText: "Please Enter The Warned Name ",
        emptyText: "Please Enter The Warned Name ",
    });
    InvalidInputHelper(document.getElementsByName("warWarnedId")[0], {
        defaultText: "Please Enter The Warned Id ",
        emptyText: "Please Enter The Warned Id ",
    });
    InvalidInputHelper(document.getElementsByName("warLatitude")[0], {
        defaultText: "Please Enter The Latitude ",
        emptyText: "Please Enter The Latitude ",
    });
    InvalidInputHelper(document.getElementsByName("warLongitude")[0], {
        defaultText: "Please Enter The Longitude ",
        emptyText: "Please Enter The Longitude ",
    });
    InvalidInputHelper(document.getElementsByName("warType")[0], {
        defaultText: "Please Enter The Warning Type ",
        emptyText: "Please Enter The Warning Type ",
    });
    InvalidInputHelper(document.getElementsByName("warStructType")[0], {
        defaultText: "Please Enter The Struct Type ",
        emptyText: "Please Enter The Struct Type ",
    });
    InvalidInputHelper(document.getElementsByName("warIssueDate")[0], {
        defaultText: "Please Enter The Issue Date ",
        emptyText: "Please Enter The Issue Date ",
    });
    InvalidInputHelper(document.getElementsByName("warSubmitDate")[0], {
        defaultText: "Please Enter The Submit Date ",
        emptyText: "Please Enter The Submit Date ",
    });
    InvalidInputHelper(document.getElementsByName("warReceptionistId")[0], {
        defaultText: "Please Enter The Receptionist Id ",
        emptyText: "Please Enter The Receptionist Id ",
    });
    InvalidInputHelper(document.getElementsByName("warReceptionistName")[0], {
        defaultText: "Please Enter The Receptionist Name ",
        emptyText: "Please Enter The Receptionist Name ",
    });
    InvalidInputHelper(document.getElementsByName("warReceptionDate")[0], {
        defaultText: "Please Enter The Reception Date ",
        emptyText: "Please Enter The Reception Date ",
    });
    InvalidInputHelper(document.getElementsByName("warStatus")[0], {
        defaultText: "Please Enter The Status ",
        emptyText: "Please Enter The Status ",
    });
    InvalidInputHelper(document.getElementsByName("warNotes")[0], {
        defaultText: "Please Enter The Notes ",
        emptyText: "Please Enter The Notes ",
    });
</script>