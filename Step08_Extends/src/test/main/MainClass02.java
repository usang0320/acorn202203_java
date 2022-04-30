package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 *  지역변수나 필드앞에 선언하는 data type 은 (참조데이터 type)
 *  그 안에 들어있는 참조값의 사용 설명서 라고 생각하면 된다.
 *  
 *  그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용 설명서에 명시된 기능만 사용 할 수 있다.
 *  
 *  java 의 모든 객체는 다형성을 가질 수 있다.
 *  
 *  다형성은 type 이 여러개라는 의미이다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		//어떤 객체의 참조값을 부모 type 으로 받을 수 있다.
		Phone p2 = new HandPhone();	//설명서가 구형이라 새로운 기능을 사용하지 못한다고 생각하자.
		Object p3 = new HandPhone();
		
		p1.takePicture();
		p2.call();
		
		p1.name="아이폰11"; //HandPhone 이란 틀로 p1이란 핸드폰을 만들고, 그 폰 이름을 아이폰11이라 하겠다
		
		
		
	}
}
