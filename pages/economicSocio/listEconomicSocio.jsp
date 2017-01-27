<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#comId").attr("placeholder", "Community");
    });
</script>
<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Basic Socio Tracking </a><span
                class=""> > </span><span> List Basic socio</span></nav>
    </div>
</div>



<article class="form">


    <div class="container IncidentsCont">

        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>List of Basic Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <button type="button" onclick="javaScript:parent.location = '/viewAddEconomicSocio.do'"
                        class="btn btn-primary fa fa-plus pull-right">Add Basic Socio
                </button>
            </div>
        </div>
        <div class="content-wrapper formWrapper  col-md-12 pd15 ">
            <html:form action="/searchEconomicSocio.do" method="POST" focus="comId">
                <div class="form-group row">
                    <div class="col-md-12">
                        <fieldset class="isClustr">
                            <legend>Search Basic socio</legend>
                            <div class="form-group row">

                                <div class="col-md-4">
                                    <label for="comId" class="col-sm-12 col-form-label">Community:</label>
                                    <div class="col-sm-12">
                                        <html:select property="comId"
                                                     styleClass="selectpicker form-control">
                                            <logic:present name="communityList">
                                                <html:option value="">Select</html:option>
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
                                <div class="col-md-4">

                                </div>
                                <div class="col-md-4">
                                    <label  class="col-sm-5 col-form-label">&nbsp;</label>
                                    <div class="col-sm-12">
                                        <button type="submit" class="btn btn-primary">Search</button>
                                    </div>
                                </div>
                            </div>



                        </fieldset>
                    </div>
                </div>
            </html:form>
            <table id="listEconomicSocioTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th class="text-center">Men Livelihood Source1</th>
                    <th class="text-center">Men Livelihood Source2</th>
                    <th class="text-center">Men Livelihood Source3</th>
                    <th class="text-center">Women Livelihood Source1</th>
                    <th class="text-center">Women Livelihood Source2</th>
                    <th class="text-center">Women Livelihood Source3</th>
                    <th class="text-center">Access to Lands Military</th>
                    <th class="text-center">Access to Lands Checkpoints</th>
                    <th class="text-center"></th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th class="text-center">Men Livelihood Source1</th>
                    <th class="text-center">Men Livelihood Source2</th>
                    <th class="text-center">Men Livelihood Source3</th>
                    <th class="text-center">Women Livelihood Source1</th>
                    <th class="text-center">Women Livelihood Source2</th>
                    <th class="text-center">Women Livelihood Source3</th>
                    <th class="text-center">Access to Lands Military</th>
                    <th class="text-center">Access to Lands Checkpoints</th>
                    <th class="text-center"></th>

                </tr>
                </tfoot>
                <tbody>
                <logic:present name="pmsEconomicSocioList">
                    <logic:iterate id="pmsEconomicSocioList" name="pmsEconomicSocioList" type="eu.pms.project.database.PmsEconomicSocio">
                        <tr>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="menLivelihoodSource1"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="menLivelihoodSource2"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="menLivelihoodSource3"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="womenLivelihoodSource1"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="womenLivelihoodSource2"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="womenLivelihoodSource3"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="accessToLandsMilitary"/></td>
                            <td width="10%" class="text-center"><bean:write name="pmsEconomicSocioList" property="accessToLandsCheckpoints"/></td>
                            <td width="5%" class="text-center">
                                <a href="javaScript:parent.location = '/viewPmsEconomicSocio.do?ecoId=<bean:write name="pmsEconomicSocioList" property="compId.ecoId"/>'">
                                    <span class="glyphicon glyphicon-list-alt"></span>
                                </a>
                                &nbsp;
                                <a href="javaScript:parent.location = '/viewEditEconomicSocio.do?ecoId=<bean:write name="pmsEconomicSocioList" property="compId.ecoId"/>'">
                                    <span class="glyphicon glyphicon-edit"></span>
                                </a>
                            </td>
                        </tr>
                    </logic:iterate>
                </logic:present>
                </tbody>
            </table>
            <script>
                //                $(document).ready(function () {
                //                    $('#listAgricultureSocioTbl').DataTable(  {
                //                        dom: 'lBfrtip',
                //                        buttons: [
                //                            'excelHtml5',
                //                            'pdfHtml5'
                //                        ]
                //                    }  );
                //                });
                $(document).ready(function() {
                    var table = $('#listEconomicSocioTbl').DataTable( {
                        lengthChange: false,
//        dom: 'Bftrip',
                        buttons: ['excel', 'pdf']
                    } );

                    table.buttons().container()
                        .appendTo( '#listEconomicSocioTbl_wrapper .col-sm-6:eq(0)' );
                } );
            </script>
        </div>


    </div>
    </div>
</article>


