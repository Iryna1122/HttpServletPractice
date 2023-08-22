<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.08.2023
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="guess-servlet" method="post">
  <label >Введіть число 0 - 100:</label>
  <input type="number" name="num">
  <input type="submit" value="Send">

</form>

</body>
</html>
