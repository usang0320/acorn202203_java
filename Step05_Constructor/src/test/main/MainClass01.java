package test.main;


import test.mypac.Member;
import test.mypac.Student;
public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();
		Member m1 = new Member(1, "�豸��", "�뷮��");
		Member m2 = new Member(2, "�ذ�", "��ŵ�");
		System.out.println(m1.name);
		System.out.println(m2.addr);
		
		s1.study();
		s1.goSchool();
		
		Member m3 = new Member();
		m3.name="�̹ο�";
		m3.num=23;
		m3.addr="�ɽ��ؿ�";
		System.out.println(m3.name+"�� "+m3.addr);
		
		
		Member m4 = new Member();
		m4.name="�̿���";
		m4.addr="������";
		System.out.println(m4.name+"�� "+m4.addr);
		
	}
}
