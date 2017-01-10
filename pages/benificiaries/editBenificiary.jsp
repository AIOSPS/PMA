<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<script type="text/javascript">
    $(function () {
        $("#benId").attr("placeholder", "Benificiary ID");
        $("#benId").prop('required', true);
        $("#benDesc").attr("placeholder", "Description");
        $("#benDesc").prop('required', true);
        $("#benTotal").attr("placeholder", "Benificiary Total");
        $("#benTotal").prop('required', true);
    });
</script>


<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Benificiary Information
        </a><span class=""> > </span><span>Benificiaries</span></nav>
    </div>
</div>


<article class="FormPage">
    <div class="container">
        <div class="col-md-12  pd15 titleArea">
            <div class="col-md-8">
                <h1>Edit Benificiary</h1>
            </div>
            <div class="col-md-4 pd15 create ">
                <%--<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>--%>
            </div>
        </div>
        <div class="content-wrapper formWrapper ">

            <html:form action="addBenificiary">
                <h2 class="titleSep"><span>Benificiary Information</span></h2>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="benId" class="col-sm-3 col-form-label">Benificiary ID:</label>
                        <div class="col-sm-9">
                            <html:text property="benId" styleClass="form-control" styleId="benId" disabled="true"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="benDesc" class="col-sm-3 col-form-label">Description:</label>
                        <div class="col-sm-9">
                            <html:text property="benDesc" styleClass="form-control" styleId="benDesc"/>
                        </div>
                    </div>
                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="benTotal" class="col-sm-3 col-form-label">Benificiary Total:</label>
                        <div class="col-sm-9">
                            <html:text property="benTotal" styleClass="form-control" styleId="benTotal"/>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="secId" class="col-sm-3 col-form-label">Benificiary Type:</label>
                        <div class="col-sm-9">
                            <html:select property="btpId"
                                         styleClass="selectpicker form-control">
                                <logic:present name="benificiaryTypeList">
                                    <html:options collection="benificiaryTypeList" property="lookupId" labelProperty="lookupDesc"/>
                                </logic:present>
                            </html:select>
                            <script>
                                $(function () {
                                    $('[name="btpId"]').eq(0).attr("data-live-search", "true");
                                });
                            </script>
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

    InvalidInputHelper(document.getElementsByName("benId")[0], {
        defaultText: "Please Enter The Benificiary ID ",
        emptyText: "Please Enter The Benificiary ID ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("benDesc")[0], {
        defaultText: "Please Enter The Description ",
        emptyText: "Please Enter The Description ",
    });
    InvalidInputHelper(document.getElementsByName("benTotal")[0], {
        defaultText: "Please Enter The Benificiary Total ",
        emptyText: "Please Enter The Benificiary Total ",
    });
</script>