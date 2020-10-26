<%--
  Created by IntelliJ IDEA.
  User: 编程小哥令狐
  Date: 2020/10/26
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用来测试文件上传</h1>
    <form action="http://localhost:8080/Struts2_day2/file/upload" enctype="multipart/form-data" method="post">
        <input type="file" name="aaa"><br>
        <input type="submit" value="上传文件">
    </form>
</body>
</html>
