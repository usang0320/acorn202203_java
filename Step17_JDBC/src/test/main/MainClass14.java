package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass14 {
	public static void main(String[] args) {
		//�޼ҵ带 ȣ���ؼ� ���ڷ� ������ ��ȣ�� �ش��ϴ� ȸ�������� ���ͼ�
		MemberDto dto = getData(6);
		if(dto!=null) {
			//����ϱ�
			System.out.println("��ȣ:"+dto.getNum()+" �̸�:"+dto.getName()+" �ּ�:"+dto.getAddr());
		}else {
			System.out.println("�ش�ȸ���� �������� �ʽ��ϴ�.");
		}
		
	}
	
	//���ڷ� ���޵� ��ȣ�� �ش��ϴ� ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public static MemberDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		//MemberDto ��ü�� ���� ���������� �̸� �����.
		MemberDto dto = null;
		
		try {
			conn= new DBConnect().getConn();
			String sql = "select name,addr from member"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			//���� select �� row�� �ִٸ�
			if(rs.next()) {
				//select �� ������ MemberDto ��ü�� ��´�.
				dto=new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return dto;
	}
}
