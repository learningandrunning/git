<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/24
  Time: 11:09
  To change this template use File | Settings | File Templates.   这个不用
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>

  <head>

        <title>login.jsp页面</title>

      </head>

  <body>

    
<form action="user/insertUser" method="post">
    <fieldset>
        <table style="background-color:#FFFFFF">
            <tr style="height:30px;font-size:25px">
                <td align="right" style="width:100%">注册52Player</td>
            </tr>
            <tr>
                <td>姓名:</td>
                <td><input type="text" name="userName" id="userName" placeholder="请输入姓名" size="40"/></td>
            </tr>
            <tr>
            <tr>
                <td>账号:</td>
                <td><input type="text" name="uNo" id="uNo" placeholder="请输入账号" size="40"/></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password" id="password" placeholder="请输入密码" size="40"/></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" id="confirmPassword" placeholder="请再次输入密码" size="40"/></td>
            </tr>
            <tr>
                <td>用户类型:</td>
                <td><select name="uType"size="1" id="uType">
                    <option value="2">普通用户</option>
                </select>
                </td>
            </tr>
            <tr style="background-color:#1ABC9C">
                <td colspan="2" align="center" style="height:50px;">
                    <input type="button" id="saveButton" value="注册" uNo=style="height:50px;font-Size:20px" /><br>
                </td>
            </tr>
            <tr>
                <td id="result"></td>
            </tr>
        </table>
    </fieldset>
</form>



  </body>

</html>