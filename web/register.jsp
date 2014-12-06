<%-- 
    Document   : register
    Created on : Nov 9, 2014, 3:16:00 PM
    Author     : terrelkl
--%>
<%@page contentType="text/html" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="assets/head.jsp" /> 

<h1>Register your account</h1>
<div class="col-lg-8">
    <s:bean name="bean.GetQuestions">
        <s:form action="RegisterAction">
            <s:textfield label="UserId" name="inputUserName" />
            <s:password label="Password" name="inputPassword1" />
            <s:password label="Password (again)" name="inputPassword2"/>
            <s:textfield label="Email" name="inputEmail"/>
            <s:select style="color: #000;" label="Question" name="inputQuestion" list="questions"/>
            <s:textfield label="Answer" name="inputAnswer"/>
            <s:submit value="Login" name="submit" />
        </s:form>
    </s:bean>
</div>

<jsp:include page="assets/foot.jsp" /> 