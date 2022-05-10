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
		//메소드를 호출해서 인자로 전달한 번호에 해당하는 회원정보를 얻어와서
		MemberDto dto = getData(6);
		if(dto!=null) {
			//사용하기
			System.out.println("번호:"+dto.getNum()+" 이름:"+dto.getName()+" 주소:"+dto.getAddr());
		}else {
			System.out.println("해당회원은 존재하지 않습니다.");
		}
		
	}
	
	//인자로 전달된 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드
	public static MemberDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		//MemberDto 객체를 담을 지역변수를 미리 만든다.
		MemberDto dto = null;
		
		try {
			conn= new DBConnect().getConn();
			String sql = "select name,addr from member"
					+" where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			//만일 select 된 row가 있다면
			if(rs.next()) {
				//select 된 정보를 MemberDto 객체에 담는다.
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
