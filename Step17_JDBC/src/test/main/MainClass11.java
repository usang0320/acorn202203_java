package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		//������ ȸ���� ��ȣ��� ����
		int num=4;
		
		delete(num);
	}
	
	public static void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn= new DBConnect().getConn();
			String sql = "delete from member"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			System.out.println("ȸ�������� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");
	}
}
