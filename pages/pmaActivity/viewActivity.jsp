<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#actvNo").attr("placeholder", "Activity No.");
        $("#actvNo").prop('required', true);
        $("#intrNo").attr("placeholder", "Programme");
        $("#intrNo").prop('required', true);
        $("#actvLevel").attr("placeholder", "Level of Activity");
        $("#actvLevel").prop('required', true);
        $("#actvImplementingPartner").attr("placeholder", "Implementing Partners");
        $("#actvImplementingPartner").prop('required', true);
        $("#actvTitle").attr("placeholder", "Activity Title");
        $("#actvTitle").prop('required', true);
        $("#actvSummaryDescription").attr("placeholder", "Summary Description");
        $("#actvSummaryDescription").prop('required', true);
        $("#actvStatus").attr("placeholder", "Status");
        $("#actvStatus").prop('required', true);
        $("#actvProposedStartDate").attr("placeholder", "Proposed Start Date");
        $("#actvProposedStartDate").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-puzzle-piece"></span>   Program Implementation
        </a><span class=""> > </span><span>View Activity</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container pd0">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>View Activity</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addPmaActivity">
                <h2 class="titleSep"><span>Activity Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvNo" class="col-sm-3 col-form-label">Activity Number:</label>
                        <div class="col-sm-9">
                            <html:text property="actvNo" styleClass="form-control" styleId="actvNo" disabled="true"/>
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

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvLevel" class="col-sm-3 col-form-label">Level of Activity:</label>
                        <div class="col-sm-9">
                            <html:select property="actvLevel"
                                         styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">MOLG</html:option>
                                <html:option value="2">Governorate</html:option>
                                <html:option value="3">LGU'S</html:option>
                                <html:option value="4">BTC Office</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actvImplementingPartner" class="col-sm-3 col-form-label">Implementing Partners:</label>
                        <div class="col-sm-9">
                            <html:select property="actvImplementingPartner"
                                         styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">MOLG</html:option>
                                <html:option value="2">MDLF</html:option>
                                <html:option value="3">Other Donors</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="clasCode" class="col-sm-3 col-form-label">Activity Classification:</label>
                        <div class="col-sm-9">
                            <html:select property="clasCode"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="actClasList">
                                    <html:options collection="actClasList" property="clasCode" labelProperty="clasDescription"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="clasCode"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actvProposedStartDate" class="col-sm-3 col-form-label">Proposed Start Date:</label>
                        <div class='input-group date col-sm-9' id='actvProposedStartDate1'>
                            <html:text property="actvProposedStartDate" styleClass="form-control" styleId="actvProposedStartDate" disabled="true"/>
                            <span class="input-group-addon">
                            <span class="glyphicon glyphicon-calendar"></span>
                            </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#actvProposedStartDate1').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvProposedEndDate" class="col-sm-3 col-form-label">Proposed End Date:</label>
                        <div class='input-group date col-sm-9' id='actvProposedEndDate1'>
                            <html:text property="actvProposedEndDate" styleClass="form-control" styleId="actvProposedEndDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#actvProposedEndDate1').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                    <div class="col-md-6">
                        <label for="actvActualStartDate" class="col-sm-3 col-form-label">Actual Start Date:</label>
                        <div class='input-group date col-sm-9' id='actvActualStartDate1'>
                            <html:text property="actvActualStartDate" styleClass="form-control" styleId="actvActualStartDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#actvActualStartDate1').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvActualEndDate" class="col-sm-3 col-form-label">Actual End Date:</label>
                        <div class='input-group date col-sm-9' id='actvActualEndDate1'>
                            <html:text property="actvActualEndDate" styleClass="form-control" styleId="actvActualEndDate" disabled="true"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#actvActualEndDate1').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                    <div class="col-md-6">
                        <label for="actvTitle" class="col-sm-3 col-form-label">Activity Title:</label>
                        <div class="col-sm-9">
                            <html:text property="actvTitle" styleClass="form-control" styleId="actvTitle" disabled="true"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvBudget" class="col-sm-3 col-form-label">Budget:</label>
                        <div class="input-group date  col-sm-9">
                            <html:text property="actvBudget" styleClass="form-control" styleId="actvBudget" disabled="true"/>
                            <span class="input-group-addon input-group-addon1">
                               €
                            </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actvTotalCost" class="col-sm-3 col-form-label">Total Cost:</label>
                        <div class="input-group date  col-sm-9">
                            <html:text property="actvTotalCost" styleClass="form-control" styleId="actvTotalCost" disabled="true"/>
                            <span class="input-group-addon input-group-addon1">
                               €
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="rsltNo" class="col-sm-3 col-form-label">Related Output/Result:</label>
                        <div class="col-sm-9">
                            <html:select property="rsltNo"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="resultList">
                                    <html:options collection="resultList" property="rsltNo" labelProperty="rsltTitle"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="rsltNo"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actvStatus" class="col-sm-3 col-form-label">Activity Status:</label>
                        <div class="col-sm-9">
                            <html:select property="actvStatus"
                                         styleClass="selectpicker form-control" disabled="true">
                                <html:option value="1">Active</html:option>
                                <html:option value="2">Not Active</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvResponsibility" class="col-sm-3 col-form-label">Responsibility:</label>
                        <div class="col-sm-9">
                            <html:textarea property="actvResponsibility" styleClass="form-control" rows="6" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indrNo" class="col-sm-3 col-form-label">Related Indicator:</label>
                        <div class="col-sm-9">
                            <html:select property="indrNo"
                                         styleClass="selectpicker form-control" disabled="true">
                                <logic:present name="indrList">
                                    <html:options collection="indrList" property="indrNo" labelProperty="indrDefinition"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="indrNo"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvLessonsLearned" class="col-sm-3 col-form-label">Lessons Learned:</label>
                        <div class="col-sm-9">
                            <html:textarea property="actvLessonsLearned" styleClass="form-control" rows="6" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="actChallenges" class="col-sm-3 col-form-label">Challenges:</label>
                        <div class="col-sm-9">
                            <html:textarea property="actChallenges" styleClass="form-control" rows="6" disabled="true"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="actvSummaryDescription" class="col-sm-3 col-form-label">Summary Description:</label>
                        <div class="col-sm-9">
                            <html:textarea property="actvSummaryDescription" styleClass="form-control" rows="6" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="rsltNo" class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                        </div>
                    </div>
                </div>
                <h2 class="titleSep"><span>Activity Details</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic">
                                        <thead>
                                        <tr >
                                            <th width="35%" class="text-center">Implementer</th>
                                            <th width="30%" class="text-center">Cost</th>
                                            <th width="30%" class="text-center">Community</th>
                                            <th width="5%" class="text-center">
                                                <a id="add_row" class="btn btn-primary fa fa-plus"></a>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="actImplmnt"> Implementer List
                                                <select  class="form-control" id="actImplmnt0" name="actImplmnt0" >
                                                    <logic:iterate id="implList" name="implList">
                                                        <option value=<bean:write name="implList" property="impId"/>><bean:write name="implList" property="impName"/></option>
                                                    </logic:iterate>
                                                </select>
                                            </td>
                                            <td data-name="actCost">
                                                <input type="text" id="actCost0" name="actCost0" placeholder='Cost' class="form-control"/>
                                            </td>
                                            <td data-name="actCommunity"> Community List
                                                <select  class="form-control" id="actCommunity0" name="actCommunity0" >
                                                    <logic:iterate id="communityList" name="communityList">
                                                        <option value=<bean:write name="communityList" property="comId"/>><bean:write name="communityList" property="comName"/></option>
                                                    </logic:iterate>
                                                </select>
                                            </td>
                                            <td data-name="del">
                                                <button nam="del0" class="btn btn-danger glyphicon glyphicon-remove row-remove"></button>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic2">
                                        <thead>
                                        <tr >
                                            <th width="47%" class="text-center">Benificiary Type</th>
                                            <th width="48%" class="text-center">Benificiary Total</th>
                                            <th width="5%" class="text-center">
                                                <a id="add_row2" class="btn btn-primary fa fa-plus"></a>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="btpId">benificiryTypeList
                                                <select  class="form-control" id="btpId0" name="btpId0" >
                                                    <logic:iterate id="benificiaryList" name="benificiaryList">
                                                        <option value=<bean:write name="benificiaryList" property="lookupId"/>><bean:write name="benificiaryList" property="lookupDesc"/></option>
                                                    </logic:iterate>
                                                </select>
                                            </td>
                                            <td data-name="benTotal">
                                                <input type="text" id="benTotal0" name="benTotal0" placeholder='Benificiary Total' class="form-control"/>
                                            </td>
                                            <td data-name="del">
                                                <button nam="del0" class="btn btn-danger glyphicon glyphicon-remove row-remove"></button>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="form-group row opBtn">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="button" onclick="javaScript:parent.location = '/viewEditPmaActivity.do?actvNo=<%=request.getParameter("actvNo")%>&intrNo=<%=request.getParameter("intrNo")%>'"
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
    InvalidInputHelper(document.getElementsByName("actvNo")[0], {
        defaultText: "Please Enter The Activity No ",
        emptyText: "Please Enter The Activity No ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("intrNo")[0], {
        defaultText: "Please Enter The Programme ",
        emptyText: "Please Enter The Programme ",
    });
    InvalidInputHelper(document.getElementsByName("actvLevel")[0], {
        defaultText: "Please Enter The Level",
        emptyText: "Please Enter The Level ",
    });
    InvalidInputHelper(document.getElementsByName("actvImplementingPartner")[0], {
        defaultText: "Please Enter The Implementing Partner ",
        emptyText: "Please Enter The Implementing Partner ",
    });
    InvalidInputHelper(document.getElementsByName("actvTitle")[0], {
        defaultText: "Please Enter The Title ",
        emptyText: "Please Enter The Title ",
    });
    InvalidInputHelper(document.getElementsByName("actvSummaryDescription")[0], {
        defaultText: "Please Enter The Summary Description ",
        emptyText: "Please Enter The Summary Description ",
    });
    InvalidInputHelper(document.getElementsByName("actvStatus")[0], {
        defaultText: "Please Enter The Status ",
        emptyText: "Please Enter The Status ",
    });
    InvalidInputHelper(document.getElementsByName("actvProposedStartDate")[0], {
        defaultText: "Please Enter The Proposed Start Date ",
        emptyText: "Please Enter The Proposed Start Date ",
    });

  </script>