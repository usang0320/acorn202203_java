package test.mypac;
/*
 *  [ interface ]
 *  
 *  - 생성자가 없다 (단독 객체 생성 불가)
 *  - 구현된 메소드는 가질 수 없다 (추상 메소드만 가질 수 있다)
 *  - 필드는 static final 상수만 가질 수 있다.
 *  - data type 의 역할을 할 수 있다.
 *  - interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서
 *    객체를 생성해야 한다.
 *  - 클래스 상속은 단일상속이지만 interface는 여러개를 implements 할 수 있다.
 */
public interface Remocon {
	//필드는 static final 필드만 가질 수 있다.
	public static final String COMPANY="LG";	//static final이 생략 되어도 static final 역할을 한다
	public static final double PI=3.14159;
	
	//메소드는 추상 메소드만 정의 할 수 있다.
	public void up();
	public void down();
	
}
