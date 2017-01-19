<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#perId").attr("placeholder", "Permit Number");
        $("#perId").prop('required', true);
        $("#perTitle").attr("placeholder", "Permit Title");
        $("#perTitle").prop('required', true);
        $("#perPeriod").attr("placeholder", "Permit Period");
        $("#perPeriod").prop('required', true);
        $("#issuingAgency").attr("placeholder", "Issuing Agency");
        $("#issuingAgency").prop('required', true);
        $("#perSubmitDate").attr("placeholder", "Submit Date");
        $("#perSubmitDate").prop('required', true);
        $("#perIssueDate").attr("placeholder", "Issue Date");
        $("#perIssueDate").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Permit Information
        </a><span class=""> > </span><span>Permits</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Permit</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditPermit">
                    <h2 class="titleSep"><span>Permit Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="perId" class="col-sm-3 col-form-label">Permit Number:</label>
                        <div class="col-sm-9">
                            <html:text property="perId" styleClass="form-control" styleId="perId" disabled="true"/>
                                <%--<html:hidden property="perId"/>--%>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="perTitle" class="col-sm-3 col-form-label">Permit Title:</label>
                        <div class="col-sm-9">
                            <html:text property="perTitle" styleClass="form-control" styleId="perTitle" disabled="true"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="perType" class="col-sm-3 col-form-label">Permit Type:</label>
                        <div class="col-sm-9">
                            <html:select property="perType" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">ICA</html:option>
                                <html:option value="2">MOLG</html:option>
                                <html:option value="3">MOA</html:option>
                                <html:option value="4">MOHE</html:option>
                                <html:option value="5">MON</html:option>
                                <html:option value="6">MOC</html:option>
                                <html:option value="7">PWA</html:option>
                                <html:option value="8">PENRA</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="perStatus" class="col-sm-3 col-form-label">Permit Status:</label>
                        <div class="col-sm-9">
                            <html:select property="perStatus" disabled="true"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Approved</html:option>
                                <html:option value="2">Rejected</html:option>
                                <html:option value="3">Stuck</html:option>
                                <html:option value="4">Stopped</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="perSubmitDate" class="col-sm-3 col-form-label">Submit Date:</label>

                        <div class='input-group date col-sm-9' id='pSubmitDate'>
                            <html:text property="perSubmitDate" styleClass="form-control" styleId="perSubmitDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="perIssueDate" class="col-sm-3 col-form-label">Issue Date:</label>

                        <div class='input-group date col-sm-9' id='pIssueDate'>
                            <html:text property="perIssueDate" styleClass="form-control" styleId="perIssueDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#pSubmitDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#pIssueDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="perPeriod" class="col-sm-3 col-form-label">Permit Period:</label>
                        <div class="col-sm-9">
                            <html:text property="perPeriod" styleClass="form-control" styleId="perPeriod" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="perIssuingAgency" class="col-sm-3 col-form-label">Issuing Agency:</label>
                        <div class="col-sm-9">
                            <html:text property="perIssuingAgency" styleClass="form-control" styleId="perIssuingAgency" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditPermit.do?perId=<%=request.getParameter("perId")%>'"
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

    InvalidInputHelper(document.getElementsByName("perId")[0], {
        defaultText: "Please Enter The Permit ID ",
        emptyText: "Please Enter The Permit ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("perTitle")[0], {
        defaultText: "Please Enter The Permit Title ",
        emptyText: "Please Enter The Permit Title ",
    });
    InvalidInputHelper(document.getElementsByName("perPeriod")[0], {
        defaultText: "Please Enter The Permit Period ",
        emptyText: "Please Enter The Permit Period ",
    });
    InvalidInputHelper(document.getElementsByName("issuingAgency")[0], {
        defaultText: "Please Enter The Issuing Agency ",
        emptyText: "Please Enter The Issuing Agency ",
    });
    InvalidInputHelper(document.getElementsByName("perSubmitDate")[0], {
        defaultText: "Please Enter The Submit Date ",
        emptyText: "Please Enter The Submit Date ",
    });
    InvalidInputHelper(document.getElementsByName("perIssueDate")[0], {
        defaultText: "Please Enter The Issue Date ",
        emptyText: "Please Enter The Issue Date ",
    });
</script>