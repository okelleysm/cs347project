<%-- 
    Document   : recover
    Created on : Nov 9, 2014, 3:37:50 PM
    Author     : terrelkl
--%>

<jsp:include page="assets/head.jsp" /> 

<h1>Recover your account credentials</h1>
<div class="col-lg-8">
    <form class="form-horizontal">
        <fieldset>
            <legend>Fill this out</legend>
            <div class="form-group">
                <label for="inputEmail" class="col-lg-2 control-label">Email</label>
                <div class="col-lg-10">
                    <input class="form-control" id="inputEmail" type="text">
                </div>
            </div>
            <div class="form-group">
                <label for="inputQuestion" class="col-lg-2 control-label">Security Question</label>
                <div class="col-lg-10">
                    <select class="form-control" id="inputQuestion">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="inputAnswer" class="col-lg-2 control-label">Answer</label>
                <div class="col-lg-10">
                    <input class="form-control" id="inputAnswer" type="text">
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