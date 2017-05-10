<%--
  Created by IntelliJ IDEA.
  User: Antonella
  Date: 5/10/17
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HTML Form Demo</title>
</head>
<body>

<form name="testForm" method="post" action="/success" onsubmit="return validateForm()">
    Customer Name: <input type="text" name="c_name" required><br>
    Coffee Type: <input type="text" name="c_type" required><br>

    <h3>Coffee Options</h3>
    Decaf <input type="checkbox" name="options" value="Decaf"><br>
    Extra Bold <input type="checkbox" name="options" value="Extra Bold"><br>

    <h3>Gender</h3>
    <input type="radio" name="gender" value="male">Male<br>
    <input type="radio" name="gender" value="female">Female<br>
    <input type="radio" name="gender" value="other">Other<br>
    <input type="submit"><br>

</form>

<%--<script>--%>
    <%--function validateForm() {--%>
        <%--var name = document.forms["testForm"]["c_name"].value;--%>
        <%--var type = document.forms["testForm"]["c_type"].value;--%>

        <%--if (name == "" || type == "") {--%>
            <%--alert("You must enter a value to proceed!");--%>
            <%--return false;--%>
        <%--}--%>
        <%--if (name.length < 2 || type.length < 2 ) {--%>
            <%--alert("Input must be longer than 2 characters!");--%>
            <%--return false;--%>
        <%--}--%>
    <%--}--%>




<%--</script>--%>

</body>
</html>
