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
                <th >��ǰ��</th>    
                <th>������ ��õ</th>
                <th>���� ��ü �Ͻ�</th>
                <th>�ΰ����� ���� </th>
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