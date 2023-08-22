<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.08.2023
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="anketa-servlet" method="post">

  <label>Enter your name:</label>
  <input type="text" name="name"><br>
  <label>Enter your phone number:</label>
  <input type="tel" name="phone"><br>
  <label>Enter your email:</label>
  <input type="email" name="email"><br>
  <label>Enter your age:</label>
  <input type="number" name="age"><br>
  <label>Хочете підписатися на нашу розсилку?</label>
  <input type="checkbox" name="spam"><br>
  <label>Sex:</label>
  <input type="radio" name="sex" value="female"> female
  <input type="radio" name="sex" value="male"> male
  <input type="radio" name="sex" value="other"> other

  <hr>

  <input type="submit" value="Send data">


</form>

</body>
</html>
