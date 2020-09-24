<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2020, 2:12:47 PM
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First:<input type="text" name="firstValue" value="${firstValue}"><br>
            Second:<input type="text" name="secondValue" value="${secondValue}"><br>
            <input type="submit" value="+" name="submit">
            <input type="submit" value="-" name="submit">
            <input type="submit" value="*" name="submit">
            <input type="submit" value="%" name="submit">
            <br>
        </form>
             <p>${message}</p>
             <a href="age">Age Calculator</a>
    </body>
</html>
