package test.main;
import test.mypac.MyObject;
import test.mypac.Car;
import test.mypac.Radio;
import test.mypac.Speaker;
public class MainClass01 {
	public static void main(String[] args) {
		//MyObject Ŭ������ ���ǵ� 3���� �޼ҵ带 ���ʷ� ȣ���ϴ� code �� �ۼ��� ������
		MyObject mo = new MyObject();
		mo.walk();
		int num = mo.getNumber();
		String str =mo.getGreeting();
		System.out.println(num);
		System.out.println(str);
		
		Car car1 = mo.getCar();
		car1.name="GV70";
		
		// .setNum() .setName() .useCar() �޼ҵ� 3���� ȣ���ϴ� code �� �ۼ��� ������.
		mo.setNum(14);
		mo.setName("������");
		mo.useCar(car1);
		
		// .listenMusic() �޼ҵ带 ȣ���ϴ� code�� �ۼ��� ������.
		mo.listenMusic(new Radio(), new Speaker());
	}
}
