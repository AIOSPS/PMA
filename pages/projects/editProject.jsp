<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="eu.pms.project.database.PmsProjectsLocation" %>
<%@ page import="eu.pms.project.database.PmsProjectsBenificiary" %>
<%@ page import="eu.pms.lookup.database.PmsBenificiaryTyp" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#proId").attr("placeholder", "Project Number");
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
                <h1>Edit Project</h1>
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
                            <script>
                                $(function () {
                                    $('[name="donorProjectList"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
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
                            <script>
                                $(function () {
                                    $('[name="implementerProjectList"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>

                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="devId" class="col-sm-3 col-form-label">Development Agency:</label>
                        <div class="col-sm-9">
                            <html:select property="devId" styleClass="selectpicker form-control">
                                <logic:present name="developmentAgencyList">
                                    <html:options collection="developmentAgencyList" property="devId"
                                                  labelProperty="devAbbName"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="devId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
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
                            <script>
                                $(function () {
                                    $('[name="prgId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
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
                        <label for="secType" class="col-sm-3 col-form-label">Project Type:</label>
                        <div class="col-sm-9">
                            <html:select property="secType" styleClass="selectpicker form-control"
                                         onchange="setProjectTypeConfig(this.value)">
                                <html:option value="H">Humman</html:option>
                                <html:option value="D">Development</html:option>
                                <html:option value="Oth">Others</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="proTitle" class="col-sm-3 col-form-label">Project Title:</label>
                        <div class="col-sm-9">
                            <html:text property="proTitle" styleClass="form-control" styleId="proTitle"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="proDescription" class="col-sm-3 col-form-label">Project Description:</label>
                        <div class="col-sm-9">
                            <html:text property="proDescription" styleClass="form-control" styleId="proDescription"/>
                        </div>
                    </div>

                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label"> Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="secId" styleClass="selectpicker form-control">
                                <logic:present name="clusterHList">
                                    <optgroup label="Humanitarian" id="Humman">
                                        <html:options collection="clusterHList" property="secId"
                                                      labelProperty="secName"/>
                                    </optgroup>
                                </logic:present>
                                <logic:present name="clusterDList">
                                    <optgroup label="Development" id="Development">
                                        <html:options collection="clusterDList" property="secId"
                                                      labelProperty="secName"/>
                                    </optgroup>
                                </logic:present>
                                <logic:present name="clusterOthList">
                                    <optgroup label="Others" id="Others">
                                        <html:options collection="clusterOthList" property="secId"
                                                      labelProperty="secName"/>
                                    </optgroup>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="secId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label"> Sub Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="subSecId" styleClass=" form-control" >
                                <logic:present name="subSectorList">
                                    <html:options collection="subSectorList" property="compId"
                                                  labelProperty="secName"/>
                                </logic:present>
                            </html:select>
                                <%--<script>--%>
                                <%--$(function () {--%>
                                <%--$('[name="subSecId"]').eq(0).attr("data-live-search", "true");--%>
                                <%--});--%>
                                <%--</script>--%>
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
                        <div class="input-group date  col-sm-9">
                            <html:text property="proBudgetTxt" styleClass="form-control" styleId="proBudget"/>
                            <html:hidden property="proBudget"/>
                            <span class="input-group-addon input-group-addon1">
                               €
                            </span>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="statusPr" class="col-sm-3 col-form-label">Status:</label>
                        <div class="col-sm-9">
                            <html:select property="proStatus" styleClass="selectpicker form-control">
                                <html:option value="1">Design / Approval</html:option>
                                <html:option value="2">Ongoing</html:option>
                                <html:option value="3">Delayed</html:option>
                                <html:option value="4">Completed</html:option>
                                <html:option value="5">On-Hold</html:option>
                                <html:option value="6">Closed</html:option>
                                <html:option value="7">Cancelled</html:option>
                            </html:select>
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
                        <label  class="col-sm-3 col-form-label">&nbsp;</label>
                        <div class="col-sm-9">
                            <%--<img id="prImage" src="resources/images/pro1.jpg" height="168"></img>--%>
                        </div>
                    </div>
                </div>

                <h2 class="titleSep"><span>Location</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-bordered table-hover table-sortable" id="tab_logic">
                                        <thead>
                                        <tr >
                                            <th width="47%" class="text-center">Latitude</th>
                                            <th width="48%" class="text-center">Longitude</th>
                                            <th width="5%" class="text-center">
                                                <a id="add_row" class="btn btn-primary fa fa-plus"></a>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <td data-name="comLatitude">
                                                <input type="text" id="comLatitude0" name="comLatitude0"  placeholder='Latitude' class="form-control"/>
                                            </td>
                                            <td data-name="comLongitude">
                                                <input type="text" id="comLongitude0" name="comLongitude0" placeholder='Longitude' class="form-control"/>
                                            </td>
                                            <td data-name="del">
                                                <button nam="del0" class="btn btn-danger glyphicon glyphicon-remove row-remove"></button>
                                            </td>
                                        </tr>
                                        <logic:present name="projectLocationList">
                                            <% List projectLocationList = (List) request.getAttribute("projectLocationList");
                                                int count = 1;
                                                Iterator itr = projectLocationList.iterator();
                                                PmsProjectsLocation pmsProjectsLocation = null;
                                                while (itr.hasNext()){
                                                    pmsProjectsLocation = (PmsProjectsLocation) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <td data-name="comLatitude">
                                                    <input type="text" id="comLatitude<%=count%>" name="comLatitude<%=count%>" value="<%=pmsProjectsLocation.getCompId().getComLatitude()%>"  placeholder='Latitude' class="form-control"/>
                                                </td>
                                                <td data-name="comLongitude">
                                                    <input type="text" id="comLongitude<%=count%>" name="comLongitude<%=count%>" value="<%=pmsProjectsLocation.getCompId().getComLongitude()%>" placeholder='Longitude' class="form-control"/>
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
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend> Cluster</legend>
                            <div class="col-md-6">
                                <label for="proHasCluster" class="col-sm-3 col-form-label">Is Cluster:</label>
                                <fieldset class="col-sm-9" id="isCluster">
                                    <div>

                                        <label class="radio-inline">
                                            <html:radio property="proHasCluster" onclick="setProjectTypeConfig(this.value)" value="1"/>
                                            Yes
                                        </label>


                                        <label class="radio-inline">
                                            <html:radio property="proHasCluster" onclick="setProjectTypeConfig(this.value)" value="0"/>
                                            No
                                        </label>


                                    </div>
                                </fieldset>
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
                                    <script>
                                        $(function () {
                                            $('[name="communityProjectList"]').eq(0).attr("data-live-search", "true");
                                        });
                                    </script>

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
                            <script>
                                $(function () {
                                    $('[name="preId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>

                    </div>
                </div>
                <h2 class="titleSep"><span>Benificiaries</span></h2>
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
                                            <td data-name="btpId">
                                                <select  class="form-control" id="btpId0" name="btpId0"  >
                                                    <logic:present name="benificiryTypeList">
                                                        <% List benificiryTypeList = (List) request.getAttribute("benificiryTypeList");%>
                                                        <%
                                                            for (int i = 0; i < benificiryTypeList.size(); i++) {
                                                                PmsBenificiaryTyp obj = (PmsBenificiaryTyp) benificiryTypeList.get(i);
                                                        %>
                                                        <option value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                                        <%}%>

                                                    </logic:present>
                                                </select>
                                            </td>
                                            <td data-name="benTotal">
                                                <input type="text" id="benTotal0" name="benTotal0" placeholder='Benificiary Total' class="form-control"/>
                                            </td>
                                            <td data-name="del">
                                                <button nam="del0" class="btn btn-danger glyphicon glyphicon-remove row-remove"></button>
                                            </td>
                                        </tr>
                                        <logic:present name="projectBenificiryList">
                                            <% List projectBenificiryList = (List) request.getAttribute("projectBenificiryList");
                                                int count = 1;
                                                Iterator itr = projectBenificiryList.iterator();
                                                PmsProjectsBenificiary pmsProjectsBenificiary = null;
                                                while (itr.hasNext()){
                                                    pmsProjectsBenificiary = (PmsProjectsBenificiary) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <td data-name="btpId">
                                                    <select  class="form-control"  id="btpId<%=count%>" name="btpId<%=count%>" >
                                                        <logic:present name="benificiryTypeList">
                                                            <% List benificiryTypeList = (List) request.getAttribute("benificiryTypeList");%>
                                                            <%
                                                                for (int i = 0; i < benificiryTypeList.size(); i++) {
                                                                    PmsBenificiaryTyp obj = (PmsBenificiaryTyp) benificiryTypeList.get(i);
                                                                    if(pmsProjectsBenificiary.getCompId().getBtpId().equals(obj.getLookupId())){
                                                            %>
                                                            <option selected value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                                            <%}else{%>
                                                            <option value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                                               <% }}%>

                                                        </logic:present>
                                                    </select>
                                                </td>
                                                <td data-name="benTotal">
                                                    <input type="text" id="benTotal<%=count%>" name="benTotal<%=count%>" value="<%=pmsProjectsBenificiary.getBenTotal()%>" placeholder='Benificiary Total' class="form-control"/>
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
                <h2 class="titleSep"><span>Link to Indicator</span></h2>
                <div class="form-group row">

                    <div class="col-md-6  ">
                        <label for="indicatorProjectList" class="col-sm-3 col-form-label">Indicators:</label>
                        <div class="col-sm-9">
                            <html:select property="indicatorProjectList" styleClass="selectpicker form-control">
                                <logic:present name="indicatorList">
                                    <html:options collection="indicatorList" property="compId.compId"
                                                  labelProperty="indTitle"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="indicatorProjectList"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                    <div class="col-md-6  ">
                        <label class="col-sm-3 col-form-label">&nbsp;</label>
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
    //    *****************************project type**************
    function setProjectTypeConfig(cluType) {
//        if(cluType=="Hum"){
//            document.getElementsByName("communityProjectList")[0].disabled = true;
//            document.getElementsByName("cluId")[0].disabled = false;
//            $('[name="cluId"]').eq(0).parent().removeClass("disabled");
//            $('[name="cluId"]').eq(0).parent().find('button').removeClass("disabled");
//            document.getElementsByName("proHasCluster")[0].disabled = true;
//            document.getElementsByName("proHasCluster")[1].disabled = true;
//            document.getElementsByName("proHasCluster")[1].checked  = true;
//            $('li[data-optgroup=1]').removeClass("disabled");
//            $('li[data-optgroup=2]').addClass("disabled");
//            $("#Development").prop("disabled", true);
//        }else if(cluType=="Dev"){
//            document.getElementsByName("proHasCluster")[0].disabled = false;
//            document.getElementsByName("proHasCluster")[1].disabled = false;
//            document.getElementsByName("proHasCluster")[0].checked  = true;
//            $('li[data-optgroup=1]').addClass("disabled");
//            $('li[data-optgroup=2]').removeClass("disabled");
//        }else if(cluType=="1"){
//            document.getElementsByName("communityProjectList")[0].disabled = true;
//            document.getElementsByName("cluId")[0].disabled = false;
//            $('[name="cluId"]').eq(0).parent().removeClass("disabled");
//            $('[name="cluId"]').eq(0).parent().find('button').removeClass("disabled");
//            $('li[data-optgroup=1]').addClass("disabled");
//            $('li[data-optgroup=2]').removeClass("disabled");
//        }else if(cluType=="0"){
//            document.getElementsByName("communityProjectList")[0].disabled = false;
//            $('[name="communityProjectList"]').eq(0).parent().removeClass("disabled");
//            $('[name="communityProjectList"]').eq(0).parent().find('button').removeClass("disabled");
//            document.getElementsByName("cluId")[0].disabled = true;
//            $('li[data-optgroup=1]').addClass("disabled");
//            $('li[data-optgroup=2]').addClass("disabled");
//        }
    }

    setProjectTypeConfig('Hum');


</script>

<script>
    //   table script for location
    $(document).ready(function() {
        $("#add_row").on("click", function() {
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
            $.each($("#tab_logic tbody tr:nth(0) td"), function() {
                var cur_td = $(this);

                var children = cur_td.children();
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
            $(tr).appendTo($('#tab_logic'));

            $(tr).find("td button.row-remove").on("click", function() {
                $(this).closest("tr").remove();
            });
        });
        $("#add_row2").on("click", function() {
            var newid = 0;
            $.each($("#tab_logic2 tr"), function() {
                if (parseInt($(this).data("id")) > newid) {
                    newid = parseInt($(this).data("id"));
                }
            });
            newid++;
            var tr = $("<tr></tr>", {
                id: "addr"+newid,
                "data-id": newid
            });
            $.each($("#tab_logic2 tbody tr:nth(0) td"), function() {
                var cur_td = $(this);

                var children = cur_td.children();
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
                        'text': $('#tab_logic2 tr').length
                    }).appendTo($(tr));
                }
            });
            $(tr).appendTo($('#tab_logic2'));

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


    document.getElementsByName("proBudgetTxt")[0].onblur =function (){

        //number-format the user input
        this.value = parseFloat(this.value.replace(/,/g, ""))
                .toFixed(2)
                .toString()
                .replace(/\B(?=(\d{3})+(?!\d))/g, ",");

        document.getElementsByName("proBudget")[0].value = this.value.replace(/,/g, "")
    }

    //************** filter sub sector*******************
    var opts = $('[name="subSecId"] option').map(function(){
        return [[this.value, $(this).text()]];
    });
    var currentVal = document.getElementsByName("secId")[0].value;
    var optlist = $('[name="subSecId"]').eq(0).empty();
    optlist.append($("<option></option>").attr("value",'').text('')); ;
    opts.each(function(){
        if (parseInt(currentVal)==parseInt((this[0].split("|")[1]))) {
            optlist.append($('<option></option>').attr('value', this[0]).text(this[1]));

        }
    });
    $('[name="secId"]').eq(0).change(function() {
        var currentVal = $( this ).val();
        var optlist = $('[name="subSecId"]').eq(0).empty();
        optlist.append($("<option></option>").attr("value",'').text('')); ;
        opts.each(function(){
            if (parseInt(currentVal)==parseInt((this[0].split("|")[1]))) {
                optlist.append($('<option></option>').attr('value', this[0]).text(this[1]));

            }
        });
    });
    //************** end filter sub sector*******************
</script>