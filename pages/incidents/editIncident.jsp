<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script type="text/javascript">
    $(function () {
        $("#incId").attr("placeholder", "Incident ID");
        $("#incId").prop('required', true);
        $("#incOchaId").attr("placeholder", "Incident OCHA");
        $("#incOchaId").prop('required', true);
        $("#incDescription").attr("placeholder", "Description");
        $("#incDescription").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Incident Information
        </a><span class=""> > </span><span>Incidents</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Incident</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addIncident">
                <h2 class="titleSep"><span>Incident Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incType" class="col-sm-3 col-form-label">Incident Type:</label>
                        <div class="col-sm-9">
                            <html:select property="incType"
                                         styleClass="selectpicker form-control">
                                <html:option value="1">Type one</html:option>
                                <html:option value="2">Type two</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <%--<label for="incId" class="col-sm-3 col-form-label">Incident ID:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="incId" styleClass="form-control" styleId="incId" disabled="true"/>--%>
                            <html:hidden property="incId"/>
                        <%--</div>--%>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incOchaId" class="col-sm-3 col-form-label">Incident OCHA:</label>
                        <div class="col-sm-9">
                            <html:text property="incOchaId" styleClass="form-control" styleId="incOchaId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incDescription" class="col-sm-3 col-form-label">Description:</label>
                        <div class="col-sm-9">
                            <html:text property="incDescription" styleClass="form-control" styleId="incDescription"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incAffectedWomen" class="col-sm-3 col-form-label">Affected Women:</label>
                        <div class="col-sm-9">
                            <html:text property="incAffectedWomen" styleClass="form-control" styleId="incAffectedWomen"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incAffectedMen" class="col-sm-3 col-form-label">Affected Men:</label>
                        <div class="col-sm-9">
                            <html:text property="incAffectedMen" styleClass="form-control" styleId="incAffectedMen"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incAffectedAdaults" class="col-sm-3 col-form-label">Affected Adaults:</label>
                        <div class="col-sm-9">
                            <html:text property="incAffectedAdaults" styleClass="form-control" styleId="incAffectedAdaults"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incAffectedChildren" class="col-sm-3 col-form-label">Affected Children:</label>
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                            <html:text property="incAffectedChildren" styleClass="form-control" styleId="incAffectedChildren"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incDisplacedWomen" class="col-sm-3 col-form-label">Displaced Women:</label>
                        <div class="col-sm-9">
                            <html:text property="incDisplacedWomen" styleClass="form-control" styleId="incDisplacedWomen"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incDisplacedMen" class="col-sm-3 col-form-label">Displaced Men:</label>
                        <div class="col-sm-9">
                            <html:text property="incDisplacedMen" styleClass="form-control" styleId="incDisplacedMen"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incDisplacedAdult" class="col-sm-3 col-form-label">Displaced Adult:</label>
                        <div class="col-sm-9">
                            <html:text property="incDisplacedAdult" styleClass="form-control" styleId="incDisplacedAdult"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incDisplacedChildren" class="col-sm-3 col-form-label">Displaced Children:</label>
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                            <html:text property="incDisplacedChildren" styleClass="form-control" styleId="incDisplacedChildren"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incDemolishedStructure" class="col-sm-3 col-form-label">Demolished Structure:</label>
                        <div class="col-sm-9">
                            <html:text property="incDemolishedStructure" styleClass="form-control" styleId="incDemolishedStructure"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incDemolishedMen" class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                            &nbsp;
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="incSourceLink" class="col-sm-3 col-form-label">Source Link:</label>
                        <div class="col-sm-9">
                            <html:text property="incSourceLink" styleClass="form-control" styleId="incSourceLink"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="incTimeStamp" class="col-sm-3 col-form-label">Incident Date:</label>
                        <div class="col-sm-9">
                            <div class='input-group date col-sm-9' id='pIncidentDate'>
                                <html:text property="incTimeStamp" styleClass="form-control" styleId="incTimeStamp"/>
                                <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                            </div>
                            <script type="text/javascript">
                                $(function () {
                                    $('#pIncidentDate').datetimepicker({
                                        format: 'DD/MM/YYYY'
                                    });
                                });
                            </script>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="locLatitude" class="col-sm-3 col-form-label">Location Latitude:</label>
                        <div class="col-sm-9">
                            <html:text property="locLatitude" styleClass="form-control" styleId="locLatitude"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="locLongitude" class="col-sm-3 col-form-label">Location Longitude:</label>
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                            <html:text property="locLongitude" styleClass="form-control" styleId="locLongitude"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="datId" class="col-sm-3 col-form-label">Data Sources:</label>
                        <div class="col-sm-9">
                            <html:select property="datId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="dataSourceList">
                                    <html:options collection="dataSourceList" property="lookupId" labelProperty="lookupDesc"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="datId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
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
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proId" class="col-sm-3 col-form-label">Project:</label>
                        <div class="col-sm-9">
                            <html:select property="proId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="projectList">
                                    <html:options collection="projectList" property="proId" labelProperty="proTitle"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="proId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
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
    InvalidInputHelper(document.getElementsByName("incId")[0], {
        defaultText: "Please Enter The Incident ID ",
        emptyText: "Please Enter The Incident ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("incOchaId")[0], {
        defaultText: "Please Enter The Incident OCHA ",
        emptyText: "Please Enter The Incident OCHA ",
    });
    InvalidInputHelper(document.getElementsByName("incDescription")[0], {
        defaultText: "Please Enter The Description ",
        emptyText: "Please Enter The Description ",
    });
</script>