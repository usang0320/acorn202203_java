package test.main;
/*
 *  아래와 같은 CarFactory 라는 이름의 클래스를 만들어 보세요
 *  
 *  CarFactory 객체는 getCar() 라는 메소드가 있고
 *  
 *  해당 메소드를 호출하면 Car type 객체의 참조값을 리턴하도록 메소드를 만들어보세요.
 */
import test.mypac.Car;
import test.mypac.CarFactory;
public class MainClass06 {

	public static void main(String[] args) {
		//CarFactory 객체를 이용해서 Car 객체의 참조값을 얻어와서
		CarFactory cf = new CarFactory();
		Car c1 = cf.getCar();
		//그 객체에 차의 이름을 넣고
		c1.name="GV70";
		//drive() 메소드를 호출해보세요
		c1.drive();
	}

}
