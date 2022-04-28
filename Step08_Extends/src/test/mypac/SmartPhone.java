package test.mypac;

public class SmartPhone extends HandPhone{
	//생성자
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//부모의 메소드 재정의(Override)
	@Override	//지워도 문제없음. 표시역할
	public void takePicture() {
		System.out.println("100만 화소의 고화질 사진을 찍어요!");
	}
	
}
