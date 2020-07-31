<%@ page import="ConnectDB.C_DB" language="java"
	trimDirectiveWhitespaces="true" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="ConnectDB.put_data"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Demo</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
	
		$('#bttall').click(function() {
			
			$.ajax({
				type : 'POST',
				data : {
					action : 'one_click'

				},
				url : 'AjaxController',
				success : function(result) {
					$('#result3').html(result);

				}
				
				
			});

			
		});
	});
</script>
</head>
<body>
	<fieldset>
		<legend>Demo 1</legend>
		<form>
			모든 데이터 출력 <input type="button" value="새로고침" id="bttall"> <br> 
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
			<span id="result3"></span>
		</form>
	</fieldset>

</body>
</html>