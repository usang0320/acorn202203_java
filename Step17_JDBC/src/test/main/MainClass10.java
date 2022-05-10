package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//������ ȸ���� ����
		int num=1;
		String name="ȣ��";
		String addr="�н���";
		
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		update(dto);
		
	}
	
	//ȸ�� 1���� ������ �����ϴ� �޼ҵ�
	public static void update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn= new DBConnect().getConn();
			String sql = "update member"
					+" set name=?, addr=?"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
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
