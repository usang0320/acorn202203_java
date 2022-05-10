package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.util.DBConnect;

public class MainClass15 {
	public static void main(String[] args) {
		//������ ȸ���� ��ȣ�� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ȸ����ȣ �Է�: ");
		int num= sc.nextInt();
		
		boolean isSuccess=delete(num);
		
		if(isSuccess) {
			System.out.println("ȸ�������� ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("�ش�Ǵ� ȸ���� �����ϴ�.");
		}
	}
	/*
	 * ���ڷ� ���޵� ��ȣ�� �ش��ϴ� ȸ�������� �����ϰ� �۾��� �������θ� �����ϴ� �޼ҵ�
	 * 
	 * �۾��� �������θ� �����ϴ� �޼ҵ�� ����� ������!
	 */
	public static boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		boolean isExist=false;
		try {
			conn= new DBConnect().getConn();
			String sql = "delete from member"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			//sql �� �����ϰ� ������ (�߰�, ����, ����) row �� ���� ���� �ޱ�
			
			int updatedRowCount=pstmt.executeUpdate();
			if (updatedRowCount > 0) {
				//������ ���
				isExist=true;
			}else {
				//������ ���
				isExist=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return isExist;
	}
}
