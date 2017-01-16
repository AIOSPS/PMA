<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#objId").attr("placeholder", "Objective ID");
        $("#objId").prop('required', true);
        $("#objDesc").attr("placeholder", "Objective Description");
        $("#objDesc").prop('required', true);
        $("#objLongDesc").attr("placeholder", "Long Description");
        $("#objLongDesc").prop('required', true);
        $("#objDefineDate").attr("placeholder", "Define Date");
        $("#objDefineDate").prop('required', true);
        $("#objCloseDate").attr("placeholder", "Close Date");
        $("#objCloseDate").prop('required', true);
        $("#ojbUserId").attr("placeholder", "User ID");
        $("#ojbUserId").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Project Tracking
        </a><span class=""> > </span><span>Album</span></nav>
    </div>
</div>

<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List Of Images</h1>
            </div>
            <div class="col-md-4 pd15 create ">
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
            <html:form action="/addImageToAlbumProject.do" method="POST"  enctype="multipart/form-data">
                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend>Browse to select image to upload it</legend>
                            <div class="form-group row">

                                <div class="col-md-12">
                                    <div class="col-sm-12">
                                        <html:hidden property="proId"/>
                                        <%--<html:file property="albImage"  styleClass="file-loading"/>--%>
                                        <%--<html:file property="albImage"  styleClass="file file-loading" data-allowed-file-extensions='["csv", "txt"]'/>--%>
                                        <input id="albImage" name="albImage"  type="file" class="file file-loading" data-allowed-file-extensions='["jpg", "jepg"]'>
                                            <%--<script>--%>
                                            <%--$(document).on('ready', function() {--%>
<%--//                                                $('input[name=albImage]').prop("multiple", true);--%>
                                                <%--$('input[name=albImage]').fileinput({showCaption: false});--%>
                                            <%--});--%>
<%--//                                            </script>--%>
                                    </div>
                                </div>
                            </div>


                        </fieldset>
                    </div>
                </div>
            </html:form>
            <logic:present name="pmsProjectAlbumList">
            <div class="content-wrapper ">

                <logic:iterate id="pmsProjectAlbumList" name="pmsProjectAlbumList" type="eu.pms.project.database.PmsProjectAlbum">
                    <div class="col-md-3 dsh-blocks dsh-projects sec1">
                            <div class="dsh-bg">
                                <img class="" width="200" height="140"  src="/downloadImgAlbum.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>">
                                <div class="pull-right">
                                    <a href="javaScript:parent.location = '/deleteImgAlbumProject.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>'">
                                        <span class="glyphicon glyphicon-trash"></span>
                                    </a>
                                </div>

                            </div>
                    </div>
                </logic:iterate>


            </div>
            </logic:present>

            <%--<table id="listProjectAlbumsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">--%>
                <%--<thead>--%>
                <%--<tr>--%>
                    <%--<th class="text-center">Title</th>--%>
                    <%--<th class="text-center"></th>--%>
                <%--</tr>--%>
                <%--</thead>--%>
                <%--<tfoot>--%>
                <%--<tr>--%>
                    <%--<th class="text-center">Title</th>--%>
                    <%--<th class="text-center"></th>--%>

                <%--</tr>--%>
                <%--</tfoot>--%>
                <%--<tbody>--%>
                <%--<logic:present name="pmsProjectAlbumList">--%>
                    <%--<logic:iterate id="pmsProjectAlbumList" name="pmsProjectAlbumList" type="eu.pms.project.database.PmsProjectAlbum">--%>
                        <%--<tr>--%>
                            <%--<td width="20%">--%>
                                <%--<img style="overflow: hidden" width="100" height="70"  src="/downloadImgAlbum.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>">--%>
                            <%--</td>--%>
                            <%--<td width="10%" class="text-center">--%>
                                <%--<a href="javaScript:parent.location = '/viewEditProject.do?proId=<bean:write name="pmsProjectAlbumList" property="compId.proId"/>&albId=<bean:write name="pmsProjectAlbumList" property="compId.albId"/>'">--%>
                                    <%--<span class="glyphicon glyphicon-trash"></span>--%>
                                <%--</a>--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                    <%--</logic:iterate>--%>
                <%--</logic:present>--%>
                <%--</tbody>--%>
            <%--</table>--%>
            <%--<script>--%>
                <%--$(document).ready(function () {--%>
                    <%--$('#listProjectAlbumsTbl').DataTable();--%>
                <%--});--%>
            <%--</script>--%>
        </div>
        <div class="form-group row">
            <div class="offset-sm-2 col-sm-10">
                <button type="button" onclick="javaScript:parent.location = '/pmsProjectList.do'"
                        class="btn btn-primary">Go To Projects List
                </button>
            </div>
        </div>

    </div>
    </div>
</article>