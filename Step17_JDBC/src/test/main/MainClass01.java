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
public class MainClass01 {
	public static void main(String[] args) {
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
		ResultSet rs = null;
		try {
			//������ sql ��
			String sql = "SELECT num,name,addr FROM member"
					+ " ORDER BY num ASC";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement ��ü�� �̿��ؼ� query �� �����ϰ� �����
			//ResultSet ��ü�� �޾ƿ���
			rs=pstmt.executeQuery();
			/*
			 *  ResultSet ��ü�� .next() �޼ҵ�� cursor �ؿ� row �� �����ϴ��� Ȯ���ؼ�
			 *  ���� �����ϸ� true �� �����ϰ� cursor �� ��ĭ ������ �̵��Ѵ�.
			 *  ���� �������� ������ false �� �����Ѵ�.
			 */
			while(rs.next()) {
				//���� cursor �� ��ġ�� ������ num �̶�� Į���� ���� ����
				int num = rs.getInt("num");
				//���� cursor �� ��ġ�� ������ name �̶�� Į���� ���ڿ� ����
				String name = rs.getString("name");
				//���� cursor �� ��ġ�� ������ addr �̶�� Į���� ���ڿ� ����
				String addr = rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");
	}
}
