package test.main;
import test.mypac.Member;
public class MainClass04 {

	public static void main(String[] args) {
		//1. Member ��ü�� �����ؼ�
		Member m3 = new Member();
		//2. ȸ���Ѹ��� ������ ���
		m3.num=3;
		m3.name="������";
		m3.addr="��";
		//3. showInfo() �޼ҵ带 ȣ���غ�����.
		m3.showInfo();
	}

}
