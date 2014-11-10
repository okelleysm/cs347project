<%-- 
    Document   : login
    Created on : Nov 9, 2014, 3:33:28 PM
    Author     : terrelkl
--%>

<jsp:include page="assets/head.jsp" /> 

<h1>Log into your account</h1>
<div class="col-lg-8">
    <form class="form-horizontal">
        <fieldset>
            <legend>Fill this out</legend>
            <div class="form-group">
                <label for="inputUserName" class="col-lg-2 control-label">Username</label>
                <div class="col-lg-10">
                    <input class="form-control" id="inputUserName" type="text">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword" class="col-lg-2 control-label">Password</label>
                <div class="col-lg-10">
                    <input class="form-control" id="inputPassword1" type="text">
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-10 col-lg-offset-2">
                    <button class="btn btn-default">Cancel</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>

<jsp:include page="assets/foot.jsp" /> 