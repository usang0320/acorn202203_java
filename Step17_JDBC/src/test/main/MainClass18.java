package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass18 {
	public static void main(String[] args) {
		//1�� ȸ���� ������ ���;� �Ѵٸ�?
		MemberDao dao = new MemberDao();
		MemberDto dto =dao.getData(5);
		System.out.println(dto.getName());
		
		//��� ȸ���� ����� ��������
		List<MemberDto> list = dao.getList();
	}
}
