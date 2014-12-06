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
        <s:password label="Retype Password" name="inputPassword2"/>
        <s:textfield label="Email" name="inputEmail"/>
        <s:select label="Security Quesiton" name="" list=""/>
        <s:textfield label="Answer" name="inputAnswer"/>
        
        <s:submit value="Cancel"/>
        <s:submit value="Submit"/>


                <label for="inputAnswer" class="col-lg-2 control-label">Answer</label>
                <div class="col-lg-10">
                    <input class="form-control" id="inputAnswer" type="text">
                </div>


                    <button class="btn btn-default">Cancel</button>
                    <button type="submit" class="btn btn-primary">Submit</button>


</div>
<jsp:include page="assets/foot.jsp" /> 