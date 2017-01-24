<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
        $("#comId").attr("placeholder", "Community ID");
        $("#comId").prop('required', true);
        $("#comPcbsCode").attr("placeholder", "PCBS Code");
        $("#comPcbsCode").prop('required', true);
        $("#comOchaCode").attr("placeholder", "OCHA Code");
        $("#comOchaCode").prop('required', true);
        $("#comName").attr("placeholder", "Community Name");
        $("#comName").prop('required', true);
        $("#comTotalAreaLand").attr("placeholder", "Total Area Land");
        $("#comTotalAreaLand").prop('required', true);
        $("#comLocationShortDescription").attr("placeholder", "Location Short Description");
        $("#comLocationShortDescription").prop('required', true);
        $("#comTopology").attr("placeholder", "Topology");
        $("#comTopology").prop('required', true);
        $("#comSchoolsInfo").attr("placeholder", "Schools");
        $("#comSchoolsInfo").prop('required', true);
        $("#comHealthSchoolsInfo").attr("placeholder", "Health Center");
        $("#comHealthSchoolsInfo").prop('required', true);
        $("#comReligionCenters").attr("placeholder", "Religious Center");
        $("#comReligionCenters").prop('required', true);
        $("#comCemetery").attr("placeholder", "Cemetery");
        $("#comCemetery").prop('required', true);
        $("#comWaterNetworkInfo").attr("placeholder", "Water Network");
        $("#comWaterNetworkInfo").prop('required', true);
        $("#comSewerageNetworkInfo").attr("placeholder", "Sewerage Network");
        $("#comSewerageNetworkInfo").prop('required', true);
        $("#comElectricalNetworkInfo").attr("placeholder", "Electrical Network");
        $("#comElectricalNetworkInfo").prop('required', true);
        $("#comSolidWasteServiceInfo").attr("placeholder", "Soild Waste service");
        $("#comSolidWasteServiceInfo").prop('required', true);
        $("#comRoadNetworkInfo").attr("placeholder", "Road Network");
        $("#comRoadNetworkInfo").prop('required', true);
        $("#comTransportNetworkInfo").attr("placeholder", "Transport Network");
        $("#comTransportNetworkInfo").prop('required', true);
        $("#comEcnonomicActivitiesInfo").attr("placeholder", "Main Economic Activity ");
        $("#comEcnonomicActivitiesInfo").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Communnity Information
        </a><span class=""> > </span><span>Communities</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Add Community</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addCommunity">
                <h2 class="titleSep"><span>Community Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comName" class="col-sm-3 col-form-label">Community Name:</label>
                        <div class="col-sm-9">
                            <html:text property="comName" styleClass="form-control" styleId="comName"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <%--<label for="comId" class="col-sm-3 col-form-label">Community ID:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="comId" styleClass="form-control" styleId="comId"/>--%>
                        <%--</div>--%>
                    </div>

                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comPcbsCode" class="col-sm-3 col-form-label">PCBS Code:</label>
                        <div class="col-sm-9">
                            <html:text property="comPcbsCode" styleClass="form-control" styleId="comPcbsCode"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comOchaCode" class="col-sm-3 col-form-label">OCHA Code:</label>
                        <div class="col-sm-9">
                            <html:text property="comOchaCode" styleClass="form-control" styleId="comOchaCode"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="typeId" class="col-sm-3 col-form-label">Type:</label>
                        <div class="col-sm-9">
                            <html:select property="typeId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="communityTypeList">
                                    <html:options collection="communityTypeList" property="typId" labelProperty="typDesc"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="typeId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <label for="govId" class="col-sm-3 col-form-label">Governorate:</label>
                        <div class="col-sm-9">
                            <html:select property="govId"
                                         styleClass="selectpicker form-control">
                                <html:options collection="governateList" property="lookupId" labelProperty="lookupDesc"/>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="govId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comTotalAreaLand" class="col-sm-3 col-form-label">Total Area Land:</label>
                        <div class='input-group date  col-sm-9' >
                            <html:text property="comTotalAreaLand" styleClass="form-control" styleId="comTotalAreaLand"/>
                            <span class="input-group-addon input-group-addon1">
                               Dunum
                            </span>
                    </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comLocationShortDescription" class="col-sm-3 col-form-label">Location Short Description:</label>
                        <div class="col-sm-9">
                            <html:text property="comLocationShortDescription" styleClass="form-control" styleId="comLocationShortDescription"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comTopology" class="col-sm-3 col-form-label">Topology:</label>
                        <div class="col-sm-9">
                            <html:text property="comTopology" styleClass="form-control" styleId="comTopology"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comResidentsTotal" class="col-sm-3 col-form-label">Residents #:</label>
                        <div class="col-sm-9">
                            <html:text property="comResidentsTotal" styleClass="form-control" styleId="comResidentsTotal"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comMaleTotal" class="col-sm-3 col-form-label">Male #:</label>
                        <div class="col-sm-9">
                            <html:text property="comMaleTotal" styleClass="form-control" styleId="comMaleTotal"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comFemaleTotal" class="col-sm-3 col-form-label">Female #:</label>
                        <div class="col-sm-9">
                            <html:text property="comFemaleTotal" styleClass="form-control" styleId="comFemaleTotal"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comKidsTotal" class="col-sm-3 col-form-label">Children #:</label>
                        <div class="col-sm-9">
                            <html:text property="comKidsTotal" styleClass="form-control" styleId="comKidsTotal"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comSchoolsInfo" class="col-sm-3 col-form-label">Schools:</label>
                        <div class="col-sm-9">
                            <html:text property="comSchoolsInfo" styleClass="form-control" styleId="comSchoolsInfo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comHealthSchoolsInfo" class="col-sm-3 col-form-label">Health Center:</label>
                        <div class="col-sm-9">
                            <html:text property="comHealthSchoolsInfo" styleClass="form-control" styleId="comHealthSchoolsInfo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comReligionCenters" class="col-sm-3 col-form-label">Religious Center:</label>
                        <div class="col-sm-9">
                            <html:text property="comReligionCenters" styleClass="form-control" styleId="comReligionCenters"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comCemetery" class="col-sm-3 col-form-label">Cemetery:</label>
                        <div class="col-sm-9">
                            <html:text property="comCemetery" styleClass="form-control" styleId="comCemetery"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comWaterNetworkInfo" class="col-sm-3 col-form-label">Water Network:</label>
                        <div class="col-sm-9">
                            <html:text property="comWaterNetworkInfo" styleClass="form-control" styleId="comWaterNetworkInfo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comSewerageNetworkInfo" class="col-sm-3 col-form-label">Sewerage Network:</label>
                        <div class="col-sm-9">
                            <html:text property="comSewerageNetworkInfo" styleClass="form-control" styleId="comSewerageNetworkInfo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comElectricalNetworkInfo" class="col-sm-3 col-form-label">Electrical Network:</label>
                        <div class="col-sm-9">
                            <html:text property="comElectricalNetworkInfo" styleClass="form-control" styleId="comElectricalNetworkInfo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comSolidWasteServiceInfo" class="col-sm-3 col-form-label">Soild Waste service:</label>
                        <div class="col-sm-9">
                            <html:text property="comSolidWasteServiceInfo" styleClass="form-control" styleId="comSolidWasteServiceInfo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comRoadNetworkInfo" class="col-sm-3 col-form-label">Road Network:</label>
                        <div class="col-sm-9">
                            <html:text property="comRoadNetworkInfo" styleClass="form-control" styleId="comRoadNetworkInfo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comTransportNetworkInfo" class="col-sm-3 col-form-label">Transport Network:</label>
                        <div class="col-sm-9">
                            <html:text property="comTransportNetworkInfo" styleClass="form-control" styleId="comTransportNetworkInfo"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comEcnonomicActivitiesInfo" class="col-sm-3 col-form-label">Main Economic Activity:</label>
                        <div class="col-sm-9">
                            <html:text property="comEcnonomicActivitiesInfo" styleClass="form-control" styleId="comEcnonomicActivitiesInfo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comLatitude" class="col-sm-3 col-form-label">Latitude:</label>
                        <div class="col-sm-9">
                            <html:text property="comLatitude" styleClass="form-control" styleId="comLatitude"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comLongitude" class="col-sm-3 col-form-label">Longitude:</label>
                        <div class="col-sm-9">
                            <html:text property="comLongitude" styleClass="form-control" styleId="comLongitude"/>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="comPercentAreaC" class="col-sm-3 col-form-label">% in Area C:</label>
                        <div class="col-sm-9">
                            <html:select property="comPercentAreaC" styleClass="selectpicker form-control">
                                <html:option value="1">Less than 50%</html:option>
                                <html:option value="2">More than or equal 50% and less than 100%</html:option>
                                <html:option value="3">100%</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="comTouchingBorder" class="col-sm-3 col-form-label">Touching Border:</label>
                        <div class="col-sm-9">
                            <html:select property="comTouchingBorder" styleClass="selectpicker form-control">
                                <html:option value="1">A</html:option>
                                <html:option value="2">B</html:option>
                                <html:option value="3">AB</html:option>
                                <html:option value="4">ABEJ</html:option>
                                <html:option value="5">EJ</html:option>
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


    InvalidInputHelper(document.getElementsByName("comId")[0], {
        defaultText: "Please Enter The Community ID ",
        emptyText: "Please Enter The Community ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("comPcbsCode")[0], {
        defaultText: "Please Enter The PCBS Code ",
        emptyText: "Please Enter The PCBS Code ",
    });
    InvalidInputHelper(document.getElementsByName("comOchaCode")[0], {
        defaultText: "Please Enter The OCHA Code ",
        emptyText: "Please Enter The OCHA Code ",
    });
    InvalidInputHelper(document.getElementsByName("comName")[0], {
        defaultText: "Please Enter The Community Name ",
        emptyText: "Please Enter The Community Name ",
    });
    InvalidInputHelper(document.getElementsByName("comTotalAreaLand")[0], {
        defaultText: "Please Enter The Total Area Land ",
        emptyText: "Please Enter The Total Area Land ",
    });
    InvalidInputHelper(document.getElementsByName("comLocationShortDescription")[0], {
        defaultText: "Please Enter The Location Short Description ",
        emptyText: "Please Enter The ELocation Short Description ",
    });
    InvalidInputHelper(document.getElementsByName("comTopology")[0], {
        defaultText: "Please Enter The Topology ",
        emptyText: "Please Enter The Topology ",
    });
</script>