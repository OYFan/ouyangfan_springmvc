<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>新增</title>
    <link rel="stylesheet" href="css/index.css" type="text/css" />
</head>

<body>
<form action="/tbResume/updateOne" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>新增信息</h1></td>
        </tr>

        <tr>
            <td>姓名:</td>
            <td><input  type="text" name="name"/></td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><input  type="text" name="address"/></td>
        </tr>
        <tr>
            <td>手机:</td>
            <td><input  type="text" name="phone"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="button" value="返回" οnclick="history.go(-1)"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>