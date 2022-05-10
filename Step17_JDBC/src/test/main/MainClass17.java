package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.dto.MemberDto;
import test.util.DBConnect;

//update
public class MainClass17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 회원의 번호를 입력하세요.");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("수정할 회원의 이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("수정할 회원의 주소를 입력하세요.");
		String addr = sc.nextLine();
		
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		boolean isSuccess = update(dto);
		if(isSuccess==true) {
			System.out.println(num+"번 회원의 정보를 수정했습니다.");
		}else {
			System.out.println(num+"번 회원의 정보를 수정하지 못했습니다.");
		}
		
	}
	
	public static boolean update(MemberDto dto) {
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
	
}
