<%@ page language="java" pageEncoding="EUC-KR"%>
<%@ page contentType="image/jpeg"%>
<%@ page import="org.jfree.chart.*"%>
<%@ page import="ConnectDB.*"%>
<%@ page import="ConnectDB.Barchart" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<input type ="button" value="������" onclick="location.href='Manager.jsp'">
	<%
	System.out.println("��ư Ŭ��");
	ServletOutputStream s = response.getOutputStream();
	Barchart dbr = new Barchart();
	JFreeChart chart= dbr.getPieChart();
	ChartUtilities.writeChartAsPNG(s, chart, 800, 450);
	%>

</body>
</html>