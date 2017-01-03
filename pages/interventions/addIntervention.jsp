<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#intId").attr("placeholder", "Intervention ID");
        $("#intId").prop('required', true);
        $("#intDesc").attr("placeholder", "Description");
        $("#intDesc").prop('required', true);
        $("#intEstimatedBudget").attr("placeholder", "Estimated Budget");
        $("#intEstimatedBudget").prop('required', true);
        $("#intSource").attr("placeholder", "Source");
        $("#intSource").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Intervention Information
        </a><span class=""> > </span><span>Interventions</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Create a New Intervention</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addIntervention">
                <h2 class="titleSep"><span>Intervention Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="intId" class="col-sm-3 col-form-label">Intervention ID:</label>
                        <div class="col-sm-9">
                            <html:text property="intId" styleClass="form-control" styleId="intId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="masId" class="col-sm-3 col-form-label">Master Plan:</label>
                        <div class="col-sm-9">
                            <html:select property="masId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="masterPlanList">
                                    <html:option value="">Select</html:option>
                                    <html:options collection="masterPlanList" property="masId" labelProperty="masMpName"/>
                                </logic:present>

                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label">Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="secId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="sectorsList">
                                    <html:options collection="sectorsList" property="secId" labelProperty="secName"/>
                                </logic:present>

                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intDesc" class="col-sm-3 col-form-label">Description:</label>
                        <div class="col-sm-9">
                            <html:text property="intDesc" styleClass="form-control" styleId="intDesc"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="intEstimatedBudget" class="col-sm-3 col-form-label">Estimated Budget:</label>
                        <div class="col-sm-9">
                            <html:text property="intEstimatedBudget" styleClass="form-control" styleId="intEstimatedBudget"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intSource" class="col-sm-3 col-form-label">Source:</label>
                        <div class="col-sm-9">
                            <html:select property="intSource" styleClass="selectpicker form-control">
                                <html:option value="MASTER">Master Plan</html:option>
                                <html:option value="ASSESS">Assessment</html:option>
                                <html:option value="COMM">Comunity Representative</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="intPriority" class="col-sm-3 col-form-label">Priority:</label>
                        <div class="col-sm-9">
                            <html:select property="intPriority" styleClass="selectpicker form-control">
                                <html:option value="H">High</html:option>
                                <html:option value="M">Medium</html:option>
                                <html:option value="L">Low</html:option>

                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">

                        </div>
                    </div>
                </div>
                <h2 class="titleSep"><span>Activity Information</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic">
                                        <thead>
                                        <tr >
                                            <th width="15%" class="text-center">Activity ID</th>
                                            <th width="35%" class="text-center">Description</th>
                                            <th width="15%" class="text-center">Unit</th>
                                            <th width="15%" class="text-center">Unit Qty</th>
                                            <th width="15%" class="text-center">Estimated Budget</th>
                                            <th width="5%" class="text-center">
                                                <a id="add_row" class="btn btn-primary fa fa-plus"></a>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="actId">
                                                <input type="text" id="actId0" name="actId0"  placeholder='Activity ID' class="form-control"/>
                                            </td>
                                            <td data-name="actDesc">
                                                <input type="text" id="actDesc0" name="actDesc0" placeholder='Description' class="form-control"/>
                                            </td>
                                            <td data-name="actUnit">
                                                <input type="text" id="actUnit0" name="actUnit0" placeholder='Unit' class="form-control"/>
                                            </td>
                                            <td data-name="actUnitQty">
                                                <input type="text" id="actUnitQty0" name="actUnitQty0" placeholder='Unit Qty' class="form-control"/>
                                            </td>
                                            <td data-name="actEstimatedBudget">
                                                <input type="text" id="actEstimatedBudget0" name="actEstimatedBudget0" placeholder='Estimated Budget' class="form-control"/>
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
                    <div class="offset-sm-2 col-sm-10">
                        <html:submit value="Submit" styleClass="btn btn-primary"/>
                    </div>
                </div>
            </html:form>


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


    InvalidInputHelper(document.getElementsByName("intId")[0], {
        defaultText: "Please Enter The Intervention ID ",
        emptyText: "Please Enter The Intervention ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("intDesc")[0], {
        defaultText: "Please Enter The Description ",
        emptyText: "Please Enter The Description ",
    });
    InvalidInputHelper(document.getElementsByName("intEstimatedBudget")[0], {
        defaultText: "Please Enter The Estimated Budget ",
        emptyText: "Please Enter The Estimated Budget ",
    });
    InvalidInputHelper(document.getElementsByName("intSource")[0], {
        defaultText: "Please Enter The Source ",
        emptyText: "Please Enter The Source ",
    });


//   table script for activities
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