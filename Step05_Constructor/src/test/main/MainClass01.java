package test.main;


import test.mypac.Member;
import test.mypac.Student;
public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();
		Member m1 = new Member(1, "김구라", "노량진");
		Member m2 = new Member(2, "해골", "행신동");
		System.out.println(m1.name);
		System.out.println(m2.addr);
		
		s1.study();
		s1.goSchool();
		
		Member m3 = new Member();
		m3.name="이민영";
		m3.num=23;
		m3.addr="심심해요";
		System.out.println(m3.name+"은 "+m3.addr);
		
		
		Member m4 = new Member();
		m4.name="이예진";
		m4.addr="ㅈ댔어요";
		System.out.println(m4.name+"은 "+m4.addr);
		
	}
}
