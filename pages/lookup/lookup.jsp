<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script>
    function deleteLookup(lookupId)
    {
        if(confirm("Are you sure that you want to delete this item?"))
        {
            parent.location = '/deleteLookupsAction.do?lt='+document.lookupForm.lockupType.value+'&id='+lookupId
        }
        else
            return;
    }

    function updateLookup(lookupId,lookupDesc)
    {
        document.lookupForm.lockupId.value=lookupId;
        document.lookupForm.lockupDesc.value=lookupDesc;
        document.lookupForm.action="/updateLookupAction.do" ;
    }

    function activeTab(tabId)
    {
        document.getElementById("tab1").className  = "btn btn-success btnFullWidth";
        document.getElementById("tab2").className  = "btn btn-success btnFullWidth";
        document.getElementById("tab" + tabId).className  = "active btn btn-success btnFullWidth";

    }
</script>

<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Settings Tracking </a><span
                class=""> > </span><span> Lookups</span></nav>
    </div>
</div>
<article class="form">
    <div class="container IncidentsCont">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-12">
                <h1>List Of <%=request.getAttribute("lkAlias")+""%></h1>
            </div>
        </div>

        <div class="content-wrapper formWrapper  col-md-2 border2 ">
            <div class="col-sm-12 col-md-12">
                <button id="tab1" type="button" onclick="javaScript:parent.location = '/viewLookupsAction.do?lt=1'">Data Sources</button>
                <div class="br"></div>
                <button id="tab2" type="button" onclick="javaScript:parent.location = '/viewLookupsAction.do?lt=2'">Benificiary Types</button>

            </div>
        </div>
            <div class="content-wrapper formWrapper  col-md-7 border2">
            <table id="listLookupsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">Description</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">Description</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="lookups">
                    <logic:iterate id="lookups" name="lookups">
                        <tr>
                            <td><bean:write name="lookups" property="lookupId"/></td>
                            <td><bean:write name="lookups" property="lookupDesc"/></td>
                            <td class="text-center" width="10%">
                            <a href="javascript:updateLookup('<bean:write name="lookups" property="lookupId"/>','<bean:write name="lookups" property="lookupDesc"/>')"><span class="glyphicon glyphicon-edit"></span></a>
                            <a href="javascript:deleteLookup('<bean:write name="lookups" property="lookupId"/>')"><span class="glyphicon glyphicon-trash"></span></a>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
                $(document).ready(function () {
                    $('#listLookupsTbl').DataTable();
                });
            </script>
        </div>
        <div class="content-wrapper formWrapper col-md-3 border2">
            <html:form action="insertLookupAction">
                <html:hidden property="lockupType"/>
                <div class="form-group">
                    <br/>
                    <div class="col-sm-12 col-md-12"><h4 class="text-success">Record for <%=request.getAttribute("lkAlias")+""%>:</h4></div>
                    <br/><br/>
                </div>
                <div class="form-group row">
                    <div class="col-md-12">
                        <label for="lockupId" class="col-sm-12 col-form-label">Lookup Id:</label>
                        <div class="col-sm-12">
                            <html:text property="lockupId" styleClass="form-control" styleId="lockupId"/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-12">
                        <label for="lockupDesc" class="col-sm-12 col-form-label">Description:</label>
                        <div class="col-sm-12">
                            <html:text property="lockupDesc" styleClass="form-control" styleId="lockupDesc"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12 col-md-12">
                        <br/>
                        <html:submit styleClass="btn btn-success" value="Save"/>
                    </div>
                </div>
            </html:form>
        </div>
    </div>
</article>

<script type="text/javascript">
    activeTab('<%=request.getAttribute("tabNo")!=null?""+request.getAttribute("tabNo"):"tab1"%>');
</script>