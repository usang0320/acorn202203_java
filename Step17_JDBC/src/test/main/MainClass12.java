package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		//전체 회원의 목록을 main 메소드 안에서 사용하고 싶다면
		List<MemberDto> list = getList();	//메소드를 호출해서 전체 회원목록을 받아온다.
		for(MemberDto tmp : list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
		System.out.println("회원정보를 모두 불러왔습니다.");
	}
	
	//전체 회원의 목록을 리턴해주는 메소드
	public static List<MemberDto> getList(){
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
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return li;
	}
}
