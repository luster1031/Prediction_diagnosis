<%@ page import="ConnectDB.C_DB"  language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ConnectDB.put_data" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" bordercolor="red"> 
 
    <tr>
                <th >부품명</th>    
                <th>제조사 추천</th>
                <th>직전 교체 일시</th>
                <th>인공지능 예측 </th>
    </tr>
    <%
    C_DB cdb = new C_DB();
    ArrayList<put_data>list_one = cdb.Storage_list(2);

	for(put_data data:list_one){
	%>
     <tr>
                <td><%=data.getPart_name()%></td>
                <td><%=data.getFactory_sug()%></td>
                <td><%=data.getActual_change() %></td>
                <td><%=data.getAi_sug() %></td>
        </tr>
          <%} %>
	</table>
</body>
</html>