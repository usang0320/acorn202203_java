package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

/*
 *  JDBC ( java DataBase connectivity)
 *  
 *  DataBase �� �����ؼ� SELECT, INSERT, UPDATE, DELETE �۾��ϱ�
 *  
 *  Oracle �� �����ϱ� ���ؼ��� ����̹� Ŭ������ ����ִ� ojdbc6.jar ������
 *  ����� �� �ֵ��� �����ؾ� �Ѵ�.
 */
public class MainClass06 {
	public static void main(String[] args) {
		//������ member_seq �� Ȱ���ؼ� ȸ�� ������ �߰��� ������.
		
		//member ���̺� �߰��� ȸ���� ������� ����
		
		String name="�̸�";
		String addr="�ּ�";
		
		//SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� �����
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			//DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�.
			conn= new DBConnect().getConn();
			//������ sql ��
			String sql = "insert into member"
					+" (num,name,addr)"
					+" values(member_seq.nextval,?,?)";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			// ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			
			//sql �� �����ϱ�
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
