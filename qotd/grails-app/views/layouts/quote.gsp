<%--
  Created by IntelliJ IDEA.
  User: islomar
  Date: 13/01/15
  Time: 11:33
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>QOTD &raquo; <g:layoutTitle/></title> <!--Merges title from target page-->
    <g:external dir="css" file="snazzy.css"/> <!--Creates relative link to CSS file-->
    <g:layoutHead/> <!--Merges head elements from target page-->
    <r:layoutResources /> <!--Merges in JavaScript, CSS, and other resources-->
</head>

<body>
    <div id="header">
        <g:img dir="images" file="logo.png" alt="logo" />
    </div>
    <g:layoutBody/> <!--Merges body elements from target page-->
</body>
</html>
