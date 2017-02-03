<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<script type="text/javascript">
    $(function () {
//        $("#agrId").attr("placeholder", "Agriculture Id");
//        $("#agrId").prop('required', true);
        $("#comId").attr("placeholder", "Community");
        $("#comId").prop('required', true);
        $("#menLivelihoodSource1").attr("placeholder", "Men Livelihood Source1");
        $("#menLivelihoodSource1").prop('required', true);
        $("#menLivelihoodSource2").attr("placeholder", "Men Livelihood Source2");
        $("#menLivelihoodSource2").prop('required', true);
        $("#menLivelihoodSource3").attr("placeholder", "Men Livelihood Source3");
        $("#menLivelihoodSource3").prop('required', true);
        $("#womenLivelihoodSource1").attr("placeholder", "Women Livelihood Source1");
        $("#womenLivelihoodSource1").prop('required', true);
        $("#womenLivelihoodSource2").attr("placeholder", "Women Livelihood Source1");
        $("#womenLivelihoodSource2").prop('required', true);
        $("#womenLivelihoodSource3").attr("placeholder", "Women Livelihood Source3");
        $("#womenLivelihoodSource3").prop('required', true);
        $("#accessToLandsMilitary").attr("placeholder", "Access to Lands Military");
        $("#accessToLandsMilitary").prop('required', true);
        $("#accessToLandsCheckpoints").attr("placeholder", "Access to Lands Checkpoints");
        $("#accessToLandsCheckpoints").prop('required', true);
        $("#familyAvgSize").attr("placeholder", "Family Average Size");
        $("#familyAvgSize").prop('required', true);
        $("#familyAvgIncome").attr("placeholder", "family Average Income");
        $("#familyAvgIncome").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Basic Socio Information
        </a><span class=""> > </span><span>Basic Socio</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Basic Socio</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addEconomicSocio">
                <h2 class="titleSep"><span>Basic Socio Information</span></h2>

                <div class="form-group row">
                    <%--<div class="col-md-6">--%>
                        <%--<label for="agrId" class="col-sm-3 col-form-label">Agriculture Id:</label>--%>
                        <%--<div class="col-sm-9">--%>
                            <%--<html:text property="agrId" styleClass="form-control" styleId="agrId"/>--%>
                        <html:hidden property="ecoId"/>
                        <%--</div>--%>
                    <%--</div>--%>
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
                    <div class="col-md-6">
                        <label for="menLivelihoodSource1" class="col-sm-3 col-form-label">Men Livelihood Source1:</label>
                        <div class="col-sm-9">
                            <html:select property="menLivelihoodSource1" styleClass="selectpicker form-control">
                                <html:option value="1">work in settlements</html:option>
                                <html:option value="2">PA employee</html:option>
                                <html:option value="3">Farming</html:option>
                                <html:option value="4">Handicrafts</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>


                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="menLivelihoodSource2" class="col-sm-3 col-form-label">Men Livelihood Source2:</label>
                        <div class="col-sm-9">
                            <html:select property="menLivelihoodSource2" styleClass="selectpicker form-control">
                                <html:option value="1">work in settlements</html:option>
                                <html:option value="2">PA employee</html:option>
                                <html:option value="3">Farming</html:option>
                                <html:option value="4">Handicrafts</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="menLivelihoodSource3" class="col-sm-3 col-form-label">Men Livelihood Source3:</label>
                        <div class="col-sm-9">
                            <html:select property="menLivelihoodSource3" styleClass="selectpicker form-control">
                                <html:option value="1">work in settlements</html:option>
                                <html:option value="2">PA employee</html:option>
                                <html:option value="3">Farming</html:option>
                                <html:option value="4">Handicrafts</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="womenLivelihoodSource1" class="col-sm-3 col-form-label">Women Livelihood Source1:</label>
                        <div class="col-sm-9">
                            <html:select property="womenLivelihoodSource1" styleClass="selectpicker form-control">
                                <html:option value="1">work in settlements</html:option>
                                <html:option value="2">PA employee</html:option>
                                <html:option value="3">Farming</html:option>
                                <html:option value="4">Handicrafts</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="womenLivelihoodSource2" class="col-sm-3 col-form-label">Women Livelihood Source2:</label>
                        <div class="col-sm-9">
                            <html:select property="womenLivelihoodSource2" styleClass="selectpicker form-control">
                                <html:option value="1">work in settlements</html:option>
                                <html:option value="2">PA employee</html:option>
                                <html:option value="3">Farming</html:option>
                                <html:option value="4">Handicrafts</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <label for="womenLivelihoodSource3" class="col-sm-3 col-form-label">Women Livelihood Source3:</label>
                        <div class="col-sm-9">
                            <html:select property="womenLivelihoodSource3" styleClass="selectpicker form-control">
                                <html:option value="1">work in settlements</html:option>
                                <html:option value="2">PA employee</html:option>
                                <html:option value="3">Farming</html:option>
                                <html:option value="4">Handicrafts</html:option>
                            </html:select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="accessToLandsMilitary" class="col-sm-3 col-form-label">Access to Lands Affected By:</label>
                        <div class="col-sm-9">
                            <html:select property="accessToLandsMilitary" styleClass="selectpicker form-control">
                                <html:option value="1">Military Activity</html:option>
                                <html:option value="2">Check Points</html:option>
                                <html:option value="3">Bypass Road</html:option>
                            </html:select>
                        </div>
                    </div>
                </div>
                <div class="form-group row">

                    <div class="col-md-6">
                        <%--<label for="accessToLandsCheckpoints" class="col-sm-3 col-form-label">Access to Lands Checkpoints:</label>--%>
                        <%--<div class='col-sm-9'>--%>
                            <%--<fieldset class="col-sm-9" id="accessToLandsCheckpoints">--%>
                                <%--<div>--%>

                                    <%--<label class="radio-inline">--%>
                                        <%--<html:radio property="accessToLandsCheckpoints" value="1"/>--%>
                                        <%--Yes--%>
                                    <%--</label>--%>


                                    <%--<label class="radio-inline">--%>
                                        <%--<html:radio property="accessToLandsCheckpoints"  value="0"/>--%>
                                        <%--No--%>
                                    <%--</label>--%>


                                <%--</div>--%>
                            <%--</fieldset>--%>
                        <%--</div>--%>
                            <label for="familyAvgSize" class="col-sm-3 col-form-label">Family Average Size:</label>
                            <div class='input-group date  col-sm-9'>
                                <html:text property="familyAvgSize" styleClass="form-control" styleId="familyAvgSize"/>
                                <span class="input-group-addon input-group-addon1">
                               Person
                            </span>
                            </div>
                    </div>
                    <div class="col-md-6">
                        <label for="familyAvgIncome" class="col-sm-3 col-form-label">Family Average Income:</label>
                        <div class='input-group date  col-sm-9'>
                            <html:text property="familyAvgIncome" styleClass="form-control" styleId="familyAvgIncome"/>
                            <span class="input-group-addon input-group-addon1">
                               NIS
                            </span>
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


//    InvalidInputHelper(document.getElementsByName("agrId")[0], {
//        defaultText: "Please Enter The Agriculture Id ",
//        emptyText: "Please Enter The Agriculture Id ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
//    });
    InvalidInputHelper(document.getElementsByName("comId")[0], {
        defaultText: "Please Enter The Community ",
        emptyText: "Please Enter The Community ",
    });
    InvalidInputHelper(document.getElementsByName("menLivelihoodSource1")[0], {
        defaultText: "Please Enter The Men Livelihood Source1 ",
        emptyText: "Please Enter The  Men Livelihood Source1 ",
    });
    InvalidInputHelper(document.getElementsByName("menLivelihoodSource2")[0], {
        defaultText: "Please Enter The Men Livelihood Source2 ",
        emptyText: "Please Enter The  Men Livelihood Source2 ",
    });
    InvalidInputHelper(document.getElementsByName("menLivelihoodSource3")[0], {
        defaultText: "Please Enter The Men Livelihood Source3 ",
        emptyText: "Please Enter The  Men Livelihood Source3 ",
    });
    InvalidInputHelper(document.getElementsByName("womenLivelihoodSource1")[0], {
        defaultText: "Please Enter The Women Livelihood Source1",
        emptyText: "Please Enter The Women Livelihood Source1",
    });
    InvalidInputHelper(document.getElementsByName("womenLivelihoodSource2")[0], {
        defaultText: "Please Enter The Women Livelihood Source2",
        emptyText: "Please Enter The Women Livelihood Source2",
    });
    InvalidInputHelper(document.getElementsByName("womenLivelihoodSource3")[0], {
        defaultText: "Please Enter The Women Livelihood Source3 ",
        emptyText: "Please Enter The Women Livelihood Source3 ",
    });
    InvalidInputHelper(document.getElementsByName("accessToLandsMilitary")[0], {
        defaultText: "Please Enter The Access to Lands Military ",
        emptyText: "Please Enter The  Access to Lands Military ",
    });
    InvalidInputHelper(document.getElementsByName("accessToLandsCheckpoints")[0], {
        defaultText: "Please Enter The Access to Lands Checkpoints ",
        emptyText: "Please Enter The Access to Lands Checkpoints ",
    });
    InvalidInputHelper(document.getElementsByName("familyAvgSize")[0], {
        defaultText: "Please Enter The  Family Average Size ",
        emptyText: "Please Enter The  Family Average Size ",
    });
    InvalidInputHelper(document.getElementsByName("familyAvgIncome")[0], {
        defaultText: "Please Enter The Family Average Income ",
        emptyText: "Please Enter The  Family Average Income ",
    });


</script>
