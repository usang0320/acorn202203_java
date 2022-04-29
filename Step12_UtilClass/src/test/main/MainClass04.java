package test.main;

import java.util.ArrayList;

public class MainClass04 {
	public static void main(String[] args) {
		//정수를 저장 할 수 있는 ArrayList 객체를 생성해서 참조값을 ArrayList type 의 지역변수 nums 에 담기
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//확장 for 문을 이용해서 저장된 정수를 순서대로 콘솔창에 출력하기
		for(Integer tmp:nums) {	//type은 int 도 됨
			System.out.println(tmp);
		}
	}
}
