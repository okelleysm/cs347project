<%-- 
    Document   : admin
    Created on : Nov 16, 2014, 5:02:50 PM
    Author     : Leeroy
--%>
<%@page import="java.util.*"%>
<jsp:useBean id="query" scope="session" class="model.db.DBQuery" />

<jsp:include page="assets/head.jsp" /> 

<div class="col-lg-4">
    <div class="panel panel-default">
        <div class="panel-heading">Actions</div>
        <div class="panel-body"><a href="#">Create User</a></div>
        <div class="panel-body"><a href="#">Create Security Question</a></div>
    </div>
</div>
<div class="col-lg-8">
    <div class="panel panel-default">
        <div class="panel-heading">List of Users</div>
        <div class="panel-body">
            <table class="table table-striped table-hover ">
                <thead>
                    <tr>
                        <th class='thicon'><!-- Modify Icon--></th>
                        <th class='thicon'><!-- Delete Icon--></th>
                        <th>#</th>
                        <th>Username</th>
                        <th>Class</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<String> tasks = query.executeQuery(
                                "SELECT userName, userClass, email FROM Users");

                        if (tasks != null) {

                            int columnA = 0;
                            int rowCountA = 1;

                            Iterator it = tasks.iterator();
                            while (it.hasNext()) {
                                columnA++;
                                if (columnA == 1) {
                                    out.println("<tr>");
                                    out.println("<td><span class='glyphicon glyphicon-pencil'></span></td>");
                                    out.println("<td><span class='glyphicon glyphicon-trash'></span></td>");
                                    out.println("<td>" + rowCountA + "</td>");
                                }

                                out.println("<td>" + it.next() + "</td>");

                                if (columnA == 3) {
                                    out.println("</tr>");
                                    columnA = 0;
                                    rowCountA++;
                                }
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">List of Security Questions</div>
        <div class="panel-body">
            <table class="table table-striped table-hover ">
                <thead>
                    <tr>
                        <th class='thicon'><!-- Modify Icon--></th>
                        <th class='thicon'><!-- Delete Icon--></th>
                        <th>#</th>
                        <th>Security Question</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<String> questions = query.executeQuery(
                                "SELECT securityQuestion FROM SecurityQuestions");

                        if (questions != null) {
                            int rowCountB = 0;

                            Iterator it2 = questions.iterator();
                            while (it2.hasNext()) {
                                rowCountB++;
                                out.println("<tr>");
                                out.println("<td><span class='glyphicon glyphicon-pencil'></span></td>");
                                out.println("<td><span class='glyphicon glyphicon-trash'></span></td>");
                                out.println("<td>" + rowCountB + "</td>");
                                out.println("<td>" + it2.next() + "</td>");
                                out.println("</tr>");
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="assets/foot.jsp" />