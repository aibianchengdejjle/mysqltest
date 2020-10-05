<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
 <div style="text-align: center">
<%--     首先要在web配置文件中配置相关的文件中完成注册 然后斜杠后面的代表是web下面的url--%>
  <form action="${pageContext.request.contextPath}/login" method="get">
    用户名 <input type="text" name="username"><br>
      密码 <input type="password" name="password"><br>
      爱好 <br>
      <input type="checkbox" name="hoobby" value="王者荣耀">王者荣耀 <br>
      <input type="checkbox" name="hobby" value="刺激战场">刺激战场 <br>
      <input type="checkbox" name="hobby" value="穿越火线">穿越火线 <br>
      <input type="submit" value="提交">
  </form>
 </div>
</body>
</html>
