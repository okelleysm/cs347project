<%-- 
    Document   : dashboard
    Created on : Nov 9, 2014, 3:40:25 PM
    Author     : terrelkl
--%>
<%@page import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="assets/head.jsp" /> 

<div class="col-lg-4">
    <div class="panel panel-default">
        <div class="panel-heading">Actions</div>
        <div class="panel-body"><a href="#">Create Task</a></div>
    </div>
</div>
<div class="col-lg-8">
    <div class="panel panel-default">
        <div class="panel-heading">Lee's Tasks</div>
        <div class="panel-body">
            <table class="table table-striped table-hover ">
                <thead>
                    <tr>
                        <th><!-- Modify Icon--></th>
                        <th><!-- Delete Icon--></th>
                        <th>#</th>
                        <th>Task Name</th>
                        <th>Priority</th>
                        <th>Due Date</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <s:iterator value="tasks" value="list">
                                <td><s:property value="taskName"/></td>
                                <td><s:property value="priority"/></td>
                                <td><s:property value="dueDate"/></td>
                                <td><s:property value="status"/></td>
                            </s:iterator>
                    <tr>
                        <td><span class='glyphicon glyphicon-pencil'></span></td>
                        <td><span class='glyphicon glyphicon-trash'></span></td>
                        <td>1</td>
                        <td>Do Homework</td>
                        <td>Critical</td>
                        <td>11:59pm 11/07/2014</td>
                        <td>Open</td>
                    </tr>
                    <tr>
                        <td><span class='glyphicon glyphicon-pencil'></span></td>
                        <td><span class='glyphicon glyphicon-trash'></span></td>
                        <td>2</td>
                        <td>Buy Food</td>
                        <td>High</td>
                        <td>3:00pm 11/10/2014</td>
                        <td>Open</td>
                    </tr>
                    <tr>
                        <td><span class='glyphicon glyphicon-pencil'></span></td>
                        <td><span class='glyphicon glyphicon-trash'></span></td>
                        <td>3</td>
                        <td>Visit Mom</td>
                        <td>Low</td>
                        <td>12:00pm 11/27/2014</td>
                        <td>Completed</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<jsp:include page="assets/foot.jsp" /> 