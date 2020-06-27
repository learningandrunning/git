<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>

<%--常见的form表单提交方式--%>
<table>
    <h2 style="color: red">常见的表单提交方式：</h2><br>
    <form id="userInfo1" method="post" action="/test/save">
        姓名:<input type="text" name="userName"><br>
        ID:<input type="text" name="id"><br>
        电话:<input type="text" name="mobile"><br>
        结果：<h3>${msg}</h3><br>
        <input type="submit" value="提交">
    </form>
</table>
<br>
<br>
<br>

<%--使用jquery的ajax提交form表单--%>
<table>
    <h2 style="color: red">使用ajax实现表单提交：</h2><br>
    <form id="userInfo2" method="post">
        姓名:<input type="text" name="userName"><br>
        ID:<input type="text" name="id"><br>
        电话:<input type="text" name="mobile"><br>
        结果：<h3 id="result"></h3><br>
        <input id="commit" type="button" value="提交">
    </form>
</table>

</body>
<%--<script src="../js/jquery-3.3.1.js"></script>--%>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js" type="text/javascript"></script>
<script>
    $(function () {
        $("#commit").click(function () {
            debugger;
            $.ajax({
                url: "/test/addUserAjax",
                type: "post",
                //.serialize() 当提交多条表单数据时，我们可以采用当表单进行序列化的方式简化原有的操作
                data: $("#userInfo2").serialize(),
                dataType: "json",
                success: function (result) {
                    if (result == "success") {
                        $("#result").html("添加成功");
                    } else {
                        $("#result").html("添加失败");
                    }
                }
            })
        })
    })
</script>
</html>