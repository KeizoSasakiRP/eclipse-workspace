<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calc_sum</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/CalcSum">
		数字を入力してください<br>
		<input type="text" name="num1">num1<br>
		<input type="text" name="num2">num2<br>
		<input type="submit" value="送信">
	</form>
</body>
</html>