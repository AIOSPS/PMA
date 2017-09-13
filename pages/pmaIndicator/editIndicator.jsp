<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="btc.pma.programme.database.PmaIndicatorDetail" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#indrNo").attr("placeholder", "Indicator No.");
        $("#indrNo").prop('required', true);
        $("#indrDefinition").attr("placeholder", "Indicator Definition");
        $("#indrDefinition").prop('required', true);
        $("#indrBaseline").attr("placeholder", "Indicator Baseline");
        $("#indrBaseline").prop('required', true);
        $("#indrDefineDate").attr("placeholder", "Define Date");
        $("#indrDefineDate").prop('required', true);
        $("#indrClosedDate").attr("placeholder", "Closed Date");
        $("#indrClosedDate").prop('required', true);
        $("#indrStatus").attr("placeholder", "Status");
        $("#indrStatus").prop('required', true);
        $("#indrTargetPlaned").attr("placeholder", "Target Planed");
        $("#indrTargetPlaned").prop('required', true);
        $("#indrDataCollMethod").attr("placeholder", "Data Collection Method");
        $("#indrDataCollMethod").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-puzzle-piece"></span>   M&amp;E
        </a><span class=""> > </span><span>Edit Indicator</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container pd0">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Indicator</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addPmaIndicator">
                <h2 class="titleSep"><span>Indicator Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <%--<label for="indrNo" class="col-sm-3 col-form-label">Indicator Number:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="indrNo" styleClass="form-control" styleId="indrNo"/>--%>
                        <%--</div>--%>
                            <html:hidden property="indrNo"/>
                    </div>
                    <div class="col-md-6">
                        <label for="resId" class="col-sm-3 col-form-label">Result:</label>
                        <div class="col-sm-9">
                            <html:select property="rsltNo"
                                         styleClass="selectpicker form-control">
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
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indrDefinition" class="col-sm-3 col-form-label">Indicator Definition:</label>
                        <div class="col-sm-9">
                            <html:text property="indrDefinition" styleClass="form-control" styleId="indrDefinition"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indrDefineDate" class="col-sm-3 col-form-label">Indicator Define Date:</label>
                        <div class='input-group date col-sm-9' id='iDate'>
                            <html:text property="indrDefineDate" styleClass="form-control" styleId="indrDefineDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#indrDefineDate').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indrClosedDate" class="col-sm-3 col-form-label">Indicator Close Date:</label>
                        <div class='input-group date col-sm-9' id='iDate'>
                            <html:text property="indrClosedDate" styleClass="form-control" styleId="indrClosedDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#indrClosedDate').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                    <div class="col-md-6">
                        <label for="indrBaseline" class="col-sm-3 col-form-label">Base line:</label>
                        <div class="col-sm-9">
                            <html:text property="indrBaseline" styleClass="form-control" styleId="indrBaseline"/>
                        </div>
                    </div>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indrStatus" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="indrStatus"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Active</html:option>
                                <html:option value="2">Inactive</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indrTargetPlaned" class="col-sm-3 col-form-label">Target Planed:</label>
                        <div class="col-sm-9">
                            <html:text property="indrTargetPlaned" styleClass="form-control" styleId="indrTargetPlaned"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indrDataCollMethod" class="col-sm-3 col-form-label">Collection Method:</label>
                        <div class="col-sm-9">
                            <html:select property="indrDataCollMethod"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Observation</html:option>
                                <html:option value="2">Document analysis</html:option>
                                <html:option value="3">Interview</html:option>
                                <html:option value="4">Group Discussion</html:option>
                                <html:option value="5">Group Assessment</html:option>
                                <html:option value="6">Survey</html:option>
                                <html:option value="7">Case Study</html:option>
                                <html:option value="8">Journal Keeping</html:option>
                                <html:option value="9">Testimonials</html:option>
                                <html:option value="10">Self-assessment</html:option>
                                <html:option value="11">Studies</html:option>
                                <html:option value="12">Photograph/video logs</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indrTool" class="col-sm-3 col-form-label">Tool:</label>
                        <div class="col-sm-9">
                            <html:text property="indrTool" styleClass="form-control" styleId="indrTool"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indrFrequency" class="col-sm-3 col-form-label">Frequency:</label>
                        <div class="col-sm-9">
                            <html:text property="indrFrequency" styleClass="form-control" styleId="indrFrequency"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indrResponsibilities" class="col-sm-3 col-form-label">Reponsibility:</label>
                        <div class="col-sm-9">
                            <html:text property="indrResponsibilities" styleClass="form-control" styleId="indrResponsibilities"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indrTargetAcheived" class="col-sm-3 col-form-label">Target Acheived:</label>
                        <div class="col-sm-9">
                            <html:text property="indrTargetAcheived" styleClass="form-control" styleId="indrTargetAcheived"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indrType" class="col-sm-3 col-form-label">Type:</label>
                        <div class="col-sm-9">
                            <html:select property="indrType"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Qalitative</html:option>
                                <html:option value="2">Quantitative</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intrNo" class="col-sm-3 col-form-label">Programme:</label>
                        <div class="col-sm-9">
                            <html:select property="intrNo"
                                         styleClass="selectpicker form-control">
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
                    <div class="col-md-6">
                        <label for="indrNo" class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                        </div>
                    </div>
                </div>
                <h2 class="titleSep"><span>Indicator Measures Information</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic">
                                        <thead>
                                        <tr >
                                            <th width="95%" class="text-center">Value</th>
                                            <th width="5%" class="text-center">
                                                <a id="add_row" class="btn btn-primary fa fa-plus"></a>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="indValue">
                                                <input type="text" id="indValue0" name="indValue0" placeholder='Value' class="form-control"/>
                                            </td>
                                            <td data-name="del">
                                                <button nam="del0" class="btn btn-danger glyphicon glyphicon-remove row-remove"></button>
                                            </td>
                                        </tr>
                                        <logic:present name="indicatorDetailList">
                                            <% List indicatorDetailList = (List) request.getAttribute("indicatorDetailList");
                                                int count = 1;
                                                Iterator itr = indicatorDetailList.iterator();
                                                PmaIndicatorDetail pmaIndicatorDetail = null;
                                                while (itr.hasNext()){
                                                    pmaIndicatorDetail = (PmaIndicatorDetail) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <td data-name="indValue">
                                                    <input type="text" id="indValue<%=count%>" name="indValue<%=count%>" value="<%=pmaIndicatorDetail.getIdtlValue()%>" placeholder='Value' class="form-control"/>
                                                </td>
                                            </tr>
                                            <%
                                                    count++;
                                                }
                                            %>
                                        </logic:present>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

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
    InvalidInputHelper(document.getElementsByName("indrNo")[0], {
        defaultText: "Please Enter The Indicator No ",
        emptyText: "Please Enter The Indicator No ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("indrDefinition")[0], {
        defaultText: "Please Enter The Indicator Definition ",
        emptyText: "Please Enter The Indicator Definition ",
    });
    InvalidInputHelper(document.getElementsByName("indrBaseline")[0], {
        defaultText: "Please Enter The Indicator Base line ",
        emptyText: "Please Enter The Indicator Base line ",
    });
    InvalidInputHelper(document.getElementsByName("indrDefineDate")[0], {
        defaultText: "Please Enter The Define Date ",
        emptyText: "Please Enter The Define Date ",
    });
    InvalidInputHelper(document.getElementsByName("indrClosedDate")[0], {
        defaultText: "Please Enter The Closed Date ",
        emptyText: "Please Enter The Closed Date ",
    });
    InvalidInputHelper(document.getElementsByName("indrStatus")[0], {
        defaultText: "Please Enter The Status ",
        emptyText: "Please Enter The Status ",
    });
    InvalidInputHelper(document.getElementsByName("indrTargetPlaned")[0], {
        defaultText: "Please Enter The Target Planed ",
        emptyText: "Please Enter The Target Planed ",
    });
    InvalidInputHelper(document.getElementsByName("indrDataCollMethod")[0], {
        defaultText: "Please Enter The Data Collection Method ",
        emptyText: "Please Enter The Data Collection Method ",
    });

    //   table script for programme
    $(document).ready(function() {
        $("#add_row").on("click", function() {
            // Dynamic Rows Code

            // Get max row id and set new id
            var newid = 0;
            $.each($("#tab_logic tr"), function() {
                if (parseInt($(this).data("id")) > newid) {
                    newid = parseInt($(this).data("id"));
                }
            });
            newid++;

            var tr = $("<tr></tr>", {
                id: "addr"+newid,
                "data-id": newid
            });

            // loop through each td and create new elements with name of newid
            $.each($("#tab_logic tbody tr:nth(0) td"), function() {
                var cur_td = $(this);

                var children = cur_td.children();

                // add new td and element if it has a nane
                if ($(this).data("name") != undefined) {
                    var td = $("<td></td>", {
                        "data-name": $(cur_td).data("name")
                    });

                    var c = $(cur_td).find($(children[0]).prop('tagName')).clone().val("");
                    c.attr("name", $(cur_td).data("name") + newid);
                    c.attr("id", $(cur_td).data("name") + newid);
                    c.appendTo($(td));
                    td.appendTo($(tr));
                } else {
                    var td = $("<td></td>", {
                        'text': $('#tab_logic tr').length
                    }).appendTo($(tr));
                }
            });

            // add delete button and td
            /*
             $("<td></td>").append(
             $("<button class='btn btn-danger glyphicon glyphicon-remove row-remove'></button>")
             .click(function() {
             $(this).closest("tr").remove();
             })
             ).appendTo($(tr));
             */

            // add the new row
            $(tr).appendTo($('#tab_logic'));

            $(tr).find("td button.row-remove").on("click", function() {
                $(this).closest("tr").remove();
            });
        });




        // Sortable Code
        var fixHelperModified = function(e, tr) {
            var $originals = tr.children();
            var $helper = tr.clone();

            $helper.children().each(function(index) {
                $(this).width($originals.eq(index).width())
            });

            return $helper;
        };

        $(".table-sortable tbody").sortable({
            helper: fixHelperModified
        }).disableSelection();

        $(".table-sortable thead").disableSelection();



        $("#add_row").trigger("click");
    });
</script>