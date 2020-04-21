<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>显示</title>
    <style type="text/css">
        table {
            border: 1px solid pink;
            margin: 0 auto;
        }

        td{
            width: 150px;
            border: 1px solid pink;
            text-align: center;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>地区</td>
        <td>手机</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id }</td>
            <td>${item.name }</td>
            <td>${item.address }</td>
            <td>${item.phone }</td>
            <td><a href="/tbResume/deleteOne?id=${item.id }">删除</a>|<a href="/tbResume/findOneBeforeUpdate?id=${item.id }">修改</a></td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="6" style="text-align: left;"><a href="../insert.jsp">添加信息</a></td>
    </tr>

</table>
</body>
</html>