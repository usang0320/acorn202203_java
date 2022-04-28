package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon() {

			@Override
			public void attack() {
				System.out.println("�����ؿ�!");	
			}
		};
		
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				System.out.println("�����ؿ�!");
				
			}
			
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
