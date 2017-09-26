<%@ page import="java.util.List" %>
<%@ page import="eu.pms.lookup.database.PmsGovernate" %>
<%@ page import="eu.pms.lookup.database.PmsBenificiaryTyp" %>
<%@ page import="eu.pms.project.database.*" %>
<%@ page import="btc.pma.programme.database.PmaActivityClasification" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<div class="content-wrapper breadcrumb brd2 container">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Dynamic Report
        </a><span class=""> > </span><span>Criteria</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container pd0">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Report Criteria</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="generateDynamicReport" target="_blank">
                <h2 class="titleSep"><span>Select inputs and outputs report</span></h2>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label  class="col-sm-3 col-form-label">Inputs</label>
                    </div>
                    <div class="col-md-4">
                        <label  class="col-sm-3 col-form-label">Outputs</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="4_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="4" class="checkBox">
                            Activity Status</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="4_whereCondType" value="0">
                            <select  id="4_val1" name="4_val1" class="form-control input-sm">
                                <option value="1">Design / Approval</option>
                                <option value="2">Ongoing</option>
                                <option value="3">Delayed</option>
                                <option value="4">Completed</option>
                                <option value="5">On-Hold</option>
                                <option value="6">Closed</option>
                                <option value="7">Cancelled</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="2" class="checkBox" checked>
                            Activity Title</label>
                    </div>
                </div>

                <%--<div class="form-group row">--%>
                    <%--<div class="col-md-8">--%>
                        <%--<label for="6_val1" class="col-sm-3 col-form-label">--%>
                            <%--<input type="checkbox" name="inputItems" value="6" class="checkBox">--%>
                            <%--Start Date</label>--%>
                        <%--<input type="hidden" name="6_whereCondType" value="0">--%>
                        <%--<div class='input-group date col-sm-9' id='prStDate'>--%>
                            <%--<input type="text" id="6_val1" name="6_val1" class="form-control input-sm">--%>
                            <%--<span class="input-group-addon">--%>
                        <%--<span class="glyphicon glyphicon-calendar"></span>--%>
                    <%--</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-4">--%>
                        <%--<label class="col-sm-12 col-form-label">--%>
                            <%--<input type="checkbox" name="outputItems" value="3" class="checkBox" checked>--%>
                            <%--Project Description</label>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <%--<div class="form-group row">--%>
                    <%--<div class="col-md-8">--%>
                        <%--<label for="7_val1" class="col-sm-3 col-form-label">--%>
                            <%--<input type="checkbox" name="inputItems" value="7" class="checkBox">--%>
                            <%--End Date</label>--%>
                        <%--<input type="hidden" name="7_whereCondType" value="0">--%>
                        <%--<div class='input-group date col-sm-9' id='prEdDate'>--%>
                            <%--<input type="text" id="7_val1" name="7_val1" class="form-control input-sm">--%>
                            <%--<span class="input-group-addon">--%>
                        <%--<span class="glyphicon glyphicon-calendar"></span>--%>
                    <%--</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-4">--%>
                        <%--<label class="col-sm-12 col-form-label">--%>
                            <%--<input type="checkbox" name="outputItems" value="8" class="checkBox" checked>--%>
                            <%--Governorate</label>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="8" class="checkBox">
                            Governorate
                        </label>
                        <div class="col-sm-9">
                            <input type="hidden" name="8_whereCondType" value="0">
                            <select id="8_val1" name="8_val1" class="selectpicker form-control input-sm" data-live-search="true">
                                <logic:present name="governateList">
                                    <% List governateList = (List) request.getAttribute("governateList");%>
                                    <%
                                        for (int i = 0; i < governateList.size(); i++) {
                                            PmsGovernate obj = (PmsGovernate) governateList.get(i);
                                    %>
                                    <option value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                    <% }%>

                                </logic:present>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="9" class="checkBox" checked>
                            Community</label>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="9" class="checkBox">
                            Community</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="9_whereCondType" value="0">
                            <select id="9_val1" name="9_val1" class="selectpicker form-control input-sm" data-live-search="true">
                                <logic:present name="communityList">
                                    <% List communityList = (List) request.getAttribute("communityList");%>
                                    <%
                                        for (int i = 0; i < communityList.size(); i++) {
                                            PmsCommunity obj = (PmsCommunity) communityList.get(i);
                                    %>
                                    <option value="<%=obj.getComId()%>"><%=obj.getComName()%></option>
                                    <% }%>

                                </logic:present>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="11" class="checkBox" checked>
                            Activity Classification</label>
                    </div>
                </div>

                <%--<div class="form-group row">--%>
                    <%--<div class="col-md-8">--%>
                        <%--<label class="col-sm-3 col-form-label">--%>
                            <%--<input type="checkbox" name="inputItems" value="10" class="checkBox">--%>
                            <%--Sector</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<input type="hidden" name="10_whereCondType" value="0">--%>
                            <%--<select id="10_val1" name="10_val1" class="selectpicker form-control input-sm" data-live-search="true">--%>
                                <%--<logic:present name="sectorsList">--%>
                                    <%--<% List sectorsList = (List) request.getAttribute("sectorsList");%>--%>
                                    <%--<%--%>
                                        <%--for (int i = 0; i < sectorsList.size(); i++) {--%>
                                            <%--PmsSector obj = (PmsSector) sectorsList.get(i);--%>
                                    <%--%>--%>
                                    <%--<option value="<%=obj.getSecId()%>"><%=obj.getSecName()%></option>--%>
                                    <%--<% }%>--%>

                                <%--</logic:present>--%>
                            <%--</select>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-4">--%>
                        <%--<label class="col-sm-12 col-form-label">--%>
                            <%--<input type="checkbox" name="outputItems" value="10" class="checkBox" checked>--%>
                            <%--Sector</label>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="11" class="checkBox">
                            Activity Classification</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="11_whereCondType" value="0">
                            <select id="11_val1" name="11_val1" class="selectpicker form-control input-sm" data-live-search="true">
                                <logic:present name="classList">
                                    <% List classList = (List) request.getAttribute("classList");%>
                                    <%
                                        for (int i = 0; i < classList.size(); i++) {
                                            PmaActivityClasification obj = (PmaActivityClasification) classList.get(i);
                                    %>
                                    <option value="<%=obj.getClasCode()%>"><%=obj.getClasDescription()%></option>
                                    <% }%>

                                </logic:present>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="14" class="checkBox" checked>
                            Implementer</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="12" class="checkBox">
                            Challenges</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="12_whereCondType" value="0">
                            <select id="12_val1" name="12_val1" class="form-control input-sm">
                                <option value="1" selected>Yes</option>
                                <option value="0">No</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="5" class="checkBox" checked>
                            Cost</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="13" class="checkBox">
                            Benificiary Type</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="13_whereCondType" value="0">
                            <select id="13_val1" name="13_val1" class="selectpicker form-control input-sm" data-live-search="true">
                                <logic:present name="benificiaryTypeList">
                                    <% List benificiaryTypeList = (List) request.getAttribute("benificiaryTypeList");%>
                                    <%
                                        for (int i = 0; i < benificiaryTypeList.size(); i++) {
                                            PmsBenificiaryTyp obj = (PmsBenificiaryTyp) benificiaryTypeList.get(i);
                                    %>
                                    <option value="<%=obj.getLookupId()%>"><%=obj.getLookupDesc()%></option>
                                    <% }%>

                                </logic:present>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="12" class="checkBox" checked>
                            Challenges</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="14" class="checkBox">
                            Implementer</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="14_whereCondType" value="0">
                            <select id="14_val1" name="14_val1" class="selectpicker form-control input-sm" data-live-search="true">
                                <logic:present name="implementerList">
                                    <% List implementerList = (List) request.getAttribute("implementerList");%>
                                    <%
                                        for (int i = 0; i < implementerList.size(); i++) {
                                            PmsImplementer obj = (PmsImplementer) implementerList.get(i);
                                    %>
                                    <option value="<%=obj.getImpId()%>"><%=obj.getImpName()%></option>
                                    <% }%>

                                </logic:present>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="3" class="checkBox" checked>
                            Programme Description</label>
                    </div>
                    <%--<div class="col-md-4">--%>
                        <%--<label class="col-sm-12 col-form-label">--%>
                            <%--<input type="checkbox" name="outputItems" value="6" class="checkBox" checked>--%>
                            <%--Start Date</label>--%>
                    <%--</div>--%>

                </div>
                    <%--<div class="form-group row">--%>
                    <%--<div class="col-md-8">--%>
                    <%--<label for="1_val1" class="col-sm-3 col-form-label">--%>
                    <%--<input type="checkbox" name="inputItems" value="1" class="checkBox">--%>
                    <%--Project ID</label>--%>
                    <%--<div class="col-sm-9">--%>
                    <%--<input type="hidden" name="1_whereCondType" value="0">--%>
                    <%--<input type="text" id="1_val1" name="1_val1" class="form-control input-sm">--%>
                    <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-4">--%>
                    <%--<label class="col-sm-12 col-form-label">--%>
                    <%--<input type="checkbox" name="outputItems" value="1" class="checkBox" checked>--%>
                    <%--Project ID</label>--%>
                    <%--</div>--%>
                    <%--</div>--%>

                <div class="form-group row">
                    <div class="col-md-8">
                            <%--<label for="2_val1" class="col-sm-3 col-form-label">--%>
                            <%--<input type="checkbox" name="inputItems" value="2" class="checkBox">--%>
                            <%--Project Title</label>--%>
                            <%--<div class="col-sm-9">--%>
                            <%--<input type="hidden" name="2_whereCondType" value="5">--%>
                            <%--<input type="text" id="2_val1" name="2_val1" class="form-control input-sm">--%>
                            <%--</div>--%>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="8" class="checkBox" checked>
                            Governorate</label>
                    </div>
                    <%--<div class="col-md-4">--%>
                        <%--<label class="col-sm-12 col-form-label">--%>
                            <%--<input type="checkbox" name="outputItems" value="7" class="checkBox" checked>--%>
                            <%--End Date</label>--%>
                    <%--</div>--%>

                </div>
                <script type="text/javascript">
                    $(function () {
                        $('#prStDate').datetimepicker({format: 'DD/MM/YYYY'});
                        $('#prEdDate').datetimepicker({format: 'DD/MM/YYYY'});
                    });
                </script>

                <div class="form-group row">
                    <div class="col-md-8">
                            <%--<label for="3_val1" class="col-sm-3 col-form-label">--%>
                            <%--<input type="checkbox" name="inputItems" value="3" class="checkBox">--%>
                            <%--Project Description</label>--%>
                            <%--<div class="col-sm-9">--%>
                            <%--<input type="hidden" name="3_whereCondType" value="5">--%>
                            <%--<input type="text" id="3_val1" name="3_val1" class="form-control input-sm">--%>
                            <%--</div>--%>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="4" class="checkBox" checked>
                            Activity Status</label>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-8">
                            <%--<label for="5_val1" class="col-sm-3 col-form-label">--%>
                            <%--<input type="checkbox" name="inputItems" value="5" class="checkBox">--%>
                            <%--Project Budget</label>--%>
                            <%--<div class="col-sm-9">--%>
                            <%--<input type="hidden" name="5_whereCondType" value="5">--%>
                            <%--<input type="text" id="5_val1" name="5_val1" class="form-control input-sm">--%>
                            <%--</div>--%>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="13" class="checkBox" checked>
                            Benificiary Type</label>
                    </div>
                </div>
                <h2 class="titleSep"><span>Export report</span></h2>
                <div class="form-group row opBtn">
                    <div class="col-md-8">
                        <label class="col-sm-3 col-form-label">
                            Report Type</label>
                        <div class="col-sm-9">
                            <select name="reportType" class="form-control input-sm">
                                <option value="excel" selected>Excel</option>
                                <option value="pdf">PDF</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <html:submit value="Export" styleClass="btn btn-primary"/>
                        <html:button value="Visulalize" property="" styleClass="btn btn-primary"/>
                    </div>
                    <%--<div class="offset-sm-2 col-sm-10">--%>
                        <%--<label class="col-sm-3 col-form-label">Report Type:</label>--%>
                        <%--<div class="col-sm-5 text-left">--%>
                        <%--<select name="reportType" class="form-control input-sm">--%>
                            <%--<option value="excel" selected>Excel</option>--%>
                            <%--<option value="pdf">PDF</option>--%>
                        <%--</select>--%>
                            <%--</div>--%>
                        <%--<div class="col-sm-3">--%>
                        <%--<html:submit value="Export" styleClass="btn btn-primary"/>--%>
                            <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            </html:form>


        </div>


    </div>
    </div>
</article>
