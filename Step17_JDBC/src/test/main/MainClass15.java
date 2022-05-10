package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.util.DBConnect;

public class MainClass15 {
	public static void main(String[] args) {
		//삭제할 회원의 번호를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 회원번호 입력: ");
		int num= sc.nextInt();
		
		boolean isSuccess=delete(num);
		
		if(isSuccess) {
			System.out.println("회원정보가 삭제 되었습니다.");
		}else {
			System.out.println("해당되는 회원이 없습니다.");
		}
	}
	/*
	 * 인자로 전달된 번호에 해당하는 회원정보를 삭제하고 작업의 성공여부를 리턴하는 메소드
	 * 
	 * 작업의 성공여부를 리턴하는 메소드로 만들어 보세요!
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
			//sql 문 실행하고 수정된 (추가, 수정, 삭제) row 의 개수 리턴 받기
			
			int updatedRowCount=pstmt.executeUpdate();
			if (updatedRowCount > 0) {
				//성공인 경우
				isExist=true;
			}else {
				//실패인 경우
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
