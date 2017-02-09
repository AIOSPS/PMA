<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="eu.pms.project.database.PmsActivity" %>
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
                <h1>Proposed Community Need</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="viewEditIntervention">
                    <h2 class="titleSep"><span>Intervention Information</span></h2>

                <div class="form-group row">
                    <%--<div class="col-md-6">--%>
                        <%--<label for="intId" class="col-sm-3 col-form-label">Intervention ID:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="intId" styleClass="form-control" styleId="intId" disabled="true"/>--%>
                            <html:hidden property="intId"/>
                        <%--</div>--%>
                    <%--</div>--%>
                    <div class="col-md-6">
                        <label for="masId" class="col-sm-3 col-form-label">Master Plan:</label>
                        <div class="col-sm-9">
                            <html:select property="masId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="masterPlanList">
                                    <html:option value="">Select</html:option>
                                    <html:options collection="masterPlanList" property="masId" labelProperty="masMpName"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                        <div class="col-md-6">
                            <label for="intDesc" class="col-sm-3 col-form-label">Description:</label>
                            <div class="col-sm-9">
                                <html:text property="intDesc" styleClass="form-control" styleId="intDesc" disabled="true"/>
                            </div>
                        </div>

                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label">Sector:</label>
                        <div class="col-sm-9">
                            <html:select property="secId" disabled="true"
                                         styleClass="selectpicker form-control">
                                <logic:present name="sectorsList">
                                    <html:options collection="sectorsList" property="secId" labelProperty="secName"/>
                                </logic:present>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intEstimatedBudget" class="col-sm-3 col-form-label">Priority:</label>
                        <div class="col-sm-9">
                            <html:select property="intPriority" styleClass="selectpicker form-control" disabled="true">
                                <html:option value="O">Very Low</html:option>
                                <html:option value="L">Low</html:option>
                                <html:option value="H">High</html:option>
                                <html:option value="V">Very High</html:option>
                                <html:option value="U">Urgent</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="intEstimatedBudget" class="col-sm-3 col-form-label">Estimated Budget:</label>
                        <div class="col-sm-9">
                            <html:text property="intEstimatedBudget" styleClass="form-control" styleId="intEstimatedBudget" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="intSource" class="col-sm-3 col-form-label">Source:</label>
                        <div class="col-sm-9">
                            <html:select property="intSource" styleClass="selectpicker form-control" disabled="true">
                                <html:option value="MASTER">Master Plan</html:option>
                                <html:option value="ASSESS">Assessment</html:option>
                                <html:option value="COMM">Comunity Representative</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>

                <%--<div class="form-group row">--%>

                    <%--<div class="col-md-6">--%>
                        <%--<label for="intEstimatedBudget" class="col-sm-3 col-form-label">Priority:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:select property="intPriority" styleClass="selectpicker form-control" disabled="true">--%>
                                <%--<html:option value="O">Very Low</html:option>--%>
                                <%--<html:option value="L">Low</html:option>--%>
                                <%--<html:option value="H">High</html:option>--%>
                                <%--<html:option value="V">Very High</html:option>--%>
                                <%--<html:option value="U">Urgent</html:option>--%>
                            <%--</html:select>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-6">--%>
                        <%--<label for="intSource" class="col-sm-3 col-form-label"></label>--%>
                        <%--<div class="col-sm-9">--%>

                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <h2 class="titleSep"><span>Activity Information</span></h2>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <div class="container">
                            <div class="row clearfix">
                                <div class="col-md-12 table-responsive">
                                    <table class="table table-striped table-bordered" id="tab_logic">
                                        <thead>
                                        <tr >
                                            <%--<th width="15%" class="text-center">Activity ID</th>--%>
                                            <th width="40%" class="text-center">Description</th>
                                            <th width="15%" class="text-center">Unit</th>
                                            <th width="15%" class="text-center">Unit Qty</th>
                                            <th width="15%" class="text-center">Estimated Budget</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr id='addr0' data-id="0" class="hidden">
                                            <%--<td data-name="actId">--%>
                                                <%--<input type="text" id="actId0" name="actId0"  placeholder='Activity ID' class="form-control"/>--%>
                                            <%--</td>--%>
                                            <td data-name="actDesc">
                                                <input type="text" id="actDesc0" name="actDesc0" placeholder='Description' class="form-control"/>
                                            </td>
                                            <td data-name="actUnit">
                                                <input type="text" id="actUnit0" name="actUnit0" placeholder='Unit' class="form-control"/>
                                            </td>
                                            <td data-name="actUnitQty">
                                                <%--<input type="text" id="actUnitQty0" name="actUnitQty0" placeholder='Unit Qty' class="form-control"/>--%>
                                            </td>
                                            <td data-name="actEstimatedBudget">
                                                <input type="text" id="actEstimatedBudget0" name="actEstimatedBudget0" placeholder='Estimated Budget' class="form-control"/>
                                            </td>
                                        </tr>
                                        <logic:present name="activitiesList">
                                            <% List activitiesList = (List) request.getAttribute("activitiesList");
                                                System.out.println("**********************"+activitiesList.size());
                                                int count = 1;
                                                Iterator itr = activitiesList.iterator();
                                                PmsActivity pmsActivity = null;
                                                while (itr.hasNext()){
                                                    pmsActivity = (PmsActivity) itr.next();
                                            %>
                                            <tr id='addr<%=count%>' data-id="<%=count%>">
                                                <%--<td data-name="actId">--%>
                                                    <%--<input type="text" disabled="true" id="actId<%=count%>" name="actId<%=count%>" value="<%=pmsActivity.getCompId().getActId()%>"  placeholder='Activity ID' class="form-control"/>--%>
                                                <%--</td>--%>
                                                <td data-name="actDesc">
                                                    <input type="text" disabled="true" id="actDesc<%=count%>" name="actDesc<%=count%>" value="<%=pmsActivity.getActDesc()%>" placeholder='Description' class="form-control"/>
                                                </td>
                                                <td data-name="actUnit">
                                                    <input type="text" disabled="true" id="actUnit<%=count%>" name="actUnit<%=count%>" value="<%=pmsActivity.getActUnit()%>" placeholder='Unit' class="form-control"/>
                                                </td>
                                                <td data-name="actUnitQty">
                                                    <input type="text" disabled="true" id="actUnitQty<%=count%>" name="actUnitQty<%=count%>" value="<%=pmsActivity.getActUnitQty()%>" placeholder='Unit Qty' class="form-control"/>
                                                </td>
                                                <td data-name="actEstimatedBudget">
                                                    <input type="text" disabled="true" id="actEstimatedBudget<%=count%>" name="actEstimatedBudget<%=count%>" value="<%=pmsActivity.getActEstimatedBudget()%>" placeholder='Estimated Budget' class="form-control"/>
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
                        <button type="button" onclick="javaScript:parent.location = '/viewEditIntervention.do?intId=<%=request.getParameter("intId")%>&secId=<%=request.getParameter("secId")%>'"
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

