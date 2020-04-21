<html>
<body>
<%@ page contentType="text/html; charset=UTF-8" %>
<style>
    #info{top:50%;left:50%; position:absolute; width:600px; height:400px; margin:-100px -100px; }
</style>
<div id="info">
    <form action="/login/login">
        请输入用户名:<br>
        <input type="text" name="username">
        <br>
        请输入密码:<br>
        <input type="text" name="password">
        <br><br>
        <span style="display:block; width:150px; text-align:center">
            <input type="submit" value="登陆">
        </span>
    </form>



</div>

</body>
</html>
