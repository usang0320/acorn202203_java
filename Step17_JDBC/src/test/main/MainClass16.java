package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass16 {
	public static void main(String[] args) {
		//추가할 회원 정보를 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("주소 입력: ");
		String addr = sc.nextLine();
		
		//회원정보를 MemberDto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//메소드를 호출하면서 전달해서 회원정보를 추가하고 성공여부를 리턴받는다.
		boolean isSuccess = insert(dto);
		if(isSuccess) {
			System.out.println(name+" 의 정보를 추가 했습니다.");
		}else {
			System.out.println(name+" 정보 추가 실패!");
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
		
		System.out.println("main 메소드가 종료됩니다.");
		return isInsert;
	}
}
