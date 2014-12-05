<%-- 
    Document   : create
    Created on : Nov 9, 2014, 3:50:51 PM
    Author     : terrelkl
--%>

<jsp:include page="assets/head.jsp" /> 


<h1>Create an {element}</h1>
<div class="col-lg-8">
    <s:form action="CreateQuestion">
        <s:textfield label="UserName" name="inputUserName"/>
        <s:password label="Password" name="inputPassword1" />
        <s:password label="Password (again)" name="inputPassword2" />
        <s:textfield label="Email" name="inputEmail"/>
        
        
        <s:submit value="Submit"/>

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
</div>
<jsp:include page="assets/foot.jsp" /> 