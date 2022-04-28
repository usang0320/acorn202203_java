package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 문자열을 5번 입력 받는다.
		 *  입력받은 문자열은 차례대로 배열에 저장 되어야 한다.
		 *  모두 다 입력 받은 후 for 문을 이용해서 배열에 저장된
		 *  모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
		String[] strings=new String[5];
		
		for(int i=0; i<strings.length; i++) {
			System.out.println("문자열 입력:");
			String str = sc.nextLine();
			strings[i]=str;
		}
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}
}
