<%--
  Created by IntelliJ IDEA.
  User: 编程小哥令狐
  Date: 2020/10/25
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Struts2中的零散参数的接收</h1>
    <form action="http://localhost:8080/Struts2_day2/param/param" method="post">
        用户名：<input type="text" name="username"><br>
        年龄：<input type="text" name="age"><br>
        价格：<input type="text" name="price"><br>
        生日：<input type="text" name="bir"><br>
        性别：<input type="text" name="sex"><br>
        <input type="submit" value="提交">
    </form>

    <h1>Struts2中的对象类型参数的接收</h1>
    <form action="http://localhost:8080/Struts2_day2/param/param" method="post">
        id：<input type="text" name="user.id"><br>
        年龄：<input type="text" name="user.age"><br>
        价格：<input type="text" name="user.price"><br>
        生日：<input type="text" name="user.bir"><br>
        性别：<input type="text" name="user.sex"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
