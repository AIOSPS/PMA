<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#proId").attr("placeholder", "Project ID");
        $("#proId").prop('required', true);
        $("#proTitle").attr("placeholder", "Project Title");
        $("#proTitle").prop('required', true);
        $("#proDescription").attr("placeholder", "Project Description");
        $("#proDescription").prop('required', true);
        $("#proStartDate").attr("placeholder", "Start Date");
        $("#proStartDate").prop('required', true);
        $("#proEndDate").attr("placeholder", "End Date");
        $("#proEndDate").prop('required', true);
        $("#proBudget").attr("placeholder", "Project Budget");
        $("#proBudget").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Project Information
        </a><span class=""> > </span><span>Projects</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Create a New Project</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addProject">
                <h2 class="titleSep"><span>Administration</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="donorProjectList" class="col-sm-3 col-form-label">Donor:</label>
                        <div class="col-sm-9">

                                <html:select property="donorProjectList" multiple="true"
                                             styleClass="selectpicker form-control">
                                    <logic:present name="dononrList">
                                    <html:options collection="dononrList" property="donId" labelProperty="donName"/>
                                    </logic:present>
                                </html:select>

                        </div>

                    </div>

                    <div class="col-md-6">

                        <label for="implementerProjectList" class="col-sm-3 col-form-label">Implementer:</label>
                        <div class="col-sm-9">

                                <html:select property="implementerProjectList" multiple="true"
                                             styleClass="selectpicker form-control">
                                    <logic:present name="implementerList">
                                    <html:options collection="implementerList" property="impId"
                                                  labelProperty="impName"/>
                                    </logic:present>
                                </html:select>

                        </div>

                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="devId" class="col-sm-3 col-form-label">D.A:</label>
                        <div class="col-sm-9">

                            <html:select property="devId" styleClass="selectpicker form-control">
                                <logic:present name="developmentAgencyList">
                                <html:options collection="developmentAgencyList" property="devId"
                                              labelProperty="devAbbName"/>
                                </logic:present>
                            </html:select>

                        </div>
                    </div>

                    <div class="col-md-6">
                        <label for="prgId" class="col-sm-3 col-form-label">Programme:</label>
                        <div class="col-sm-9">

                            <html:select property="prgId" styleClass="selectpicker form-control">
                                <logic:present name="programmList">
                                <html:options collection="programmList" property="prgId" labelProperty="prgTitle"/>
                                </logic:present>
                            </html:select>

                        </div>
                    </div>
                </div>


                <h2 class="titleSep"><span>Project Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proId" class="col-sm-3 col-form-label">Project ID:</label>
                        <div class="col-sm-9">
                            <html:text property="proId" styleClass="form-control" styleId="proId"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="proTitle" class="col-sm-3 col-form-label">Project Title:</label>
                        <div class="col-sm-9">
                            <html:text property="proTitle" styleClass="form-control" styleId="proTitle"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proDescription" class="col-sm-3 col-form-label">Project Destination:</label>
                        <div class="col-sm-9">
                            <html:text property="proDescription" styleClass="form-control" styleId="proDescription"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="statusPr" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="proStatus" styleClass="selectpicker form-control">
                                <html:option value="1">New</html:option>
                                <html:option value="2">Stopped</html:option>
                                <html:option value="3">Completed</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="prStDate" class="col-sm-3 col-form-label">Start Date:</label>

                        <div class='input-group date col-sm-9' id='pStartDate'>
                            <html:text property="proStartDate" styleClass="form-control" styleId="proStartDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="prEnDate" class="col-sm-3 col-form-label">End Date:</label>

                        <div class='input-group date col-sm-9' id='pEndDate'>
                            <html:text property="proEndDate" styleClass="form-control" styleId="proEndDate"/>
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#pStartDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                            $('#pEndDate').datetimepicker({
                                format: 'DD/MM/YYYY'
                            });
                        });
                    </script>

                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proBudget" class="col-sm-3 col-form-label">Budget:</label>
                        <div class="col-sm-9">
                            <html:text property="proBudget" styleClass="form-control" styleId="proBudget"/>
                        </div>
                    </div>
                    <div class="col-md-6">

                        <div class="col-sm-9">
                        </div>
                    </div>
                </div>


                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="prNotes" class="col-sm-3 col-form-label">Project Notes:</label>
                        <div class="col-sm-9">
                            <html:textarea property="proNotes" styleClass="form-control" rows="6"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="prNotes" class="col-sm-3 col-form-label">Project Images:</label>
                        <div class="col-sm-9">
                            <img id="prImage" src="resources/images/pro1.jpg" height="168"></img>
                        </div>
                    </div>
                </div>


                <h2 class="titleSep"><span>Location</span></h2>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="locationProjectList" class="col-sm-3 col-form-label"> GIS Location:</label>
                        <div class="col-sm-9">

                            <html:select property="locationProjectList" multiple="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="locationList">
                                <html:options collection="locationList" property="locId" labelProperty="locLatitude"/>
                                </logic:present>
                            </html:select>

                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="proArea" class="col-sm-3 col-form-label">Project Area:</label>
                        <div class="col-sm-9">
                            <html:select property="proArea" styleClass="selectpicker form-control">
                                <html:option value="A">A</html:option>
                                <html:option value="B">B</html:option>
                                <html:option value="C">C</html:option>
                                <html:option value="EJ">EJ</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proType" class="col-sm-3 col-form-label">Project Type:</label>
                        <div class="col-sm-9">
                            <html:select property="proType" styleClass="selectpicker form-control">
                                <html:option value="1">Humman</html:option>
                                <html:option value="2">Development</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6  ">
                        <label for="communityProjectList" class="col-sm-3 col-form-label"> Community:</label>
                        <div class="col-sm-9">

                            <html:select property="communityProjectList" multiple="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="communityList">
                                <html:options collection="communityList" property="comId" labelProperty="comName"/>
                                </logic:present>
                            </html:select>

                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend> Cluster</legend>
                            <div class="col-md-6">
                                <label for="proHasCluster" class="col-sm-3 col-form-label">Is Cluster:</label>
                                <fieldset class="col-sm-9" id="isCluster">
                                    <div>

                                        <label class="radio-inline">
                                            <html:radio property="proHasCluster" value="1"/>
                                            Yes
                                        </label>


                                        <label class="radio-inline">
                                            <html:radio property="proHasCluster" value="0"/>
                                            No
                                        </label>


                                    </div>
                                </fieldset>
                            </div>

                            <div class="col-md-6">
                                <label for="cluId" class="col-sm-3 col-form-label"> Cluster:</label>
                                <div class="col-sm-9">
                                    <html:select property="cluId" styleClass="selectpicker form-control">
                                        <logic:present name="clusterList">
                                        <html:options collection="clusterList" property="compId.cluId"
                                                      labelProperty="cluDesc"/>
                                        </logic:present>
                                    </html:select>
                                </div>
                            </div>

                        </fieldset>
                    </div>
                </div>


                <h2 class="titleSep"><span>Permit</span></h2>

                <div class="form-group row">
                    <div class="col-md-6  ">
                        <label for="proNeedPermit" class="col-sm-3 col-form-label">Permit Need:</label>
                        <fieldset class="col-sm-9" id="PermitNeed">
                            <div>

                                <label class="radio-inline">
                                    <html:radio property="proNeedPermit" value="1"/>
                                    Yes
                                </label>


                                <label class="radio-inline">
                                    <html:radio property="proNeedPermit" value="0"/>
                                    No
                                </label>


                            </div>
                        </fieldset>
                    </div>

                    <div class="col-md-6  ">
                        <label for="preId" class="col-sm-3 col-form-label">Permit Number:</label>
                        <div class="col-sm-9">
                            <html:select property="preId" styleClass="selectpicker form-control">
                                <logic:present name="permitList">
                                <html:options collection="permitList" property="perId" labelProperty="perTitle"/>
                                </logic:present>
                            </html:select>

                        </div>

                    </div>
                </div>
                <h2 class="titleSep"><span>Benificiaries</span></h2>

                <div class="form-group row">
                    <div class="col-md-6  ">
                        <label for="benificiaryProjectList" class="col-sm-3 col-form-label">Benificiaries:</label>
                        <div class="col-sm-9">
                            <html:select property="benificiaryProjectList" multiple="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="benificiryList">
                                <html:options collection="benificiryList" property="benId" labelProperty="benDesc"/>
                                </logic:present>
                            </html:select>
                        </div>

                    </div>

                    <div class="col-md-6  ">
                        <label for="indicatorProjectList" class="col-sm-3 col-form-label">Indicators:</label>
                        <div class="col-sm-9">
                            <html:select property="indicatorProjectList" styleClass="selectpicker form-control">
                                <logic:present name="indicatorList">
                                <html:options collection="indicatorList" property="compId.compId"
                                              labelProperty="indTitle"/>
                                </logic:present>
                            </html:select>
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


    InvalidInputHelper(document.getElementsByName("proId")[0], {
        defaultText: "Please Enter The Project ID ",
        emptyText: "Please Enter The Project ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("proTitle")[0], {
        defaultText: "Please Enter The Project Title ",
        emptyText: "Please Enter The Project Title ",
    });
    InvalidInputHelper(document.getElementsByName("proDescription")[0], {
        defaultText: "Please Enter The Project Description ",
        emptyText: "Please Enter The Project Description ",
    });
    InvalidInputHelper(document.getElementsByName("proStartDate")[0], {
        defaultText: "Please Enter The Start Date ",
        emptyText: "Please Enter The Start Date ",
    });
    InvalidInputHelper(document.getElementsByName("proEndDate")[0], {
        defaultText: "Please Enter The End Date ",
        emptyText: "Please Enter The End Date ",
    });
    InvalidInputHelper(document.getElementsByName("proBudget")[0], {
        defaultText: "Please Enter The Project Budjet ",
        emptyText: "Please Enter The Project Budjet ",
    });
</script>