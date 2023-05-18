<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
<title>商品マスタ</title>
</head>
<body style="text-align:center">
<%if(request.getAttribute("login_name") != null){ %>
		<strong>部署：<%=request.getAttribute("dptname") %></strong><br>
		<strong>氏名：<%=request.getAttribute("login_name") %></strong><br>
	<%} %>
		
	<p>商品マスタメンテナンスメニュー</p>
	<br>
	<a href="/NockWeb/listcon?no=1"  >商品一覧</a><br>
	<a href="/NockWeb/web/mod.jsp?no=3"  >商品登録</a><br>
	<a href="/NockWeb/listcon?no=2" >商品変更・削除</a>
</body>
</html>