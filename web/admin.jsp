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
                    ArrayList<String> tasks = query.allFrom("users");
                    if (tasks != null) {
                        int count = 0;
                        Iterator it = tasks.iterator();
                        while (it.hasNext()) {
                            count++;
                            if (count == 1) {
                                out.println("<tr>");
                                out.println("<td><span class='glyphicon glyphicon-pencil'></span></td>");
                                out.println("<td><span class='glyphicon glyphicon-trash'></span></td>");
                            }
                            out.println("<td>" + it.next() + "</td>");
                            if (count == 4) {
                                it.next();
                                it.next();
                                it.next();
                                out.println("</tr>");
                                count = 0;
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
                    ArrayList<String> questions = query.allFrom("securityQuestions");
                    if (questions != null) {
                        int count = 0;
                        Iterator it = questions.iterator();
                        while (it.hasNext()) {
                            count++;
                            if (count == 1) {
                                out.println("<tr>");
                                out.println("<td><span class='glyphicon glyphicon-pencil'></span></td>");
                                out.println("<td><span class='glyphicon glyphicon-trash'></span></td>");
                            }
                            out.println("<td>" + it.next() + "</td>");
                            if (count == 2) {
                                out.println("</tr>");
                                count = 0;
                            }
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="assets/foot.jsp" />