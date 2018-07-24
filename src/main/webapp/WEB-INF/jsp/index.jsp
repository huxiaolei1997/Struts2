<%--
  Created by 胡晓磊.
  User: 12459
  Date: 2018/7/3
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
<form action="hello" method="POST">
    <p>请输入你的用户名：</p>
    <input type="text" name="name"/>
    <input type="submit" value="Say Hello"/>
</form>

<form action="upload" method="post" enctype="multipart/form-data">
    <label for="myFile">Upload your file</label>
    <input type="file" name="myFile" />
    <input type="submit" value="Upload"/>
</form>
</body>
</html>