<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Dynamic Report
        </a><span class=""> > </span><span>Criteria</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Report Criteria</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="generateDynamicReport">
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
                        <label for="1_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="1" class="checkBox">
                            Project ID</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="1_whereCondType" value="0">
                            <input type="text" id="1_val1" name="1_val1" class="form-control input-sm">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="1" class="checkBox" checked>
                            Project ID</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="2_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="2" class="checkBox">
                            Project Title</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="2_whereCondType" value="5">
                            <input type="text" id="2_val1" name="2_val1" class="form-control input-sm">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="2" class="checkBox" checked>
                            Project Title</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="3_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="3" class="checkBox">
                            Project Description</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="3_whereCondType" value="5">
                            <input type="text" id="3_val1" name="3_val1" class="form-control input-sm">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="3" class="checkBox" checked>
                            Project Description</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="4_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="4" class="checkBox">
                            Project Status</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="4_whereCondType" value="0">
                            <select  id="4_val1" name="4_val1" class="form-control input-sm">
                                <option value="1" selected>New</option>
                                <option value="2">Stopped</option>
                                <option value="3">Completed</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="4" class="checkBox" checked>
                            Project Status</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="5_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="5" class="checkBox">
                            Project Budget</label>
                        <div class="col-sm-9">
                            <input type="hidden" name="5_whereCondType" value="5">
                            <input type="text" id="5_val1" name="5_val1" class="form-control input-sm">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="5" class="checkBox" checked>
                            Project Budget</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="6_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="6" class="checkBox">
                            Start Date</label>
                        <input type="hidden" name="6_whereCondType" value="0">
                        <div class='input-group date col-sm-9' id='prStDate'>
                            <input type="text" id="6_val1" name="6_val1" class="form-control input-sm">
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="6" class="checkBox" checked>
                            Start Date</label>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-8">
                        <label for="7_val1" class="col-sm-3 col-form-label">
                            <input type="checkbox" name="inputItems" value="7" class="checkBox">
                            End Date</label>
                        <input type="hidden" name="7_whereCondType" value="0">
                        <div class='input-group date col-sm-9' id='prEdDate'>
                            <input type="text" id="7_val1" name="7_val1" class="form-control input-sm">
                            <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <label class="col-sm-12 col-form-label">
                            <input type="checkbox" name="outputItems" value="7" class="checkBox" checked>
                            End Date</label>
                    </div>
                </div>
                <script type="text/javascript">
                    $(function () {
                        $('#prStDate').datetimepicker({format: 'DD/MM/YYYY'});
                        $('#prEnDate').datetimepicker({format: 'DD/MM/YYYY'});
                    });
                </script>

                <div class="form-group row">
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
