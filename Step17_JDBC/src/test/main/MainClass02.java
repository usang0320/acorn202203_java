package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  JDBC ( java DataBase connectivity)
 *  
 *  DataBase �� �����ؼ� SELECT, INSERT, UPDATE, DELETE �۾��ϱ�
 *  
 *  Oracle �� �����ϱ� ���ؼ��� ����̹� Ŭ������ ����ִ� ojdbc6.jar ������
 *  ����� �� �ֵ��� �����ؾ� �Ѵ�.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//member ���̺� �߰��� ȸ���� ������� ����
		int num=4;
		String name="�ֵ���";
		String addr="��õ��";
				
		//DB ���ᰴü�� ���� ���� ���� �����
		Connection conn=null;
		
		try {
			//����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        //������ DB �� ���� @�������ּ�:port��ȣ:db�̸�
	        String url="jdbc:oracle:thin:@localhost:1521:xe";
	        //���� ��й�ȣ�� �̿��ؼ� Connection ��ü�� ������ ������
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        //���ܰ� �߻����� �ʰ� ������� ��������� �������� ���� �����̴�.
	         System.out.println("Oracle DB ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� �����
		PreparedStatement pstmt=null;
		try {
			//������ sql ��
			String sql = "insert into member"
					+" (num,name,addr)"
					+" values(?,?,?)";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			// ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//sql �� �����ϱ�
			pstmt.executeUpdate();
			System.out.println("ȸ�������� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");
	}
}
