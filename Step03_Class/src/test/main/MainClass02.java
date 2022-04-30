package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public String myName="김구라";	//필드
	
	public static void test() {	//메소드
		System.out.println("test() 호출됨");
	}

	public static void main(String[] args) {
		MainClass02 mn = new MainClass02();
		MyUtil.send();
		MyUtil.version="1.0";
		mn.myName="이유상";
		System.out.println(mn.myName);
		test();	//동일 클래스내에 있는 static 끼리는 바로 호출 가능 
	}

}
