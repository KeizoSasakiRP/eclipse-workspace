<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//リクエストスコープからのデータの取得
String bookTitle = (String) request.getAttribute("bookTitle");
%>
<html>
<head>
<meta charset="UTF-8">
<title>リクエストスコープを利用したプログラム</title>
</head>
<body>
	本の名前：<%=bookTitle%>
</body>
</html>