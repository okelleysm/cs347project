<%-- 
    Document   : login
    Created on : Nov 9, 2014, 3:33:28 PM
    Author     : terrelkl
--%>
<%@page contentType="text/html" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="mt" uri="WEB-INF/tlds/secure.tld" %>
<mt:secure/>
<jsp:include page="assets/head.jsp" /> 

<h1>Log into your account</h1>
<div class="col-lg-8">
    <s:form action="LoginAction">
        <s:textfield label="UserId" name="inputUserName" />
        <s:password label="Password" name="inputPassword" />
        <s:submit value="Login" />
    </s:form>
</div>

<jsp:include page="assets/foot.jsp" /> 