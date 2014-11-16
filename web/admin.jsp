<%-- 
    Document   : admin
    Created on : Nov 16, 2014, 5:02:50 PM
    Author     : Leeroy
--%>

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
                    <tr>
                        <td><span class='glyphicon glyphicon-pencil'></span></td>
                        <td><span class='glyphicon glyphicon-trash'></span></td>
                        <td>1</td>
                        <td>Lee</td>
                        <td>User</td>
                        <td>lee@jmu.edu</td>
                    </tr>
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
                    <tr>
                        <td><span class='glyphicon glyphicon-pencil'></span></td>
                        <td><span class='glyphicon glyphicon-trash'></span></td>
                        <td>1</td>
                        <td>The name of your first pet?</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="assets/foot.jsp" />