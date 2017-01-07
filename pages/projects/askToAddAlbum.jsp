<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="eu.pms.project.database.PmsProjectsBenificiary" %>
<%@ page import="eu.pms.project.database.PmsProjectsLocation" %>
<%@ page import="eu.pms.lookup.database.PmsBenificiaryTyp" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>



<div class="content-wrapper breadcrumb brd2">
    <div class="container clearfix">
        <nav class="menu-breadcrumb2"><a href="#" class="active"><span class="fa fa-home "></span> Project Information
        </a><span class=""> > </span><span>Projects</span></nav>
    </div>
</div>

<article class="FormPage">
    <div class="container">
        <%--<div class="col-md-12  pd15 titleArea">--%>
            <%--<div class="col-md-8">--%>
                <%--<h1> Project</h1>--%>
            <%--</div>--%>
            <%--<div class="col-md-4 pd15 create ">--%>
                <%--&lt;%&ndash;<button type="button" class="btn btn-primary fa fa-plus pull-right">Create Record</button>&ndash;%&gt;--%>
            <%--</div>--%>
        <%--</div>--%>
        <div class="content-wrapper formWrapper ">

                <h2 class="titleSep"><span>Do You Want To Add Images For This Project?</span></h2>

                <div class="form-group row">
                    <div class="col-md-4">
                    </div>
                    <div class="col-md-4">
                        <%--<div class="alert alert-info" role="alert">--%>
<%--<p>Do You Want To Add Images For This Project</p>--%>
                        <%--</div>--%>
                        <button type="button" onclick="javaScript:parent.location = '/viewAddAlbumProject.do?proId=<%=request.getParameter("proId")%>'"
                                class="btn btn-primary">Yes
                        </button>
                        <button type="button" onclick="javaScript:parent.location = '/pmsProjectList.do'"
                                class="btn btn-primary">No
                        </button>
                    </div>
                    <div class="col-md-4">
                    </div>


                </div>



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
</script>