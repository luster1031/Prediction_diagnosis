<%@page import="ConnectDB.Threadproject"%>
<%@ page import="ConnectDB.C_DB" language="java"
	trimDirectiveWhitespaces="true" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="ConnectDB.put_data"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부품 별 교체 일시 관리</title>
</head>
<body>

      

<input type="button" value="나가기" onclick = "location.href='Manager.jsp'"/>

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
          <%}%>
   </table>
<script type="text/javascript">
		setTimeout("location.reload()",1000);
		<%System.out.println("새로고침2");%>
	</script>

</body>
</html>
