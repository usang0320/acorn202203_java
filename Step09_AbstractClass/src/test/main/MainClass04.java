package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	//내부 클래스(inner class)
	static class YourWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("공중공격을 해요!");
		}
	}
	
	//static main() 메소드
	public static void main(String[] args) {
		Weapon w1 = new YourWeapon();
		useWeapon(w1);
		
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("나의 무기를 사용한다");
			}
		}
		
		Weapon w2 = new OurWeapon();
		useWeapon(w2);
	}
	/*
	 * static 메소드 내에서는
	 * 같은 클래스안에 있는 자원중 static만 쓸 수 있다.
	 * 
	 * ex) static main 안에서는 MainClass04 안에 있는 자원들중
	 * 		static 이 붙은 자원들만 사용할 수 있다.
	 */
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
