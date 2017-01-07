<%@ page import="eu.pms.project.database.PmsIndicatorMeasures" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#indId").attr("placeholder", "Indicator ID");
        $("#indId").prop('required', true);
        $("#indTitle").attr("placeholder", "Indicator Title");
        $("#indTitle").prop('required', true);
        $("#indDate").attr("placeholder", "Indicator Date");
        $("#indDate").prop('required', true);
        $("#indLongDesc").attr("placeholder", "Long Description");
        $("#indLongDesc").prop('required', true);
        $("#indBaseline").attr("placeholder", "Base line");
        $("#indBaseline").prop('required', true);
        $("#indFrequency").attr("placeholder", "Frequency");
        $("#indFrequency").prop('required', true);
        $("#indCollectionMethod").attr("placeholder", "Collection Method");
        $("#indCollectionMethod").prop('required', true);
        $("#indStatisticalMethod").attr("placeholder", "Statistical Method");
        $("#indStatisticalMethod").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Indicator Information
        </a><span class=""> > </span><span>Indicators</span></nav>
    </div>
</div>



<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Indicator</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addIndicator">
                <h2 class="titleSep"><span>Indicator Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indId" class="col-sm-3 col-form-label">Indicator ID:</label>
                        <div class="col-sm-9">
                            <html:text property="indId" styleClass="form-control" styleId="indId" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="resId" class="col-sm-3 col-form-label">Result:</label>
                        <div class="col-sm-9">
                            <html:select property="resId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="resultList">
                                    <html:options collection="resultList" property="compId.compId" labelProperty="resDesc"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indTitle" class="col-sm-3 col-form-label">Indicator Title:</label>
                        <div class="col-sm-9">
                            <html:text property="indTitle" styleClass="form-control" styleId="indTitle"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indDate" class="col-sm-3 col-form-label">Indicator Date:</label>
                        <div class='input-group date col-sm-9' id='iDate'>
                            <html:text property="indDate" styleClass="form-control" styleId="indDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                        <script type="text/javascript">
                            $(function () {
                                $('#iDate').datetimepicker({
                                    format: 'DD/MM/YYYY'
                                });
                            });
                        </script>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indLongDesc" class="col-sm-3 col-form-label">Long Description:</label>
                        <div class="col-sm-9">
                            <html:text property="indLongDesc" styleClass="form-control" styleId="indLongDesc"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indBaseline" class="col-sm-3 col-form-label">Base line:</label>
                        <div class="col-sm-9">
                            <html:text property="indBaseline" styleClass="form-control" styleId="indBaseline"/>
                        </div>
                    </div>

                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indFrequency" class="col-sm-3 col-form-label">Frequency:</label>
                        <div class="col-sm-9">
                            <html:select property="indFrequency"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">semi-annually</html:option>
                                <html:option value="2">annually</html:option>
                                <html:option value="3">periodically</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="indCollectionMethod" class="col-sm-3 col-form-label">Collection Method:</label>
                        <div class="col-sm-9">
                            <html:select property="indCollectionMethod"
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
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="indStatisticalMethod" class="col-sm-3 col-form-label">Statistical Method:</label>
                        <div class="col-sm-9">
                            <html:text property="indStatisticalMethod" styleClass="form-control" styleId="indStatisticalMethod"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
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
                                            <th width="48%" class="text-center">Target</th>
                                            <th width="47%" class="text-center">Value</th>
                                            <th width="5%" class="text-center">
                                                <a id="add_row" class="btn btn-primary fa fa-plus"></a>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="indTarget">
                                                <input type="text" id="indTarget0" name="indTarget0" placeholder='Target' class="form-control"/>
                                            </td>
                                            <td data-name="indValue">
                                                <input type="text" id="indValue0" name="indValue0" placeholder='Value' class="form-control"/>
                                            </td>
                                            <td data-name="del">
                                                <button nam="del0" class="btn btn-danger glyphicon glyphicon-remove row-remove"></button>
                                            </td>
                                        </tr>
                                        <logic:present name="indicatorMeasuresList">
                                            <% List indicatorMeasuresList = (List) request.getAttribute("indicatorMeasuresList");
                                                int count = 1;
                                                Iterator itr = indicatorMeasuresList.iterator();
                                                PmsIndicatorMeasures pmsIndicatorMeasures = null;
                                                while (itr.hasNext()){
                                                    pmsIndicatorMeasures = (PmsIndicatorMeasures) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <td data-name="indTarget">
                                                    <input type="text" id="indTarget<%=count%>" name="indTarget<%=count%>" value="<%=pmsIndicatorMeasures.getIndTarget()%>" placeholder='Target' class="form-control"/>
                                                </td>
                                                <td data-name="indValue">
                                                    <input type="text" id="indValue<%=count%>" name="indValue<%=count%>" value="<%=pmsIndicatorMeasures.getIndValue()%>" placeholder='Value' class="form-control"/>
                                                </td>
                                                <td data-name="del">
                                                    <button nam="del0" type="button" onclick="removeTr('del<%=count%>')" class="btn btn-danger glyphicon glyphicon-remove row-remove" value name="del<%=count%>" id="del<%=count%>"></button>

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
    InvalidInputHelper(document.getElementsByName("indId")[0], {
        defaultText: "Please Enter The Indicator ID ",
        emptyText: "Please Enter The Indicator ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("indTitle")[0], {
        defaultText: "Please Enter The Indicator Title ",
        emptyText: "Please Enter The Indicator Title ",
    });
    InvalidInputHelper(document.getElementsByName("indDate")[0], {
        defaultText: "Please Enter The Indicator Date ",
        emptyText: "Please Enter The Indicator Date ",
    });
    InvalidInputHelper(document.getElementsByName("indLongDesc")[0], {
        defaultText: "Please Enter The Long Description ",
        emptyText: "Please Enter The Long Description ",
    });
    InvalidInputHelper(document.getElementsByName("indBaseline")[0], {
        defaultText: "Please Enter The Base line ",
        emptyText: "Please Enter The Base line ",
    });
    InvalidInputHelper(document.getElementsByName("indFrequency")[0], {
        defaultText: "Please Enter The Frequency ",
        emptyText: "Please Enter The Frequency ",
    });
    InvalidInputHelper(document.getElementsByName("indCollectionMethod")[0], {
        defaultText: "Please Enter The Collection Method ",
        emptyText: "Please Enter The Collection Method ",
    });
    InvalidInputHelper(document.getElementsByName("indStatisticalMethod")[0], {
        defaultText: "Please Enter The Statistical Method ",
        emptyText: "Please Enter The Statistical Method ",
    });
    //   table script
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
    function removeTr(id) {
        $('#'+id).closest("tr").remove();
    }
</script>