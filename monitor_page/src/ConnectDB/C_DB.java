package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.mysql.jdbc.PreparedStatement;

public class C_DB {

	public Connection show_database(){
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����");
			String url = "jdbc:mysql://192.168.0.13:3306/testdb?useSSL=false&serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "test";
			String pwd = "test1234";

			con = DriverManager.getConnection(url, id, pwd);

    	}catch(Exception e){
    		System.out.println("[mysql : ]" + e.getMessage() + "]");
    		System.out.println("\n�������� :" + e.getStackTrace());
    		e.printStackTrace();
    		
         }
		return con;

	}
	
	public ArrayList<put_data> Storage_list(int number){
		ArrayList<put_data> list = new ArrayList<put_data>();
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			con = show_database();

			if(number == 2) {
				sql = "select * from jspdb";
				pstmt = con.prepareStatement(sql);	//sql�����Ű�� ��ü �����
				rs = pstmt.executeQuery();//���� ��� �� rs�� �Ѿ�´�
				
				while(rs.next()) {
					put_data data = new put_data();
					data.setPart_name(rs.getString("name"));
					data.setFactory_sug(rs.getString("factory"));
					data.setAi_sug(rs.getString("ai"));
					data.setActual_change(rs.getString("change_ac"));
					data.setHow_many(rs.getInt("how_many"));
					data.setManual(rs.getString("manual"));
					list.add(data);
				}
			}
			else {
				sql = "select * from arm";
				pstmt = con.prepareStatement(sql);	//sql�����Ű�� ��ü �����
				rs = pstmt.executeQuery();//���� ��� �� rs�� �Ѿ�´�
				
				while(rs.next()) {
					put_data data = new put_data();
					data.setPID(rs.getInt("pid"));
					data.setAngle(rs.getFloat("angle"));
					//���ǵ��߰�
					//Ÿ���߰�
					
					list.add(data);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{                                                            // ������ ���� �Ǵ� ���п� ������� ����� �ڿ��� ���� �Ѵ�.  (�����߿�)	
			if(rs != null) try{rs.close();}catch(SQLException sqle){sqle.printStackTrace();}            // Resultset ��ü ����
			if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){sqle.printStackTrace();}   // PreparedStatement ��ü ����
			if(con != null) try{con.close();}catch(SQLException sqle){sqle.printStackTrace();}   // Connection ����

}
		return list;
		
	}

}
