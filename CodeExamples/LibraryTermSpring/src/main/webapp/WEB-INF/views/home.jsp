<%--
  Created by IntelliJ IDEA.
  User: maurice
  Date: 5/15/17
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Library Terminal Spring</title>
    <link href="${pageContext.request.contextPath}/resources/css/validation.css" rel="stylesheet" >
</head>
<body>

<h1>Add a new book</h1>
<form:form action="/LibTermSpring/addbook" modelAttribute="command" method="get">

    <label>Author</label>
    <form:input type="text" name="title" path="title"/><form:errors path="title" cssClass="error"/><br>

    <label>Title</label>
    <form:input type="text" name="author" path="author"/><form:errors path="author" cssClass="error"/><br>

    <label>Image URL</label>
    <form:input type="text" name="thumbURL" path="thumbURL"/><br>

    <button type="submit">Add Book</button>
</form:form>
<h2>Search for Books</h2>
<form action="/LibTermSpring/search" method="get">
    <label>Search Text</label>
    <input type="text" name="searchtxt">
    <button type="submit" name="mode" value="authorsearch">Search by Author</button>
    <button type="submit" name="mode" value="titlesearch">Search by Title KeyWord</button><br>
    <button type="submit" name="mode" value="listbooks">List Books</button><br>
    <label>Verify Age (must be 18 or over)</label>
    <input type="number" name="age" min="18" required><%--Demo of HTML5 front-end validation--%>
</form>

<table border="1">
    <th>BookId</th>
    <th>Cover Image</th>
    <th>Title</th>
    <th>Author</th>
    <th>Status</th>
    <th>Due Date</th>
    <c:forEach items="${results}" var ="books">

        <tr>
            <td>${books.bookid}</td>
                    <td>
                        <a href="${books.thumbURL}" target="_blank">
                            <img src="${books.thumbURL}" style="width: 100px; height: 100px" alt="${books.title}">
                        </a>
                    </td>
            <td>${books.title}</td>
            <td>${books.author}</td>
            <c:choose>
                <c:when test="${books.status == true}">
                    <td><input type="checkbox" onchange="checkOut(this,${books.bookid})" checked><div id="${books.bookid}">Checked Out</div></td>
                </c:when>
                <c:otherwise>
                    <td><input type="checkbox" onchange="checkOut(this,${books.bookid})"><div id="${books.bookid}">Checked In</div></td>
                </c:otherwise>
            </c:choose>

            <td><div id="due${books.bookid}">${books.dueDate}</div></td>
        </tr>

    </c:forEach>

</table>

<script src="//code.jquery.com/jquery-2.2.1.js"></script>
<script type="text/javascript">
    /*
    * Send request to checkout controller to modify the book status
     */
    function checkOut(element, id){

        var status = element.checked;
        if(status){//dynamically change checkbox label text
            $("#" + id).html("Checked Out");
        }else{
            $("#" + id).html("Checked In");
            $("#due" + id).html("");
        }
        //update status in database - using ajax post request
        var url = "/LibTermSpring/checkout";
        $.post(url, {status:status, id:id}, function(data){
            //process response
            $("#due" + id).html(getDateString(data.dueDate));
        });
    }

    /*
    * Convert date to standard date string for display in view
     */
    function getDateString(data) {
        var date = ""
        if(data){
            date = (new Date(data)).toDateString();
        }
        return date;
    }
</script>
</body>
</html>
