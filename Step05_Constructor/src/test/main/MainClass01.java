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
		
		Member m3 = new Member();
		
		
	}
}
