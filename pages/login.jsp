<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script type="text/javascript">
    $(function() {
        $("#userId").attr("placeholder", "Username");
        $("#password").attr("placeholder", "Password");
        $("#userId").prop('required',true);
        $("#password").prop('required',true);

    });
</script>
<article class="log-in">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="account-wall">
                    <img class="profile-img" src="/pages/resources/images/logo-btc.png" alt="">
                    <html:form action="login" focus="userId">
                        <div class="form-signin">
                    <%--<form class="form-signin" action="home.html">--%>
                        <span class="glyphicon glyphicon-user"></span>
                        <html:text property="userId" styleClass="form-control" styleId="userId" />
                        <%--<input type="userId" class="form-control" placeholder="Username" required=""  oninvalid="this.setCustomValidity('Please Enter The Username ')" autofocus=""/>--%>
                        <span class="glyphicon glyphicon-lock"></span>
                        <html:password property="password" styleClass="form-control" styleId="password"/>
                        <%--<input type="password" class="form-control" placeholder="Password" required=""  oninvalid="this.setCustomValidity('Please Enter The Password ')" />--%>
                        <button class="btn btn-lg btn-primary btn-block" type="submit">
                            Sign in <span class="awesome"></span></button>

                        <a href="#" class="forget-password">Forget Password?</a><span class="clearfix"></span>
                    <%--</form>--%>
                        </div> </html:form>
                </div>
            </div>
        </div>
    </div>
</article>

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



    InvalidInputHelper(document.getElementsByName("userId")[0], {
        defaultText: "Please Enter The Username ",
        emptyText: "Please Enter The Username ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
    InvalidInputHelper(document.getElementsByName("password")[0], {
        defaultText: "Please Enter The Password ",
        emptyText: "Please Enter The Password ",
//        invalidText: function (input) {
//            return 'The email address "' + input.value + '" is invalid!';
//        }
    });
</script>

