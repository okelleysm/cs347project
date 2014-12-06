<%-- 
    Document   : create
    Created on : Nov 9, 2014, 3:50:51 PM
    Author     : terrelkl
--%>

<%@page contentType="text/html" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="mt" uri="WEB-INF/tlds/secure.tld" %>
<mt:secure/>
<jsp:include page="assets/head.jsp" /> 

<h1>Create a Task</h1>
<div class="col-lg-8">
    <s:form action="CreateAction?ent=task">
        <s:textfield label="UserId" name="inputUserName" />
        <s:bean id="priorities" name="priorities">
            <s:select label="Priority" name="inputPriority" list="priorities">
                <option value="0">Low</option>
                <option value="1">Standard</option>
                <option value="2">High</option>
                <option value="3">Critical</option>
            </s:select>
        </s:bean>
        <s:password label="Password" name="inputPassword" />
        <s:submit value="Login" />
    </s:form>
</div>

<jsp:include page="assets/foot.jsp" /> 