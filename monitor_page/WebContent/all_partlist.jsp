<%@ page import="ConnectDB.C_DB" language="java"
	trimDirectiveWhitespaces="true" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="ConnectDB.put_data"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든 부품 리스트 table</title>
</head>
<body>
	<input type="button" value="나가기" onclick="location.href='Manager.jsp'">
	<table border="1" bordercolor="red">

		<tr>
			<th>부품명</th>
			<th>센서 값</th>
			<th>정상센서범위</th>
			<th>진단결과</th>
		</tr>

		<%
			C_DB cdb = new C_DB();
		cdb.show_database(); //db연결 확인

		ArrayList<put_data> list = cdb.Storage_list(1);

		for (put_data data : list) {
		%>
		<tr>
			<td><%=data.getPID()%></td>
			<td><%=data.getAngle()%></td>
			<td>센서범위1</td>
			<td>결과 과연</td>
		</tr>
		<%
			}
		%>


	</table>

	<script type="text/javascript">
		setTimeout("location.reload()",1000);
		<%System.out.println("첫번째 새로고침1");%>
	</script>
</body>
</html>