package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass16 {
	public static void main(String[] args) {
		//�߰��� ȸ�� ������ �Է� �޾Ƽ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�: ");
		String name = sc.nextLine();
		System.out.println("�ּ� �Է�: ");
		String addr = sc.nextLine();
		
		//ȸ�������� MemberDto ��ü�� ���
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//�޼ҵ带 ȣ���ϸ鼭 �����ؼ� ȸ�������� �߰��ϰ� �������θ� ���Ϲ޴´�.
		boolean isSuccess = insert(dto);
		if(isSuccess) {
			System.out.println(name+" �� ������ �߰� �߽��ϴ�.");
		}else {
			System.out.println(name+" ���� �߰� ����!");
		}
		
	}
	
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		boolean isInsert = false;
		try {
			conn= new DBConnect().getConn();
			String sql = "insert into member"
					+" (num,name,addr)"
					+" values(member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			int updatedRowCount=pstmt.executeUpdate();
			if(updatedRowCount>0) {
				isInsert=true;
			}else {
				isInsert=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");
		return isInsert;
	}
}
