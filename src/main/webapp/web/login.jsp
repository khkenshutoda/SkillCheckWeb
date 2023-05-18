<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>ログイン</title>
</head>
<body>
	<%request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8"); %>
	<strong style="font-size:18px;">ログイン画面</strong>
	<br>
	<form method="post" action="/SkillCheckWeb/loginconf2">
		<table>
			<tr>
				<td>ID：</td>
				<td><input type="text" size="20" name="id"></td>
			</tr>
			<tr>
				<td>PASS：</td>
				<td><input type="password" size="20" name="pass"></td>
			</tr>
		</table>
		<br><input type="submit" name="submit" value="ログイン">
			<input type="reset" name="reset" value="リセット">
	</form>
	<%if(request.getAttribute("err") != null){ %>
		<p><%=request.getAttribute("err") %></p>
	<%} %>

</body>
</html>