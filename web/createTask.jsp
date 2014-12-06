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
    <s:bean name="bean.GetPriorities">
        <s:form action="CreateAction">
            <s:textfield label="TaskName" name="inputTaskName" />
            <s:select label="Priority" name="inputPriority" list="priorities"/>
            <s:textfield label="Due Date" name="inputDueDate" />
            <s:textfield label="Status" name="inputStatus" />
            <s:submit value="Login" name="submit"/>
        </s:form>
    </s:bean>
</div>

<jsp:include page="assets/foot.jsp" /> 