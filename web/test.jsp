<%-- 
    Document   : test
    Created on : Nov 18, 2014, 8:13:33 AM
    Author     : okellesm
--%>

<%@page import="java.util.*"%>
<jsp:useBean id="query" scope="session" class="model.db.DBQuery" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="assets/head.jsp" /> 

  <head> 
        <title>Class List</title>        
    </head>
    <body>
        <h3>Class List</h3>
        <%
            ArrayList<String> results = query.doQuery("Select * from users");
            if (results != null) {
                Iterator it = results.iterator();
                out.println("<ul>");
                while (it.hasNext()) {
                    out.println("<li>" + it.next() + "</li>");
                }
                out.println("</ul>");
            }
        %>

        
        
<jsp:include page="assets/foot.jsp" />