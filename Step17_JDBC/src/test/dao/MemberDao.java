package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	
	//ȸ�������� �����ϴ� �޼ҵ�
	public boolean insert(MemberDto dto) {
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
		
		return isInsert;
	}
	
	
	//ȸ�������� �����ϴ� �޼ҵ�
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		boolean isUpdate = false;
		try {
			conn= new DBConnect().getConn();
			String sql = "update member"
					+" set name=?, addr=?"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			int updatedRowCount=pstmt.executeUpdate();
			if(updatedRowCount>0) {
				isUpdate=true;
			}else {
				isUpdate=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return isUpdate;
	}
	
	
	//ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		boolean isExist=false;
		try {
			conn= new DBConnect().getConn();
			String sql = "delete from member"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			int updatedRowCount=pstmt.executeUpdate();
			if (updatedRowCount > 0) {
				isExist=true;
			}else {
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
	
	
	//ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public MemberDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		MemberDto dto = null;
		
		try {
			conn= new DBConnect().getConn();
			String sql = "select name,addr from member"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
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
	
	//ȸ�� ����� �����ϴ� �޼ҵ�
	public List<MemberDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		List<MemberDto> li = new ArrayList<>();
		try {
			conn= new DBConnect().getConn();
			String sql = "select * from member"
					+" order by num asc";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				li.add(dto);
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
		
		return li;
	}
}
