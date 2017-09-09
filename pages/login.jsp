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
            <div class="col-md-4 col-md-offset-4 loginBox">
                <div class="account-wall">
                    <img class="profile-img" src="/pages/resources/images/logo-btc-lgn.jpg" alt="">
                    <html:form action="login" focus="userId">
                        <div class="form-signin">

                            <span class="glyphicon glyphicon-user"></span>
                            <html:text property="userId" styleClass="form-control" styleId="userId" />

                            <span class="glyphicon glyphicon-lock"></span>
                            <html:password property="password" styleClass="form-control" styleId="password"/>

                            <button class="btn btn-lg btn-primary btn-block" type="submit">
                                Sign in <span class="awesome"></span></button>

                            <a href="#" class="forget-password">Forget Password?</a><span class="clearfix"></span>

                        </div> </html:form>
                    <script type="text/javascript" language="JavaScript">
                        <!--
                        var focusControl = document.forms["loginForm"].elements["userId"];

                        if (focusControl.type != "hidden" && !focusControl.disabled) {
                            focusControl.focus();
                        }
                        // -->
                    </script>

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

