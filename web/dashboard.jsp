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
                <%
                    ArrayList<String> tasks = query.executeQuery(
                            "SELECT taskName, priority, dueDate, status FROM Tasks");
                        
                        int cloumn = 0;
                        int rowCount = 1;
                        
                        Iterator it = tasks.iterator();
                        while (it.hasNext()) {
                            cloumn++;
                            if (cloumn == 1) {
                                out.println("<tr>");
                                out.println("<td><span class='glyphicon glyphicon-pencil'></span></td>");
                                out.println("<td><span class='glyphicon glyphicon-trash'></span></td>");
                                out.println("<td>" + rowCount + "</td>");
                            }
                            out.println("<td>" + it.next() + "</td>");
                            if (cloumn == 4) {
                                out.println("</tr>");
                                cloumn = 0;
                                rowCount++;
                            }
                        }
                %>
                    <s:bean name="bean.GetTasks" var="tasks">
                        <tr>
                            <td></td>
                            <td></td>
                            <td>3</td>
                            <s:iterator value="tasks">
                                <td><s:property value="taskName.toString()"/></td>
                                <td><s:property value="priority"/></td>
                                <td><s:property value="dueDate"/></td>
                                <td><s:property value="status"/></td>
                            </s:iterator>
                    </s:bean>
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
