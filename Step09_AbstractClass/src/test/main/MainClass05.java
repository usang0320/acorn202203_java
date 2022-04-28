package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static Weapon w1=new Weapon() {
		@Override
		public void attack() {
			System.out.println("뭔진 모르겠지만 공격하자!");	
		}	//메소드는 클래스 안에 생성된다. 
		    //new Weapon() 뒤에 anonymous class 있고 그 클래스는 Weapon클래스를 상속받는다. 
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
		
		Weapon w2 =new Weapon() {
			@Override
			public void attack() {
				System.out.println("오잉? 이것도 공격하네?");
			}
		};
		useWeapon(w2);
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("오잉? 이것도 공격하네?");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
