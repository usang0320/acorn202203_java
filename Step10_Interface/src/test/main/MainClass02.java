package test.main;

import test.mypac.Remocon;
import test.mypac.TestRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//직접 클래스를 test.mypac 페키지에 만들어서 useRemocon() 메소드를 여기서 호출해 보세요.
		Remocon r1 = new TestRemocon();
		useRemocon(r1);
		
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("오버라이드의 여러방법");
			}

			@Override
			public void down() {
				System.out.println("test중");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
