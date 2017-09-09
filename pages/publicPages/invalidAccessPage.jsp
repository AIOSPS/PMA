<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<article class="log-in">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="account-wall">
                    <img class="profile-img" src="/pages/resources/images/logo-btc-lgn.jpg" alt="">
                    <%--<html:form action="loginPage">--%>
                        <div class="form-signin">
                            <div class="alert alert-danger">
                                <p class="text-justify">You need to login to access this action! If you have account please click on Sign in button to login.</p>
                                <%--<p class="text-justify">If you have account please click on Sign in button to login.</p>--%>
                            </div>
                                <%--<form class="form-signin" action="home.html">--%>
                            <%--<span class="glyphicon glyphicon-user"></span>--%>
                            <%--<html:text property="userId" styleClass="form-control" styleId="userId" />--%>
                                <%--<input type="userId" class="form-control" placeholder="Username" required=""  oninvalid="this.setCustomValidity('Please Enter The Username ')" autofocus=""/>--%>
                            <%--<span class="glyphicon glyphicon-lock"></span>--%>
                            <%--<html:password property="password" styleClass="form-control" styleId="password"/>--%>
                                <%--<input type="password" class="form-control" placeholder="Password" required=""  oninvalid="this.setCustomValidity('Please Enter The Password ')" />--%>
                            <button class="btn btn-lg btn-primary btn-block" onclick="javaScript:parent.location = '/loginPage.do'">
                                Sign in <span class="awesome"></span></button>

                            <%--<a href="#" class="forget-password">Forget Password?</a><span class="clearfix"></span>--%>
                                <%--</form>--%>
                        </div>
                        <%--</html:form>--%>
                </div>
            </div>
        </div>
    </div>
</article>


