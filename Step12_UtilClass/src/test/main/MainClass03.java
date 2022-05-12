package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 반복문 돌면서 친구 이름을 3번 입력 받아서
		 *  입력받은 이름을 ArrayList 객체에 순서대로 저장을 하는 프로그램을 해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			System.out.println("친구 이름을 입력하세요");
			String name=sc.nextLine();
			names.add(name);
		}
		
		//저장된 내용을 반복문 돌면서 순서대로 출력하기
		for(int i=0; i<names.size(); i++) {
			//i번째 item
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("---------");
		
		//확장 for 문
		for(String tmp:names) {	//콜론의 우측에다가 배열이나 ArrayList의 참조값을 넣어준다
			System.out.println(tmp);
		}
	}
}
