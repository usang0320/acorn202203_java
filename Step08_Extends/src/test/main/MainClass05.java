package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		// 자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 =new HandPhone();
		
		// 엄마가 새로운 설명서를 들고 왔다. 이폰은 이제 스마트폰?
		SmartPhone p2 = (SmartPhone)p1;	//HandPhone 에 설명서만 바꾼거라 안됨
										//ClassCastException 발생! 참조값의 객체의 원래 type 을 확인
		//엄마 짱짱
		p2.doInternet();
	}
}
