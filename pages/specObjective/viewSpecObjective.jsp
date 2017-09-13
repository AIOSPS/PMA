<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#sobjNo").attr("placeholder", "Specific Objective No.");
        $("#sobjNo").prop('required', true);
        $("#sobjDescription").attr("placeholder", "Specific Objective Description");
        $("#sobjDescription").prop('required', true);
        $("#sobjDefineDate").attr("placeholder", "Specific Objective Define Date");
        $("#sobjDefineDate").prop('required', true);
        $("#sobjAdaptationDate").attr("placeholder", "Specific Objective Adaptation Date");
        $("#sobjAdaptationDate").prop('required', true);
        $("#sobjRelatedDocuments").attr("placeholder", "Specific Objective Related Documents");
        $("#sobjRelatedDocuments").prop('required', true);
        $("#intrNo").attr("placeholder", "Programme No");
        $("#intrNo").prop('required', true);

    });
</script>


<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-desktop "></span> Programme Management
        </a><span class=""> > </span><span>View Specific Objective</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container pd0">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Specific Objective</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="AddSpecObjective">
                <h2 class="titleSep"><span>Specific Objective Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="sobjNo" class="col-sm-3 col-form-label">Specific Objective No:</label>
                        <div class="col-sm-9">
                            <html:text property="sobjNo" styleClass="form-control" styleId="sobjNo" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="sobjDescription" class="col-sm-3 col-form-label">Description:</label>
                        <div class="col-sm-9">
                            <html:text property="sobjDescription" styleClass="form-control" styleId="sobjDescription" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="sobjDefineDate" class="col-sm-3 col-form-label">Define Date:</label>

                        <div class='input-group date col-sm-9' id='sobjDefineDate'>
                            <html:text property="sobjDefineDate" styleClass="form-control" styleId="sobjDefineDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="sobjAdaptationDate" class="col-sm-3 col-form-label">Adaptation Date:</label>

                        <div class='input-group date col-sm-9' id='rCloseDate'>
                            <html:text property="sobjAdaptationDate" styleClass="form-control" styleId="sobjAdaptationDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#sobjDefineDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#sobjAdaptationDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="sobjRelatedDocuments" class="col-sm-3 col-form-label">Related Documents:</label>
                        <div class="col-sm-9">
                            <html:text property="sobjRelatedDocuments" styleClass="form-control" styleId="sobjRelatedDocuments" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intrNo" class="col-sm-3 col-form-label">Programme:</label>
                        <div class="col-sm-9">
                            <html:select property="intrNo"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="programmeList">
                                    <html:options collection="programmeList" property="intrNo" labelProperty="intrTitle"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="intrNo"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>
                <%--<div class="form-group row">--%>
                <%--<div class="col-md-6">--%>
                <%--<label for="resStatus" class="col-sm-3 col-form-label">Status:</label>--%>
                <%--<div class="col-sm-9">--%>
                <%--<html:select property="resStatus"--%>
                <%--styleClass="selectpicker form-control">--%>
                <%--<html:option value="1">Achived</html:option>--%>
                <%--<html:option value="2">Not Achived</html:option>--%>
                <%--</html:select>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-md-6">--%>
                <%--<label  class="col-sm-3 col-form-label">&nbsp;</label>--%>
                <%--<div class="col-sm-9">--%>

                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>

                <div class="form-group row opBtn">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditSpecObjective.do?sobjNo=<%=request.getParameter("sobjNo")%>'"
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
    InvalidInputHelper(document.getElementsByName("sobjNo")[0], {
        defaultText: "Please Enter The Specific Objective No. ",
        emptyText: "Please Enter The Specific Objective No ",
    });
    InvalidInputHelper(document.getElementsByName("sobjDescription")[0], {
        defaultText: "Please Enter The Specific Objective Description ",
        emptyText: "Please Enter The Specific Objective Description ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("sobjDefineDate")[0], {
        defaultText: "Please Enter The Define Date ",
        emptyText: "Please Enter The Define Date ",
    });
    InvalidInputHelper(document.getElementsByName("sobjAdaptationDate")[0], {
        defaultText: "Please Enter The Adaptation Date ",
        emptyText: "Please Enter The Adaptation Date ",
    });
    InvalidInputHelper(document.getElementsByName("sobjRelatedDocuments")[0], {
        defaultText: "Please Enter The Related Documents ",
        emptyText: "Please Enter The Related Documents ",
    });
    InvalidInputHelper(document.getElementsByName("intrNo")[0], {
        defaultText: "Please Enter The Programme ",
        emptyText: "Please Enter The Programme",
    });

</script>
