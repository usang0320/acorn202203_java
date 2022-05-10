package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass18 {
	public static void main(String[] args) {
		//1번 회원의 정보를 얻어와야 한다면?
		MemberDao dao = new MemberDao();
		MemberDto dto =dao.getData(5);
		System.out.println(dto.getName());
		
		//모든 회원의 목록을 얻어오려면
		List<MemberDto> list = dao.getList();
	}
}
