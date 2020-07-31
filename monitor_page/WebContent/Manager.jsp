<%@ page errorPage="error.jsp"%>
<%@ page import="ConnectDB.C_DB" language="java" trimDirectiveWhitespaces="true" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자</title>
</head>
<body>

	<input type ="button" value="모든 센서 데이터 진단 결과" onclick="location.href='all_partlist.jsp'">
	<input type ="button" value="부품 별 교체 일시 관리"  onclick = "location.href='Date_of_replacement.jsp'">
	<input type ="button" value="제조사 추천 교체 시기 대비 실제 교체 그래프" onclick="location.href='chartPage.jsp'">
	

</body>
</html>